package tiiehenry.crawl.pge.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tiiehenry.crawl.pge.model.College985;
/**
*  @author TIIEHenry
*/
public interface College985BaseMapper {

    int insertCollege985(College985 object);

    int updateCollege985(College985 object);

    int update(College985.UpdateBuilder object);

    List<College985> queryCollege985(College985 object);

    College985 queryCollege985Limit1(College985 object);

}