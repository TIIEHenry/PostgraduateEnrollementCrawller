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
public class CollegeSubject implements Serializable {

    private static final long serialVersionUID = 1577944305448L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String url;

    /**
    * 
    * isNullAble:1
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
    private String provinceCode;

    /**
    * 
    * isNullAble:1
    */
    private String provinceName;

    /**
    * 
    * isNullAble:1
    */
    private Integer graduateSchool;

    /**
    * 
    * isNullAble:1
    */
    private Integer selfScribing;

    /**
    * 
    * isNullAble:1
    */
    private Integer doctorStation;

    /**
    * 
    * isNullAble:1
    */
    private String subjectCode;

    /**
    * 
    * isNullAble:1
    */
    private String subjectName;


    public void setUrl(String url){this.url = url;}

    public String getUrl(){return this.url;}

    public void setCollegeCode(String collegeCode){this.collegeCode = collegeCode;}

    public String getCollegeCode(){return this.collegeCode;}

    public void setCollegeName(String collegeName){this.collegeName = collegeName;}

    public String getCollegeName(){return this.collegeName;}

    public void setProvinceCode(String provinceCode){this.provinceCode = provinceCode;}

    public String getProvinceCode(){return this.provinceCode;}

    public void setProvinceName(String provinceName){this.provinceName = provinceName;}

    public String getProvinceName(){return this.provinceName;}

    public void setGraduateSchool(Integer graduateSchool){this.graduateSchool = graduateSchool;}

    public Integer getGraduateSchool(){return this.graduateSchool;}

    public void setSelfScribing(Integer selfScribing){this.selfScribing = selfScribing;}

    public Integer getSelfScribing(){return this.selfScribing;}

    public void setDoctorStation(Integer doctorStation){this.doctorStation = doctorStation;}

    public Integer getDoctorStation(){return this.doctorStation;}

    public void setSubjectCode(String subjectCode){this.subjectCode = subjectCode;}

    public String getSubjectCode(){return this.subjectCode;}

    public void setSubjectName(String subjectName){this.subjectName = subjectName;}

    public String getSubjectName(){return this.subjectName;}
    @Override
    public String toString() {
        return "CollegeSubject{" +
                "url='" + url + '\'' +
                "collegeCode='" + collegeCode + '\'' +
                "collegeName='" + collegeName + '\'' +
                "provinceCode='" + provinceCode + '\'' +
                "provinceName='" + provinceName + '\'' +
                "graduateSchool='" + graduateSchool + '\'' +
                "selfScribing='" + selfScribing + '\'' +
                "doctorStation='" + doctorStation + '\'' +
                "subjectCode='" + subjectCode + '\'' +
                "subjectName='" + subjectName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CollegeSubject set;

        private ConditionBuilder where;

        public UpdateBuilder set(CollegeSubject set){
            this.set = set;
            return this;
        }

        public CollegeSubject getSet(){
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

    public static class QueryBuilder extends CollegeSubject{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
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
        private List<String> provinceCodeList;

        public List<String> getProvinceCodeList(){return this.provinceCodeList;}


        private List<String> fuzzyProvinceCode;

        public List<String> getFuzzyProvinceCode(){return this.fuzzyProvinceCode;}

        private List<String> rightFuzzyProvinceCode;

        public List<String> getRightFuzzyProvinceCode(){return this.rightFuzzyProvinceCode;}
        private List<String> provinceNameList;

        public List<String> getProvinceNameList(){return this.provinceNameList;}


        private List<String> fuzzyProvinceName;

        public List<String> getFuzzyProvinceName(){return this.fuzzyProvinceName;}

        private List<String> rightFuzzyProvinceName;

        public List<String> getRightFuzzyProvinceName(){return this.rightFuzzyProvinceName;}
        private List<Integer> graduateSchoolList;

        public List<Integer> getGraduateSchoolList(){return this.graduateSchoolList;}

        private Integer graduateSchoolSt;

        private Integer graduateSchoolEd;

        public Integer getGraduateSchoolSt(){return this.graduateSchoolSt;}

        public Integer getGraduateSchoolEd(){return this.graduateSchoolEd;}

        private List<Integer> selfScribingList;

        public List<Integer> getSelfScribingList(){return this.selfScribingList;}

        private Integer selfScribingSt;

        private Integer selfScribingEd;

        public Integer getSelfScribingSt(){return this.selfScribingSt;}

        public Integer getSelfScribingEd(){return this.selfScribingEd;}

        private List<Integer> doctorStationList;

        public List<Integer> getDoctorStationList(){return this.doctorStationList;}

        private Integer doctorStationSt;

        private Integer doctorStationEd;

        public Integer getDoctorStationSt(){return this.doctorStationSt;}

        public Integer getDoctorStationEd(){return this.doctorStationEd;}

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
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public QueryBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public QueryBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public QueryBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public QueryBuilder url(String url){
            setUrl(url);
            return this;
        }

        public QueryBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public QueryBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        public QueryBuilder fetchUrl(){
            setFetchFields("fetchFields","url");
            return this;
        }

        public QueryBuilder excludeUrl(){
            setFetchFields("excludeFields","url");
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

        public QueryBuilder fuzzyProvinceCode (List<String> fuzzyProvinceCode){
            this.fuzzyProvinceCode = fuzzyProvinceCode;
            return this;
        }

        public QueryBuilder fuzzyProvinceCode (String ... fuzzyProvinceCode){
            this.fuzzyProvinceCode = solveNullList(fuzzyProvinceCode);
            return this;
        }

        public QueryBuilder rightFuzzyProvinceCode (List<String> rightFuzzyProvinceCode){
            this.rightFuzzyProvinceCode = rightFuzzyProvinceCode;
            return this;
        }

        public QueryBuilder rightFuzzyProvinceCode (String ... rightFuzzyProvinceCode){
            this.rightFuzzyProvinceCode = solveNullList(rightFuzzyProvinceCode);
            return this;
        }

        public QueryBuilder provinceCode(String provinceCode){
            setProvinceCode(provinceCode);
            return this;
        }

        public QueryBuilder provinceCodeList(String ... provinceCode){
            this.provinceCodeList = solveNullList(provinceCode);
            return this;
        }

        public QueryBuilder provinceCodeList(List<String> provinceCode){
            this.provinceCodeList = provinceCode;
            return this;
        }

        public QueryBuilder fetchProvinceCode(){
            setFetchFields("fetchFields","provinceCode");
            return this;
        }

        public QueryBuilder excludeProvinceCode(){
            setFetchFields("excludeFields","provinceCode");
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

        public QueryBuilder graduateSchoolBetWeen(Integer graduateSchoolSt,Integer graduateSchoolEd){
            this.graduateSchoolSt = graduateSchoolSt;
            this.graduateSchoolEd = graduateSchoolEd;
            return this;
        }

        public QueryBuilder graduateSchoolGreaterEqThan(Integer graduateSchoolSt){
            this.graduateSchoolSt = graduateSchoolSt;
            return this;
        }
        public QueryBuilder graduateSchoolLessEqThan(Integer graduateSchoolEd){
            this.graduateSchoolEd = graduateSchoolEd;
            return this;
        }


        public QueryBuilder graduateSchool(Integer graduateSchool){
            setGraduateSchool(graduateSchool);
            return this;
        }

        public QueryBuilder graduateSchoolList(Integer ... graduateSchool){
            this.graduateSchoolList = solveNullList(graduateSchool);
            return this;
        }

        public QueryBuilder graduateSchoolList(List<Integer> graduateSchool){
            this.graduateSchoolList = graduateSchool;
            return this;
        }

        public QueryBuilder fetchGraduateSchool(){
            setFetchFields("fetchFields","graduateSchool");
            return this;
        }

        public QueryBuilder excludeGraduateSchool(){
            setFetchFields("excludeFields","graduateSchool");
            return this;
        }

        public QueryBuilder selfScribingBetWeen(Integer selfScribingSt,Integer selfScribingEd){
            this.selfScribingSt = selfScribingSt;
            this.selfScribingEd = selfScribingEd;
            return this;
        }

        public QueryBuilder selfScribingGreaterEqThan(Integer selfScribingSt){
            this.selfScribingSt = selfScribingSt;
            return this;
        }
        public QueryBuilder selfScribingLessEqThan(Integer selfScribingEd){
            this.selfScribingEd = selfScribingEd;
            return this;
        }


        public QueryBuilder selfScribing(Integer selfScribing){
            setSelfScribing(selfScribing);
            return this;
        }

        public QueryBuilder selfScribingList(Integer ... selfScribing){
            this.selfScribingList = solveNullList(selfScribing);
            return this;
        }

        public QueryBuilder selfScribingList(List<Integer> selfScribing){
            this.selfScribingList = selfScribing;
            return this;
        }

        public QueryBuilder fetchSelfScribing(){
            setFetchFields("fetchFields","selfScribing");
            return this;
        }

        public QueryBuilder excludeSelfScribing(){
            setFetchFields("excludeFields","selfScribing");
            return this;
        }

        public QueryBuilder doctorStationBetWeen(Integer doctorStationSt,Integer doctorStationEd){
            this.doctorStationSt = doctorStationSt;
            this.doctorStationEd = doctorStationEd;
            return this;
        }

        public QueryBuilder doctorStationGreaterEqThan(Integer doctorStationSt){
            this.doctorStationSt = doctorStationSt;
            return this;
        }
        public QueryBuilder doctorStationLessEqThan(Integer doctorStationEd){
            this.doctorStationEd = doctorStationEd;
            return this;
        }


        public QueryBuilder doctorStation(Integer doctorStation){
            setDoctorStation(doctorStation);
            return this;
        }

        public QueryBuilder doctorStationList(Integer ... doctorStation){
            this.doctorStationList = solveNullList(doctorStation);
            return this;
        }

        public QueryBuilder doctorStationList(List<Integer> doctorStation){
            this.doctorStationList = doctorStation;
            return this;
        }

        public QueryBuilder fetchDoctorStation(){
            setFetchFields("fetchFields","doctorStation");
            return this;
        }

        public QueryBuilder excludeDoctorStation(){
            setFetchFields("excludeFields","doctorStation");
            return this;
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

        public CollegeSubject build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
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
        private List<String> provinceCodeList;

        public List<String> getProvinceCodeList(){return this.provinceCodeList;}


        private List<String> fuzzyProvinceCode;

        public List<String> getFuzzyProvinceCode(){return this.fuzzyProvinceCode;}

        private List<String> rightFuzzyProvinceCode;

        public List<String> getRightFuzzyProvinceCode(){return this.rightFuzzyProvinceCode;}
        private List<String> provinceNameList;

        public List<String> getProvinceNameList(){return this.provinceNameList;}


        private List<String> fuzzyProvinceName;

        public List<String> getFuzzyProvinceName(){return this.fuzzyProvinceName;}

        private List<String> rightFuzzyProvinceName;

        public List<String> getRightFuzzyProvinceName(){return this.rightFuzzyProvinceName;}
        private List<Integer> graduateSchoolList;

        public List<Integer> getGraduateSchoolList(){return this.graduateSchoolList;}

        private Integer graduateSchoolSt;

        private Integer graduateSchoolEd;

        public Integer getGraduateSchoolSt(){return this.graduateSchoolSt;}

        public Integer getGraduateSchoolEd(){return this.graduateSchoolEd;}

        private List<Integer> selfScribingList;

        public List<Integer> getSelfScribingList(){return this.selfScribingList;}

        private Integer selfScribingSt;

        private Integer selfScribingEd;

        public Integer getSelfScribingSt(){return this.selfScribingSt;}

        public Integer getSelfScribingEd(){return this.selfScribingEd;}

        private List<Integer> doctorStationList;

        public List<Integer> getDoctorStationList(){return this.doctorStationList;}

        private Integer doctorStationSt;

        private Integer doctorStationEd;

        public Integer getDoctorStationSt(){return this.doctorStationSt;}

        public Integer getDoctorStationEd(){return this.doctorStationEd;}

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

        public ConditionBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public ConditionBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public ConditionBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public ConditionBuilder urlList(List<String> url){
            this.urlList = url;
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

        public ConditionBuilder fuzzyProvinceCode (List<String> fuzzyProvinceCode){
            this.fuzzyProvinceCode = fuzzyProvinceCode;
            return this;
        }

        public ConditionBuilder fuzzyProvinceCode (String ... fuzzyProvinceCode){
            this.fuzzyProvinceCode = solveNullList(fuzzyProvinceCode);
            return this;
        }

        public ConditionBuilder rightFuzzyProvinceCode (List<String> rightFuzzyProvinceCode){
            this.rightFuzzyProvinceCode = rightFuzzyProvinceCode;
            return this;
        }

        public ConditionBuilder rightFuzzyProvinceCode (String ... rightFuzzyProvinceCode){
            this.rightFuzzyProvinceCode = solveNullList(rightFuzzyProvinceCode);
            return this;
        }

        public ConditionBuilder provinceCodeList(String ... provinceCode){
            this.provinceCodeList = solveNullList(provinceCode);
            return this;
        }

        public ConditionBuilder provinceCodeList(List<String> provinceCode){
            this.provinceCodeList = provinceCode;
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

        public ConditionBuilder graduateSchoolBetWeen(Integer graduateSchoolSt,Integer graduateSchoolEd){
            this.graduateSchoolSt = graduateSchoolSt;
            this.graduateSchoolEd = graduateSchoolEd;
            return this;
        }

        public ConditionBuilder graduateSchoolGreaterEqThan(Integer graduateSchoolSt){
            this.graduateSchoolSt = graduateSchoolSt;
            return this;
        }
        public ConditionBuilder graduateSchoolLessEqThan(Integer graduateSchoolEd){
            this.graduateSchoolEd = graduateSchoolEd;
            return this;
        }


        public ConditionBuilder graduateSchoolList(Integer ... graduateSchool){
            this.graduateSchoolList = solveNullList(graduateSchool);
            return this;
        }

        public ConditionBuilder graduateSchoolList(List<Integer> graduateSchool){
            this.graduateSchoolList = graduateSchool;
            return this;
        }

        public ConditionBuilder selfScribingBetWeen(Integer selfScribingSt,Integer selfScribingEd){
            this.selfScribingSt = selfScribingSt;
            this.selfScribingEd = selfScribingEd;
            return this;
        }

        public ConditionBuilder selfScribingGreaterEqThan(Integer selfScribingSt){
            this.selfScribingSt = selfScribingSt;
            return this;
        }
        public ConditionBuilder selfScribingLessEqThan(Integer selfScribingEd){
            this.selfScribingEd = selfScribingEd;
            return this;
        }


        public ConditionBuilder selfScribingList(Integer ... selfScribing){
            this.selfScribingList = solveNullList(selfScribing);
            return this;
        }

        public ConditionBuilder selfScribingList(List<Integer> selfScribing){
            this.selfScribingList = selfScribing;
            return this;
        }

        public ConditionBuilder doctorStationBetWeen(Integer doctorStationSt,Integer doctorStationEd){
            this.doctorStationSt = doctorStationSt;
            this.doctorStationEd = doctorStationEd;
            return this;
        }

        public ConditionBuilder doctorStationGreaterEqThan(Integer doctorStationSt){
            this.doctorStationSt = doctorStationSt;
            return this;
        }
        public ConditionBuilder doctorStationLessEqThan(Integer doctorStationEd){
            this.doctorStationEd = doctorStationEd;
            return this;
        }


        public ConditionBuilder doctorStationList(Integer ... doctorStation){
            this.doctorStationList = solveNullList(doctorStation);
            return this;
        }

        public ConditionBuilder doctorStationList(List<Integer> doctorStation){
            this.doctorStationList = doctorStation;
            return this;
        }

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

        private CollegeSubject obj;

        public Builder(){
            this.obj = new CollegeSubject();
        }

        public Builder url(String url){
            this.obj.setUrl(url);
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
        public Builder provinceCode(String provinceCode){
            this.obj.setProvinceCode(provinceCode);
            return this;
        }
        public Builder provinceName(String provinceName){
            this.obj.setProvinceName(provinceName);
            return this;
        }
        public Builder graduateSchool(Integer graduateSchool){
            this.obj.setGraduateSchool(graduateSchool);
            return this;
        }
        public Builder selfScribing(Integer selfScribing){
            this.obj.setSelfScribing(selfScribing);
            return this;
        }
        public Builder doctorStation(Integer doctorStation){
            this.obj.setDoctorStation(doctorStation);
            return this;
        }
        public Builder subjectCode(String subjectCode){
            this.obj.setSubjectCode(subjectCode);
            return this;
        }
        public Builder subjectName(String subjectName){
            this.obj.setSubjectName(subjectName);
            return this;
        }
        public CollegeSubject build(){return obj;}
    }

}
