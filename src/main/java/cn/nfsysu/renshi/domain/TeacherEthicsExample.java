package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherEthicsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TeacherEthicsExample() {
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andHonorNameIsNull() {
            addCriterion("honor_name is null");
            return (Criteria) this;
        }

        public Criteria andHonorNameIsNotNull() {
            addCriterion("honor_name is not null");
            return (Criteria) this;
        }

        public Criteria andHonorNameEqualTo(String value) {
            addCriterion("honor_name =", value, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorNameNotEqualTo(String value) {
            addCriterion("honor_name <>", value, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorNameGreaterThan(String value) {
            addCriterion("honor_name >", value, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorNameGreaterThanOrEqualTo(String value) {
            addCriterion("honor_name >=", value, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorNameLessThan(String value) {
            addCriterion("honor_name <", value, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorNameLessThanOrEqualTo(String value) {
            addCriterion("honor_name <=", value, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorNameLike(String value) {
            addCriterion("honor_name like", value, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorNameNotLike(String value) {
            addCriterion("honor_name not like", value, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorNameIn(List<String> values) {
            addCriterion("honor_name in", values, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorNameNotIn(List<String> values) {
            addCriterion("honor_name not in", values, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorNameBetween(String value1, String value2) {
            addCriterion("honor_name between", value1, value2, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorNameNotBetween(String value1, String value2) {
            addCriterion("honor_name not between", value1, value2, "honorName");
            return (Criteria) this;
        }

        public Criteria andHonorTimeIsNull() {
            addCriterion("honor_time is null");
            return (Criteria) this;
        }

        public Criteria andHonorTimeIsNotNull() {
            addCriterion("honor_time is not null");
            return (Criteria) this;
        }

        public Criteria andHonorTimeEqualTo(Date value) {
            addCriterion("honor_time =", value, "honorTime");
            return (Criteria) this;
        }

        public Criteria andHonorTimeNotEqualTo(Date value) {
            addCriterion("honor_time <>", value, "honorTime");
            return (Criteria) this;
        }

        public Criteria andHonorTimeGreaterThan(Date value) {
            addCriterion("honor_time >", value, "honorTime");
            return (Criteria) this;
        }

        public Criteria andHonorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("honor_time >=", value, "honorTime");
            return (Criteria) this;
        }

        public Criteria andHonorTimeLessThan(Date value) {
            addCriterion("honor_time <", value, "honorTime");
            return (Criteria) this;
        }

        public Criteria andHonorTimeLessThanOrEqualTo(Date value) {
            addCriterion("honor_time <=", value, "honorTime");
            return (Criteria) this;
        }

        public Criteria andHonorTimeIn(List<Date> values) {
            addCriterion("honor_time in", values, "honorTime");
            return (Criteria) this;
        }

        public Criteria andHonorTimeNotIn(List<Date> values) {
            addCriterion("honor_time not in", values, "honorTime");
            return (Criteria) this;
        }

        public Criteria andHonorTimeBetween(Date value1, Date value2) {
            addCriterion("honor_time between", value1, value2, "honorTime");
            return (Criteria) this;
        }

        public Criteria andHonorTimeNotBetween(Date value1, Date value2) {
            addCriterion("honor_time not between", value1, value2, "honorTime");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeIsNull() {
            addCriterion("honor_describe is null");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeIsNotNull() {
            addCriterion("honor_describe is not null");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeEqualTo(String value) {
            addCriterion("honor_describe =", value, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeNotEqualTo(String value) {
            addCriterion("honor_describe <>", value, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeGreaterThan(String value) {
            addCriterion("honor_describe >", value, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("honor_describe >=", value, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeLessThan(String value) {
            addCriterion("honor_describe <", value, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeLessThanOrEqualTo(String value) {
            addCriterion("honor_describe <=", value, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeLike(String value) {
            addCriterion("honor_describe like", value, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeNotLike(String value) {
            addCriterion("honor_describe not like", value, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeIn(List<String> values) {
            addCriterion("honor_describe in", values, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeNotIn(List<String> values) {
            addCriterion("honor_describe not in", values, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeBetween(String value1, String value2) {
            addCriterion("honor_describe between", value1, value2, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andHonorDescribeNotBetween(String value1, String value2) {
            addCriterion("honor_describe not between", value1, value2, "honorDescribe");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
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