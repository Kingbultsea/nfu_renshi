package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.List;

public class TeacherQualificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TeacherQualificationExample() {
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

        public Criteria andQualificationTypeIsNull() {
            addCriterion("qualification_type is null");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeIsNotNull() {
            addCriterion("qualification_type is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeEqualTo(String value) {
            addCriterion("qualification_type =", value, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeNotEqualTo(String value) {
            addCriterion("qualification_type <>", value, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeGreaterThan(String value) {
            addCriterion("qualification_type >", value, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("qualification_type >=", value, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeLessThan(String value) {
            addCriterion("qualification_type <", value, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeLessThanOrEqualTo(String value) {
            addCriterion("qualification_type <=", value, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeLike(String value) {
            addCriterion("qualification_type like", value, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeNotLike(String value) {
            addCriterion("qualification_type not like", value, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeIn(List<String> values) {
            addCriterion("qualification_type in", values, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeNotIn(List<String> values) {
            addCriterion("qualification_type not in", values, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeBetween(String value1, String value2) {
            addCriterion("qualification_type between", value1, value2, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationTypeNotBetween(String value1, String value2) {
            addCriterion("qualification_type not between", value1, value2, "qualificationType");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberIsNull() {
            addCriterion("qualification_number is null");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberIsNotNull() {
            addCriterion("qualification_number is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberEqualTo(String value) {
            addCriterion("qualification_number =", value, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberNotEqualTo(String value) {
            addCriterion("qualification_number <>", value, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberGreaterThan(String value) {
            addCriterion("qualification_number >", value, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("qualification_number >=", value, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberLessThan(String value) {
            addCriterion("qualification_number <", value, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberLessThanOrEqualTo(String value) {
            addCriterion("qualification_number <=", value, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberLike(String value) {
            addCriterion("qualification_number like", value, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberNotLike(String value) {
            addCriterion("qualification_number not like", value, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberIn(List<String> values) {
            addCriterion("qualification_number in", values, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberNotIn(List<String> values) {
            addCriterion("qualification_number not in", values, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberBetween(String value1, String value2) {
            addCriterion("qualification_number between", value1, value2, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andQualificationNumberNotBetween(String value1, String value2) {
            addCriterion("qualification_number not between", value1, value2, "qualificationNumber");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceIsNull() {
            addCriterion("date_of_issuance is null");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceIsNotNull() {
            addCriterion("date_of_issuance is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceEqualTo(String value) {
            addCriterion("date_of_issuance =", value, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceNotEqualTo(String value) {
            addCriterion("date_of_issuance <>", value, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceGreaterThan(String value) {
            addCriterion("date_of_issuance >", value, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceGreaterThanOrEqualTo(String value) {
            addCriterion("date_of_issuance >=", value, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceLessThan(String value) {
            addCriterion("date_of_issuance <", value, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceLessThanOrEqualTo(String value) {
            addCriterion("date_of_issuance <=", value, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceLike(String value) {
            addCriterion("date_of_issuance like", value, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceNotLike(String value) {
            addCriterion("date_of_issuance not like", value, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceIn(List<String> values) {
            addCriterion("date_of_issuance in", values, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceNotIn(List<String> values) {
            addCriterion("date_of_issuance not in", values, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceBetween(String value1, String value2) {
            addCriterion("date_of_issuance between", value1, value2, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andDateOfIssuanceNotBetween(String value1, String value2) {
            addCriterion("date_of_issuance not between", value1, value2, "dateOfIssuance");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitIsNull() {
            addCriterion("lssuing_unit is null");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitIsNotNull() {
            addCriterion("lssuing_unit is not null");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitEqualTo(String value) {
            addCriterion("lssuing_unit =", value, "lssuingUnit");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitNotEqualTo(String value) {
            addCriterion("lssuing_unit <>", value, "lssuingUnit");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitGreaterThan(String value) {
            addCriterion("lssuing_unit >", value, "lssuingUnit");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("lssuing_unit >=", value, "lssuingUnit");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitLessThan(String value) {
            addCriterion("lssuing_unit <", value, "lssuingUnit");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitLessThanOrEqualTo(String value) {
            addCriterion("lssuing_unit <=", value, "lssuingUnit");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitLike(String value) {
            addCriterion("lssuing_unit like", value, "lssuingUnit");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitNotLike(String value) {
            addCriterion("lssuing_unit not like", value, "lssuingUnit");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitIn(List<String> values) {
            addCriterion("lssuing_unit in", values, "lssuingUnit");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitNotIn(List<String> values) {
            addCriterion("lssuing_unit not in", values, "lssuingUnit");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitBetween(String value1, String value2) {
            addCriterion("lssuing_unit between", value1, value2, "lssuingUnit");
            return (Criteria) this;
        }

        public Criteria andLssuingUnitNotBetween(String value1, String value2) {
            addCriterion("lssuing_unit not between", value1, value2, "lssuingUnit");
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