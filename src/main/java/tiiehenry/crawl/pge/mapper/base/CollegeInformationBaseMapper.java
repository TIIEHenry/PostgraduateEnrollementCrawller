package tiiehenry.crawl.pge.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tiiehenry.crawl.pge.model.CollegeInformation;
/**
*  @author TIIEHenry
*/
public interface CollegeInformationBaseMapper {

    int insertCollegeInformation(CollegeInformation object);

    int updateCollegeInformation(CollegeInformation object);

    int update(CollegeInformation.UpdateBuilder object);

    List<CollegeInformation> queryCollegeInformation(CollegeInformation object);

    CollegeInformation queryCollegeInformationLimit1(CollegeInformation object);

}