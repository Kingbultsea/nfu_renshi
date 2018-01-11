package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.List;

public class DomesticTrainingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DomesticTrainingExample() {
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

        public Criteria andTrainYearIsNull() {
            addCriterion("train_year is null");
            return (Criteria) this;
        }

        public Criteria andTrainYearIsNotNull() {
            addCriterion("train_year is not null");
            return (Criteria) this;
        }

        public Criteria andTrainYearEqualTo(Integer value) {
            addCriterion("train_year =", value, "trainYear");
            return (Criteria) this;
        }

        public Criteria andTrainYearNotEqualTo(Integer value) {
            addCriterion("train_year <>", value, "trainYear");
            return (Criteria) this;
        }

        public Criteria andTrainYearGreaterThan(Integer value) {
            addCriterion("train_year >", value, "trainYear");
            return (Criteria) this;
        }

        public Criteria andTrainYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("train_year >=", value, "trainYear");
            return (Criteria) this;
        }

        public Criteria andTrainYearLessThan(Integer value) {
            addCriterion("train_year <", value, "trainYear");
            return (Criteria) this;
        }

        public Criteria andTrainYearLessThanOrEqualTo(Integer value) {
            addCriterion("train_year <=", value, "trainYear");
            return (Criteria) this;
        }

        public Criteria andTrainYearIn(List<Integer> values) {
            addCriterion("train_year in", values, "trainYear");
            return (Criteria) this;
        }

        public Criteria andTrainYearNotIn(List<Integer> values) {
            addCriterion("train_year not in", values, "trainYear");
            return (Criteria) this;
        }

        public Criteria andTrainYearBetween(Integer value1, Integer value2) {
            addCriterion("train_year between", value1, value2, "trainYear");
            return (Criteria) this;
        }

        public Criteria andTrainYearNotBetween(Integer value1, Integer value2) {
            addCriterion("train_year not between", value1, value2, "trainYear");
            return (Criteria) this;
        }

        public Criteria andTrainTypeIsNull() {
            addCriterion("train_type is null");
            return (Criteria) this;
        }

        public Criteria andTrainTypeIsNotNull() {
            addCriterion("train_type is not null");
            return (Criteria) this;
        }

        public Criteria andTrainTypeEqualTo(String value) {
            addCriterion("train_type =", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotEqualTo(String value) {
            addCriterion("train_type <>", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeGreaterThan(String value) {
            addCriterion("train_type >", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("train_type >=", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeLessThan(String value) {
            addCriterion("train_type <", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeLessThanOrEqualTo(String value) {
            addCriterion("train_type <=", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeLike(String value) {
            addCriterion("train_type like", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotLike(String value) {
            addCriterion("train_type not like", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeIn(List<String> values) {
            addCriterion("train_type in", values, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotIn(List<String> values) {
            addCriterion("train_type not in", values, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeBetween(String value1, String value2) {
            addCriterion("train_type between", value1, value2, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotBetween(String value1, String value2) {
            addCriterion("train_type not between", value1, value2, "trainType");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsIsNull() {
            addCriterion("train_institutions is null");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsIsNotNull() {
            addCriterion("train_institutions is not null");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsEqualTo(String value) {
            addCriterion("train_institutions =", value, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsNotEqualTo(String value) {
            addCriterion("train_institutions <>", value, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsGreaterThan(String value) {
            addCriterion("train_institutions >", value, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsGreaterThanOrEqualTo(String value) {
            addCriterion("train_institutions >=", value, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsLessThan(String value) {
            addCriterion("train_institutions <", value, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsLessThanOrEqualTo(String value) {
            addCriterion("train_institutions <=", value, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsLike(String value) {
            addCriterion("train_institutions like", value, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsNotLike(String value) {
            addCriterion("train_institutions not like", value, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsIn(List<String> values) {
            addCriterion("train_institutions in", values, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsNotIn(List<String> values) {
            addCriterion("train_institutions not in", values, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsBetween(String value1, String value2) {
            addCriterion("train_institutions between", value1, value2, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainInstitutionsNotBetween(String value1, String value2) {
            addCriterion("train_institutions not between", value1, value2, "trainInstitutions");
            return (Criteria) this;
        }

        public Criteria andTrainModeIsNull() {
            addCriterion("train_mode is null");
            return (Criteria) this;
        }

        public Criteria andTrainModeIsNotNull() {
            addCriterion("train_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTrainModeEqualTo(String value) {
            addCriterion("train_mode =", value, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainModeNotEqualTo(String value) {
            addCriterion("train_mode <>", value, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainModeGreaterThan(String value) {
            addCriterion("train_mode >", value, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainModeGreaterThanOrEqualTo(String value) {
            addCriterion("train_mode >=", value, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainModeLessThan(String value) {
            addCriterion("train_mode <", value, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainModeLessThanOrEqualTo(String value) {
            addCriterion("train_mode <=", value, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainModeLike(String value) {
            addCriterion("train_mode like", value, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainModeNotLike(String value) {
            addCriterion("train_mode not like", value, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainModeIn(List<String> values) {
            addCriterion("train_mode in", values, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainModeNotIn(List<String> values) {
            addCriterion("train_mode not in", values, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainModeBetween(String value1, String value2) {
            addCriterion("train_mode between", value1, value2, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainModeNotBetween(String value1, String value2) {
            addCriterion("train_mode not between", value1, value2, "trainMode");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeIsNull() {
            addCriterion("train_get_time is null");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeIsNotNull() {
            addCriterion("train_get_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeEqualTo(Integer value) {
            addCriterion("train_get_time =", value, "trainGetTime");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeNotEqualTo(Integer value) {
            addCriterion("train_get_time <>", value, "trainGetTime");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeGreaterThan(Integer value) {
            addCriterion("train_get_time >", value, "trainGetTime");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("train_get_time >=", value, "trainGetTime");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeLessThan(Integer value) {
            addCriterion("train_get_time <", value, "trainGetTime");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeLessThanOrEqualTo(Integer value) {
            addCriterion("train_get_time <=", value, "trainGetTime");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeIn(List<Integer> values) {
            addCriterion("train_get_time in", values, "trainGetTime");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeNotIn(List<Integer> values) {
            addCriterion("train_get_time not in", values, "trainGetTime");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeBetween(Integer value1, Integer value2) {
            addCriterion("train_get_time between", value1, value2, "trainGetTime");
            return (Criteria) this;
        }

        public Criteria andTrainGetTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("train_get_time not between", value1, value2, "trainGetTime");
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