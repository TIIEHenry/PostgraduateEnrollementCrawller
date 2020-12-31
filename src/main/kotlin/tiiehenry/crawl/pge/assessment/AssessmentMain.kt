package tiiehenry.crawl.pge.assessment

import tiiehenry.crawl.pge.assessment.craller.Craller

/**
 * http://www.cdgdc.edu.cn/xwyyjsjyxx/xkpgjg/
 */
class AssessmentMain {


        companion object {

            @JvmStatic
            fun main(args: Array<String>) {
//            launch(MainApplication::class.java)

                Craller().start()
            }
        }
}