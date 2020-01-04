package tiiehenry.crawl.pge.college

import tiiehenry.crawl.pge.college.craller.Craller

class SCMain {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
//            launch(MainApplication::class.java)

            Craller().start()
        }
    }
}