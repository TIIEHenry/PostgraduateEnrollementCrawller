package tiiehenry.crawl.pge.enrollment.craller

import tiiehenry.crawl.pge.enrollment.data.DBStorer
import tiiehenry.crawl.pge.enrollment.data.LearningStyle
import tiiehenry.crawl.pge.publicdata.Provinces
import tiiehenry.crawl.pge.enrollment.data.Subjects

class Craller  {
    val province: Provinces = Provinces.请选择
    val subject: Subjects? = Subjects.计算机科学与技术_0812
    val learningStyle: LearningStyle = LearningStyle.全日制
    val storer: DBStorer = DBStorer()

    fun start() {

        if (subject == null) {
            Subjects.values().forEach {
                College4SubjectCraller(province, it, learningStyle, storer).start()
            }
        } else {
            College4SubjectCraller(province, subject, learningStyle, storer).start()
        }
    }

    companion object {
        val baseUrl = "https://yz.chsi.com.cn"
    }
}