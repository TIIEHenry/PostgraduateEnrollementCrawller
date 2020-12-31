package tiiehenry.crawl.pge.college.craller

import tiiehenry.crawl.pge.college.data.DBStorer


class Craller {

    val storer: DBStorer = DBStorer()

    fun start() {
//        CollegeFor985Craller(storer).start()
//        CollegeFor211Craller(storer).start()
//        CollegeForCommonCraller(storer).start()

        CollegeForInformationCraller(storer).start()
    }
}