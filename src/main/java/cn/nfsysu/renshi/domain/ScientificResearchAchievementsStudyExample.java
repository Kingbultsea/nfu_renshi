package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.List;

public class ScientificResearchAchievementsStudyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ScientificResearchAchievementsStudyExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(String value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(String value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(String value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(String value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(String value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(String value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLike(String value) {
            addCriterion("report_time like", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotLike(String value) {
            addCriterion("report_time not like", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<String> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<String> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(String value1, String value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(String value1, String value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyIsNull() {
            addCriterion("entrusting_party is null");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyIsNotNull() {
            addCriterion("entrusting_party is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyEqualTo(String value) {
            addCriterion("entrusting_party =", value, "entrustingParty");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyNotEqualTo(String value) {
            addCriterion("entrusting_party <>", value, "entrustingParty");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyGreaterThan(String value) {
            addCriterion("entrusting_party >", value, "entrustingParty");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyGreaterThanOrEqualTo(String value) {
            addCriterion("entrusting_party >=", value, "entrustingParty");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyLessThan(String value) {
            addCriterion("entrusting_party <", value, "entrustingParty");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyLessThanOrEqualTo(String value) {
            addCriterion("entrusting_party <=", value, "entrustingParty");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyLike(String value) {
            addCriterion("entrusting_party like", value, "entrustingParty");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyNotLike(String value) {
            addCriterion("entrusting_party not like", value, "entrustingParty");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyIn(List<String> values) {
            addCriterion("entrusting_party in", values, "entrustingParty");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyNotIn(List<String> values) {
            addCriterion("entrusting_party not in", values, "entrustingParty");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyBetween(String value1, String value2) {
            addCriterion("entrusting_party between", value1, value2, "entrustingParty");
            return (Criteria) this;
        }

        public Criteria andEntrustingPartyNotBetween(String value1, String value2) {
            addCriterion("entrusting_party not between", value1, value2, "entrustingParty");
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