package tiiehenry.crawl.pge.college.craller

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import tiiehenry.crawl.pge.college.data.DBStorer

class CollegeFor985Craller(val storer:DBStorer) {
    private fun getDocumentForPage(): Document {
        return Jsoup.connect("http://www.chinadegrees.cn/xwyyjsjyxx/xwbl/zdjs/985gc/index.shtml")
            .headers(
                mapOf(
                    "User-Agent" to "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3298.3 Safari/537.36",
                    "Host" to "https://yz.chsi.com.cn"
                )
            ).get()
    }
    fun getCollegeList(): MutableList<String> {
        val list= mutableListOf<String>()
        val doc=getDocumentForPage()
        val tdList=doc.getElementsByClass("MsoNormalTable")[0].child(0).getElementsByTag("td")
        tdList.forEach {
            val text=it.child(0).child(0).text().trim()
            list.add(text)
        }
        return list;
    }

    fun start() {
        getCollegeList().forEach {
            storer.storeCollege985Item(it)
        }
    }
}