package tiiehenry.crawl.pge

import tiiehenry.crawl.pge.data.LearningStyle
import tiiehenry.crawl.pge.data.Provinces
import tiiehenry.crawl.pge.data.Subjects

class Craller  {
    val province: Provinces = Provinces.请选择
    val subject: Subjects? = null/*Subjects.世界史_0603*/
    val learningStyle: LearningStyle = LearningStyle.全日制
    val storer: Storer= Storer()

    fun start() {

        if (subject == null) {
            Subjects.values().forEach {
                College4SubjectCraller(province, it, learningStyle,storer).start()
            }
        } else {
            College4SubjectCraller(province, subject, learningStyle,storer).start()
        }
    }

    companion object {
        val baseUrl = "https://yz.chsi.com.cn"
    }
}