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
public class CollegeCommon implements Serializable {

    private static final long serialVersionUID = 1578044678666L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String collegeName;

    /**
    * 
    * isNullAble:1
    */
    private String competentDepartment;

    /**
    * 
    * isNullAble:1
    */
    private String location;

    /**
    * 
    * isNullAble:1
    */
    private String level;


    public void setCollegeName(String collegeName){this.collegeName = collegeName;}

    public String getCollegeName(){return this.collegeName;}

    public void setCompetentDepartment(String competentDepartment){this.competentDepartment = competentDepartment;}

    public String getCompetentDepartment(){return this.competentDepartment;}

    public void setLocation(String location){this.location = location;}

    public String getLocation(){return this.location;}

    public void setLevel(String level){this.level = level;}

    public String getLevel(){return this.level;}
    @Override
    public String toString() {
        return "CollegeCommon{" +
                "collegeName='" + collegeName + '\'' +
                "competentDepartment='" + competentDepartment + '\'' +
                "location='" + location + '\'' +
                "level='" + level + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CollegeCommon set;

        private ConditionBuilder where;

        public UpdateBuilder set(CollegeCommon set){
            this.set = set;
            return this;
        }

        public CollegeCommon getSet(){
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

    public static class QueryBuilder extends CollegeCommon{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> collegeNameList;

        public List<String> getCollegeNameList(){return this.collegeNameList;}


        private List<String> fuzzyCollegeName;

        public List<String> getFuzzyCollegeName(){return this.fuzzyCollegeName;}

        private List<String> rightFuzzyCollegeName;

        public List<String> getRightFuzzyCollegeName(){return this.rightFuzzyCollegeName;}
        private List<String> competentDepartmentList;

        public List<String> getCompetentDepartmentList(){return this.competentDepartmentList;}


        private List<String> fuzzyCompetentDepartment;

        public List<String> getFuzzyCompetentDepartment(){return this.fuzzyCompetentDepartment;}

        private List<String> rightFuzzyCompetentDepartment;

        public List<String> getRightFuzzyCompetentDepartment(){return this.rightFuzzyCompetentDepartment;}
        private List<String> locationList;

        public List<String> getLocationList(){return this.locationList;}


        private List<String> fuzzyLocation;

        public List<String> getFuzzyLocation(){return this.fuzzyLocation;}

        private List<String> rightFuzzyLocation;

        public List<String> getRightFuzzyLocation(){return this.rightFuzzyLocation;}
        private List<String> levelList;

        public List<String> getLevelList(){return this.levelList;}


        private List<String> fuzzyLevel;

        public List<String> getFuzzyLevel(){return this.fuzzyLevel;}

        private List<String> rightFuzzyLevel;

        public List<String> getRightFuzzyLevel(){return this.rightFuzzyLevel;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyCompetentDepartment (List<String> fuzzyCompetentDepartment){
            this.fuzzyCompetentDepartment = fuzzyCompetentDepartment;
            return this;
        }

        public QueryBuilder fuzzyCompetentDepartment (String ... fuzzyCompetentDepartment){
            this.fuzzyCompetentDepartment = solveNullList(fuzzyCompetentDepartment);
            return this;
        }

        public QueryBuilder rightFuzzyCompetentDepartment (List<String> rightFuzzyCompetentDepartment){
            this.rightFuzzyCompetentDepartment = rightFuzzyCompetentDepartment;
            return this;
        }

        public QueryBuilder rightFuzzyCompetentDepartment (String ... rightFuzzyCompetentDepartment){
            this.rightFuzzyCompetentDepartment = solveNullList(rightFuzzyCompetentDepartment);
            return this;
        }

        public QueryBuilder competentDepartment(String competentDepartment){
            setCompetentDepartment(competentDepartment);
            return this;
        }

        public QueryBuilder competentDepartmentList(String ... competentDepartment){
            this.competentDepartmentList = solveNullList(competentDepartment);
            return this;
        }

        public QueryBuilder competentDepartmentList(List<String> competentDepartment){
            this.competentDepartmentList = competentDepartment;
            return this;
        }

        public QueryBuilder fetchCompetentDepartment(){
            setFetchFields("fetchFields","competentDepartment");
            return this;
        }

        public QueryBuilder excludeCompetentDepartment(){
            setFetchFields("excludeFields","competentDepartment");
            return this;
        }

        public QueryBuilder fuzzyLocation (List<String> fuzzyLocation){
            this.fuzzyLocation = fuzzyLocation;
            return this;
        }

        public QueryBuilder fuzzyLocation (String ... fuzzyLocation){
            this.fuzzyLocation = solveNullList(fuzzyLocation);
            return this;
        }

        public QueryBuilder rightFuzzyLocation (List<String> rightFuzzyLocation){
            this.rightFuzzyLocation = rightFuzzyLocation;
            return this;
        }

        public QueryBuilder rightFuzzyLocation (String ... rightFuzzyLocation){
            this.rightFuzzyLocation = solveNullList(rightFuzzyLocation);
            return this;
        }

        public QueryBuilder location(String location){
            setLocation(location);
            return this;
        }

        public QueryBuilder locationList(String ... location){
            this.locationList = solveNullList(location);
            return this;
        }

        public QueryBuilder locationList(List<String> location){
            this.locationList = location;
            return this;
        }

        public QueryBuilder fetchLocation(){
            setFetchFields("fetchFields","location");
            return this;
        }

        public QueryBuilder excludeLocation(){
            setFetchFields("excludeFields","location");
            return this;
        }

        public QueryBuilder fuzzyLevel (List<String> fuzzyLevel){
            this.fuzzyLevel = fuzzyLevel;
            return this;
        }

        public QueryBuilder fuzzyLevel (String ... fuzzyLevel){
            this.fuzzyLevel = solveNullList(fuzzyLevel);
            return this;
        }

        public QueryBuilder rightFuzzyLevel (List<String> rightFuzzyLevel){
            this.rightFuzzyLevel = rightFuzzyLevel;
            return this;
        }

        public QueryBuilder rightFuzzyLevel (String ... rightFuzzyLevel){
            this.rightFuzzyLevel = solveNullList(rightFuzzyLevel);
            return this;
        }

        public QueryBuilder level(String level){
            setLevel(level);
            return this;
        }

        public QueryBuilder levelList(String ... level){
            this.levelList = solveNullList(level);
            return this;
        }

        public QueryBuilder levelList(List<String> level){
            this.levelList = level;
            return this;
        }

        public QueryBuilder fetchLevel(){
            setFetchFields("fetchFields","level");
            return this;
        }

        public QueryBuilder excludeLevel(){
            setFetchFields("excludeFields","level");
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

        public CollegeCommon build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> collegeNameList;

        public List<String> getCollegeNameList(){return this.collegeNameList;}


        private List<String> fuzzyCollegeName;

        public List<String> getFuzzyCollegeName(){return this.fuzzyCollegeName;}

        private List<String> rightFuzzyCollegeName;

        public List<String> getRightFuzzyCollegeName(){return this.rightFuzzyCollegeName;}
        private List<String> competentDepartmentList;

        public List<String> getCompetentDepartmentList(){return this.competentDepartmentList;}


        private List<String> fuzzyCompetentDepartment;

        public List<String> getFuzzyCompetentDepartment(){return this.fuzzyCompetentDepartment;}

        private List<String> rightFuzzyCompetentDepartment;

        public List<String> getRightFuzzyCompetentDepartment(){return this.rightFuzzyCompetentDepartment;}
        private List<String> locationList;

        public List<String> getLocationList(){return this.locationList;}


        private List<String> fuzzyLocation;

        public List<String> getFuzzyLocation(){return this.fuzzyLocation;}

        private List<String> rightFuzzyLocation;

        public List<String> getRightFuzzyLocation(){return this.rightFuzzyLocation;}
        private List<String> levelList;

        public List<String> getLevelList(){return this.levelList;}


        private List<String> fuzzyLevel;

        public List<String> getFuzzyLevel(){return this.fuzzyLevel;}

        private List<String> rightFuzzyLevel;

        public List<String> getRightFuzzyLevel(){return this.rightFuzzyLevel;}

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

        public ConditionBuilder fuzzyCompetentDepartment (List<String> fuzzyCompetentDepartment){
            this.fuzzyCompetentDepartment = fuzzyCompetentDepartment;
            return this;
        }

        public ConditionBuilder fuzzyCompetentDepartment (String ... fuzzyCompetentDepartment){
            this.fuzzyCompetentDepartment = solveNullList(fuzzyCompetentDepartment);
            return this;
        }

        public ConditionBuilder rightFuzzyCompetentDepartment (List<String> rightFuzzyCompetentDepartment){
            this.rightFuzzyCompetentDepartment = rightFuzzyCompetentDepartment;
            return this;
        }

        public ConditionBuilder rightFuzzyCompetentDepartment (String ... rightFuzzyCompetentDepartment){
            this.rightFuzzyCompetentDepartment = solveNullList(rightFuzzyCompetentDepartment);
            return this;
        }

        public ConditionBuilder competentDepartmentList(String ... competentDepartment){
            this.competentDepartmentList = solveNullList(competentDepartment);
            return this;
        }

        public ConditionBuilder competentDepartmentList(List<String> competentDepartment){
            this.competentDepartmentList = competentDepartment;
            return this;
        }

        public ConditionBuilder fuzzyLocation (List<String> fuzzyLocation){
            this.fuzzyLocation = fuzzyLocation;
            return this;
        }

        public ConditionBuilder fuzzyLocation (String ... fuzzyLocation){
            this.fuzzyLocation = solveNullList(fuzzyLocation);
            return this;
        }

        public ConditionBuilder rightFuzzyLocation (List<String> rightFuzzyLocation){
            this.rightFuzzyLocation = rightFuzzyLocation;
            return this;
        }

        public ConditionBuilder rightFuzzyLocation (String ... rightFuzzyLocation){
            this.rightFuzzyLocation = solveNullList(rightFuzzyLocation);
            return this;
        }

        public ConditionBuilder locationList(String ... location){
            this.locationList = solveNullList(location);
            return this;
        }

        public ConditionBuilder locationList(List<String> location){
            this.locationList = location;
            return this;
        }

        public ConditionBuilder fuzzyLevel (List<String> fuzzyLevel){
            this.fuzzyLevel = fuzzyLevel;
            return this;
        }

        public ConditionBuilder fuzzyLevel (String ... fuzzyLevel){
            this.fuzzyLevel = solveNullList(fuzzyLevel);
            return this;
        }

        public ConditionBuilder rightFuzzyLevel (List<String> rightFuzzyLevel){
            this.rightFuzzyLevel = rightFuzzyLevel;
            return this;
        }

        public ConditionBuilder rightFuzzyLevel (String ... rightFuzzyLevel){
            this.rightFuzzyLevel = solveNullList(rightFuzzyLevel);
            return this;
        }

        public ConditionBuilder levelList(String ... level){
            this.levelList = solveNullList(level);
            return this;
        }

        public ConditionBuilder levelList(List<String> level){
            this.levelList = level;
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

        private CollegeCommon obj;

        public Builder(){
            this.obj = new CollegeCommon();
        }

        public Builder collegeName(String collegeName){
            this.obj.setCollegeName(collegeName);
            return this;
        }
        public Builder competentDepartment(String competentDepartment){
            this.obj.setCompetentDepartment(competentDepartment);
            return this;
        }
        public Builder location(String location){
            this.obj.setLocation(location);
            return this;
        }
        public Builder level(String level){
            this.obj.setLevel(level);
            return this;
        }
        public CollegeCommon build(){return obj;}
    }

}
