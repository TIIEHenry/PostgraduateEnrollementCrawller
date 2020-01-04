package tiiehenry.crawl.pge.assessment.craller

import tiiehenry.crawl.pge.assessment.bean.Categories
import tiiehenry.crawl.pge.assessment.data.DBStorer

class Craller {
    val category:Categories?=null

    val storer: DBStorer = DBStorer()

    fun start() {
        if (category == null) {
            Categories.values().forEach {
                College4RankCraller( it,storer).start()
            }
        } else {
            College4RankCraller(category,storer).start()
        }

    }

}
