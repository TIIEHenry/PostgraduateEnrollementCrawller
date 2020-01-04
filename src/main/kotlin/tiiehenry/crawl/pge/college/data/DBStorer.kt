package tiiehenry.crawl.pge.college.data

import tiiehenry.crawl.pge.college.bean.CollegeForCommonItem
import tiiehenry.crawl.pge.college.bean.CollegeForInformationItem
import tiiehenry.crawl.pge.mapper.base.College211BaseMapper
import tiiehenry.crawl.pge.mapper.base.College985BaseMapper
import tiiehenry.crawl.pge.mapper.base.CollegeCommonBaseMapper
import tiiehenry.crawl.pge.mapper.base.CollegeInformationBaseMapper
import tiiehenry.crawl.pge.model.College211
import tiiehenry.crawl.pge.model.College985
import tiiehenry.crawl.pge.model.CollegeCommon
import tiiehenry.crawl.pge.model.CollegeInformation
import tiiehenry.crawl.pge.publicdata.DBManager


class DBStorer {
    val sqlSession = DBManager.openSession()

    val college985Mapper = sqlSession.getMapper(College985BaseMapper::class.java)
    val college211Mapper = sqlSession.getMapper(College211BaseMapper::class.java)
    val collegeCommonMapper = sqlSession.getMapper(CollegeCommonBaseMapper::class.java)
    val collegeInformationMapper = sqlSession.getMapper(CollegeInformationBaseMapper::class.java)

    fun storeCollege985Item(item: String) {
        val csr = College985().apply {
            collegeName = item
        }
//        println(item)
        if (college985Mapper.queryCollege985(csr).size == 0) {
            college985Mapper.insertCollege985(csr)
        } else {
            college985Mapper.updateCollege985(csr)
        }
    }

    fun storeCollege211Item(item: String) {
        val csr = College211().apply {
            collegeName = item
        }
        if (college211Mapper.queryCollege211(csr).size == 0) {
            college211Mapper.insertCollege211(csr)
        } else {
            college211Mapper.updateCollege211(csr)
        }
    }

    fun storeCollegeForCommonItem(item: CollegeForCommonItem) {
        val cc = CollegeCommon().apply {
            collegeName = item.collegeName
            competentDepartment = item.competentDepartment
            location = item.location
            level = item.level
        }
        val exists = collegeCommonMapper.queryCollegeCommon(cc).size == 0
        cc.apply {
            competentDepartment = item.competentDepartment
            location = item.location
            level = item.level
        }
        if (exists) {
            collegeCommonMapper.insertCollegeCommon(cc)
        } else {
            collegeCommonMapper.updateCollegeCommon(cc)
        }
    }

    fun storeCollegeForInformationItem(item: CollegeForInformationItem) {
        val ci = CollegeInformation().apply {
            collegeName = item.collegeName
        }
        val exists = collegeInformationMapper.queryCollegeInformation(ci).size == 0
        ci.apply {
            collegeType = item.collegeType
            collegeLevel = item.collegeLevel
            collegeFeature = item.collegeFeature
            collegeUrl = item.collegeUrl
            collegeUrlExtra = item.collegeUrlExtra
            competentDepartment = item.competentDepartment
            logoUrl = item.logoUrl
            provinceName = item.provinceName
        }
        if (exists) {
            collegeInformationMapper.insertCollegeInformation(ci)
        } else {
            collegeInformationMapper.updateCollegeInformation(ci)
        }
    }
}