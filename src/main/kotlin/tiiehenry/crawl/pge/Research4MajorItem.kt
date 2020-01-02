package tiiehenry.crawl.pge

data class Research4MajorItem(

    val url: String,
    val examWay: String,//考试方式
    val faculty: String,//院系所
    val major: String,//专业
    val majorDirection: String,//研究方向

    val studyWay: String,//学习方式

    val teacher: String,//指导教师
    val enrollmentPlan: String,//拟招生人数
    val examRegionUrl: String,//考试范围
    val examRegionId: String,//考试范围id
    val interdisciplinary: String,//跨专业
    val comment: String //备注,

) {
}