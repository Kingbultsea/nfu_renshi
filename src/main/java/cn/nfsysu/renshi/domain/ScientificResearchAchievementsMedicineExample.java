package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScientificResearchAchievementsMedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ScientificResearchAchievementsMedicineExample() {
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

        public Criteria andCertificateNameIsNull() {
            addCriterion("certificate_name is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIsNotNull() {
            addCriterion("certificate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameEqualTo(String value) {
            addCriterion("certificate_name =", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotEqualTo(String value) {
            addCriterion("certificate_name <>", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThan(String value) {
            addCriterion("certificate_name >", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_name >=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThan(String value) {
            addCriterion("certificate_name <", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThanOrEqualTo(String value) {
            addCriterion("certificate_name <=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLike(String value) {
            addCriterion("certificate_name like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotLike(String value) {
            addCriterion("certificate_name not like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIn(List<String> values) {
            addCriterion("certificate_name in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotIn(List<String> values) {
            addCriterion("certificate_name not in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameBetween(String value1, String value2) {
            addCriterion("certificate_name between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotBetween(String value1, String value2) {
            addCriterion("certificate_name not between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessIsNull() {
            addCriterion("is_representativeness is null");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessIsNotNull() {
            addCriterion("is_representativeness is not null");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessEqualTo(String value) {
            addCriterion("is_representativeness =", value, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessNotEqualTo(String value) {
            addCriterion("is_representativeness <>", value, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessGreaterThan(String value) {
            addCriterion("is_representativeness >", value, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessGreaterThanOrEqualTo(String value) {
            addCriterion("is_representativeness >=", value, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessLessThan(String value) {
            addCriterion("is_representativeness <", value, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessLessThanOrEqualTo(String value) {
            addCriterion("is_representativeness <=", value, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessLike(String value) {
            addCriterion("is_representativeness like", value, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessNotLike(String value) {
            addCriterion("is_representativeness not like", value, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessIn(List<String> values) {
            addCriterion("is_representativeness in", values, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessNotIn(List<String> values) {
            addCriterion("is_representativeness not in", values, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessBetween(String value1, String value2) {
            addCriterion("is_representativeness between", value1, value2, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andIsRepresentativenessNotBetween(String value1, String value2) {
            addCriterion("is_representativeness not between", value1, value2, "isRepresentativeness");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIsNull() {
            addCriterion("certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIsNotNull() {
            addCriterion("certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberEqualTo(String value) {
            addCriterion("certificate_number =", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotEqualTo(String value) {
            addCriterion("certificate_number <>", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThan(String value) {
            addCriterion("certificate_number >", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_number >=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThan(String value) {
            addCriterion("certificate_number <", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("certificate_number <=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLike(String value) {
            addCriterion("certificate_number like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotLike(String value) {
            addCriterion("certificate_number not like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIn(List<String> values) {
            addCriterion("certificate_number in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotIn(List<String> values) {
            addCriterion("certificate_number not in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberBetween(String value1, String value2) {
            addCriterion("certificate_number between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("certificate_number not between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andSelfRoleIsNull() {
            addCriterion("self_role is null");
            return (Criteria) this;
        }

        public Criteria andSelfRoleIsNotNull() {
            addCriterion("self_role is not null");
            return (Criteria) this;
        }

        public Criteria andSelfRoleEqualTo(String value) {
            addCriterion("self_role =", value, "selfRole");
            return (Criteria) this;
        }

        public Criteria andSelfRoleNotEqualTo(String value) {
            addCriterion("self_role <>", value, "selfRole");
            return (Criteria) this;
        }

        public Criteria andSelfRoleGreaterThan(String value) {
            addCriterion("self_role >", value, "selfRole");
            return (Criteria) this;
        }

        public Criteria andSelfRoleGreaterThanOrEqualTo(String value) {
            addCriterion("self_role >=", value, "selfRole");
            return (Criteria) this;
        }

        public Criteria andSelfRoleLessThan(String value) {
            addCriterion("self_role <", value, "selfRole");
            return (Criteria) this;
        }

        public Criteria andSelfRoleLessThanOrEqualTo(String value) {
            addCriterion("self_role <=", value, "selfRole");
            return (Criteria) this;
        }

        public Criteria andSelfRoleLike(String value) {
            addCriterion("self_role like", value, "selfRole");
            return (Criteria) this;
        }

        public Criteria andSelfRoleNotLike(String value) {
            addCriterion("self_role not like", value, "selfRole");
            return (Criteria) this;
        }

        public Criteria andSelfRoleIn(List<String> values) {
            addCriterion("self_role in", values, "selfRole");
            return (Criteria) this;
        }

        public Criteria andSelfRoleNotIn(List<String> values) {
            addCriterion("self_role not in", values, "selfRole");
            return (Criteria) this;
        }

        public Criteria andSelfRoleBetween(String value1, String value2) {
            addCriterion("self_role between", value1, value2, "selfRole");
            return (Criteria) this;
        }

        public Criteria andSelfRoleNotBetween(String value1, String value2) {
            addCriterion("self_role not between", value1, value2, "selfRole");
            return (Criteria) this;
        }

        public Criteria andAwardTimeIsNull() {
            addCriterion("award_time is null");
            return (Criteria) this;
        }

        public Criteria andAwardTimeIsNotNull() {
            addCriterion("award_time is not null");
            return (Criteria) this;
        }

        public Criteria andAwardTimeEqualTo(Date value) {
            addCriterion("award_time =", value, "awardTime");
            return (Criteria) this;
        }

        public Criteria andAwardTimeNotEqualTo(Date value) {
            addCriterion("award_time <>", value, "awardTime");
            return (Criteria) this;
        }

        public Criteria andAwardTimeGreaterThan(Date value) {
            addCriterion("award_time >", value, "awardTime");
            return (Criteria) this;
        }

        public Criteria andAwardTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("award_time >=", value, "awardTime");
            return (Criteria) this;
        }

        public Criteria andAwardTimeLessThan(Date value) {
            addCriterion("award_time <", value, "awardTime");
            return (Criteria) this;
        }

        public Criteria andAwardTimeLessThanOrEqualTo(Date value) {
            addCriterion("award_time <=", value, "awardTime");
            return (Criteria) this;
        }

        public Criteria andAwardTimeIn(List<Date> values) {
            addCriterion("award_time in", values, "awardTime");
            return (Criteria) this;
        }

        public Criteria andAwardTimeNotIn(List<Date> values) {
            addCriterion("award_time not in", values, "awardTime");
            return (Criteria) this;
        }

        public Criteria andAwardTimeBetween(Date value1, Date value2) {
            addCriterion("award_time between", value1, value2, "awardTime");
            return (Criteria) this;
        }

        public Criteria andAwardTimeNotBetween(Date value1, Date value2) {
            addCriterion("award_time not between", value1, value2, "awardTime");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIsNull() {
            addCriterion("validity_period is null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIsNotNull() {
            addCriterion("validity_period is not null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEqualTo(String value) {
            addCriterion("validity_period =", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotEqualTo(String value) {
            addCriterion("validity_period <>", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodGreaterThan(String value) {
            addCriterion("validity_period >", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("validity_period >=", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLessThan(String value) {
            addCriterion("validity_period <", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLessThanOrEqualTo(String value) {
            addCriterion("validity_period <=", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLike(String value) {
            addCriterion("validity_period like", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotLike(String value) {
            addCriterion("validity_period not like", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIn(List<String> values) {
            addCriterion("validity_period in", values, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotIn(List<String> values) {
            addCriterion("validity_period not in", values, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodBetween(String value1, String value2) {
            addCriterion("validity_period between", value1, value2, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotBetween(String value1, String value2) {
            addCriterion("validity_period not between", value1, value2, "validityPeriod");
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