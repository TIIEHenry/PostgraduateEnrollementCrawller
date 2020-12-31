package tiiehenry.crawl.pge.enrollment

import tiiehenry.crawl.pge.enrollment.craller.Craller

/**
 * 研招网
 * @link https://yz.chsi.com.cn/zsml/zyfx_search.jsp
 */
class PGEMain {


    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
//            launch(MainApplication::class.java)

            Craller().start()
        }
    }
}