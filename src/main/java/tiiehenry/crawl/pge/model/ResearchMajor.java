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
public class ResearchMajor implements Serializable {

    private static final long serialVersionUID = 1577944165484L;


    /**
    * 
    * isNullAble:0
    */
    private String url;

    /**
    * 
    * isNullAble:1
    */
    private String examWay;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String faculty;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String major;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String majorDirection;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String studyWay;

    /**
    * 
    * isNullAble:1
    */
    private String teacher;

    /**
    * 
    * isNullAble:1
    */
    private String enrollmentPlan;

    /**
    * 
    * isNullAble:1
    */
    private String examRegionUrl;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String examRegionId;

    /**
    * 
    * isNullAble:1
    */
    private String interdisciplinary;

    /**
    * 
    * isNullAble:1
    */
    private String comment;


    public void setUrl(String url){this.url = url;}

    public String getUrl(){return this.url;}

    public void setExamWay(String examWay){this.examWay = examWay;}

    public String getExamWay(){return this.examWay;}

    public void setFaculty(String faculty){this.faculty = faculty;}

    public String getFaculty(){return this.faculty;}

    public void setMajor(String major){this.major = major;}

    public String getMajor(){return this.major;}

    public void setMajorDirection(String majorDirection){this.majorDirection = majorDirection;}

    public String getMajorDirection(){return this.majorDirection;}

    public void setStudyWay(String studyWay){this.studyWay = studyWay;}

    public String getStudyWay(){return this.studyWay;}

    public void setTeacher(String teacher){this.teacher = teacher;}

    public String getTeacher(){return this.teacher;}

    public void setEnrollmentPlan(String enrollmentPlan){this.enrollmentPlan = enrollmentPlan;}

    public String getEnrollmentPlan(){return this.enrollmentPlan;}

    public void setExamRegionUrl(String examRegionUrl){this.examRegionUrl = examRegionUrl;}

    public String getExamRegionUrl(){return this.examRegionUrl;}

    public void setExamRegionId(String examRegionId){this.examRegionId = examRegionId;}

    public String getExamRegionId(){return this.examRegionId;}

    public void setInterdisciplinary(String interdisciplinary){this.interdisciplinary = interdisciplinary;}

    public String getInterdisciplinary(){return this.interdisciplinary;}

    public void setComment(String comment){this.comment = comment;}

    public String getComment(){return this.comment;}
    @Override
    public String toString() {
        return "ResearchMajor{" +
                "url='" + url + '\'' +
                "examWay='" + examWay + '\'' +
                "faculty='" + faculty + '\'' +
                "major='" + major + '\'' +
                "majorDirection='" + majorDirection + '\'' +
                "studyWay='" + studyWay + '\'' +
                "teacher='" + teacher + '\'' +
                "enrollmentPlan='" + enrollmentPlan + '\'' +
                "examRegionUrl='" + examRegionUrl + '\'' +
                "examRegionId='" + examRegionId + '\'' +
                "interdisciplinary='" + interdisciplinary + '\'' +
                "comment='" + comment + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ResearchMajor set;

        private ConditionBuilder where;

        public UpdateBuilder set(ResearchMajor set){
            this.set = set;
            return this;
        }

        public ResearchMajor getSet(){
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

    public static class QueryBuilder extends ResearchMajor{
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
        private List<String> examWayList;

        public List<String> getExamWayList(){return this.examWayList;}


        private List<String> fuzzyExamWay;

        public List<String> getFuzzyExamWay(){return this.fuzzyExamWay;}

        private List<String> rightFuzzyExamWay;

        public List<String> getRightFuzzyExamWay(){return this.rightFuzzyExamWay;}
        private List<String> facultyList;

        public List<String> getFacultyList(){return this.facultyList;}


        private List<String> fuzzyFaculty;

        public List<String> getFuzzyFaculty(){return this.fuzzyFaculty;}

        private List<String> rightFuzzyFaculty;

        public List<String> getRightFuzzyFaculty(){return this.rightFuzzyFaculty;}
        private List<String> majorList;

        public List<String> getMajorList(){return this.majorList;}


        private List<String> fuzzyMajor;

        public List<String> getFuzzyMajor(){return this.fuzzyMajor;}

        private List<String> rightFuzzyMajor;

        public List<String> getRightFuzzyMajor(){return this.rightFuzzyMajor;}
        private List<String> majorDirectionList;

        public List<String> getMajorDirectionList(){return this.majorDirectionList;}


        private List<String> fuzzyMajorDirection;

        public List<String> getFuzzyMajorDirection(){return this.fuzzyMajorDirection;}

        private List<String> rightFuzzyMajorDirection;

        public List<String> getRightFuzzyMajorDirection(){return this.rightFuzzyMajorDirection;}
        private List<String> studyWayList;

        public List<String> getStudyWayList(){return this.studyWayList;}


        private List<String> fuzzyStudyWay;

        public List<String> getFuzzyStudyWay(){return this.fuzzyStudyWay;}

        private List<String> rightFuzzyStudyWay;

        public List<String> getRightFuzzyStudyWay(){return this.rightFuzzyStudyWay;}
        private List<String> teacherList;

        public List<String> getTeacherList(){return this.teacherList;}


        private List<String> fuzzyTeacher;

        public List<String> getFuzzyTeacher(){return this.fuzzyTeacher;}

        private List<String> rightFuzzyTeacher;

        public List<String> getRightFuzzyTeacher(){return this.rightFuzzyTeacher;}
        private List<String> enrollmentPlanList;

        public List<String> getEnrollmentPlanList(){return this.enrollmentPlanList;}


        private List<String> fuzzyEnrollmentPlan;

        public List<String> getFuzzyEnrollmentPlan(){return this.fuzzyEnrollmentPlan;}

        private List<String> rightFuzzyEnrollmentPlan;

        public List<String> getRightFuzzyEnrollmentPlan(){return this.rightFuzzyEnrollmentPlan;}
        private List<String> examRegionUrlList;

        public List<String> getExamRegionUrlList(){return this.examRegionUrlList;}


        private List<String> fuzzyExamRegionUrl;

        public List<String> getFuzzyExamRegionUrl(){return this.fuzzyExamRegionUrl;}

        private List<String> rightFuzzyExamRegionUrl;

        public List<String> getRightFuzzyExamRegionUrl(){return this.rightFuzzyExamRegionUrl;}
        private List<String> examRegionIdList;

        public List<String> getExamRegionIdList(){return this.examRegionIdList;}


        private List<String> fuzzyExamRegionId;

        public List<String> getFuzzyExamRegionId(){return this.fuzzyExamRegionId;}

        private List<String> rightFuzzyExamRegionId;

        public List<String> getRightFuzzyExamRegionId(){return this.rightFuzzyExamRegionId;}
        private List<String> interdisciplinaryList;

        public List<String> getInterdisciplinaryList(){return this.interdisciplinaryList;}


        private List<String> fuzzyInterdisciplinary;

        public List<String> getFuzzyInterdisciplinary(){return this.fuzzyInterdisciplinary;}

        private List<String> rightFuzzyInterdisciplinary;

        public List<String> getRightFuzzyInterdisciplinary(){return this.rightFuzzyInterdisciplinary;}
        private List<String> commentList;

        public List<String> getCommentList(){return this.commentList;}


        private List<String> fuzzyComment;

        public List<String> getFuzzyComment(){return this.fuzzyComment;}

        private List<String> rightFuzzyComment;

        public List<String> getRightFuzzyComment(){return this.rightFuzzyComment;}
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

        public QueryBuilder fuzzyExamWay (List<String> fuzzyExamWay){
            this.fuzzyExamWay = fuzzyExamWay;
            return this;
        }

        public QueryBuilder fuzzyExamWay (String ... fuzzyExamWay){
            this.fuzzyExamWay = solveNullList(fuzzyExamWay);
            return this;
        }

        public QueryBuilder rightFuzzyExamWay (List<String> rightFuzzyExamWay){
            this.rightFuzzyExamWay = rightFuzzyExamWay;
            return this;
        }

        public QueryBuilder rightFuzzyExamWay (String ... rightFuzzyExamWay){
            this.rightFuzzyExamWay = solveNullList(rightFuzzyExamWay);
            return this;
        }

        public QueryBuilder examWay(String examWay){
            setExamWay(examWay);
            return this;
        }

        public QueryBuilder examWayList(String ... examWay){
            this.examWayList = solveNullList(examWay);
            return this;
        }

        public QueryBuilder examWayList(List<String> examWay){
            this.examWayList = examWay;
            return this;
        }

        public QueryBuilder fetchExamWay(){
            setFetchFields("fetchFields","examWay");
            return this;
        }

        public QueryBuilder excludeExamWay(){
            setFetchFields("excludeFields","examWay");
            return this;
        }

        public QueryBuilder fuzzyFaculty (List<String> fuzzyFaculty){
            this.fuzzyFaculty = fuzzyFaculty;
            return this;
        }

        public QueryBuilder fuzzyFaculty (String ... fuzzyFaculty){
            this.fuzzyFaculty = solveNullList(fuzzyFaculty);
            return this;
        }

        public QueryBuilder rightFuzzyFaculty (List<String> rightFuzzyFaculty){
            this.rightFuzzyFaculty = rightFuzzyFaculty;
            return this;
        }

        public QueryBuilder rightFuzzyFaculty (String ... rightFuzzyFaculty){
            this.rightFuzzyFaculty = solveNullList(rightFuzzyFaculty);
            return this;
        }

        public QueryBuilder faculty(String faculty){
            setFaculty(faculty);
            return this;
        }

        public QueryBuilder facultyList(String ... faculty){
            this.facultyList = solveNullList(faculty);
            return this;
        }

        public QueryBuilder facultyList(List<String> faculty){
            this.facultyList = faculty;
            return this;
        }

        public QueryBuilder fetchFaculty(){
            setFetchFields("fetchFields","faculty");
            return this;
        }

        public QueryBuilder excludeFaculty(){
            setFetchFields("excludeFields","faculty");
            return this;
        }

        public QueryBuilder fuzzyMajor (List<String> fuzzyMajor){
            this.fuzzyMajor = fuzzyMajor;
            return this;
        }

        public QueryBuilder fuzzyMajor (String ... fuzzyMajor){
            this.fuzzyMajor = solveNullList(fuzzyMajor);
            return this;
        }

        public QueryBuilder rightFuzzyMajor (List<String> rightFuzzyMajor){
            this.rightFuzzyMajor = rightFuzzyMajor;
            return this;
        }

        public QueryBuilder rightFuzzyMajor (String ... rightFuzzyMajor){
            this.rightFuzzyMajor = solveNullList(rightFuzzyMajor);
            return this;
        }

        public QueryBuilder major(String major){
            setMajor(major);
            return this;
        }

        public QueryBuilder majorList(String ... major){
            this.majorList = solveNullList(major);
            return this;
        }

        public QueryBuilder majorList(List<String> major){
            this.majorList = major;
            return this;
        }

        public QueryBuilder fetchMajor(){
            setFetchFields("fetchFields","major");
            return this;
        }

        public QueryBuilder excludeMajor(){
            setFetchFields("excludeFields","major");
            return this;
        }

        public QueryBuilder fuzzyMajorDirection (List<String> fuzzyMajorDirection){
            this.fuzzyMajorDirection = fuzzyMajorDirection;
            return this;
        }

        public QueryBuilder fuzzyMajorDirection (String ... fuzzyMajorDirection){
            this.fuzzyMajorDirection = solveNullList(fuzzyMajorDirection);
            return this;
        }

        public QueryBuilder rightFuzzyMajorDirection (List<String> rightFuzzyMajorDirection){
            this.rightFuzzyMajorDirection = rightFuzzyMajorDirection;
            return this;
        }

        public QueryBuilder rightFuzzyMajorDirection (String ... rightFuzzyMajorDirection){
            this.rightFuzzyMajorDirection = solveNullList(rightFuzzyMajorDirection);
            return this;
        }

        public QueryBuilder majorDirection(String majorDirection){
            setMajorDirection(majorDirection);
            return this;
        }

        public QueryBuilder majorDirectionList(String ... majorDirection){
            this.majorDirectionList = solveNullList(majorDirection);
            return this;
        }

        public QueryBuilder majorDirectionList(List<String> majorDirection){
            this.majorDirectionList = majorDirection;
            return this;
        }

        public QueryBuilder fetchMajorDirection(){
            setFetchFields("fetchFields","majorDirection");
            return this;
        }

        public QueryBuilder excludeMajorDirection(){
            setFetchFields("excludeFields","majorDirection");
            return this;
        }

        public QueryBuilder fuzzyStudyWay (List<String> fuzzyStudyWay){
            this.fuzzyStudyWay = fuzzyStudyWay;
            return this;
        }

        public QueryBuilder fuzzyStudyWay (String ... fuzzyStudyWay){
            this.fuzzyStudyWay = solveNullList(fuzzyStudyWay);
            return this;
        }

        public QueryBuilder rightFuzzyStudyWay (List<String> rightFuzzyStudyWay){
            this.rightFuzzyStudyWay = rightFuzzyStudyWay;
            return this;
        }

        public QueryBuilder rightFuzzyStudyWay (String ... rightFuzzyStudyWay){
            this.rightFuzzyStudyWay = solveNullList(rightFuzzyStudyWay);
            return this;
        }

        public QueryBuilder studyWay(String studyWay){
            setStudyWay(studyWay);
            return this;
        }

        public QueryBuilder studyWayList(String ... studyWay){
            this.studyWayList = solveNullList(studyWay);
            return this;
        }

        public QueryBuilder studyWayList(List<String> studyWay){
            this.studyWayList = studyWay;
            return this;
        }

        public QueryBuilder fetchStudyWay(){
            setFetchFields("fetchFields","studyWay");
            return this;
        }

        public QueryBuilder excludeStudyWay(){
            setFetchFields("excludeFields","studyWay");
            return this;
        }

        public QueryBuilder fuzzyTeacher (List<String> fuzzyTeacher){
            this.fuzzyTeacher = fuzzyTeacher;
            return this;
        }

        public QueryBuilder fuzzyTeacher (String ... fuzzyTeacher){
            this.fuzzyTeacher = solveNullList(fuzzyTeacher);
            return this;
        }

        public QueryBuilder rightFuzzyTeacher (List<String> rightFuzzyTeacher){
            this.rightFuzzyTeacher = rightFuzzyTeacher;
            return this;
        }

        public QueryBuilder rightFuzzyTeacher (String ... rightFuzzyTeacher){
            this.rightFuzzyTeacher = solveNullList(rightFuzzyTeacher);
            return this;
        }

        public QueryBuilder teacher(String teacher){
            setTeacher(teacher);
            return this;
        }

        public QueryBuilder teacherList(String ... teacher){
            this.teacherList = solveNullList(teacher);
            return this;
        }

        public QueryBuilder teacherList(List<String> teacher){
            this.teacherList = teacher;
            return this;
        }

        public QueryBuilder fetchTeacher(){
            setFetchFields("fetchFields","teacher");
            return this;
        }

        public QueryBuilder excludeTeacher(){
            setFetchFields("excludeFields","teacher");
            return this;
        }

        public QueryBuilder fuzzyEnrollmentPlan (List<String> fuzzyEnrollmentPlan){
            this.fuzzyEnrollmentPlan = fuzzyEnrollmentPlan;
            return this;
        }

        public QueryBuilder fuzzyEnrollmentPlan (String ... fuzzyEnrollmentPlan){
            this.fuzzyEnrollmentPlan = solveNullList(fuzzyEnrollmentPlan);
            return this;
        }

        public QueryBuilder rightFuzzyEnrollmentPlan (List<String> rightFuzzyEnrollmentPlan){
            this.rightFuzzyEnrollmentPlan = rightFuzzyEnrollmentPlan;
            return this;
        }

        public QueryBuilder rightFuzzyEnrollmentPlan (String ... rightFuzzyEnrollmentPlan){
            this.rightFuzzyEnrollmentPlan = solveNullList(rightFuzzyEnrollmentPlan);
            return this;
        }

        public QueryBuilder enrollmentPlan(String enrollmentPlan){
            setEnrollmentPlan(enrollmentPlan);
            return this;
        }

        public QueryBuilder enrollmentPlanList(String ... enrollmentPlan){
            this.enrollmentPlanList = solveNullList(enrollmentPlan);
            return this;
        }

        public QueryBuilder enrollmentPlanList(List<String> enrollmentPlan){
            this.enrollmentPlanList = enrollmentPlan;
            return this;
        }

        public QueryBuilder fetchEnrollmentPlan(){
            setFetchFields("fetchFields","enrollmentPlan");
            return this;
        }

        public QueryBuilder excludeEnrollmentPlan(){
            setFetchFields("excludeFields","enrollmentPlan");
            return this;
        }

        public QueryBuilder fuzzyExamRegionUrl (List<String> fuzzyExamRegionUrl){
            this.fuzzyExamRegionUrl = fuzzyExamRegionUrl;
            return this;
        }

        public QueryBuilder fuzzyExamRegionUrl (String ... fuzzyExamRegionUrl){
            this.fuzzyExamRegionUrl = solveNullList(fuzzyExamRegionUrl);
            return this;
        }

        public QueryBuilder rightFuzzyExamRegionUrl (List<String> rightFuzzyExamRegionUrl){
            this.rightFuzzyExamRegionUrl = rightFuzzyExamRegionUrl;
            return this;
        }

        public QueryBuilder rightFuzzyExamRegionUrl (String ... rightFuzzyExamRegionUrl){
            this.rightFuzzyExamRegionUrl = solveNullList(rightFuzzyExamRegionUrl);
            return this;
        }

        public QueryBuilder examRegionUrl(String examRegionUrl){
            setExamRegionUrl(examRegionUrl);
            return this;
        }

        public QueryBuilder examRegionUrlList(String ... examRegionUrl){
            this.examRegionUrlList = solveNullList(examRegionUrl);
            return this;
        }

        public QueryBuilder examRegionUrlList(List<String> examRegionUrl){
            this.examRegionUrlList = examRegionUrl;
            return this;
        }

        public QueryBuilder fetchExamRegionUrl(){
            setFetchFields("fetchFields","examRegionUrl");
            return this;
        }

        public QueryBuilder excludeExamRegionUrl(){
            setFetchFields("excludeFields","examRegionUrl");
            return this;
        }

        public QueryBuilder fuzzyExamRegionId (List<String> fuzzyExamRegionId){
            this.fuzzyExamRegionId = fuzzyExamRegionId;
            return this;
        }

        public QueryBuilder fuzzyExamRegionId (String ... fuzzyExamRegionId){
            this.fuzzyExamRegionId = solveNullList(fuzzyExamRegionId);
            return this;
        }

        public QueryBuilder rightFuzzyExamRegionId (List<String> rightFuzzyExamRegionId){
            this.rightFuzzyExamRegionId = rightFuzzyExamRegionId;
            return this;
        }

        public QueryBuilder rightFuzzyExamRegionId (String ... rightFuzzyExamRegionId){
            this.rightFuzzyExamRegionId = solveNullList(rightFuzzyExamRegionId);
            return this;
        }

        public QueryBuilder examRegionId(String examRegionId){
            setExamRegionId(examRegionId);
            return this;
        }

        public QueryBuilder examRegionIdList(String ... examRegionId){
            this.examRegionIdList = solveNullList(examRegionId);
            return this;
        }

        public QueryBuilder examRegionIdList(List<String> examRegionId){
            this.examRegionIdList = examRegionId;
            return this;
        }

        public QueryBuilder fetchExamRegionId(){
            setFetchFields("fetchFields","examRegionId");
            return this;
        }

        public QueryBuilder excludeExamRegionId(){
            setFetchFields("excludeFields","examRegionId");
            return this;
        }

        public QueryBuilder fuzzyInterdisciplinary (List<String> fuzzyInterdisciplinary){
            this.fuzzyInterdisciplinary = fuzzyInterdisciplinary;
            return this;
        }

        public QueryBuilder fuzzyInterdisciplinary (String ... fuzzyInterdisciplinary){
            this.fuzzyInterdisciplinary = solveNullList(fuzzyInterdisciplinary);
            return this;
        }

        public QueryBuilder rightFuzzyInterdisciplinary (List<String> rightFuzzyInterdisciplinary){
            this.rightFuzzyInterdisciplinary = rightFuzzyInterdisciplinary;
            return this;
        }

        public QueryBuilder rightFuzzyInterdisciplinary (String ... rightFuzzyInterdisciplinary){
            this.rightFuzzyInterdisciplinary = solveNullList(rightFuzzyInterdisciplinary);
            return this;
        }

        public QueryBuilder interdisciplinary(String interdisciplinary){
            setInterdisciplinary(interdisciplinary);
            return this;
        }

        public QueryBuilder interdisciplinaryList(String ... interdisciplinary){
            this.interdisciplinaryList = solveNullList(interdisciplinary);
            return this;
        }

        public QueryBuilder interdisciplinaryList(List<String> interdisciplinary){
            this.interdisciplinaryList = interdisciplinary;
            return this;
        }

        public QueryBuilder fetchInterdisciplinary(){
            setFetchFields("fetchFields","interdisciplinary");
            return this;
        }

        public QueryBuilder excludeInterdisciplinary(){
            setFetchFields("excludeFields","interdisciplinary");
            return this;
        }

        public QueryBuilder fuzzyComment (List<String> fuzzyComment){
            this.fuzzyComment = fuzzyComment;
            return this;
        }

        public QueryBuilder fuzzyComment (String ... fuzzyComment){
            this.fuzzyComment = solveNullList(fuzzyComment);
            return this;
        }

        public QueryBuilder rightFuzzyComment (List<String> rightFuzzyComment){
            this.rightFuzzyComment = rightFuzzyComment;
            return this;
        }

        public QueryBuilder rightFuzzyComment (String ... rightFuzzyComment){
            this.rightFuzzyComment = solveNullList(rightFuzzyComment);
            return this;
        }

        public QueryBuilder comment(String comment){
            setComment(comment);
            return this;
        }

        public QueryBuilder commentList(String ... comment){
            this.commentList = solveNullList(comment);
            return this;
        }

        public QueryBuilder commentList(List<String> comment){
            this.commentList = comment;
            return this;
        }

        public QueryBuilder fetchComment(){
            setFetchFields("fetchFields","comment");
            return this;
        }

        public QueryBuilder excludeComment(){
            setFetchFields("excludeFields","comment");
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

        public ResearchMajor build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
        private List<String> examWayList;

        public List<String> getExamWayList(){return this.examWayList;}


        private List<String> fuzzyExamWay;

        public List<String> getFuzzyExamWay(){return this.fuzzyExamWay;}

        private List<String> rightFuzzyExamWay;

        public List<String> getRightFuzzyExamWay(){return this.rightFuzzyExamWay;}
        private List<String> facultyList;

        public List<String> getFacultyList(){return this.facultyList;}


        private List<String> fuzzyFaculty;

        public List<String> getFuzzyFaculty(){return this.fuzzyFaculty;}

        private List<String> rightFuzzyFaculty;

        public List<String> getRightFuzzyFaculty(){return this.rightFuzzyFaculty;}
        private List<String> majorList;

        public List<String> getMajorList(){return this.majorList;}


        private List<String> fuzzyMajor;

        public List<String> getFuzzyMajor(){return this.fuzzyMajor;}

        private List<String> rightFuzzyMajor;

        public List<String> getRightFuzzyMajor(){return this.rightFuzzyMajor;}
        private List<String> majorDirectionList;

        public List<String> getMajorDirectionList(){return this.majorDirectionList;}


        private List<String> fuzzyMajorDirection;

        public List<String> getFuzzyMajorDirection(){return this.fuzzyMajorDirection;}

        private List<String> rightFuzzyMajorDirection;

        public List<String> getRightFuzzyMajorDirection(){return this.rightFuzzyMajorDirection;}
        private List<String> studyWayList;

        public List<String> getStudyWayList(){return this.studyWayList;}


        private List<String> fuzzyStudyWay;

        public List<String> getFuzzyStudyWay(){return this.fuzzyStudyWay;}

        private List<String> rightFuzzyStudyWay;

        public List<String> getRightFuzzyStudyWay(){return this.rightFuzzyStudyWay;}
        private List<String> teacherList;

        public List<String> getTeacherList(){return this.teacherList;}


        private List<String> fuzzyTeacher;

        public List<String> getFuzzyTeacher(){return this.fuzzyTeacher;}

        private List<String> rightFuzzyTeacher;

        public List<String> getRightFuzzyTeacher(){return this.rightFuzzyTeacher;}
        private List<String> enrollmentPlanList;

        public List<String> getEnrollmentPlanList(){return this.enrollmentPlanList;}


        private List<String> fuzzyEnrollmentPlan;

        public List<String> getFuzzyEnrollmentPlan(){return this.fuzzyEnrollmentPlan;}

        private List<String> rightFuzzyEnrollmentPlan;

        public List<String> getRightFuzzyEnrollmentPlan(){return this.rightFuzzyEnrollmentPlan;}
        private List<String> examRegionUrlList;

        public List<String> getExamRegionUrlList(){return this.examRegionUrlList;}


        private List<String> fuzzyExamRegionUrl;

        public List<String> getFuzzyExamRegionUrl(){return this.fuzzyExamRegionUrl;}

        private List<String> rightFuzzyExamRegionUrl;

        public List<String> getRightFuzzyExamRegionUrl(){return this.rightFuzzyExamRegionUrl;}
        private List<String> examRegionIdList;

        public List<String> getExamRegionIdList(){return this.examRegionIdList;}


        private List<String> fuzzyExamRegionId;

        public List<String> getFuzzyExamRegionId(){return this.fuzzyExamRegionId;}

        private List<String> rightFuzzyExamRegionId;

        public List<String> getRightFuzzyExamRegionId(){return this.rightFuzzyExamRegionId;}
        private List<String> interdisciplinaryList;

        public List<String> getInterdisciplinaryList(){return this.interdisciplinaryList;}


        private List<String> fuzzyInterdisciplinary;

        public List<String> getFuzzyInterdisciplinary(){return this.fuzzyInterdisciplinary;}

        private List<String> rightFuzzyInterdisciplinary;

        public List<String> getRightFuzzyInterdisciplinary(){return this.rightFuzzyInterdisciplinary;}
        private List<String> commentList;

        public List<String> getCommentList(){return this.commentList;}


        private List<String> fuzzyComment;

        public List<String> getFuzzyComment(){return this.fuzzyComment;}

        private List<String> rightFuzzyComment;

        public List<String> getRightFuzzyComment(){return this.rightFuzzyComment;}

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

        public ConditionBuilder fuzzyExamWay (List<String> fuzzyExamWay){
            this.fuzzyExamWay = fuzzyExamWay;
            return this;
        }

        public ConditionBuilder fuzzyExamWay (String ... fuzzyExamWay){
            this.fuzzyExamWay = solveNullList(fuzzyExamWay);
            return this;
        }

        public ConditionBuilder rightFuzzyExamWay (List<String> rightFuzzyExamWay){
            this.rightFuzzyExamWay = rightFuzzyExamWay;
            return this;
        }

        public ConditionBuilder rightFuzzyExamWay (String ... rightFuzzyExamWay){
            this.rightFuzzyExamWay = solveNullList(rightFuzzyExamWay);
            return this;
        }

        public ConditionBuilder examWayList(String ... examWay){
            this.examWayList = solveNullList(examWay);
            return this;
        }

        public ConditionBuilder examWayList(List<String> examWay){
            this.examWayList = examWay;
            return this;
        }

        public ConditionBuilder fuzzyFaculty (List<String> fuzzyFaculty){
            this.fuzzyFaculty = fuzzyFaculty;
            return this;
        }

        public ConditionBuilder fuzzyFaculty (String ... fuzzyFaculty){
            this.fuzzyFaculty = solveNullList(fuzzyFaculty);
            return this;
        }

        public ConditionBuilder rightFuzzyFaculty (List<String> rightFuzzyFaculty){
            this.rightFuzzyFaculty = rightFuzzyFaculty;
            return this;
        }

        public ConditionBuilder rightFuzzyFaculty (String ... rightFuzzyFaculty){
            this.rightFuzzyFaculty = solveNullList(rightFuzzyFaculty);
            return this;
        }

        public ConditionBuilder facultyList(String ... faculty){
            this.facultyList = solveNullList(faculty);
            return this;
        }

        public ConditionBuilder facultyList(List<String> faculty){
            this.facultyList = faculty;
            return this;
        }

        public ConditionBuilder fuzzyMajor (List<String> fuzzyMajor){
            this.fuzzyMajor = fuzzyMajor;
            return this;
        }

        public ConditionBuilder fuzzyMajor (String ... fuzzyMajor){
            this.fuzzyMajor = solveNullList(fuzzyMajor);
            return this;
        }

        public ConditionBuilder rightFuzzyMajor (List<String> rightFuzzyMajor){
            this.rightFuzzyMajor = rightFuzzyMajor;
            return this;
        }

        public ConditionBuilder rightFuzzyMajor (String ... rightFuzzyMajor){
            this.rightFuzzyMajor = solveNullList(rightFuzzyMajor);
            return this;
        }

        public ConditionBuilder majorList(String ... major){
            this.majorList = solveNullList(major);
            return this;
        }

        public ConditionBuilder majorList(List<String> major){
            this.majorList = major;
            return this;
        }

        public ConditionBuilder fuzzyMajorDirection (List<String> fuzzyMajorDirection){
            this.fuzzyMajorDirection = fuzzyMajorDirection;
            return this;
        }

        public ConditionBuilder fuzzyMajorDirection (String ... fuzzyMajorDirection){
            this.fuzzyMajorDirection = solveNullList(fuzzyMajorDirection);
            return this;
        }

        public ConditionBuilder rightFuzzyMajorDirection (List<String> rightFuzzyMajorDirection){
            this.rightFuzzyMajorDirection = rightFuzzyMajorDirection;
            return this;
        }

        public ConditionBuilder rightFuzzyMajorDirection (String ... rightFuzzyMajorDirection){
            this.rightFuzzyMajorDirection = solveNullList(rightFuzzyMajorDirection);
            return this;
        }

        public ConditionBuilder majorDirectionList(String ... majorDirection){
            this.majorDirectionList = solveNullList(majorDirection);
            return this;
        }

        public ConditionBuilder majorDirectionList(List<String> majorDirection){
            this.majorDirectionList = majorDirection;
            return this;
        }

        public ConditionBuilder fuzzyStudyWay (List<String> fuzzyStudyWay){
            this.fuzzyStudyWay = fuzzyStudyWay;
            return this;
        }

        public ConditionBuilder fuzzyStudyWay (String ... fuzzyStudyWay){
            this.fuzzyStudyWay = solveNullList(fuzzyStudyWay);
            return this;
        }

        public ConditionBuilder rightFuzzyStudyWay (List<String> rightFuzzyStudyWay){
            this.rightFuzzyStudyWay = rightFuzzyStudyWay;
            return this;
        }

        public ConditionBuilder rightFuzzyStudyWay (String ... rightFuzzyStudyWay){
            this.rightFuzzyStudyWay = solveNullList(rightFuzzyStudyWay);
            return this;
        }

        public ConditionBuilder studyWayList(String ... studyWay){
            this.studyWayList = solveNullList(studyWay);
            return this;
        }

        public ConditionBuilder studyWayList(List<String> studyWay){
            this.studyWayList = studyWay;
            return this;
        }

        public ConditionBuilder fuzzyTeacher (List<String> fuzzyTeacher){
            this.fuzzyTeacher = fuzzyTeacher;
            return this;
        }

        public ConditionBuilder fuzzyTeacher (String ... fuzzyTeacher){
            this.fuzzyTeacher = solveNullList(fuzzyTeacher);
            return this;
        }

        public ConditionBuilder rightFuzzyTeacher (List<String> rightFuzzyTeacher){
            this.rightFuzzyTeacher = rightFuzzyTeacher;
            return this;
        }

        public ConditionBuilder rightFuzzyTeacher (String ... rightFuzzyTeacher){
            this.rightFuzzyTeacher = solveNullList(rightFuzzyTeacher);
            return this;
        }

        public ConditionBuilder teacherList(String ... teacher){
            this.teacherList = solveNullList(teacher);
            return this;
        }

        public ConditionBuilder teacherList(List<String> teacher){
            this.teacherList = teacher;
            return this;
        }

        public ConditionBuilder fuzzyEnrollmentPlan (List<String> fuzzyEnrollmentPlan){
            this.fuzzyEnrollmentPlan = fuzzyEnrollmentPlan;
            return this;
        }

        public ConditionBuilder fuzzyEnrollmentPlan (String ... fuzzyEnrollmentPlan){
            this.fuzzyEnrollmentPlan = solveNullList(fuzzyEnrollmentPlan);
            return this;
        }

        public ConditionBuilder rightFuzzyEnrollmentPlan (List<String> rightFuzzyEnrollmentPlan){
            this.rightFuzzyEnrollmentPlan = rightFuzzyEnrollmentPlan;
            return this;
        }

        public ConditionBuilder rightFuzzyEnrollmentPlan (String ... rightFuzzyEnrollmentPlan){
            this.rightFuzzyEnrollmentPlan = solveNullList(rightFuzzyEnrollmentPlan);
            return this;
        }

        public ConditionBuilder enrollmentPlanList(String ... enrollmentPlan){
            this.enrollmentPlanList = solveNullList(enrollmentPlan);
            return this;
        }

        public ConditionBuilder enrollmentPlanList(List<String> enrollmentPlan){
            this.enrollmentPlanList = enrollmentPlan;
            return this;
        }

        public ConditionBuilder fuzzyExamRegionUrl (List<String> fuzzyExamRegionUrl){
            this.fuzzyExamRegionUrl = fuzzyExamRegionUrl;
            return this;
        }

        public ConditionBuilder fuzzyExamRegionUrl (String ... fuzzyExamRegionUrl){
            this.fuzzyExamRegionUrl = solveNullList(fuzzyExamRegionUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyExamRegionUrl (List<String> rightFuzzyExamRegionUrl){
            this.rightFuzzyExamRegionUrl = rightFuzzyExamRegionUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyExamRegionUrl (String ... rightFuzzyExamRegionUrl){
            this.rightFuzzyExamRegionUrl = solveNullList(rightFuzzyExamRegionUrl);
            return this;
        }

        public ConditionBuilder examRegionUrlList(String ... examRegionUrl){
            this.examRegionUrlList = solveNullList(examRegionUrl);
            return this;
        }

        public ConditionBuilder examRegionUrlList(List<String> examRegionUrl){
            this.examRegionUrlList = examRegionUrl;
            return this;
        }

        public ConditionBuilder fuzzyExamRegionId (List<String> fuzzyExamRegionId){
            this.fuzzyExamRegionId = fuzzyExamRegionId;
            return this;
        }

        public ConditionBuilder fuzzyExamRegionId (String ... fuzzyExamRegionId){
            this.fuzzyExamRegionId = solveNullList(fuzzyExamRegionId);
            return this;
        }

        public ConditionBuilder rightFuzzyExamRegionId (List<String> rightFuzzyExamRegionId){
            this.rightFuzzyExamRegionId = rightFuzzyExamRegionId;
            return this;
        }

        public ConditionBuilder rightFuzzyExamRegionId (String ... rightFuzzyExamRegionId){
            this.rightFuzzyExamRegionId = solveNullList(rightFuzzyExamRegionId);
            return this;
        }

        public ConditionBuilder examRegionIdList(String ... examRegionId){
            this.examRegionIdList = solveNullList(examRegionId);
            return this;
        }

        public ConditionBuilder examRegionIdList(List<String> examRegionId){
            this.examRegionIdList = examRegionId;
            return this;
        }

        public ConditionBuilder fuzzyInterdisciplinary (List<String> fuzzyInterdisciplinary){
            this.fuzzyInterdisciplinary = fuzzyInterdisciplinary;
            return this;
        }

        public ConditionBuilder fuzzyInterdisciplinary (String ... fuzzyInterdisciplinary){
            this.fuzzyInterdisciplinary = solveNullList(fuzzyInterdisciplinary);
            return this;
        }

        public ConditionBuilder rightFuzzyInterdisciplinary (List<String> rightFuzzyInterdisciplinary){
            this.rightFuzzyInterdisciplinary = rightFuzzyInterdisciplinary;
            return this;
        }

        public ConditionBuilder rightFuzzyInterdisciplinary (String ... rightFuzzyInterdisciplinary){
            this.rightFuzzyInterdisciplinary = solveNullList(rightFuzzyInterdisciplinary);
            return this;
        }

        public ConditionBuilder interdisciplinaryList(String ... interdisciplinary){
            this.interdisciplinaryList = solveNullList(interdisciplinary);
            return this;
        }

        public ConditionBuilder interdisciplinaryList(List<String> interdisciplinary){
            this.interdisciplinaryList = interdisciplinary;
            return this;
        }

        public ConditionBuilder fuzzyComment (List<String> fuzzyComment){
            this.fuzzyComment = fuzzyComment;
            return this;
        }

        public ConditionBuilder fuzzyComment (String ... fuzzyComment){
            this.fuzzyComment = solveNullList(fuzzyComment);
            return this;
        }

        public ConditionBuilder rightFuzzyComment (List<String> rightFuzzyComment){
            this.rightFuzzyComment = rightFuzzyComment;
            return this;
        }

        public ConditionBuilder rightFuzzyComment (String ... rightFuzzyComment){
            this.rightFuzzyComment = solveNullList(rightFuzzyComment);
            return this;
        }

        public ConditionBuilder commentList(String ... comment){
            this.commentList = solveNullList(comment);
            return this;
        }

        public ConditionBuilder commentList(List<String> comment){
            this.commentList = comment;
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

        private ResearchMajor obj;

        public Builder(){
            this.obj = new ResearchMajor();
        }

        public Builder url(String url){
            this.obj.setUrl(url);
            return this;
        }
        public Builder examWay(String examWay){
            this.obj.setExamWay(examWay);
            return this;
        }
        public Builder faculty(String faculty){
            this.obj.setFaculty(faculty);
            return this;
        }
        public Builder major(String major){
            this.obj.setMajor(major);
            return this;
        }
        public Builder majorDirection(String majorDirection){
            this.obj.setMajorDirection(majorDirection);
            return this;
        }
        public Builder studyWay(String studyWay){
            this.obj.setStudyWay(studyWay);
            return this;
        }
        public Builder teacher(String teacher){
            this.obj.setTeacher(teacher);
            return this;
        }
        public Builder enrollmentPlan(String enrollmentPlan){
            this.obj.setEnrollmentPlan(enrollmentPlan);
            return this;
        }
        public Builder examRegionUrl(String examRegionUrl){
            this.obj.setExamRegionUrl(examRegionUrl);
            return this;
        }
        public Builder examRegionId(String examRegionId){
            this.obj.setExamRegionId(examRegionId);
            return this;
        }
        public Builder interdisciplinary(String interdisciplinary){
            this.obj.setInterdisciplinary(interdisciplinary);
            return this;
        }
        public Builder comment(String comment){
            this.obj.setComment(comment);
            return this;
        }
        public ResearchMajor build(){return obj;}
    }

}
