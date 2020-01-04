package tiiehenry.crawl.pge.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tiiehenry.crawl.pge.model.College211;
/**
*  @author TIIEHenry
*/
public interface College211BaseMapper {

    int insertCollege211(College211 object);

    int updateCollege211(College211 object);

    int update(College211.UpdateBuilder object);

    List<College211> queryCollege211(College211 object);

    College211 queryCollege211Limit1(College211 object);

}