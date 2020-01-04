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
public class College985 implements Serializable {

    private static final long serialVersionUID = 1578025139957L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String collegeName;


    public void setCollegeName(String collegeName){this.collegeName = collegeName;}

    public String getCollegeName(){return this.collegeName;}
    @Override
    public String toString() {
        return "College985{" +
                "collegeName='" + collegeName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private College985 set;

        private ConditionBuilder where;

        public UpdateBuilder set(College985 set){
            this.set = set;
            return this;
        }

        public College985 getSet(){
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

    public static class QueryBuilder extends College985{
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

        public College985 build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> collegeNameList;

        public List<String> getCollegeNameList(){return this.collegeNameList;}


        private List<String> fuzzyCollegeName;

        public List<String> getFuzzyCollegeName(){return this.fuzzyCollegeName;}

        private List<String> rightFuzzyCollegeName;

        public List<String> getRightFuzzyCollegeName(){return this.rightFuzzyCollegeName;}

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

        private College985 obj;

        public Builder(){
            this.obj = new College985();
        }

        public Builder collegeName(String collegeName){
            this.obj.setCollegeName(collegeName);
            return this;
        }
        public College985 build(){return obj;}
    }

}
