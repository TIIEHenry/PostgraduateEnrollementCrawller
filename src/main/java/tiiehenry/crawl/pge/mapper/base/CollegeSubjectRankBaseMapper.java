package tiiehenry.crawl.pge.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tiiehenry.crawl.pge.model.CollegeSubjectRank;
/**
*  @author TIIEHenry
*/
public interface CollegeSubjectRankBaseMapper {

    int insertCollegeSubjectRank(CollegeSubjectRank object);

    int updateCollegeSubjectRank(CollegeSubjectRank object);

    int update(CollegeSubjectRank.UpdateBuilder object);

    List<CollegeSubjectRank> queryCollegeSubjectRank(CollegeSubjectRank object);

    CollegeSubjectRank queryCollegeSubjectRankLimit1(CollegeSubjectRank object);

}