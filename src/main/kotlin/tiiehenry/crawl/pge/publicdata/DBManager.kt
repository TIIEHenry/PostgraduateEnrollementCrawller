package tiiehenry.crawl.pge.publicdata

import org.apache.ibatis.session.SqlSession
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import tiiehenry.crawl.pge.mapper.base.ResearchMajorBaseMapper
import tiiehenry.crawl.pge.model.ResearchMajor



class DBManager {

    companion object {
        fun openSession(): SqlSession {
            val sqlSessionFactory = SqlSessionFactoryBuilder().build(
                DBManager::class.java.classLoader.getResourceAsStream("mybatis-config.xml")
            )
            return sqlSessionFactory.openSession(true)
        }

        @JvmStatic
        fun main(args: Array<String>) {
            val sqlSession = openSession()

            val researchMajorMapper = sqlSession.getMapper(ResearchMajorBaseMapper::class.java)
            println(researchMajorMapper)
            researchMajorMapper.insertResearchMajor(ResearchMajor().apply {

                url = "sa"
                examWay = ""//考试方式
                faculty = ""//院系所
                major = ""//专业
                majorDirection = ""//研究方向

                studyWay = ""//学习方式

                teacher = ""//指导教师
                enrollmentPlan = ""//拟招生人数
                examRegionUrl = ""//考试范围
                examRegionId = ""//考试范围id
                interdisciplinary = ""//跨专业
                comment = "" //备注            })
            })
            sqlSession.commit()
        }
    }
}