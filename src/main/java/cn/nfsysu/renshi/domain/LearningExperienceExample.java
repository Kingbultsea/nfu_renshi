package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.List;

public class LearningExperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LearningExperienceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFatherIsNull() {
            addCriterion("father is null");
            return (Criteria) this;
        }

        public Criteria andFatherIsNotNull() {
            addCriterion("father is not null");
            return (Criteria) this;
        }

        public Criteria andFatherEqualTo(Integer value) {
            addCriterion("father =", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotEqualTo(Integer value) {
            addCriterion("father <>", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherGreaterThan(Integer value) {
            addCriterion("father >", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherGreaterThanOrEqualTo(Integer value) {
            addCriterion("father >=", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLessThan(Integer value) {
            addCriterion("father <", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLessThanOrEqualTo(Integer value) {
            addCriterion("father <=", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherIn(List<Integer> values) {
            addCriterion("father in", values, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotIn(List<Integer> values) {
            addCriterion("father not in", values, "father");
            return (Criteria) this;
        }

        public Criteria andFatherBetween(Integer value1, Integer value2) {
            addCriterion("father between", value1, value2, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotBetween(Integer value1, Integer value2) {
            addCriterion("father not between", value1, value2, "father");
            return (Criteria) this;
        }

        public Criteria andEducationalIsNull() {
            addCriterion("educational is null");
            return (Criteria) this;
        }

        public Criteria andEducationalIsNotNull() {
            addCriterion("educational is not null");
            return (Criteria) this;
        }

        public Criteria andEducationalEqualTo(String value) {
            addCriterion("educational =", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotEqualTo(String value) {
            addCriterion("educational <>", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalGreaterThan(String value) {
            addCriterion("educational >", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalGreaterThanOrEqualTo(String value) {
            addCriterion("educational >=", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLessThan(String value) {
            addCriterion("educational <", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLessThanOrEqualTo(String value) {
            addCriterion("educational <=", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLike(String value) {
            addCriterion("educational like", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotLike(String value) {
            addCriterion("educational not like", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalIn(List<String> values) {
            addCriterion("educational in", values, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotIn(List<String> values) {
            addCriterion("educational not in", values, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalBetween(String value1, String value2) {
            addCriterion("educational between", value1, value2, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotBetween(String value1, String value2) {
            addCriterion("educational not between", value1, value2, "educational");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andUniversityIsNull() {
            addCriterion("university is null");
            return (Criteria) this;
        }

        public Criteria andUniversityIsNotNull() {
            addCriterion("university is not null");
            return (Criteria) this;
        }

        public Criteria andUniversityEqualTo(String value) {
            addCriterion("university =", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotEqualTo(String value) {
            addCriterion("university <>", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityGreaterThan(String value) {
            addCriterion("university >", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityGreaterThanOrEqualTo(String value) {
            addCriterion("university >=", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityLessThan(String value) {
            addCriterion("university <", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityLessThanOrEqualTo(String value) {
            addCriterion("university <=", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityLike(String value) {
            addCriterion("university like", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotLike(String value) {
            addCriterion("university not like", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityIn(List<String> values) {
            addCriterion("university in", values, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotIn(List<String> values) {
            addCriterion("university not in", values, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityBetween(String value1, String value2) {
            addCriterion("university between", value1, value2, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotBetween(String value1, String value2) {
            addCriterion("university not between", value1, value2, "university");
            return (Criteria) this;
        }

        public Criteria andMajorsIsNull() {
            addCriterion("majors is null");
            return (Criteria) this;
        }

        public Criteria andMajorsIsNotNull() {
            addCriterion("majors is not null");
            return (Criteria) this;
        }

        public Criteria andMajorsEqualTo(String value) {
            addCriterion("majors =", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsNotEqualTo(String value) {
            addCriterion("majors <>", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsGreaterThan(String value) {
            addCriterion("majors >", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsGreaterThanOrEqualTo(String value) {
            addCriterion("majors >=", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsLessThan(String value) {
            addCriterion("majors <", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsLessThanOrEqualTo(String value) {
            addCriterion("majors <=", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsLike(String value) {
            addCriterion("majors like", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsNotLike(String value) {
            addCriterion("majors not like", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsIn(List<String> values) {
            addCriterion("majors in", values, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsNotIn(List<String> values) {
            addCriterion("majors not in", values, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsBetween(String value1, String value2) {
            addCriterion("majors between", value1, value2, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsNotBetween(String value1, String value2) {
            addCriterion("majors not between", value1, value2, "majors");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(String value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(String value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(String value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(String value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(String value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLike(String value) {
            addCriterion("begin_time like", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotLike(String value) {
            addCriterion("begin_time not like", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<String> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<String> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(String value1, String value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(String value1, String value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNameIsNull() {
            addCriterion("degree_name is null");
            return (Criteria) this;
        }

        public Criteria andDegreeNameIsNotNull() {
            addCriterion("degree_name is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeNameEqualTo(String value) {
            addCriterion("degree_name =", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameNotEqualTo(String value) {
            addCriterion("degree_name <>", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameGreaterThan(String value) {
            addCriterion("degree_name >", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("degree_name >=", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameLessThan(String value) {
            addCriterion("degree_name <", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameLessThanOrEqualTo(String value) {
            addCriterion("degree_name <=", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameLike(String value) {
            addCriterion("degree_name like", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameNotLike(String value) {
            addCriterion("degree_name not like", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameIn(List<String> values) {
            addCriterion("degree_name in", values, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameNotIn(List<String> values) {
            addCriterion("degree_name not in", values, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameBetween(String value1, String value2) {
            addCriterion("degree_name between", value1, value2, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameNotBetween(String value1, String value2) {
            addCriterion("degree_name not between", value1, value2, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeIsNull() {
            addCriterion("degree_awarded_time is null");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeIsNotNull() {
            addCriterion("degree_awarded_time is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeEqualTo(String value) {
            addCriterion("degree_awarded_time =", value, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeNotEqualTo(String value) {
            addCriterion("degree_awarded_time <>", value, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeGreaterThan(String value) {
            addCriterion("degree_awarded_time >", value, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("degree_awarded_time >=", value, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeLessThan(String value) {
            addCriterion("degree_awarded_time <", value, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeLessThanOrEqualTo(String value) {
            addCriterion("degree_awarded_time <=", value, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeLike(String value) {
            addCriterion("degree_awarded_time like", value, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeNotLike(String value) {
            addCriterion("degree_awarded_time not like", value, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeIn(List<String> values) {
            addCriterion("degree_awarded_time in", values, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeNotIn(List<String> values) {
            addCriterion("degree_awarded_time not in", values, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeBetween(String value1, String value2) {
            addCriterion("degree_awarded_time between", value1, value2, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andDegreeAwardedTimeNotBetween(String value1, String value2) {
            addCriterion("degree_awarded_time not between", value1, value2, "degreeAwardedTime");
            return (Criteria) this;
        }

        public Criteria andLearningStyleIsNull() {
            addCriterion("learning_style is null");
            return (Criteria) this;
        }

        public Criteria andLearningStyleIsNotNull() {
            addCriterion("learning_style is not null");
            return (Criteria) this;
        }

        public Criteria andLearningStyleEqualTo(String value) {
            addCriterion("learning_style =", value, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andLearningStyleNotEqualTo(String value) {
            addCriterion("learning_style <>", value, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andLearningStyleGreaterThan(String value) {
            addCriterion("learning_style >", value, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andLearningStyleGreaterThanOrEqualTo(String value) {
            addCriterion("learning_style >=", value, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andLearningStyleLessThan(String value) {
            addCriterion("learning_style <", value, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andLearningStyleLessThanOrEqualTo(String value) {
            addCriterion("learning_style <=", value, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andLearningStyleLike(String value) {
            addCriterion("learning_style like", value, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andLearningStyleNotLike(String value) {
            addCriterion("learning_style not like", value, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andLearningStyleIn(List<String> values) {
            addCriterion("learning_style in", values, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andLearningStyleNotIn(List<String> values) {
            addCriterion("learning_style not in", values, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andLearningStyleBetween(String value1, String value2) {
            addCriterion("learning_style between", value1, value2, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andLearningStyleNotBetween(String value1, String value2) {
            addCriterion("learning_style not between", value1, value2, "learningStyle");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesIsNull() {
            addCriterion("school_classes is null");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesIsNotNull() {
            addCriterion("school_classes is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesEqualTo(String value) {
            addCriterion("school_classes =", value, "schoolClasses");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesNotEqualTo(String value) {
            addCriterion("school_classes <>", value, "schoolClasses");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesGreaterThan(String value) {
            addCriterion("school_classes >", value, "schoolClasses");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesGreaterThanOrEqualTo(String value) {
            addCriterion("school_classes >=", value, "schoolClasses");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesLessThan(String value) {
            addCriterion("school_classes <", value, "schoolClasses");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesLessThanOrEqualTo(String value) {
            addCriterion("school_classes <=", value, "schoolClasses");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesLike(String value) {
            addCriterion("school_classes like", value, "schoolClasses");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesNotLike(String value) {
            addCriterion("school_classes not like", value, "schoolClasses");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesIn(List<String> values) {
            addCriterion("school_classes in", values, "schoolClasses");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesNotIn(List<String> values) {
            addCriterion("school_classes not in", values, "schoolClasses");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesBetween(String value1, String value2) {
            addCriterion("school_classes between", value1, value2, "schoolClasses");
            return (Criteria) this;
        }

        public Criteria andSchoolClassesNotBetween(String value1, String value2) {
            addCriterion("school_classes not between", value1, value2, "schoolClasses");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}