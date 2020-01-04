package tiiehenry.crawl.pge.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tiiehenry.crawl.pge.model.CollegeCommon;
/**
*  @author TIIEHenry
*/
public interface CollegeCommonBaseMapper {

    int insertCollegeCommon(CollegeCommon object);

    int updateCollegeCommon(CollegeCommon object);

    int update(CollegeCommon.UpdateBuilder object);

    List<CollegeCommon> queryCollegeCommon(CollegeCommon object);

    CollegeCommon queryCollegeCommonLimit1(CollegeCommon object);

}