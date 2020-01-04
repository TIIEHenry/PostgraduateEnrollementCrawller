package tiiehenry.crawl.pge.assessment.bean

enum class Categories(val categoryCode: String, val categoryName: String) {

    人文社科类("01,02,03,04,05,06", "人文社科类"),

    理学("07", "理学"),
    工学("08", "工学"),
    农学("09", "农学"),
    医学("10", "医学"),
    管理学("12", "管理学"),
    艺术学("13", "艺术学");


}