package tiiehenry.crawl.pge.assessment.craller

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import tiiehenry.crawl.pge.assessment.bean.Categories
import tiiehenry.crawl.pge.assessment.bean.College4RankItem
import tiiehenry.crawl.pge.assessment.data.DBStorer
import java.io.File
//college_subject_rank
//http://www.cdgdc.edu.cn/webrms/pages/Ranking/
class College4RankCraller(
    val category: Categories,
    val storer: DBStorer
) {
    val pageUrl = "http://www.cdgdc.edu.cn/webrms/pages/Ranking/"
//http://www.cdgdc.edu.cn/xwyyjsjyxx/xkpgjg/

    private fun getDocumentForPage(subjectCode: String = ""): Document {
        return Jsoup.connect("http://www.cdgdc.edu.cn/webrms/pages/Ranking/xkpmGXZJ2016.jsp?=")
            .data("xkdm", category.categoryCode)
            .data("yjxkdm", subjectCode)
            .headers(
                mapOf(
                    "User-Agent" to "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3298.3 Safari/537.36",
                    "Host" to "https://yz.chsi.com.cn"
                )
            ).get()
    }

    private fun getLevelString(level: Int): String {
        return when (level) {
            0 -> "A+"
            1 -> "A"
            2 -> "A-"
            3 -> "B+"
            4 -> "B"
            5 -> "B-"
            6 -> "C+"
            7 -> "C"
            8 -> "C-"
            else -> "?"
        }
    }

    private fun getStyleColor(style: String): String {
        return style.substringAfter("#")
    }

    fun getCollegeRankList(subjectCode: String, subjectName: String): MutableList<College4RankItem> {
        val list = mutableListOf<College4RankItem>()
        val doc = getDocumentForPage(subjectCode)
        val pageBody = doc.getElementById("pbg0")
        val tdRight = pageBody.child(0).child(0).child(0).child(2)
        val tr = tdRight.child(0).child(0).child(3)
        val tbody = tr.child(0).child(0).child(0).child(0)
        val trList = tbody.children()
        var level = 0
        var lastColor = getStyleColor(trList[0].attr("style"))
        trList.forEach {
            val style = it.attr("style")
            val styleColor = getStyleColor(style);
            if (styleColor != lastColor) {
                lastColor = styleColor
                level++
            }
//            println(style)
            val text = it.getElementsByTag("div")[0].text().replace("&nbsp;"," ")
//            File("C:\\Users\\AnyWin\\Desktop\\a.txt").writeText(text)
//            println(text)
            val collegeCode = text.substringBefore(" ").trim()
            val collegeName = text.substringAfterLast(" ").trim()
            val item = College4RankItem(
                subjectCode,
                subjectName,
                collegeCode,
                collegeName,
                collegeLevel = level,
                collegeLevelString = getLevelString(level)
            )
            list.add(item)
        }
        return list
    }

    fun getSubjectList(): MutableList<String> {
        val subjectList = mutableListOf<String>()
        val doc = getDocumentForPage()
        val table = doc.getElementById("leftgundong").child(0)
        val pList = table.child(0).child(0).child(0).children()
        pList.forEach {
            val text = it.child(0).text()
            subjectList.add(text)
        }
        return subjectList
    }

    fun start() {
        getSubjectList().forEach { text ->
            val subjectCode = text.substringBefore(" ")
            val subjectName = text.substringAfter(" ")
            getCollegeRankList(subjectCode, subjectName).forEach {
                storer.storeCollege4RankItem(it)
//                println()
            }
        }
    }
}