package tiiehenry.crawl.pge.college.craller

import org.jsoup.HttpStatusException
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import tiiehenry.crawl.pge.college.bean.CollegeForInformationItem
import tiiehenry.crawl.pge.college.data.DBStorer
//college_information
//http://college.gaokao.com/schlist
class CollegeForInformationCraller(val storer: DBStorer) {
    val url = "http://college.gaokao.com/schlist"
    private fun getDocumentForPage(pageNo: Int): Document {
        while (true) {
            try {
                return Jsoup.connect("$url/p$pageNo")
                    .headers(
                        mapOf(
                            "User-Agent" to "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3298.3 Safari/537.36",
                            "Host" to "http://college.gaokao.com"
                        )
                    ).get()
            } catch (e: HttpStatusException) {
                e.printStackTrace()
                try {
                    Thread.sleep(100)
                } catch (e: InterruptedException) {

                }
            }
        }
    }

    fun getCollegeForInformationItemList(doc: Document): ArrayList<CollegeForInformationItem> {
        val list = arrayListOf<CollegeForInformationItem>()
        val scores_List = doc.getElementsByClass("scores_List").first()
        val dlList = scores_List.getElementsByTag("dl")
        dlList.forEach {
            var collegeUrlExtra=""
            var logoUrl=""
            var collegeName=""
            val aOrImg = it.child(0).child(0)
            if (aOrImg.tagName()=="a"){
                collegeUrlExtra = aOrImg.attr("href")
                logoUrl = aOrImg.child(0).attr("src")
                collegeName = aOrImg.child(0).attr("alt")
            }else{
                collegeName = aOrImg.attr("alt")
            }
            val ul = it.child(1).child(1)
            val provinceName = ul.child(0).text().substringAfter("：")
            var collegeFeature = ""
            ul.child(1).getElementsByTag("span").forEach {
                collegeFeature += it.text() + ";"
            }

            val collegeType = ul.child(2).text().substringAfter("：")
            val competentDepartment = ul.child(3).text().substringAfter("：")
            val collegeLevel = ul.child(4).text().substringAfter("：")
            val collegeUrl = ul.child(5).text().substringAfter("：")


            val item = CollegeForInformationItem(
                collegeName,
                collegeType,
                collegeLevel,
                collegeFeature,
                collegeUrl,
                collegeUrlExtra,
                competentDepartment,
                logoUrl,
                provinceName
            )
//            println(item)

            list.add(item)
        }
        return list;
    }

    fun isHavaNextPage(doc: Document, pageNo: Int): Boolean {
        val li = doc.getElementById("qx")
        val liNext = li.previousElementSibling().previousElementSibling()
        if (liNext.children().size>0) {
            return true
        }
        return false
    }

    fun getCollegeForInformationItemListFromPage(page: Int): MutableList<CollegeForInformationItem> {
        val list = arrayListOf<CollegeForInformationItem>()
        var pageNo = page;
        var doc = getDocumentForPage(pageNo)
        list.addAll(getCollegeForInformationItemList(doc))
        while (isHavaNextPage(doc, pageNo)) {
            pageNo++;
            println("pageNo::" + pageNo)
            doc = getDocumentForPage(pageNo)
//            println(doc)
/*            File("C:\\Users\\AnyWin\\Desktop\\a.html").writeText(
                doc.toString()
            )*/
//            exitProcess(0)
            val pageList = getCollegeForInformationItemList(doc).apply {
                forEach {
                    storer.storeCollegeForInformationItem(it)
                }
            }
            list.addAll(pageList)
        }
        return list
    }

    fun getCollegeForInformationItemList(): MutableList<CollegeForInformationItem> {
        return getCollegeForInformationItemListFromPage(1)
    }

    fun start() {
//        val doc = getDocumentForPage(1)
////        println(doc)
//        File("C:\\Users\\AnyWin\\Desktop\\a.html").writeText(
//            doc.toString()
//        )
        getCollegeForInformationItemList().forEach {
            //            storer.storeCollegeForInformationItem(it)
        }
    }


    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
//            launch(MainApplication::class.java)
            val storer = DBStorer()
            CollegeForInformationCraller(storer).start()
//            CollegeForInformationCraller(storer).getCollegeForInformationItemListFromPage(104)
        }
    }
}