package tiiehenry.crawl.pge

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import tiiehenry.crawl.pge.data.LearningStyle
import tiiehenry.crawl.pge.data.Provinces
import tiiehenry.crawl.pge.data.Subjects
import java.io.File

class College4SubjectCraller(
    val province: Provinces,
    val subject: Subjects,
    val learningStyle: LearningStyle,
    val storer: Storer
) {
    val url = "https://yz.chsi.com.cn/zsml/queryAction.do";
    private fun getDocumentForPage(pageNo: Int): Document {
        return Jsoup.connect(url)
            .data("ssdm", province.provinceCode)
            .data("yjxkdm", subject.subjectCode)//学科类别
            .data("xxfs", learningStyle.code)
//            .data("zymc", "计算机科学与技术")//专业
            .data("pageno", pageNo.toString())
//            .data("dwmc", "北京大学")//querySchAction
            .headers(
                mapOf(
                    "User-Agent" to "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3298.3 Safari/537.36",
                    "Host" to "https://yz.chsi.com.cn"
                )
            ).post()
    }

    fun getCollege4SubjectItemList(doc: Document): ArrayList<College4SubjectItem> {
        val list = arrayListOf<College4SubjectItem>()
        val cntable = doc.getElementsByClass("ch-table")[0]
        val tbody = cntable.getElementsByTag("tbody")[0]
        val trList = tbody.getElementsByTag("tr")
        trList.forEach {
            val td_招生单位 = it.children()[0]
            val form = td_招生单位.children()[0]
            val a = form.children()[0]
            val href = a.attr("href");
            val url = Craller.baseUrl + href

            val codeCollege = a.text()
            val mid_codeCollege = codeCollege.indexOf(")")
            val collegeCode = codeCollege.substring(1, mid_codeCollege)
            val collegeName = codeCollege.substring(mid_codeCollege + 1)

            val td_所在地 = it.children()[1]
            val codeProvince = td_所在地.text()
            val mid_codeProvince = codeProvince.indexOf(")")
            val provinceCode = codeProvince.substring(1, mid_codeProvince)
            val provinceName = codeProvince.substring(mid_codeProvince + 1)

            val td_研究生院 = it.children()[2]
            val graduateSchool = td_研究生院.children().size > 0

            val td_自划线院校 = it.children()[3]
            val selfScribing = td_自划线院校.children().size > 0

            val td_博士点 = it.children()[4]
            val doctorStation = td_博士点.children().size > 0

            val item = College4SubjectItem(
                url,
                collegeCode,
                collegeName,
                provinceCode,
                provinceName,
                graduateSchool,
                selfScribing,
                doctorStation,
                subject.subjectCode,
                subject.subjectName
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

    fun getCollege4SubjectItemList(): MutableList<College4SubjectItem> {
        val list = arrayListOf<College4SubjectItem>()
        var pageNo = 1;
        var doc = getDocumentForPage(pageNo)
        list.addAll(getCollege4SubjectItemList(doc))
        while (isHavaNextPage(doc, pageNo)) {
            pageNo++;
            doc = getDocumentForPage(pageNo)
//            println(doc)
            File("C:\\Users\\AnyWin\\Desktop\\a.html").writeText(
                doc.toString()
            )
//            exitProcess(0)
            list.addAll(getCollege4SubjectItemList(doc))
        }
        return list
    }

    fun start() {
//        val doc = getDocumentForPage(1)
////        println(doc)
//        File("C:\\Users\\AnyWin\\Desktop\\a.html").writeText(
//            doc.toString()
//        )
        getCollege4SubjectItemList().forEach {
            Research4MajorCraller(it, storer).start()
            storer.storeCollege4SubjectItem(it)

        }
    }
}