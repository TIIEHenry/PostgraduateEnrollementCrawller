package tiiehenry.crawl.pge

data class College4SubjectItem(
    val url: String,//链接
    val collegeCode: String,//大学编码
    val collegeName: String,//大学名称
    val provinceCode: String,//所在地区
    val provinceName: String,//所在地区

    val graduateSchool: Boolean,//研究生院
    val selfScribing: Boolean,//自划线
    val doctorStation: Boolean,//博士点

    val subjectCode: String,//大学编码
    val subjectName: String//大学名称
//    val research4MajorItemList: MutableList<Research4MajorItem> = arrayListOf()
) {
}