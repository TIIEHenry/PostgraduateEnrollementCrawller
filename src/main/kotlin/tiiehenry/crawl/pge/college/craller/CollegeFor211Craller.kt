package tiiehenry.crawl.pge.college.craller

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import tiiehenry.crawl.pge.college.data.DBStorer

class CollegeFor211Craller (val storer: DBStorer) {
    private fun getDocumentForPage(): Document {
        return Jsoup.connect("http://www.chinadegrees.cn/xwyyjsjyxx/xwbl/zdjs/211gc/")
            .headers(
                mapOf(
                    "User-Agent" to "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3298.3 Safari/537.36",
                    "Host" to "http://www.chinadegrees.cn"
                )
            ).get()
    }
    fun getCollegeList(): MutableList<String> {
        val list= mutableListOf<String>()
        val doc=getDocumentForPage()
        val liList=doc.getElementById("bl").getElementsByTag("li")
        liList.forEach {
            val text=it.text().trim()
            list.add(text)
        }
        return list;
    }

    fun start() {
        getCollegeList().forEach {
            storer.storeCollege211Item(it)
        }
    }
}