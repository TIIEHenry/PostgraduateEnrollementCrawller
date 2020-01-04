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
public class CollegeSubjectRank implements Serializable {

    private static final long serialVersionUID = 1577981287963L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String subjectCode;

    /**
    * 
    * isNullAble:1
    */
    private String subjectName;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String collegeCode;

    /**
    * 
    * isNullAble:1
    */
    private String collegeName;

    /**
    * 
    * isNullAble:1
    */
    private Integer collegeLevel;

    /**
    * 
    * isNullAble:1
    */
    private String collegeLevelString;


    public void setSubjectCode(String subjectCode){this.subjectCode = subjectCode;}

    public String getSubjectCode(){return this.subjectCode;}

    public void setSubjectName(String subjectName){this.subjectName = subjectName;}

    public String getSubjectName(){return this.subjectName;}

    public void setCollegeCode(String collegeCode){this.collegeCode = collegeCode;}

    public String getCollegeCode(){return this.collegeCode;}

    public void setCollegeName(String collegeName){this.collegeName = collegeName;}

    public String getCollegeName(){return this.collegeName;}

    public void setCollegeLevel(Integer collegeLevel){this.collegeLevel = collegeLevel;}

    public Integer getCollegeLevel(){return this.collegeLevel;}

    public void setCollegeLevelString(String collegeLevelString){this.collegeLevelString = collegeLevelString;}

    public String getCollegeLevelString(){return this.collegeLevelString;}
    @Override
    public String toString() {
        return "CollegeSubjectRank{" +
                "subjectCode='" + subjectCode + '\'' +
                "subjectName='" + subjectName + '\'' +
                "collegeCode='" + collegeCode + '\'' +
                "collegeName='" + collegeName + '\'' +
                "collegeLevel='" + collegeLevel + '\'' +
                "collegeLevelString='" + collegeLevelString + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CollegeSubjectRank set;

        private ConditionBuilder where;

        public UpdateBuilder set(CollegeSubjectRank set){
            this.set = set;
            return this;
        }

        public CollegeSubjectRank getSet(){
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

    public static class QueryBuilder extends CollegeSubjectRank{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> subjectCodeList;

        public List<String> getSubjectCodeList(){return this.subjectCodeList;}


        private List<String> fuzzySubjectCode;

        public List<String> getFuzzySubjectCode(){return this.fuzzySubjectCode;}

        private List<String> rightFuzzySubjectCode;

        public List<String> getRightFuzzySubjectCode(){return this.rightFuzzySubjectCode;}
        private List<String> subjectNameList;

        public List<String> getSubjectNameList(){return this.subjectNameList;}


        private List<String> fuzzySubjectName;

        public List<String> getFuzzySubjectName(){return this.fuzzySubjectName;}

        private List<String> rightFuzzySubjectName;

        public List<String> getRightFuzzySubjectName(){return this.rightFuzzySubjectName;}
        private List<String> collegeCodeList;

        public List<String> getCollegeCodeList(){return this.collegeCodeList;}


        private List<String> fuzzyCollegeCode;

        public List<String> getFuzzyCollegeCode(){return this.fuzzyCollegeCode;}

        private List<String> rightFuzzyCollegeCode;

        public List<String> getRightFuzzyCollegeCode(){return this.rightFuzzyCollegeCode;}
        private List<String> collegeNameList;

        public List<String> getCollegeNameList(){return this.collegeNameList;}


        private List<String> fuzzyCollegeName;

        public List<String> getFuzzyCollegeName(){return this.fuzzyCollegeName;}

        private List<String> rightFuzzyCollegeName;

        public List<String> getRightFuzzyCollegeName(){return this.rightFuzzyCollegeName;}
        private List<Integer> collegeLevelList;

        public List<Integer> getCollegeLevelList(){return this.collegeLevelList;}

        private Integer collegeLevelSt;

        private Integer collegeLevelEd;

        public Integer getCollegeLevelSt(){return this.collegeLevelSt;}

        public Integer getCollegeLevelEd(){return this.collegeLevelEd;}

        private List<String> collegeLevelStringList;

        public List<String> getCollegeLevelStringList(){return this.collegeLevelStringList;}


        private List<String> fuzzyCollegeLevelString;

        public List<String> getFuzzyCollegeLevelString(){return this.fuzzyCollegeLevelString;}

        private List<String> rightFuzzyCollegeLevelString;

        public List<String> getRightFuzzyCollegeLevelString(){return this.rightFuzzyCollegeLevelString;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzySubjectCode (List<String> fuzzySubjectCode){
            this.fuzzySubjectCode = fuzzySubjectCode;
            return this;
        }

        public QueryBuilder fuzzySubjectCode (String ... fuzzySubjectCode){
            this.fuzzySubjectCode = solveNullList(fuzzySubjectCode);
            return this;
        }

        public QueryBuilder rightFuzzySubjectCode (List<String> rightFuzzySubjectCode){
            this.rightFuzzySubjectCode = rightFuzzySubjectCode;
            return this;
        }

        public QueryBuilder rightFuzzySubjectCode (String ... rightFuzzySubjectCode){
            this.rightFuzzySubjectCode = solveNullList(rightFuzzySubjectCode);
            return this;
        }

        public QueryBuilder subjectCode(String subjectCode){
            setSubjectCode(subjectCode);
            return this;
        }

        public QueryBuilder subjectCodeList(String ... subjectCode){
            this.subjectCodeList = solveNullList(subjectCode);
            return this;
        }

        public QueryBuilder subjectCodeList(List<String> subjectCode){
            this.subjectCodeList = subjectCode;
            return this;
        }

        public QueryBuilder fetchSubjectCode(){
            setFetchFields("fetchFields","subjectCode");
            return this;
        }

        public QueryBuilder excludeSubjectCode(){
            setFetchFields("excludeFields","subjectCode");
            return this;
        }

        public QueryBuilder fuzzySubjectName (List<String> fuzzySubjectName){
            this.fuzzySubjectName = fuzzySubjectName;
            return this;
        }

        public QueryBuilder fuzzySubjectName (String ... fuzzySubjectName){
            this.fuzzySubjectName = solveNullList(fuzzySubjectName);
            return this;
        }

        public QueryBuilder rightFuzzySubjectName (List<String> rightFuzzySubjectName){
            this.rightFuzzySubjectName = rightFuzzySubjectName;
            return this;
        }

        public QueryBuilder rightFuzzySubjectName (String ... rightFuzzySubjectName){
            this.rightFuzzySubjectName = solveNullList(rightFuzzySubjectName);
            return this;
        }

        public QueryBuilder subjectName(String subjectName){
            setSubjectName(subjectName);
            return this;
        }

        public QueryBuilder subjectNameList(String ... subjectName){
            this.subjectNameList = solveNullList(subjectName);
            return this;
        }

        public QueryBuilder subjectNameList(List<String> subjectName){
            this.subjectNameList = subjectName;
            return this;
        }

        public QueryBuilder fetchSubjectName(){
            setFetchFields("fetchFields","subjectName");
            return this;
        }

        public QueryBuilder excludeSubjectName(){
            setFetchFields("excludeFields","subjectName");
            return this;
        }

        public QueryBuilder fuzzyCollegeCode (List<String> fuzzyCollegeCode){
            this.fuzzyCollegeCode = fuzzyCollegeCode;
            return this;
        }

        public QueryBuilder fuzzyCollegeCode (String ... fuzzyCollegeCode){
            this.fuzzyCollegeCode = solveNullList(fuzzyCollegeCode);
            return this;
        }

        public QueryBuilder rightFuzzyCollegeCode (List<String> rightFuzzyCollegeCode){
            this.rightFuzzyCollegeCode = rightFuzzyCollegeCode;
            return this;
        }

        public QueryBuilder rightFuzzyCollegeCode (String ... rightFuzzyCollegeCode){
            this.rightFuzzyCollegeCode = solveNullList(rightFuzzyCollegeCode);
            return this;
        }

        public QueryBuilder collegeCode(String collegeCode){
            setCollegeCode(collegeCode);
            return this;
        }

        public QueryBuilder collegeCodeList(String ... collegeCode){
            this.collegeCodeList = solveNullList(collegeCode);
            return this;
        }

        public QueryBuilder collegeCodeList(List<String> collegeCode){
            this.collegeCodeList = collegeCode;
            return this;
        }

        public QueryBuilder fetchCollegeCode(){
            setFetchFields("fetchFields","collegeCode");
            return this;
        }

        public QueryBuilder excludeCollegeCode(){
            setFetchFields("excludeFields","collegeCode");
            return this;
        }

        public QueryBuilder fuzzyCollegeName (List<String> fuzzyCollegeName){
            this.fuzzyCollegeName = fuzzyCollegeName;
            return this;
        }

        public QueryBuilder fuzzyCollegeName (String ... fuzzyCollegeName){
            this.fuzzyCollegeName = solveNullList(fuzzyCollegeName);
            return this;
        }

        public QueryBuilder rightFuzzyCollegeName (List<String> rightFuzzyCollegeName){
            this.rightFuzzyCollegeName = rightFuzzyCollegeName;
            return this;
        }

        public QueryBuilder rightFuzzyCollegeName (String ... rightFuzzyCollegeName){
            this.rightFuzzyCollegeName = solveNullList(rightFuzzyCollegeName);
            return this;
        }

        public QueryBuilder collegeName(String collegeName){
            setCollegeName(collegeName);
            return this;
        }

        public QueryBuilder collegeNameList(String ... collegeName){
            this.collegeNameList = solveNullList(collegeName);
            return this;
        }

        public QueryBuilder collegeNameList(List<String> collegeName){
            this.collegeNameList = collegeName;
            return this;
        }

        public QueryBuilder fetchCollegeName(){
            setFetchFields("fetchFields","collegeName");
            return this;
        }

        public QueryBuilder excludeCollegeName(){
            setFetchFields("excludeFields","collegeName");
            return this;
        }

        public QueryBuilder collegeLevelBetWeen(Integer collegeLevelSt,Integer collegeLevelEd){
            this.collegeLevelSt = collegeLevelSt;
            this.collegeLevelEd = collegeLevelEd;
            return this;
        }

        public QueryBuilder collegeLevelGreaterEqThan(Integer collegeLevelSt){
            this.collegeLevelSt = collegeLevelSt;
            return this;
        }
        public QueryBuilder collegeLevelLessEqThan(Integer collegeLevelEd){
            this.collegeLevelEd = collegeLevelEd;
            return this;
        }


        public QueryBuilder collegeLevel(Integer collegeLevel){
            setCollegeLevel(collegeLevel);
            return this;
        }

        public QueryBuilder collegeLevelList(Integer ... collegeLevel){
            this.collegeLevelList = solveNullList(collegeLevel);
            return this;
        }

        public QueryBuilder collegeLevelList(List<Integer> collegeLevel){
            this.collegeLevelList = collegeLevel;
            return this;
        }

        public QueryBuilder fetchCollegeLevel(){
            setFetchFields("fetchFields","collegeLevel");
            return this;
        }

        public QueryBuilder excludeCollegeLevel(){
            setFetchFields("excludeFields","collegeLevel");
            return this;
        }

        public QueryBuilder fuzzyCollegeLevelString (List<String> fuzzyCollegeLevelString){
            this.fuzzyCollegeLevelString = fuzzyCollegeLevelString;
            return this;
        }

        public QueryBuilder fuzzyCollegeLevelString (String ... fuzzyCollegeLevelString){
            this.fuzzyCollegeLevelString = solveNullList(fuzzyCollegeLevelString);
            return this;
        }

        public QueryBuilder rightFuzzyCollegeLevelString (List<String> rightFuzzyCollegeLevelString){
            this.rightFuzzyCollegeLevelString = rightFuzzyCollegeLevelString;
            return this;
        }

        public QueryBuilder rightFuzzyCollegeLevelString (String ... rightFuzzyCollegeLevelString){
            this.rightFuzzyCollegeLevelString = solveNullList(rightFuzzyCollegeLevelString);
            return this;
        }

        public QueryBuilder collegeLevelString(String collegeLevelString){
            setCollegeLevelString(collegeLevelString);
            return this;
        }

        public QueryBuilder collegeLevelStringList(String ... collegeLevelString){
            this.collegeLevelStringList = solveNullList(collegeLevelString);
            return this;
        }

        public QueryBuilder collegeLevelStringList(List<String> collegeLevelString){
            this.collegeLevelStringList = collegeLevelString;
            return this;
        }

        public QueryBuilder fetchCollegeLevelString(){
            setFetchFields("fetchFields","collegeLevelString");
            return this;
        }

        public QueryBuilder excludeCollegeLevelString(){
            setFetchFields("excludeFields","collegeLevelString");
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

        public CollegeSubjectRank build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> subjectCodeList;

        public List<String> getSubjectCodeList(){return this.subjectCodeList;}


        private List<String> fuzzySubjectCode;

        public List<String> getFuzzySubjectCode(){return this.fuzzySubjectCode;}

        private List<String> rightFuzzySubjectCode;

        public List<String> getRightFuzzySubjectCode(){return this.rightFuzzySubjectCode;}
        private List<String> subjectNameList;

        public List<String> getSubjectNameList(){return this.subjectNameList;}


        private List<String> fuzzySubjectName;

        public List<String> getFuzzySubjectName(){return this.fuzzySubjectName;}

        private List<String> rightFuzzySubjectName;

        public List<String> getRightFuzzySubjectName(){return this.rightFuzzySubjectName;}
        private List<String> collegeCodeList;

        public List<String> getCollegeCodeList(){return this.collegeCodeList;}


        private List<String> fuzzyCollegeCode;

        public List<String> getFuzzyCollegeCode(){return this.fuzzyCollegeCode;}

        private List<String> rightFuzzyCollegeCode;

        public List<String> getRightFuzzyCollegeCode(){return this.rightFuzzyCollegeCode;}
        private List<String> collegeNameList;

        public List<String> getCollegeNameList(){return this.collegeNameList;}


        private List<String> fuzzyCollegeName;

        public List<String> getFuzzyCollegeName(){return this.fuzzyCollegeName;}

        private List<String> rightFuzzyCollegeName;

        public List<String> getRightFuzzyCollegeName(){return this.rightFuzzyCollegeName;}
        private List<Integer> collegeLevelList;

        public List<Integer> getCollegeLevelList(){return this.collegeLevelList;}

        private Integer collegeLevelSt;

        private Integer collegeLevelEd;

        public Integer getCollegeLevelSt(){return this.collegeLevelSt;}

        public Integer getCollegeLevelEd(){return this.collegeLevelEd;}

        private List<String> collegeLevelStringList;

        public List<String> getCollegeLevelStringList(){return this.collegeLevelStringList;}


        private List<String> fuzzyCollegeLevelString;

        public List<String> getFuzzyCollegeLevelString(){return this.fuzzyCollegeLevelString;}

        private List<String> rightFuzzyCollegeLevelString;

        public List<String> getRightFuzzyCollegeLevelString(){return this.rightFuzzyCollegeLevelString;}

        public ConditionBuilder fuzzySubjectCode (List<String> fuzzySubjectCode){
            this.fuzzySubjectCode = fuzzySubjectCode;
            return this;
        }

        public ConditionBuilder fuzzySubjectCode (String ... fuzzySubjectCode){
            this.fuzzySubjectCode = solveNullList(fuzzySubjectCode);
            return this;
        }

        public ConditionBuilder rightFuzzySubjectCode (List<String> rightFuzzySubjectCode){
            this.rightFuzzySubjectCode = rightFuzzySubjectCode;
            return this;
        }

        public ConditionBuilder rightFuzzySubjectCode (String ... rightFuzzySubjectCode){
            this.rightFuzzySubjectCode = solveNullList(rightFuzzySubjectCode);
            return this;
        }

        public ConditionBuilder subjectCodeList(String ... subjectCode){
            this.subjectCodeList = solveNullList(subjectCode);
            return this;
        }

        public ConditionBuilder subjectCodeList(List<String> subjectCode){
            this.subjectCodeList = subjectCode;
            return this;
        }

        public ConditionBuilder fuzzySubjectName (List<String> fuzzySubjectName){
            this.fuzzySubjectName = fuzzySubjectName;
            return this;
        }

        public ConditionBuilder fuzzySubjectName (String ... fuzzySubjectName){
            this.fuzzySubjectName = solveNullList(fuzzySubjectName);
            return this;
        }

        public ConditionBuilder rightFuzzySubjectName (List<String> rightFuzzySubjectName){
            this.rightFuzzySubjectName = rightFuzzySubjectName;
            return this;
        }

        public ConditionBuilder rightFuzzySubjectName (String ... rightFuzzySubjectName){
            this.rightFuzzySubjectName = solveNullList(rightFuzzySubjectName);
            return this;
        }

        public ConditionBuilder subjectNameList(String ... subjectName){
            this.subjectNameList = solveNullList(subjectName);
            return this;
        }

        public ConditionBuilder subjectNameList(List<String> subjectName){
            this.subjectNameList = subjectName;
            return this;
        }

        public ConditionBuilder fuzzyCollegeCode (List<String> fuzzyCollegeCode){
            this.fuzzyCollegeCode = fuzzyCollegeCode;
            return this;
        }

        public ConditionBuilder fuzzyCollegeCode (String ... fuzzyCollegeCode){
            this.fuzzyCollegeCode = solveNullList(fuzzyCollegeCode);
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeCode (List<String> rightFuzzyCollegeCode){
            this.rightFuzzyCollegeCode = rightFuzzyCollegeCode;
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeCode (String ... rightFuzzyCollegeCode){
            this.rightFuzzyCollegeCode = solveNullList(rightFuzzyCollegeCode);
            return this;
        }

        public ConditionBuilder collegeCodeList(String ... collegeCode){
            this.collegeCodeList = solveNullList(collegeCode);
            return this;
        }

        public ConditionBuilder collegeCodeList(List<String> collegeCode){
            this.collegeCodeList = collegeCode;
            return this;
        }

        public ConditionBuilder fuzzyCollegeName (List<String> fuzzyCollegeName){
            this.fuzzyCollegeName = fuzzyCollegeName;
            return this;
        }

        public ConditionBuilder fuzzyCollegeName (String ... fuzzyCollegeName){
            this.fuzzyCollegeName = solveNullList(fuzzyCollegeName);
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeName (List<String> rightFuzzyCollegeName){
            this.rightFuzzyCollegeName = rightFuzzyCollegeName;
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeName (String ... rightFuzzyCollegeName){
            this.rightFuzzyCollegeName = solveNullList(rightFuzzyCollegeName);
            return this;
        }

        public ConditionBuilder collegeNameList(String ... collegeName){
            this.collegeNameList = solveNullList(collegeName);
            return this;
        }

        public ConditionBuilder collegeNameList(List<String> collegeName){
            this.collegeNameList = collegeName;
            return this;
        }

        public ConditionBuilder collegeLevelBetWeen(Integer collegeLevelSt,Integer collegeLevelEd){
            this.collegeLevelSt = collegeLevelSt;
            this.collegeLevelEd = collegeLevelEd;
            return this;
        }

        public ConditionBuilder collegeLevelGreaterEqThan(Integer collegeLevelSt){
            this.collegeLevelSt = collegeLevelSt;
            return this;
        }
        public ConditionBuilder collegeLevelLessEqThan(Integer collegeLevelEd){
            this.collegeLevelEd = collegeLevelEd;
            return this;
        }


        public ConditionBuilder collegeLevelList(Integer ... collegeLevel){
            this.collegeLevelList = solveNullList(collegeLevel);
            return this;
        }

        public ConditionBuilder collegeLevelList(List<Integer> collegeLevel){
            this.collegeLevelList = collegeLevel;
            return this;
        }

        public ConditionBuilder fuzzyCollegeLevelString (List<String> fuzzyCollegeLevelString){
            this.fuzzyCollegeLevelString = fuzzyCollegeLevelString;
            return this;
        }

        public ConditionBuilder fuzzyCollegeLevelString (String ... fuzzyCollegeLevelString){
            this.fuzzyCollegeLevelString = solveNullList(fuzzyCollegeLevelString);
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeLevelString (List<String> rightFuzzyCollegeLevelString){
            this.rightFuzzyCollegeLevelString = rightFuzzyCollegeLevelString;
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeLevelString (String ... rightFuzzyCollegeLevelString){
            this.rightFuzzyCollegeLevelString = solveNullList(rightFuzzyCollegeLevelString);
            return this;
        }

        public ConditionBuilder collegeLevelStringList(String ... collegeLevelString){
            this.collegeLevelStringList = solveNullList(collegeLevelString);
            return this;
        }

        public ConditionBuilder collegeLevelStringList(List<String> collegeLevelString){
            this.collegeLevelStringList = collegeLevelString;
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

        private CollegeSubjectRank obj;

        public Builder(){
            this.obj = new CollegeSubjectRank();
        }

        public Builder subjectCode(String subjectCode){
            this.obj.setSubjectCode(subjectCode);
            return this;
        }
        public Builder subjectName(String subjectName){
            this.obj.setSubjectName(subjectName);
            return this;
        }
        public Builder collegeCode(String collegeCode){
            this.obj.setCollegeCode(collegeCode);
            return this;
        }
        public Builder collegeName(String collegeName){
            this.obj.setCollegeName(collegeName);
            return this;
        }
        public Builder collegeLevel(Integer collegeLevel){
            this.obj.setCollegeLevel(collegeLevel);
            return this;
        }
        public Builder collegeLevelString(String collegeLevelString){
            this.obj.setCollegeLevelString(collegeLevelString);
            return this;
        }
        public CollegeSubjectRank build(){return obj;}
    }

}
