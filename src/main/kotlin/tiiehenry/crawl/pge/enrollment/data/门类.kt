package tiiehenry.crawl.pge.enrollment.data

enum class 门类(val code: String, val label: String) {
    选择门类("", "选择门类"),
    专业学位("zyxw", "专业学位"),
    哲学("01", "(01)哲学"),
    经济学("02", "(02)经济学"),
    法学("03", "(03)法学"),
    教育学("04", "(04)教育学"),
    文学("05", "(05)文学"),
    历史学("06", "(06)历史学"),
    理学("07", "(07)理学"),
    工学("08", "(08)工学"),
    农学("09", "(09)农学"),
    医学("10", "(10)医学"),
    军事学("11", "(11)军事学"),
    管理学("12", "(12)管理学"),
    艺术学("13", "(13)艺术学"),
    ;

    companion object {

        fun fromCode(code: String): 门类 {
            values().forEach {
                if (it.code == code)
                    return it
            }
            return 选择门类
//        if (code=="专业学位")
        }
    }
}