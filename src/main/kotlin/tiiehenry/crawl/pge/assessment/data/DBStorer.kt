package tiiehenry.crawl.pge.assessment.data

import tiiehenry.crawl.pge.assessment.bean.College4RankItem
import tiiehenry.crawl.pge.publicdata.DBManager
import tiiehenry.crawl.pge.mapper.base.CollegeSubjectRankBaseMapper
import tiiehenry.crawl.pge.model.CollegeSubjectRank

class DBStorer {
    val sqlSession = DBManager.openSession()

    val collegeSubjectRankMapper = sqlSession.getMapper(CollegeSubjectRankBaseMapper::class.java)

    fun storeCollege4RankItem(item: College4RankItem) {
        val csr = CollegeSubjectRank().apply {
            collegeCode = item.collegeCode
            subjectCode = item.subjectCode
        }
        val exists =collegeSubjectRankMapper.queryCollegeSubjectRank(csr).size == 0

        csr.apply {
            collegeName = item.collegeName
            subjectName = item.subjectName
            collegeLevel = item.collegeLevel
            collegeLevelString = item.collegeLevelString
        }
        if (exists) {
            collegeSubjectRankMapper.insertCollegeSubjectRank(csr)
        } else {
            collegeSubjectRankMapper.updateCollegeSubjectRank(csr)
        }
    }
}