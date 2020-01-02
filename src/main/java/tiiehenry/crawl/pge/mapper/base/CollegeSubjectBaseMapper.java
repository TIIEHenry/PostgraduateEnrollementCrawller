package tiiehenry.crawl.pge.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tiiehenry.crawl.pge.model.CollegeSubject;
/**
*  @author TIIEHenry
*/
public interface CollegeSubjectBaseMapper {

    int insertCollegeSubject(CollegeSubject object);

    int updateCollegeSubject(CollegeSubject object);

    int update(CollegeSubject.UpdateBuilder object);

    List<CollegeSubject> queryCollegeSubject(CollegeSubject object);

    CollegeSubject queryCollegeSubjectLimit1(CollegeSubject object);

}