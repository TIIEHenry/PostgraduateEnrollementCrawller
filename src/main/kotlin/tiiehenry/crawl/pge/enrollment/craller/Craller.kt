package tiiehenry.crawl.pge.enrollment.craller

import tiiehenry.crawl.pge.enrollment.data.DBStorer
import tiiehenry.crawl.pge.enrollment.data.LearningStyle
import tiiehenry.crawl.pge.publicdata.Provinces
import tiiehenry.crawl.pge.enrollment.data.Subjects

class Craller {
    val province: Provinces = Provinces.请选择
    val subject: Subjects? = null

    //    val subject: Subjects? = Subjects.计算机科学与技术_0812
    val learningStyle: LearningStyle = LearningStyle.请选择
    val storer: DBStorer = DBStorer()

    fun start() {
        if (subject == null) {
            crawlAllSubjects()
        } else {
            crawlSubject(subject)
        }
        storer.sqlSession.close()
    }

    private fun crawlAllSubjects() {
        var started=false
        Subjects.values().forEach {
            if (it.subjectCode=="1002"){
                started=true
            }
            if (started) {
                crawlSubject(it)
            }
        }
    }

    private fun crawlSubject(subject: Subjects) {
        College4SubjectCraller(province, subject, learningStyle, storer).start()
    }

    companion object {
        val baseUrl = "https://yz.chsi.com.cn"
    }
}