package tiiehenry.crawl.pge.enrollment.craller

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import tiiehenry.crawl.pge.enrollment.data.DBStorer
import tiiehenry.crawl.pge.enrollment.bean.College4SubjectItem
import tiiehenry.crawl.pge.enrollment.data.LearningStyle
import tiiehenry.crawl.pge.publicdata.Provinces
import tiiehenry.crawl.pge.enrollment.data.Subjects
import java.io.File

class College4SubjectCraller(
    val province: Provinces,
    val subject: Subjects,
    val learningStyle: LearningStyle,
    val storer: DBStorer
) {
    val url = "https://yz.chsi.com.cn/zsml/queryAction.do";
    private fun getDocumentForPage(pageNo: Int): Document {
        println("$pageNo:$url")
        return Jsoup.connect(url)
            .data("ssdm", province.provinceCode)
            .data("dwmc", "")//单位名称
//            .data("dwmc", "北京大学")//querySchAction
            .data("mldm", subject.get门类().code)//门类
            .data("yjxkdm", subject.subjectCode)//学科类别
            .data("xxfs", learningStyle.code)
//            .data("zymc", "计算机科学与技术")//专业名称
            .data("pageno", pageNo.toString())
//            .data("xxlb", "yjsy")//研究生院
//            .data("xxlb", "ZHX")//自划线院校
//            .data("xxlb", "BS")//博士点
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
        for (it in trList) {
            val td_招生单位 = it.children()[0]
            if (td_招生单位.children().size == 0) {
//                很抱歉，没有找到您要搜索的数据！
                break
            }
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
//            File("C:\\Users\\AnyWin\\Desktop\\a.html").writeText(
//                doc.toString()
//            )
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