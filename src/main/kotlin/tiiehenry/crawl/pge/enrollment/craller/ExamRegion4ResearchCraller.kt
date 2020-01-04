package tiiehenry.crawl.pge.enrollment.craller

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import tiiehenry.crawl.pge.enrollment.data.DBStorer
import tiiehenry.crawl.pge.enrollment.bean.ExamRegion4ResearchItem

class ExamRegion4ResearchCraller(val id: String, val storer: DBStorer) {
    //            println(examId)

    private fun getDocumentForPage(): Document {
        return Jsoup.connect("https://yz.chsi.com.cn/zsml/kskm.jsp")
            .data("id", id)
            .headers(
                mapOf(
                    "User-Agent" to "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3298.3 Safari/537.36",
                    "Host" to "https://yz.chsi.com.cn"
                )
            ).post()
    }

    fun getExamRegion4ResearchItemList(doc: Document): ArrayList<ExamRegion4ResearchItem> {
//        println(doc)
        val list = arrayListOf<ExamRegion4ResearchItem>()
        val tbodyList = doc.getElementsByClass("zsml-res-items")
        tbodyList.forEachIndexed { index, element ->
            val tr = element.child(0)
            val politics = tr.child(0).text()
            val english = tr.child(1).text()
            val section1 = tr.child(2).text()
            val section2 = tr.child(3).text()
            val item= ExamRegion4ResearchItem(id, index, politics, english, section1, section2)
            list.add(item)
        }
        return list;
    }

    private fun getExamRegion4ResearchItemList(): MutableList<ExamRegion4ResearchItem> {
        val list = arrayListOf<ExamRegion4ResearchItem>()
        val doc = getDocumentForPage()
        list.addAll(getExamRegion4ResearchItemList(doc))
        return list
    }
    fun start() {
//        val doc = getDocumentForPage(1)
//        println(doc)
        /*File("C:\\Users\\AnyWin\\Desktop\\b.html").writeText(
            doc.toString()
        )*/
        /*return*/
        getExamRegion4ResearchItemList().forEach {
            storer.storeExamRegion4ResearchItem(it)

        }
    }

}