package tiiehenry.crawl.pge.enrollment

import tiiehenry.crawl.pge.enrollment.craller.Craller

class PGEMain {


    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
//            launch(MainApplication::class.java)

            Craller().start()
        }
    }
}