package tiiehenry.crawl.pge.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author TIIEHenry
*/
public class ExamregionResearch implements Serializable {

    private static final long serialVersionUID = 1577943552038L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String id;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer index;

    /**
    * 
    * isNullAble:1
    */
    private String politics;

    /**
    * 
    * isNullAble:1
    */
    private String english;

    /**
    * 
    * isNullAble:1
    */
    private String section1;

    /**
    * 
    * isNullAble:1
    */
    private String section2;


    public void setId(String id){this.id = id;}

    public String getId(){return this.id;}

    public void setIndex(Integer index){this.index = index;}

    public Integer getIndex(){return this.index;}

    public void setPolitics(String politics){this.politics = politics;}

    public String getPolitics(){return this.politics;}

    public void setEnglish(String english){this.english = english;}

    public String getEnglish(){return this.english;}

    public void setSection1(String section1){this.section1 = section1;}

    public String getSection1(){return this.section1;}

    public void setSection2(String section2){this.section2 = section2;}

    public String getSection2(){return this.section2;}
    @Override
    public String toString() {
        return "ExamregionResearch{" +
                "id='" + id + '\'' +
                "index='" + index + '\'' +
                "politics='" + politics + '\'' +
                "english='" + english + '\'' +
                "section1='" + section1 + '\'' +
                "section2='" + section2 + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ExamregionResearch set;

        private ConditionBuilder where;

        public UpdateBuilder set(ExamregionResearch set){
            this.set = set;
            return this;
        }

        public ExamregionResearch getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends ExamregionResearch{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> idList;

        public List<String> getIdList(){return this.idList;}


        private List<String> fuzzyId;

        public List<String> getFuzzyId(){return this.fuzzyId;}

        private List<String> rightFuzzyId;

        public List<String> getRightFuzzyId(){return this.rightFuzzyId;}
        private List<Integer> indexList;

        public List<Integer> getIndexList(){return this.indexList;}

        private Integer indexSt;

        private Integer indexEd;

        public Integer getIndexSt(){return this.indexSt;}

        public Integer getIndexEd(){return this.indexEd;}

        private List<String> politicsList;

        public List<String> getPoliticsList(){return this.politicsList;}


        private List<String> fuzzyPolitics;

        public List<String> getFuzzyPolitics(){return this.fuzzyPolitics;}

        private List<String> rightFuzzyPolitics;

        public List<String> getRightFuzzyPolitics(){return this.rightFuzzyPolitics;}
        private List<String> englishList;

        public List<String> getEnglishList(){return this.englishList;}


        private List<String> fuzzyEnglish;

        public List<String> getFuzzyEnglish(){return this.fuzzyEnglish;}

        private List<String> rightFuzzyEnglish;

        public List<String> getRightFuzzyEnglish(){return this.rightFuzzyEnglish;}
        private List<String> section1List;

        public List<String> getSection1List(){return this.section1List;}


        private List<String> fuzzySection1;

        public List<String> getFuzzySection1(){return this.fuzzySection1;}

        private List<String> rightFuzzySection1;

        public List<String> getRightFuzzySection1(){return this.rightFuzzySection1;}
        private List<String> section2List;

        public List<String> getSection2List(){return this.section2List;}


        private List<String> fuzzySection2;

        public List<String> getFuzzySection2(){return this.fuzzySection2;}

        private List<String> rightFuzzySection2;

        public List<String> getRightFuzzySection2(){return this.rightFuzzySection2;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyId (List<String> fuzzyId){
            this.fuzzyId = fuzzyId;
            return this;
        }

        public QueryBuilder fuzzyId (String ... fuzzyId){
            this.fuzzyId = solveNullList(fuzzyId);
            return this;
        }

        public QueryBuilder rightFuzzyId (List<String> rightFuzzyId){
            this.rightFuzzyId = rightFuzzyId;
            return this;
        }

        public QueryBuilder rightFuzzyId (String ... rightFuzzyId){
            this.rightFuzzyId = solveNullList(rightFuzzyId);
            return this;
        }

        public QueryBuilder id(String id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(String ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<String> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder indexBetWeen(Integer indexSt,Integer indexEd){
            this.indexSt = indexSt;
            this.indexEd = indexEd;
            return this;
        }

        public QueryBuilder indexGreaterEqThan(Integer indexSt){
            this.indexSt = indexSt;
            return this;
        }
        public QueryBuilder indexLessEqThan(Integer indexEd){
            this.indexEd = indexEd;
            return this;
        }


        public QueryBuilder index(Integer index){
            setIndex(index);
            return this;
        }

        public QueryBuilder indexList(Integer ... index){
            this.indexList = solveNullList(index);
            return this;
        }

        public QueryBuilder indexList(List<Integer> index){
            this.indexList = index;
            return this;
        }

        public QueryBuilder fetchIndex(){
            setFetchFields("fetchFields","index");
            return this;
        }

        public QueryBuilder excludeIndex(){
            setFetchFields("excludeFields","index");
            return this;
        }

        public QueryBuilder fuzzyPolitics (List<String> fuzzyPolitics){
            this.fuzzyPolitics = fuzzyPolitics;
            return this;
        }

        public QueryBuilder fuzzyPolitics (String ... fuzzyPolitics){
            this.fuzzyPolitics = solveNullList(fuzzyPolitics);
            return this;
        }

        public QueryBuilder rightFuzzyPolitics (List<String> rightFuzzyPolitics){
            this.rightFuzzyPolitics = rightFuzzyPolitics;
            return this;
        }

        public QueryBuilder rightFuzzyPolitics (String ... rightFuzzyPolitics){
            this.rightFuzzyPolitics = solveNullList(rightFuzzyPolitics);
            return this;
        }

        public QueryBuilder politics(String politics){
            setPolitics(politics);
            return this;
        }

        public QueryBuilder politicsList(String ... politics){
            this.politicsList = solveNullList(politics);
            return this;
        }

        public QueryBuilder politicsList(List<String> politics){
            this.politicsList = politics;
            return this;
        }

        public QueryBuilder fetchPolitics(){
            setFetchFields("fetchFields","politics");
            return this;
        }

        public QueryBuilder excludePolitics(){
            setFetchFields("excludeFields","politics");
            return this;
        }

        public QueryBuilder fuzzyEnglish (List<String> fuzzyEnglish){
            this.fuzzyEnglish = fuzzyEnglish;
            return this;
        }

        public QueryBuilder fuzzyEnglish (String ... fuzzyEnglish){
            this.fuzzyEnglish = solveNullList(fuzzyEnglish);
            return this;
        }

        public QueryBuilder rightFuzzyEnglish (List<String> rightFuzzyEnglish){
            this.rightFuzzyEnglish = rightFuzzyEnglish;
            return this;
        }

        public QueryBuilder rightFuzzyEnglish (String ... rightFuzzyEnglish){
            this.rightFuzzyEnglish = solveNullList(rightFuzzyEnglish);
            return this;
        }

        public QueryBuilder english(String english){
            setEnglish(english);
            return this;
        }

        public QueryBuilder englishList(String ... english){
            this.englishList = solveNullList(english);
            return this;
        }

        public QueryBuilder englishList(List<String> english){
            this.englishList = english;
            return this;
        }

        public QueryBuilder fetchEnglish(){
            setFetchFields("fetchFields","english");
            return this;
        }

        public QueryBuilder excludeEnglish(){
            setFetchFields("excludeFields","english");
            return this;
        }

        public QueryBuilder fuzzySection1 (List<String> fuzzySection1){
            this.fuzzySection1 = fuzzySection1;
            return this;
        }

        public QueryBuilder fuzzySection1 (String ... fuzzySection1){
            this.fuzzySection1 = solveNullList(fuzzySection1);
            return this;
        }

        public QueryBuilder rightFuzzySection1 (List<String> rightFuzzySection1){
            this.rightFuzzySection1 = rightFuzzySection1;
            return this;
        }

        public QueryBuilder rightFuzzySection1 (String ... rightFuzzySection1){
            this.rightFuzzySection1 = solveNullList(rightFuzzySection1);
            return this;
        }

        public QueryBuilder section1(String section1){
            setSection1(section1);
            return this;
        }

        public QueryBuilder section1List(String ... section1){
            this.section1List = solveNullList(section1);
            return this;
        }

        public QueryBuilder section1List(List<String> section1){
            this.section1List = section1;
            return this;
        }

        public QueryBuilder fetchSection1(){
            setFetchFields("fetchFields","section1");
            return this;
        }

        public QueryBuilder excludeSection1(){
            setFetchFields("excludeFields","section1");
            return this;
        }

        public QueryBuilder fuzzySection2 (List<String> fuzzySection2){
            this.fuzzySection2 = fuzzySection2;
            return this;
        }

        public QueryBuilder fuzzySection2 (String ... fuzzySection2){
            this.fuzzySection2 = solveNullList(fuzzySection2);
            return this;
        }

        public QueryBuilder rightFuzzySection2 (List<String> rightFuzzySection2){
            this.rightFuzzySection2 = rightFuzzySection2;
            return this;
        }

        public QueryBuilder rightFuzzySection2 (String ... rightFuzzySection2){
            this.rightFuzzySection2 = solveNullList(rightFuzzySection2);
            return this;
        }

        public QueryBuilder section2(String section2){
            setSection2(section2);
            return this;
        }

        public QueryBuilder section2List(String ... section2){
            this.section2List = solveNullList(section2);
            return this;
        }

        public QueryBuilder section2List(List<String> section2){
            this.section2List = section2;
            return this;
        }

        public QueryBuilder fetchSection2(){
            setFetchFields("fetchFields","section2");
            return this;
        }

        public QueryBuilder excludeSection2(){
            setFetchFields("excludeFields","section2");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public ExamregionResearch build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> idList;

        public List<String> getIdList(){return this.idList;}


        private List<String> fuzzyId;

        public List<String> getFuzzyId(){return this.fuzzyId;}

        private List<String> rightFuzzyId;

        public List<String> getRightFuzzyId(){return this.rightFuzzyId;}
        private List<Integer> indexList;

        public List<Integer> getIndexList(){return this.indexList;}

        private Integer indexSt;

        private Integer indexEd;

        public Integer getIndexSt(){return this.indexSt;}

        public Integer getIndexEd(){return this.indexEd;}

        private List<String> politicsList;

        public List<String> getPoliticsList(){return this.politicsList;}


        private List<String> fuzzyPolitics;

        public List<String> getFuzzyPolitics(){return this.fuzzyPolitics;}

        private List<String> rightFuzzyPolitics;

        public List<String> getRightFuzzyPolitics(){return this.rightFuzzyPolitics;}
        private List<String> englishList;

        public List<String> getEnglishList(){return this.englishList;}


        private List<String> fuzzyEnglish;

        public List<String> getFuzzyEnglish(){return this.fuzzyEnglish;}

        private List<String> rightFuzzyEnglish;

        public List<String> getRightFuzzyEnglish(){return this.rightFuzzyEnglish;}
        private List<String> section1List;

        public List<String> getSection1List(){return this.section1List;}


        private List<String> fuzzySection1;

        public List<String> getFuzzySection1(){return this.fuzzySection1;}

        private List<String> rightFuzzySection1;

        public List<String> getRightFuzzySection1(){return this.rightFuzzySection1;}
        private List<String> section2List;

        public List<String> getSection2List(){return this.section2List;}


        private List<String> fuzzySection2;

        public List<String> getFuzzySection2(){return this.fuzzySection2;}

        private List<String> rightFuzzySection2;

        public List<String> getRightFuzzySection2(){return this.rightFuzzySection2;}

        public ConditionBuilder fuzzyId (List<String> fuzzyId){
            this.fuzzyId = fuzzyId;
            return this;
        }

        public ConditionBuilder fuzzyId (String ... fuzzyId){
            this.fuzzyId = solveNullList(fuzzyId);
            return this;
        }

        public ConditionBuilder rightFuzzyId (List<String> rightFuzzyId){
            this.rightFuzzyId = rightFuzzyId;
            return this;
        }

        public ConditionBuilder rightFuzzyId (String ... rightFuzzyId){
            this.rightFuzzyId = solveNullList(rightFuzzyId);
            return this;
        }

        public ConditionBuilder idList(String ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<String> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder indexBetWeen(Integer indexSt,Integer indexEd){
            this.indexSt = indexSt;
            this.indexEd = indexEd;
            return this;
        }

        public ConditionBuilder indexGreaterEqThan(Integer indexSt){
            this.indexSt = indexSt;
            return this;
        }
        public ConditionBuilder indexLessEqThan(Integer indexEd){
            this.indexEd = indexEd;
            return this;
        }


        public ConditionBuilder indexList(Integer ... index){
            this.indexList = solveNullList(index);
            return this;
        }

        public ConditionBuilder indexList(List<Integer> index){
            this.indexList = index;
            return this;
        }

        public ConditionBuilder fuzzyPolitics (List<String> fuzzyPolitics){
            this.fuzzyPolitics = fuzzyPolitics;
            return this;
        }

        public ConditionBuilder fuzzyPolitics (String ... fuzzyPolitics){
            this.fuzzyPolitics = solveNullList(fuzzyPolitics);
            return this;
        }

        public ConditionBuilder rightFuzzyPolitics (List<String> rightFuzzyPolitics){
            this.rightFuzzyPolitics = rightFuzzyPolitics;
            return this;
        }

        public ConditionBuilder rightFuzzyPolitics (String ... rightFuzzyPolitics){
            this.rightFuzzyPolitics = solveNullList(rightFuzzyPolitics);
            return this;
        }

        public ConditionBuilder politicsList(String ... politics){
            this.politicsList = solveNullList(politics);
            return this;
        }

        public ConditionBuilder politicsList(List<String> politics){
            this.politicsList = politics;
            return this;
        }

        public ConditionBuilder fuzzyEnglish (List<String> fuzzyEnglish){
            this.fuzzyEnglish = fuzzyEnglish;
            return this;
        }

        public ConditionBuilder fuzzyEnglish (String ... fuzzyEnglish){
            this.fuzzyEnglish = solveNullList(fuzzyEnglish);
            return this;
        }

        public ConditionBuilder rightFuzzyEnglish (List<String> rightFuzzyEnglish){
            this.rightFuzzyEnglish = rightFuzzyEnglish;
            return this;
        }

        public ConditionBuilder rightFuzzyEnglish (String ... rightFuzzyEnglish){
            this.rightFuzzyEnglish = solveNullList(rightFuzzyEnglish);
            return this;
        }

        public ConditionBuilder englishList(String ... english){
            this.englishList = solveNullList(english);
            return this;
        }

        public ConditionBuilder englishList(List<String> english){
            this.englishList = english;
            return this;
        }

        public ConditionBuilder fuzzySection1 (List<String> fuzzySection1){
            this.fuzzySection1 = fuzzySection1;
            return this;
        }

        public ConditionBuilder fuzzySection1 (String ... fuzzySection1){
            this.fuzzySection1 = solveNullList(fuzzySection1);
            return this;
        }

        public ConditionBuilder rightFuzzySection1 (List<String> rightFuzzySection1){
            this.rightFuzzySection1 = rightFuzzySection1;
            return this;
        }

        public ConditionBuilder rightFuzzySection1 (String ... rightFuzzySection1){
            this.rightFuzzySection1 = solveNullList(rightFuzzySection1);
            return this;
        }

        public ConditionBuilder section1List(String ... section1){
            this.section1List = solveNullList(section1);
            return this;
        }

        public ConditionBuilder section1List(List<String> section1){
            this.section1List = section1;
            return this;
        }

        public ConditionBuilder fuzzySection2 (List<String> fuzzySection2){
            this.fuzzySection2 = fuzzySection2;
            return this;
        }

        public ConditionBuilder fuzzySection2 (String ... fuzzySection2){
            this.fuzzySection2 = solveNullList(fuzzySection2);
            return this;
        }

        public ConditionBuilder rightFuzzySection2 (List<String> rightFuzzySection2){
            this.rightFuzzySection2 = rightFuzzySection2;
            return this;
        }

        public ConditionBuilder rightFuzzySection2 (String ... rightFuzzySection2){
            this.rightFuzzySection2 = solveNullList(rightFuzzySection2);
            return this;
        }

        public ConditionBuilder section2List(String ... section2){
            this.section2List = solveNullList(section2);
            return this;
        }

        public ConditionBuilder section2List(List<String> section2){
            this.section2List = section2;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private ExamregionResearch obj;

        public Builder(){
            this.obj = new ExamregionResearch();
        }

        public Builder id(String id){
            this.obj.setId(id);
            return this;
        }
        public Builder index(Integer index){
            this.obj.setIndex(index);
            return this;
        }
        public Builder politics(String politics){
            this.obj.setPolitics(politics);
            return this;
        }
        public Builder english(String english){
            this.obj.setEnglish(english);
            return this;
        }
        public Builder section1(String section1){
            this.obj.setSection1(section1);
            return this;
        }
        public Builder section2(String section2){
            this.obj.setSection2(section2);
            return this;
        }
        public ExamregionResearch build(){return obj;}
    }

}
