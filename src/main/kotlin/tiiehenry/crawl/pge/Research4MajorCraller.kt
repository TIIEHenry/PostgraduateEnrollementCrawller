package tiiehenry.crawl.pge

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class Research4MajorCraller(
    val college4SubjectItem: College4SubjectItem,
    val storer: Storer
) {

    private fun getDocumentForPage(pageNo: Int): Document {
        return Jsoup.connect("https://yz.chsi.com.cn/zsml/querySchAction.do")
            .data("ssdm", college4SubjectItem.provinceCode)
            .data("yjxkdm", college4SubjectItem.subjectCode)//学科类别
//            .data("xxfs", college4SubjectCraller.learningStyle.code)
//            .data("zymc", "计算机科学与技术")//专业
            .data("pageno", pageNo.toString())
            .data("dwmc", college4SubjectItem.collegeName)//querySchAction
            .headers(
                mapOf(
                    "User-Agent" to "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3298.3 Safari/537.36",
                    "Host" to "https://yz.chsi.com.cn"
                )
            ).post()
    }

    fun getResearch4MajorItemList(doc: Document): ArrayList<Research4MajorItem> {
//        println(doc)
        val list = arrayListOf<Research4MajorItem>()
        val cntable = doc.getElementsByClass("ch-table")[0]
        val tbody = cntable.getElementsByTag("tbody")[0]
        val trList = tbody.getElementsByTag("tr")
        trList.forEach {
            val td_考试方式 = it.children()[0]

            val examWay = td_考试方式.text()


            val td_院系所 = it.children()[1]
            val faculty = td_院系所.text()


            val td_专业 = it.children()[2]
            val major = td_专业.text()

            val td_研究方向 = it.children()[3]
            val majorDirection = td_研究方向.text()


            val td_学习方式 = it.children()[4]
            val studyWay = td_学习方式.text()

            val td_指导教师 = it.children()[5]
            val teacher = td_指导教师.text()


            val td_招生人数 = it.children()[6]
            val td_招生人数_script = td_招生人数.getElementsByTag("script")[0]
            val td_招生人数_script_text = td_招生人数_script.data().trim()
            val enrollmentPlan = td_招生人数_script_text.substring(
                "document.write(cutString('".length,
                td_招生人数_script_text.length - "',6));".length
            )

            val td_考试范围 = it.children()[7]
            val td_考试范围_a = td_考试范围.getElementsByTag("a")[0]
            val examRegionUrl = td_考试范围_a.attr("href")
            val examRegionId = examRegionUrl.substringAfter("id=")
//            println(examId)
            val td_可跨专业 = it.children()[8]
            val td_可跨专业_a = td_可跨专业.getElementsByTag("a")[0]
            val interdisciplinary = td_可跨专业_a.text()

            val td_备注 = it.children()[9]
            val td_备注_script = td_备注.getElementsByTag("script")[0]
            val td_备注_script_text = td_备注_script.data().trim()
            val comment = td_备注_script_text.substring(
                "document.write(cutString('".length,
                td_备注_script_text.length - "',6));".length
            )
            val item = Research4MajorItem(
                college4SubjectItem.url,
                examWay,
                faculty,
                major,
                majorDirection,
                studyWay,
                teacher,
                enrollmentPlan,
                examRegionUrl,
                examRegionId,
                interdisciplinary,
                comment
            )
            list.add(item)
//            println(item)
//            exitProcess(0)
        }
        return list;
    }

    fun isHavaNextPage(doc: Document, pageNo: Int): Boolean {
//        if (doc==null)
        val ul = doc.getElementsByClass("ch-page")[0]
        val linext = ul.getElementsByClass("lip selected")[0].nextElementSibling()
        if (linext.className().trim() == "lip") {
//            println(true)
            return true
        }
//        val liList=ul.children()
//        liList.forEach {
//            val liClass=it.attr("class")
//
//            println(liClass)
//        }
        return false
    }

    fun getResearch4MajorItemList(): MutableList<Research4MajorItem> {
        val list = arrayListOf<Research4MajorItem>()
        var pageNo = 1;
        var doc = getDocumentForPage(pageNo)
        list.addAll(getResearch4MajorItemList(doc))
        while (isHavaNextPage(doc, pageNo)) {
            pageNo++;
            doc = getDocumentForPage(pageNo)
//            println(doc)
            list.addAll(getResearch4MajorItemList(doc))
        }
        return list
    }

    fun start() {
//        val doc = getDocumentForPage(1)
//        println(doc)
        /*File("C:\\Users\\AnyWin\\Desktop\\b.html").writeText(
            doc.toString()
        )*/
        /*return*/
        getResearch4MajorItemList().forEach {
            ExamRegion4ResearchCraller(it.examRegionId, storer).start()
            storer.storeResearch4MajorItem(it)

        }
    }
}