package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.List;

public class ContactInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ContactInformationExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberIsNull() {
            addCriterion("tel_number is null");
            return (Criteria) this;
        }

        public Criteria andTelNumberIsNotNull() {
            addCriterion("tel_number is not null");
            return (Criteria) this;
        }

        public Criteria andTelNumberEqualTo(String value) {
            addCriterion("tel_number =", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotEqualTo(String value) {
            addCriterion("tel_number <>", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberGreaterThan(String value) {
            addCriterion("tel_number >", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tel_number >=", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLessThan(String value) {
            addCriterion("tel_number <", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLessThanOrEqualTo(String value) {
            addCriterion("tel_number <=", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLike(String value) {
            addCriterion("tel_number like", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotLike(String value) {
            addCriterion("tel_number not like", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberIn(List<String> values) {
            addCriterion("tel_number in", values, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotIn(List<String> values) {
            addCriterion("tel_number not in", values, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberBetween(String value1, String value2) {
            addCriterion("tel_number between", value1, value2, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotBetween(String value1, String value2) {
            addCriterion("tel_number not between", value1, value2, "telNumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberIsNull() {
            addCriterion("other_tel_number is null");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberIsNotNull() {
            addCriterion("other_tel_number is not null");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberEqualTo(String value) {
            addCriterion("other_tel_number =", value, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberNotEqualTo(String value) {
            addCriterion("other_tel_number <>", value, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberGreaterThan(String value) {
            addCriterion("other_tel_number >", value, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("other_tel_number >=", value, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberLessThan(String value) {
            addCriterion("other_tel_number <", value, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberLessThanOrEqualTo(String value) {
            addCriterion("other_tel_number <=", value, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberLike(String value) {
            addCriterion("other_tel_number like", value, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberNotLike(String value) {
            addCriterion("other_tel_number not like", value, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberIn(List<String> values) {
            addCriterion("other_tel_number in", values, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberNotIn(List<String> values) {
            addCriterion("other_tel_number not in", values, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberBetween(String value1, String value2) {
            addCriterion("other_tel_number between", value1, value2, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andOtherTelNumberNotBetween(String value1, String value2) {
            addCriterion("other_tel_number not between", value1, value2, "otherTelNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactIsNull() {
            addCriterion("emergency_contact is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactIsNotNull() {
            addCriterion("emergency_contact is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactEqualTo(String value) {
            addCriterion("emergency_contact =", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotEqualTo(String value) {
            addCriterion("emergency_contact <>", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactGreaterThan(String value) {
            addCriterion("emergency_contact >", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact >=", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLessThan(String value) {
            addCriterion("emergency_contact <", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact <=", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLike(String value) {
            addCriterion("emergency_contact like", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotLike(String value) {
            addCriterion("emergency_contact not like", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactIn(List<String> values) {
            addCriterion("emergency_contact in", values, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotIn(List<String> values) {
            addCriterion("emergency_contact not in", values, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactBetween(String value1, String value2) {
            addCriterion("emergency_contact between", value1, value2, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotBetween(String value1, String value2) {
            addCriterion("emergency_contact not between", value1, value2, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberIsNull() {
            addCriterion("emergency_number is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberIsNotNull() {
            addCriterion("emergency_number is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberEqualTo(String value) {
            addCriterion("emergency_number =", value, "emergencyNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberNotEqualTo(String value) {
            addCriterion("emergency_number <>", value, "emergencyNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberGreaterThan(String value) {
            addCriterion("emergency_number >", value, "emergencyNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_number >=", value, "emergencyNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberLessThan(String value) {
            addCriterion("emergency_number <", value, "emergencyNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberLessThanOrEqualTo(String value) {
            addCriterion("emergency_number <=", value, "emergencyNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberLike(String value) {
            addCriterion("emergency_number like", value, "emergencyNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberNotLike(String value) {
            addCriterion("emergency_number not like", value, "emergencyNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberIn(List<String> values) {
            addCriterion("emergency_number in", values, "emergencyNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberNotIn(List<String> values) {
            addCriterion("emergency_number not in", values, "emergencyNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberBetween(String value1, String value2) {
            addCriterion("emergency_number between", value1, value2, "emergencyNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumberNotBetween(String value1, String value2) {
            addCriterion("emergency_number not between", value1, value2, "emergencyNumber");
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