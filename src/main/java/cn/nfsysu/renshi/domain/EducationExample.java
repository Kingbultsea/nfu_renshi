package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.List;

public class EducationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public EducationExample() {
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

        public Criteria andFatherEqualTo(String value) {
            addCriterion("father =", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotEqualTo(String value) {
            addCriterion("father <>", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherGreaterThan(String value) {
            addCriterion("father >", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherGreaterThanOrEqualTo(String value) {
            addCriterion("father >=", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLessThan(String value) {
            addCriterion("father <", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLessThanOrEqualTo(String value) {
            addCriterion("father <=", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLike(String value) {
            addCriterion("father like", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotLike(String value) {
            addCriterion("father not like", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherIn(List<String> values) {
            addCriterion("father in", values, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotIn(List<String> values) {
            addCriterion("father not in", values, "father");
            return (Criteria) this;
        }

        public Criteria andFatherBetween(String value1, String value2) {
            addCriterion("father between", value1, value2, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotBetween(String value1, String value2) {
            addCriterion("father not between", value1, value2, "father");
            return (Criteria) this;
        }

        public Criteria andYearsIsNull() {
            addCriterion("years is null");
            return (Criteria) this;
        }

        public Criteria andYearsIsNotNull() {
            addCriterion("years is not null");
            return (Criteria) this;
        }

        public Criteria andYearsEqualTo(String value) {
            addCriterion("years =", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotEqualTo(String value) {
            addCriterion("years <>", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThan(String value) {
            addCriterion("years >", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThanOrEqualTo(String value) {
            addCriterion("years >=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThan(String value) {
            addCriterion("years <", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThanOrEqualTo(String value) {
            addCriterion("years <=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLike(String value) {
            addCriterion("years like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotLike(String value) {
            addCriterion("years not like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsIn(List<String> values) {
            addCriterion("years in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotIn(List<String> values) {
            addCriterion("years not in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsBetween(String value1, String value2) {
            addCriterion("years between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotBetween(String value1, String value2) {
            addCriterion("years not between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryIsNull() {
            addCriterion("mentor_category is null");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryIsNotNull() {
            addCriterion("mentor_category is not null");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryEqualTo(String value) {
            addCriterion("mentor_category =", value, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryNotEqualTo(String value) {
            addCriterion("mentor_category <>", value, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryGreaterThan(String value) {
            addCriterion("mentor_category >", value, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("mentor_category >=", value, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryLessThan(String value) {
            addCriterion("mentor_category <", value, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryLessThanOrEqualTo(String value) {
            addCriterion("mentor_category <=", value, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryLike(String value) {
            addCriterion("mentor_category like", value, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryNotLike(String value) {
            addCriterion("mentor_category not like", value, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryIn(List<String> values) {
            addCriterion("mentor_category in", values, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryNotIn(List<String> values) {
            addCriterion("mentor_category not in", values, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryBetween(String value1, String value2) {
            addCriterion("mentor_category between", value1, value2, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andMentorCategoryNotBetween(String value1, String value2) {
            addCriterion("mentor_category not between", value1, value2, "mentorCategory");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaIsNull() {
            addCriterion("now_science_area is null");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaIsNotNull() {
            addCriterion("now_science_area is not null");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaEqualTo(String value) {
            addCriterion("now_science_area =", value, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaNotEqualTo(String value) {
            addCriterion("now_science_area <>", value, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaGreaterThan(String value) {
            addCriterion("now_science_area >", value, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaGreaterThanOrEqualTo(String value) {
            addCriterion("now_science_area >=", value, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaLessThan(String value) {
            addCriterion("now_science_area <", value, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaLessThanOrEqualTo(String value) {
            addCriterion("now_science_area <=", value, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaLike(String value) {
            addCriterion("now_science_area like", value, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaNotLike(String value) {
            addCriterion("now_science_area not like", value, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaIn(List<String> values) {
            addCriterion("now_science_area in", values, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaNotIn(List<String> values) {
            addCriterion("now_science_area not in", values, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaBetween(String value1, String value2) {
            addCriterion("now_science_area between", value1, value2, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andNowScienceAreaNotBetween(String value1, String value2) {
            addCriterion("now_science_area not between", value1, value2, "nowScienceArea");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateIsNull() {
            addCriterion("is_for_undergraduate is null");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateIsNotNull() {
            addCriterion("is_for_undergraduate is not null");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateEqualTo(String value) {
            addCriterion("is_for_undergraduate =", value, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateNotEqualTo(String value) {
            addCriterion("is_for_undergraduate <>", value, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateGreaterThan(String value) {
            addCriterion("is_for_undergraduate >", value, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateGreaterThanOrEqualTo(String value) {
            addCriterion("is_for_undergraduate >=", value, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateLessThan(String value) {
            addCriterion("is_for_undergraduate <", value, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateLessThanOrEqualTo(String value) {
            addCriterion("is_for_undergraduate <=", value, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateLike(String value) {
            addCriterion("is_for_undergraduate like", value, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateNotLike(String value) {
            addCriterion("is_for_undergraduate not like", value, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateIn(List<String> values) {
            addCriterion("is_for_undergraduate in", values, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateNotIn(List<String> values) {
            addCriterion("is_for_undergraduate not in", values, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateBetween(String value1, String value2) {
            addCriterion("is_for_undergraduate between", value1, value2, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andIsForUndergraduateNotBetween(String value1, String value2) {
            addCriterion("is_for_undergraduate not between", value1, value2, "isForUndergraduate");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursIsNull() {
            addCriterion("teaching_hours is null");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursIsNotNull() {
            addCriterion("teaching_hours is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursEqualTo(Integer value) {
            addCriterion("teaching_hours =", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursNotEqualTo(Integer value) {
            addCriterion("teaching_hours <>", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursGreaterThan(Integer value) {
            addCriterion("teaching_hours >", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("teaching_hours >=", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursLessThan(Integer value) {
            addCriterion("teaching_hours <", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursLessThanOrEqualTo(Integer value) {
            addCriterion("teaching_hours <=", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursIn(List<Integer> values) {
            addCriterion("teaching_hours in", values, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursNotIn(List<Integer> values) {
            addCriterion("teaching_hours not in", values, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursBetween(Integer value1, Integer value2) {
            addCriterion("teaching_hours between", value1, value2, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("teaching_hours not between", value1, value2, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursIsNull() {
            addCriterion("other_hours is null");
            return (Criteria) this;
        }

        public Criteria andOtherHoursIsNotNull() {
            addCriterion("other_hours is not null");
            return (Criteria) this;
        }

        public Criteria andOtherHoursEqualTo(String value) {
            addCriterion("other_hours =", value, "otherHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursNotEqualTo(String value) {
            addCriterion("other_hours <>", value, "otherHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursGreaterThan(String value) {
            addCriterion("other_hours >", value, "otherHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursGreaterThanOrEqualTo(String value) {
            addCriterion("other_hours >=", value, "otherHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursLessThan(String value) {
            addCriterion("other_hours <", value, "otherHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursLessThanOrEqualTo(String value) {
            addCriterion("other_hours <=", value, "otherHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursLike(String value) {
            addCriterion("other_hours like", value, "otherHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursNotLike(String value) {
            addCriterion("other_hours not like", value, "otherHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursIn(List<String> values) {
            addCriterion("other_hours in", values, "otherHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursNotIn(List<String> values) {
            addCriterion("other_hours not in", values, "otherHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursBetween(String value1, String value2) {
            addCriterion("other_hours between", value1, value2, "otherHours");
            return (Criteria) this;
        }

        public Criteria andOtherHoursNotBetween(String value1, String value2) {
            addCriterion("other_hours not between", value1, value2, "otherHours");
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