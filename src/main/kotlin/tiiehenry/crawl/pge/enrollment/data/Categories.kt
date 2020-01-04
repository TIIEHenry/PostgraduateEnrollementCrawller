package tiiehenry.crawl.pge.enrollment.data
//var text="";$("#mldm option").map(function(){var name=$(this).text().substring(4);text=text+name+"("+$(this).val()+","+"\""+name+"\""+"),\n"});text
@Deprecated("没用好像，还是要根据学科类别")
enum class Categories(val categoryCode: String, val categoryName: String, val degree: 学位 = 学位.学术学位) {
    专业学位("zyxw", "专业学位", 学位.专业学位),

    哲学("01", "哲学"),
    经济学("02", "经济学"),
    法学("03", "法学"),
    教育学("04", "教育学"),
    文学("05", "文学"),
    历史学("06", "历史学"),
    理学("07", "理学"),
    工学("08", "工学"),
    农学("09", "农学"),
    医学("10", "医学"),
    军事学("11", "军事学"),
    管理学("12", "管理学"),
    艺术学("13", "艺术学");


}