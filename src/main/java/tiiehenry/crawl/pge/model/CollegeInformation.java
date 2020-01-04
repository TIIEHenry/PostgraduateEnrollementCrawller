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
public class CollegeInformation implements Serializable {

    private static final long serialVersionUID = 1578054703283L;


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
    private String collegeType;

    /**
    * 
    * isNullAble:1
    */
    private String collegeLevel;

    /**
    * 
    * isNullAble:1
    */
    private String collegeFeature;

    /**
    * 
    * isNullAble:1
    */
    private String collegeUrl;

    /**
    * 
    * isNullAble:1
    */
    private String collegeUrlExtra;

    /**
    * 
    * isNullAble:1
    */
    private String competentDepartment;

    /**
    * 
    * isNullAble:1
    */
    private String logoUrl;

    /**
    * 
    * isNullAble:1
    */
    private String provinceName;


    public void setCollegeName(String collegeName){this.collegeName = collegeName;}

    public String getCollegeName(){return this.collegeName;}

    public void setCollegeType(String collegeType){this.collegeType = collegeType;}

    public String getCollegeType(){return this.collegeType;}

    public void setCollegeLevel(String collegeLevel){this.collegeLevel = collegeLevel;}

    public String getCollegeLevel(){return this.collegeLevel;}

    public void setCollegeFeature(String collegeFeature){this.collegeFeature = collegeFeature;}

    public String getCollegeFeature(){return this.collegeFeature;}

    public void setCollegeUrl(String collegeUrl){this.collegeUrl = collegeUrl;}

    public String getCollegeUrl(){return this.collegeUrl;}

    public void setCollegeUrlExtra(String collegeUrlExtra){this.collegeUrlExtra = collegeUrlExtra;}

    public String getCollegeUrlExtra(){return this.collegeUrlExtra;}

    public void setCompetentDepartment(String competentDepartment){this.competentDepartment = competentDepartment;}

    public String getCompetentDepartment(){return this.competentDepartment;}

    public void setLogoUrl(String logoUrl){this.logoUrl = logoUrl;}

    public String getLogoUrl(){return this.logoUrl;}

    public void setProvinceName(String provinceName){this.provinceName = provinceName;}

    public String getProvinceName(){return this.provinceName;}
    @Override
    public String toString() {
        return "CollegeInformation{" +
                "collegeName='" + collegeName + '\'' +
                "collegeType='" + collegeType + '\'' +
                "collegeLevel='" + collegeLevel + '\'' +
                "collegeFeature='" + collegeFeature + '\'' +
                "collegeUrl='" + collegeUrl + '\'' +
                "collegeUrlExtra='" + collegeUrlExtra + '\'' +
                "competentDepartment='" + competentDepartment + '\'' +
                "logoUrl='" + logoUrl + '\'' +
                "provinceName='" + provinceName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CollegeInformation set;

        private ConditionBuilder where;

        public UpdateBuilder set(CollegeInformation set){
            this.set = set;
            return this;
        }

        public CollegeInformation getSet(){
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

    public static class QueryBuilder extends CollegeInformation{
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
        private List<String> collegeTypeList;

        public List<String> getCollegeTypeList(){return this.collegeTypeList;}


        private List<String> fuzzyCollegeType;

        public List<String> getFuzzyCollegeType(){return this.fuzzyCollegeType;}

        private List<String> rightFuzzyCollegeType;

        public List<String> getRightFuzzyCollegeType(){return this.rightFuzzyCollegeType;}
        private List<String> collegeLevelList;

        public List<String> getCollegeLevelList(){return this.collegeLevelList;}


        private List<String> fuzzyCollegeLevel;

        public List<String> getFuzzyCollegeLevel(){return this.fuzzyCollegeLevel;}

        private List<String> rightFuzzyCollegeLevel;

        public List<String> getRightFuzzyCollegeLevel(){return this.rightFuzzyCollegeLevel;}
        private List<String> collegeFeatureList;

        public List<String> getCollegeFeatureList(){return this.collegeFeatureList;}


        private List<String> fuzzyCollegeFeature;

        public List<String> getFuzzyCollegeFeature(){return this.fuzzyCollegeFeature;}

        private List<String> rightFuzzyCollegeFeature;

        public List<String> getRightFuzzyCollegeFeature(){return this.rightFuzzyCollegeFeature;}
        private List<String> collegeUrlList;

        public List<String> getCollegeUrlList(){return this.collegeUrlList;}


        private List<String> fuzzyCollegeUrl;

        public List<String> getFuzzyCollegeUrl(){return this.fuzzyCollegeUrl;}

        private List<String> rightFuzzyCollegeUrl;

        public List<String> getRightFuzzyCollegeUrl(){return this.rightFuzzyCollegeUrl;}
        private List<String> collegeUrlExtraList;

        public List<String> getCollegeUrlExtraList(){return this.collegeUrlExtraList;}


        private List<String> fuzzyCollegeUrlExtra;

        public List<String> getFuzzyCollegeUrlExtra(){return this.fuzzyCollegeUrlExtra;}

        private List<String> rightFuzzyCollegeUrlExtra;

        public List<String> getRightFuzzyCollegeUrlExtra(){return this.rightFuzzyCollegeUrlExtra;}
        private List<String> competentDepartmentList;

        public List<String> getCompetentDepartmentList(){return this.competentDepartmentList;}


        private List<String> fuzzyCompetentDepartment;

        public List<String> getFuzzyCompetentDepartment(){return this.fuzzyCompetentDepartment;}

        private List<String> rightFuzzyCompetentDepartment;

        public List<String> getRightFuzzyCompetentDepartment(){return this.rightFuzzyCompetentDepartment;}
        private List<String> logoUrlList;

        public List<String> getLogoUrlList(){return this.logoUrlList;}


        private List<String> fuzzyLogoUrl;

        public List<String> getFuzzyLogoUrl(){return this.fuzzyLogoUrl;}

        private List<String> rightFuzzyLogoUrl;

        public List<String> getRightFuzzyLogoUrl(){return this.rightFuzzyLogoUrl;}
        private List<String> provinceNameList;

        public List<String> getProvinceNameList(){return this.provinceNameList;}


        private List<String> fuzzyProvinceName;

        public List<String> getFuzzyProvinceName(){return this.fuzzyProvinceName;}

        private List<String> rightFuzzyProvinceName;

        public List<String> getRightFuzzyProvinceName(){return this.rightFuzzyProvinceName;}
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

        public QueryBuilder fuzzyCollegeType (List<String> fuzzyCollegeType){
            this.fuzzyCollegeType = fuzzyCollegeType;
            return this;
        }

        public QueryBuilder fuzzyCollegeType (String ... fuzzyCollegeType){
            this.fuzzyCollegeType = solveNullList(fuzzyCollegeType);
            return this;
        }

        public QueryBuilder rightFuzzyCollegeType (List<String> rightFuzzyCollegeType){
            this.rightFuzzyCollegeType = rightFuzzyCollegeType;
            return this;
        }

        public QueryBuilder rightFuzzyCollegeType (String ... rightFuzzyCollegeType){
            this.rightFuzzyCollegeType = solveNullList(rightFuzzyCollegeType);
            return this;
        }

        public QueryBuilder collegeType(String collegeType){
            setCollegeType(collegeType);
            return this;
        }

        public QueryBuilder collegeTypeList(String ... collegeType){
            this.collegeTypeList = solveNullList(collegeType);
            return this;
        }

        public QueryBuilder collegeTypeList(List<String> collegeType){
            this.collegeTypeList = collegeType;
            return this;
        }

        public QueryBuilder fetchCollegeType(){
            setFetchFields("fetchFields","collegeType");
            return this;
        }

        public QueryBuilder excludeCollegeType(){
            setFetchFields("excludeFields","collegeType");
            return this;
        }

        public QueryBuilder fuzzyCollegeLevel (List<String> fuzzyCollegeLevel){
            this.fuzzyCollegeLevel = fuzzyCollegeLevel;
            return this;
        }

        public QueryBuilder fuzzyCollegeLevel (String ... fuzzyCollegeLevel){
            this.fuzzyCollegeLevel = solveNullList(fuzzyCollegeLevel);
            return this;
        }

        public QueryBuilder rightFuzzyCollegeLevel (List<String> rightFuzzyCollegeLevel){
            this.rightFuzzyCollegeLevel = rightFuzzyCollegeLevel;
            return this;
        }

        public QueryBuilder rightFuzzyCollegeLevel (String ... rightFuzzyCollegeLevel){
            this.rightFuzzyCollegeLevel = solveNullList(rightFuzzyCollegeLevel);
            return this;
        }

        public QueryBuilder collegeLevel(String collegeLevel){
            setCollegeLevel(collegeLevel);
            return this;
        }

        public QueryBuilder collegeLevelList(String ... collegeLevel){
            this.collegeLevelList = solveNullList(collegeLevel);
            return this;
        }

        public QueryBuilder collegeLevelList(List<String> collegeLevel){
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

        public QueryBuilder fuzzyCollegeFeature (List<String> fuzzyCollegeFeature){
            this.fuzzyCollegeFeature = fuzzyCollegeFeature;
            return this;
        }

        public QueryBuilder fuzzyCollegeFeature (String ... fuzzyCollegeFeature){
            this.fuzzyCollegeFeature = solveNullList(fuzzyCollegeFeature);
            return this;
        }

        public QueryBuilder rightFuzzyCollegeFeature (List<String> rightFuzzyCollegeFeature){
            this.rightFuzzyCollegeFeature = rightFuzzyCollegeFeature;
            return this;
        }

        public QueryBuilder rightFuzzyCollegeFeature (String ... rightFuzzyCollegeFeature){
            this.rightFuzzyCollegeFeature = solveNullList(rightFuzzyCollegeFeature);
            return this;
        }

        public QueryBuilder collegeFeature(String collegeFeature){
            setCollegeFeature(collegeFeature);
            return this;
        }

        public QueryBuilder collegeFeatureList(String ... collegeFeature){
            this.collegeFeatureList = solveNullList(collegeFeature);
            return this;
        }

        public QueryBuilder collegeFeatureList(List<String> collegeFeature){
            this.collegeFeatureList = collegeFeature;
            return this;
        }

        public QueryBuilder fetchCollegeFeature(){
            setFetchFields("fetchFields","collegeFeature");
            return this;
        }

        public QueryBuilder excludeCollegeFeature(){
            setFetchFields("excludeFields","collegeFeature");
            return this;
        }

        public QueryBuilder fuzzyCollegeUrl (List<String> fuzzyCollegeUrl){
            this.fuzzyCollegeUrl = fuzzyCollegeUrl;
            return this;
        }

        public QueryBuilder fuzzyCollegeUrl (String ... fuzzyCollegeUrl){
            this.fuzzyCollegeUrl = solveNullList(fuzzyCollegeUrl);
            return this;
        }

        public QueryBuilder rightFuzzyCollegeUrl (List<String> rightFuzzyCollegeUrl){
            this.rightFuzzyCollegeUrl = rightFuzzyCollegeUrl;
            return this;
        }

        public QueryBuilder rightFuzzyCollegeUrl (String ... rightFuzzyCollegeUrl){
            this.rightFuzzyCollegeUrl = solveNullList(rightFuzzyCollegeUrl);
            return this;
        }

        public QueryBuilder collegeUrl(String collegeUrl){
            setCollegeUrl(collegeUrl);
            return this;
        }

        public QueryBuilder collegeUrlList(String ... collegeUrl){
            this.collegeUrlList = solveNullList(collegeUrl);
            return this;
        }

        public QueryBuilder collegeUrlList(List<String> collegeUrl){
            this.collegeUrlList = collegeUrl;
            return this;
        }

        public QueryBuilder fetchCollegeUrl(){
            setFetchFields("fetchFields","collegeUrl");
            return this;
        }

        public QueryBuilder excludeCollegeUrl(){
            setFetchFields("excludeFields","collegeUrl");
            return this;
        }

        public QueryBuilder fuzzyCollegeUrlExtra (List<String> fuzzyCollegeUrlExtra){
            this.fuzzyCollegeUrlExtra = fuzzyCollegeUrlExtra;
            return this;
        }

        public QueryBuilder fuzzyCollegeUrlExtra (String ... fuzzyCollegeUrlExtra){
            this.fuzzyCollegeUrlExtra = solveNullList(fuzzyCollegeUrlExtra);
            return this;
        }

        public QueryBuilder rightFuzzyCollegeUrlExtra (List<String> rightFuzzyCollegeUrlExtra){
            this.rightFuzzyCollegeUrlExtra = rightFuzzyCollegeUrlExtra;
            return this;
        }

        public QueryBuilder rightFuzzyCollegeUrlExtra (String ... rightFuzzyCollegeUrlExtra){
            this.rightFuzzyCollegeUrlExtra = solveNullList(rightFuzzyCollegeUrlExtra);
            return this;
        }

        public QueryBuilder collegeUrlExtra(String collegeUrlExtra){
            setCollegeUrlExtra(collegeUrlExtra);
            return this;
        }

        public QueryBuilder collegeUrlExtraList(String ... collegeUrlExtra){
            this.collegeUrlExtraList = solveNullList(collegeUrlExtra);
            return this;
        }

        public QueryBuilder collegeUrlExtraList(List<String> collegeUrlExtra){
            this.collegeUrlExtraList = collegeUrlExtra;
            return this;
        }

        public QueryBuilder fetchCollegeUrlExtra(){
            setFetchFields("fetchFields","collegeUrlExtra");
            return this;
        }

        public QueryBuilder excludeCollegeUrlExtra(){
            setFetchFields("excludeFields","collegeUrlExtra");
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

        public QueryBuilder fuzzyLogoUrl (List<String> fuzzyLogoUrl){
            this.fuzzyLogoUrl = fuzzyLogoUrl;
            return this;
        }

        public QueryBuilder fuzzyLogoUrl (String ... fuzzyLogoUrl){
            this.fuzzyLogoUrl = solveNullList(fuzzyLogoUrl);
            return this;
        }

        public QueryBuilder rightFuzzyLogoUrl (List<String> rightFuzzyLogoUrl){
            this.rightFuzzyLogoUrl = rightFuzzyLogoUrl;
            return this;
        }

        public QueryBuilder rightFuzzyLogoUrl (String ... rightFuzzyLogoUrl){
            this.rightFuzzyLogoUrl = solveNullList(rightFuzzyLogoUrl);
            return this;
        }

        public QueryBuilder logoUrl(String logoUrl){
            setLogoUrl(logoUrl);
            return this;
        }

        public QueryBuilder logoUrlList(String ... logoUrl){
            this.logoUrlList = solveNullList(logoUrl);
            return this;
        }

        public QueryBuilder logoUrlList(List<String> logoUrl){
            this.logoUrlList = logoUrl;
            return this;
        }

        public QueryBuilder fetchLogoUrl(){
            setFetchFields("fetchFields","logoUrl");
            return this;
        }

        public QueryBuilder excludeLogoUrl(){
            setFetchFields("excludeFields","logoUrl");
            return this;
        }

        public QueryBuilder fuzzyProvinceName (List<String> fuzzyProvinceName){
            this.fuzzyProvinceName = fuzzyProvinceName;
            return this;
        }

        public QueryBuilder fuzzyProvinceName (String ... fuzzyProvinceName){
            this.fuzzyProvinceName = solveNullList(fuzzyProvinceName);
            return this;
        }

        public QueryBuilder rightFuzzyProvinceName (List<String> rightFuzzyProvinceName){
            this.rightFuzzyProvinceName = rightFuzzyProvinceName;
            return this;
        }

        public QueryBuilder rightFuzzyProvinceName (String ... rightFuzzyProvinceName){
            this.rightFuzzyProvinceName = solveNullList(rightFuzzyProvinceName);
            return this;
        }

        public QueryBuilder provinceName(String provinceName){
            setProvinceName(provinceName);
            return this;
        }

        public QueryBuilder provinceNameList(String ... provinceName){
            this.provinceNameList = solveNullList(provinceName);
            return this;
        }

        public QueryBuilder provinceNameList(List<String> provinceName){
            this.provinceNameList = provinceName;
            return this;
        }

        public QueryBuilder fetchProvinceName(){
            setFetchFields("fetchFields","provinceName");
            return this;
        }

        public QueryBuilder excludeProvinceName(){
            setFetchFields("excludeFields","provinceName");
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

        public CollegeInformation build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> collegeNameList;

        public List<String> getCollegeNameList(){return this.collegeNameList;}


        private List<String> fuzzyCollegeName;

        public List<String> getFuzzyCollegeName(){return this.fuzzyCollegeName;}

        private List<String> rightFuzzyCollegeName;

        public List<String> getRightFuzzyCollegeName(){return this.rightFuzzyCollegeName;}
        private List<String> collegeTypeList;

        public List<String> getCollegeTypeList(){return this.collegeTypeList;}


        private List<String> fuzzyCollegeType;

        public List<String> getFuzzyCollegeType(){return this.fuzzyCollegeType;}

        private List<String> rightFuzzyCollegeType;

        public List<String> getRightFuzzyCollegeType(){return this.rightFuzzyCollegeType;}
        private List<String> collegeLevelList;

        public List<String> getCollegeLevelList(){return this.collegeLevelList;}


        private List<String> fuzzyCollegeLevel;

        public List<String> getFuzzyCollegeLevel(){return this.fuzzyCollegeLevel;}

        private List<String> rightFuzzyCollegeLevel;

        public List<String> getRightFuzzyCollegeLevel(){return this.rightFuzzyCollegeLevel;}
        private List<String> collegeFeatureList;

        public List<String> getCollegeFeatureList(){return this.collegeFeatureList;}


        private List<String> fuzzyCollegeFeature;

        public List<String> getFuzzyCollegeFeature(){return this.fuzzyCollegeFeature;}

        private List<String> rightFuzzyCollegeFeature;

        public List<String> getRightFuzzyCollegeFeature(){return this.rightFuzzyCollegeFeature;}
        private List<String> collegeUrlList;

        public List<String> getCollegeUrlList(){return this.collegeUrlList;}


        private List<String> fuzzyCollegeUrl;

        public List<String> getFuzzyCollegeUrl(){return this.fuzzyCollegeUrl;}

        private List<String> rightFuzzyCollegeUrl;

        public List<String> getRightFuzzyCollegeUrl(){return this.rightFuzzyCollegeUrl;}
        private List<String> collegeUrlExtraList;

        public List<String> getCollegeUrlExtraList(){return this.collegeUrlExtraList;}


        private List<String> fuzzyCollegeUrlExtra;

        public List<String> getFuzzyCollegeUrlExtra(){return this.fuzzyCollegeUrlExtra;}

        private List<String> rightFuzzyCollegeUrlExtra;

        public List<String> getRightFuzzyCollegeUrlExtra(){return this.rightFuzzyCollegeUrlExtra;}
        private List<String> competentDepartmentList;

        public List<String> getCompetentDepartmentList(){return this.competentDepartmentList;}


        private List<String> fuzzyCompetentDepartment;

        public List<String> getFuzzyCompetentDepartment(){return this.fuzzyCompetentDepartment;}

        private List<String> rightFuzzyCompetentDepartment;

        public List<String> getRightFuzzyCompetentDepartment(){return this.rightFuzzyCompetentDepartment;}
        private List<String> logoUrlList;

        public List<String> getLogoUrlList(){return this.logoUrlList;}


        private List<String> fuzzyLogoUrl;

        public List<String> getFuzzyLogoUrl(){return this.fuzzyLogoUrl;}

        private List<String> rightFuzzyLogoUrl;

        public List<String> getRightFuzzyLogoUrl(){return this.rightFuzzyLogoUrl;}
        private List<String> provinceNameList;

        public List<String> getProvinceNameList(){return this.provinceNameList;}


        private List<String> fuzzyProvinceName;

        public List<String> getFuzzyProvinceName(){return this.fuzzyProvinceName;}

        private List<String> rightFuzzyProvinceName;

        public List<String> getRightFuzzyProvinceName(){return this.rightFuzzyProvinceName;}

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

        public ConditionBuilder fuzzyCollegeType (List<String> fuzzyCollegeType){
            this.fuzzyCollegeType = fuzzyCollegeType;
            return this;
        }

        public ConditionBuilder fuzzyCollegeType (String ... fuzzyCollegeType){
            this.fuzzyCollegeType = solveNullList(fuzzyCollegeType);
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeType (List<String> rightFuzzyCollegeType){
            this.rightFuzzyCollegeType = rightFuzzyCollegeType;
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeType (String ... rightFuzzyCollegeType){
            this.rightFuzzyCollegeType = solveNullList(rightFuzzyCollegeType);
            return this;
        }

        public ConditionBuilder collegeTypeList(String ... collegeType){
            this.collegeTypeList = solveNullList(collegeType);
            return this;
        }

        public ConditionBuilder collegeTypeList(List<String> collegeType){
            this.collegeTypeList = collegeType;
            return this;
        }

        public ConditionBuilder fuzzyCollegeLevel (List<String> fuzzyCollegeLevel){
            this.fuzzyCollegeLevel = fuzzyCollegeLevel;
            return this;
        }

        public ConditionBuilder fuzzyCollegeLevel (String ... fuzzyCollegeLevel){
            this.fuzzyCollegeLevel = solveNullList(fuzzyCollegeLevel);
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeLevel (List<String> rightFuzzyCollegeLevel){
            this.rightFuzzyCollegeLevel = rightFuzzyCollegeLevel;
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeLevel (String ... rightFuzzyCollegeLevel){
            this.rightFuzzyCollegeLevel = solveNullList(rightFuzzyCollegeLevel);
            return this;
        }

        public ConditionBuilder collegeLevelList(String ... collegeLevel){
            this.collegeLevelList = solveNullList(collegeLevel);
            return this;
        }

        public ConditionBuilder collegeLevelList(List<String> collegeLevel){
            this.collegeLevelList = collegeLevel;
            return this;
        }

        public ConditionBuilder fuzzyCollegeFeature (List<String> fuzzyCollegeFeature){
            this.fuzzyCollegeFeature = fuzzyCollegeFeature;
            return this;
        }

        public ConditionBuilder fuzzyCollegeFeature (String ... fuzzyCollegeFeature){
            this.fuzzyCollegeFeature = solveNullList(fuzzyCollegeFeature);
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeFeature (List<String> rightFuzzyCollegeFeature){
            this.rightFuzzyCollegeFeature = rightFuzzyCollegeFeature;
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeFeature (String ... rightFuzzyCollegeFeature){
            this.rightFuzzyCollegeFeature = solveNullList(rightFuzzyCollegeFeature);
            return this;
        }

        public ConditionBuilder collegeFeatureList(String ... collegeFeature){
            this.collegeFeatureList = solveNullList(collegeFeature);
            return this;
        }

        public ConditionBuilder collegeFeatureList(List<String> collegeFeature){
            this.collegeFeatureList = collegeFeature;
            return this;
        }

        public ConditionBuilder fuzzyCollegeUrl (List<String> fuzzyCollegeUrl){
            this.fuzzyCollegeUrl = fuzzyCollegeUrl;
            return this;
        }

        public ConditionBuilder fuzzyCollegeUrl (String ... fuzzyCollegeUrl){
            this.fuzzyCollegeUrl = solveNullList(fuzzyCollegeUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeUrl (List<String> rightFuzzyCollegeUrl){
            this.rightFuzzyCollegeUrl = rightFuzzyCollegeUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeUrl (String ... rightFuzzyCollegeUrl){
            this.rightFuzzyCollegeUrl = solveNullList(rightFuzzyCollegeUrl);
            return this;
        }

        public ConditionBuilder collegeUrlList(String ... collegeUrl){
            this.collegeUrlList = solveNullList(collegeUrl);
            return this;
        }

        public ConditionBuilder collegeUrlList(List<String> collegeUrl){
            this.collegeUrlList = collegeUrl;
            return this;
        }

        public ConditionBuilder fuzzyCollegeUrlExtra (List<String> fuzzyCollegeUrlExtra){
            this.fuzzyCollegeUrlExtra = fuzzyCollegeUrlExtra;
            return this;
        }

        public ConditionBuilder fuzzyCollegeUrlExtra (String ... fuzzyCollegeUrlExtra){
            this.fuzzyCollegeUrlExtra = solveNullList(fuzzyCollegeUrlExtra);
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeUrlExtra (List<String> rightFuzzyCollegeUrlExtra){
            this.rightFuzzyCollegeUrlExtra = rightFuzzyCollegeUrlExtra;
            return this;
        }

        public ConditionBuilder rightFuzzyCollegeUrlExtra (String ... rightFuzzyCollegeUrlExtra){
            this.rightFuzzyCollegeUrlExtra = solveNullList(rightFuzzyCollegeUrlExtra);
            return this;
        }

        public ConditionBuilder collegeUrlExtraList(String ... collegeUrlExtra){
            this.collegeUrlExtraList = solveNullList(collegeUrlExtra);
            return this;
        }

        public ConditionBuilder collegeUrlExtraList(List<String> collegeUrlExtra){
            this.collegeUrlExtraList = collegeUrlExtra;
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

        public ConditionBuilder fuzzyLogoUrl (List<String> fuzzyLogoUrl){
            this.fuzzyLogoUrl = fuzzyLogoUrl;
            return this;
        }

        public ConditionBuilder fuzzyLogoUrl (String ... fuzzyLogoUrl){
            this.fuzzyLogoUrl = solveNullList(fuzzyLogoUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyLogoUrl (List<String> rightFuzzyLogoUrl){
            this.rightFuzzyLogoUrl = rightFuzzyLogoUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyLogoUrl (String ... rightFuzzyLogoUrl){
            this.rightFuzzyLogoUrl = solveNullList(rightFuzzyLogoUrl);
            return this;
        }

        public ConditionBuilder logoUrlList(String ... logoUrl){
            this.logoUrlList = solveNullList(logoUrl);
            return this;
        }

        public ConditionBuilder logoUrlList(List<String> logoUrl){
            this.logoUrlList = logoUrl;
            return this;
        }

        public ConditionBuilder fuzzyProvinceName (List<String> fuzzyProvinceName){
            this.fuzzyProvinceName = fuzzyProvinceName;
            return this;
        }

        public ConditionBuilder fuzzyProvinceName (String ... fuzzyProvinceName){
            this.fuzzyProvinceName = solveNullList(fuzzyProvinceName);
            return this;
        }

        public ConditionBuilder rightFuzzyProvinceName (List<String> rightFuzzyProvinceName){
            this.rightFuzzyProvinceName = rightFuzzyProvinceName;
            return this;
        }

        public ConditionBuilder rightFuzzyProvinceName (String ... rightFuzzyProvinceName){
            this.rightFuzzyProvinceName = solveNullList(rightFuzzyProvinceName);
            return this;
        }

        public ConditionBuilder provinceNameList(String ... provinceName){
            this.provinceNameList = solveNullList(provinceName);
            return this;
        }

        public ConditionBuilder provinceNameList(List<String> provinceName){
            this.provinceNameList = provinceName;
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

        private CollegeInformation obj;

        public Builder(){
            this.obj = new CollegeInformation();
        }

        public Builder collegeName(String collegeName){
            this.obj.setCollegeName(collegeName);
            return this;
        }
        public Builder collegeType(String collegeType){
            this.obj.setCollegeType(collegeType);
            return this;
        }
        public Builder collegeLevel(String collegeLevel){
            this.obj.setCollegeLevel(collegeLevel);
            return this;
        }
        public Builder collegeFeature(String collegeFeature){
            this.obj.setCollegeFeature(collegeFeature);
            return this;
        }
        public Builder collegeUrl(String collegeUrl){
            this.obj.setCollegeUrl(collegeUrl);
            return this;
        }
        public Builder collegeUrlExtra(String collegeUrlExtra){
            this.obj.setCollegeUrlExtra(collegeUrlExtra);
            return this;
        }
        public Builder competentDepartment(String competentDepartment){
            this.obj.setCompetentDepartment(competentDepartment);
            return this;
        }
        public Builder logoUrl(String logoUrl){
            this.obj.setLogoUrl(logoUrl);
            return this;
        }
        public Builder provinceName(String provinceName){
            this.obj.setProvinceName(provinceName);
            return this;
        }
        public CollegeInformation build(){return obj;}
    }

}
