package tiiehenry.crawl.pge.college.craller

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import tiiehenry.crawl.pge.college.bean.CollegeForCommonItem
import tiiehenry.crawl.pge.college.data.DBStorer

class CollegeForCommonCraller(val storer: DBStorer) {
    private fun getDocumentForPage(): Document {
        return Jsoup.connect("http://www.chinadegrees.cn/xwyyjsjyxx/xwsytjxx/qgptgxmd/qgptgxmd.html")
            .headers(
                mapOf(
                    "User-Agent" to "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3298.3 Safari/537.36",
                    "Host" to "https://www.chinadegrees.cn"
                )
            ).get()
    }
    fun getCollegeList(): MutableList<CollegeForCommonItem> {
        val list= mutableListOf<CollegeForCommonItem>()
        val doc=getDocumentForPage()
        val pageBody = doc.getElementById("pbg0")
        val tbody = pageBody.getElementsByTag("tbody").first()
        val trList = tbody.children()
        trList.forEach {
            if (it.children().size==5) {
                val num = it.child(0).text()
                if (num != "序号") {
                    val collegeName = it.child(1).text()
                    val competentDepartment = it.child(2).text()
                    val location = it.child(3).text()
                    val level = it.child(4).text()
                    val item= CollegeForCommonItem(collegeName, competentDepartment, location, level)
                    list.add(item)
                }
            }
        }
        return list;
    }

    fun start() {
        getCollegeList().forEach {
            storer.storeCollegeForCommonItem(it)
        }
    }
}