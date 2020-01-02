package tiiehenry.crawl.pge

import tiiehenry.crawl.pge.mapper.CollegeSubjectMapper
import tiiehenry.crawl.pge.mapper.ExamregionResearchMapper
import tiiehenry.crawl.pge.mapper.ResearchMajorMapper
import tiiehenry.crawl.pge.mapper.base.CollegeSubjectBaseMapper
import tiiehenry.crawl.pge.mapper.base.ExamregionResearchBaseMapper
import tiiehenry.crawl.pge.mapper.base.ResearchMajorBaseMapper
import tiiehenry.crawl.pge.model.CollegeSubject
import tiiehenry.crawl.pge.model.ExamregionResearch
import tiiehenry.crawl.pge.model.ResearchMajor

class Storer {
    val sqlSession = DBServer.openSession()

    val collegeSubjectMapper = sqlSession.getMapper(CollegeSubjectBaseMapper::class.java)
    val examregionResearchMapper = sqlSession.getMapper(ExamregionResearchBaseMapper::class.java)
    val researchMajorMapper = sqlSession.getMapper(ResearchMajorBaseMapper::class.java)

    fun storeCollege4SubjectItem(item: College4SubjectItem) {
        val cs = CollegeSubject().apply {
            url = item.url
            collegeCode = item.collegeCode
            collegeName = item.collegeName
            provinceCode = item.provinceCode
            provinceName = item.provinceName
            graduateSchool = if (item.graduateSchool) 0 else 1
            selfScribing = if (item.selfScribing) 0 else 1
            doctorStation = if (item.doctorStation) 0 else 1
            subjectCode = item.subjectCode
            subjectName = item.subjectName
        }
        if (collegeSubjectMapper.queryCollegeSubject(cs).size == 0) {
            collegeSubjectMapper.insertCollegeSubject(cs)
        } else {
            collegeSubjectMapper.updateCollegeSubject(cs)
        }
    }


    fun storeExamRegion4ResearchItem(item: ExamRegion4ResearchItem) {
        val er = ExamregionResearch().apply {

            id = item.id
            index = item.index
            politics = item.politics
            english = item.english
            section1 = item.section1
            section2 = item.section2

        }
        if (examregionResearchMapper.queryExamregionResearch(er).size == 0) {
            examregionResearchMapper.insertExamregionResearch(er)
        } else {
            examregionResearchMapper.updateExamregionResearch(er)
        }
    }

    fun storeResearch4MajorItem(item: Research4MajorItem) {
        val rm = ResearchMajor().apply {

            url = item.url
            examWay = item.examWay//考试方式
            faculty = item.faculty//院系所
            major = item.major//专业
            majorDirection = item.majorDirection//研究方向

            studyWay = item.studyWay//学习方式

            teacher = item.teacher//指导教师
            enrollmentPlan = item.enrollmentPlan//拟招生人数
            examRegionUrl = item.examRegionUrl//考试范围
            examRegionId = item.examRegionId//考试范围id
            interdisciplinary = item.interdisciplinary//跨专业
            comment = item.comment //备注,
        }
        if (researchMajorMapper.queryResearchMajor(rm).size == 0) {
            researchMajorMapper.insertResearchMajor(rm)
        } else {
            researchMajorMapper.updateResearchMajor(rm)
        }
    }
}