package tiiehenry.crawl.pge.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tiiehenry.crawl.pge.model.ExamregionResearch;
/**
*  @author TIIEHenry
*/
public interface ExamregionResearchBaseMapper {

    int insertExamregionResearch(ExamregionResearch object);

    int updateExamregionResearch(ExamregionResearch object);

    int update(ExamregionResearch.UpdateBuilder object);

    List<ExamregionResearch> queryExamregionResearch(ExamregionResearch object);

    ExamregionResearch queryExamregionResearchLimit1(ExamregionResearch object);

}