package tiiehenry.crawl.pge.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tiiehenry.crawl.pge.model.ResearchMajor;
/**
*  @author TIIEHenry
*/
public interface ResearchMajorBaseMapper {

    int insertResearchMajor(ResearchMajor object);

    int updateResearchMajor(ResearchMajor object);

    int update(ResearchMajor.UpdateBuilder object);

    List<ResearchMajor> queryResearchMajor(ResearchMajor object);

    ResearchMajor queryResearchMajorLimit1(ResearchMajor object);

}