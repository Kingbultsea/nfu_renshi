package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOldNameIsNull() {
            addCriterion("old_name is null");
            return (Criteria) this;
        }

        public Criteria andOldNameIsNotNull() {
            addCriterion("old_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldNameEqualTo(String value) {
            addCriterion("old_name =", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotEqualTo(String value) {
            addCriterion("old_name <>", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameGreaterThan(String value) {
            addCriterion("old_name >", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_name >=", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLessThan(String value) {
            addCriterion("old_name <", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLessThanOrEqualTo(String value) {
            addCriterion("old_name <=", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLike(String value) {
            addCriterion("old_name like", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotLike(String value) {
            addCriterion("old_name not like", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameIn(List<String> values) {
            addCriterion("old_name in", values, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotIn(List<String> values) {
            addCriterion("old_name not in", values, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameBetween(String value1, String value2) {
            addCriterion("old_name between", value1, value2, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotBetween(String value1, String value2) {
            addCriterion("old_name not between", value1, value2, "oldName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andWorkNumberIsNull() {
            addCriterion("work_number is null");
            return (Criteria) this;
        }

        public Criteria andWorkNumberIsNotNull() {
            addCriterion("work_number is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNumberEqualTo(String value) {
            addCriterion("work_number =", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberNotEqualTo(String value) {
            addCriterion("work_number <>", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberGreaterThan(String value) {
            addCriterion("work_number >", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberGreaterThanOrEqualTo(String value) {
            addCriterion("work_number >=", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberLessThan(String value) {
            addCriterion("work_number <", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberLessThanOrEqualTo(String value) {
            addCriterion("work_number <=", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberLike(String value) {
            addCriterion("work_number like", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberNotLike(String value) {
            addCriterion("work_number not like", value, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberIn(List<String> values) {
            addCriterion("work_number in", values, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberNotIn(List<String> values) {
            addCriterion("work_number not in", values, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberBetween(String value1, String value2) {
            addCriterion("work_number between", value1, value2, "workNumber");
            return (Criteria) this;
        }

        public Criteria andWorkNumberNotBetween(String value1, String value2) {
            addCriterion("work_number not between", value1, value2, "workNumber");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeIsNull() {
            addCriterion("id_card_type is null");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeIsNotNull() {
            addCriterion("id_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeEqualTo(String value) {
            addCriterion("id_card_type =", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotEqualTo(String value) {
            addCriterion("id_card_type <>", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeGreaterThan(String value) {
            addCriterion("id_card_type >", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_type >=", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeLessThan(String value) {
            addCriterion("id_card_type <", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeLessThanOrEqualTo(String value) {
            addCriterion("id_card_type <=", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeLike(String value) {
            addCriterion("id_card_type like", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotLike(String value) {
            addCriterion("id_card_type not like", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeIn(List<String> values) {
            addCriterion("id_card_type in", values, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotIn(List<String> values) {
            addCriterion("id_card_type not in", values, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeBetween(String value1, String value2) {
            addCriterion("id_card_type between", value1, value2, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotBetween(String value1, String value2) {
            addCriterion("id_card_type not between", value1, value2, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIsNull() {
            addCriterion("id_card_number is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIsNotNull() {
            addCriterion("id_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberEqualTo(String value) {
            addCriterion("id_card_number =", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotEqualTo(String value) {
            addCriterion("id_card_number <>", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberGreaterThan(String value) {
            addCriterion("id_card_number >", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_number >=", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLessThan(String value) {
            addCriterion("id_card_number <", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLessThanOrEqualTo(String value) {
            addCriterion("id_card_number <=", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLike(String value) {
            addCriterion("id_card_number like", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotLike(String value) {
            addCriterion("id_card_number not like", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIn(List<String> values) {
            addCriterion("id_card_number in", values, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotIn(List<String> values) {
            addCriterion("id_card_number not in", values, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberBetween(String value1, String value2) {
            addCriterion("id_card_number between", value1, value2, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotBetween(String value1, String value2) {
            addCriterion("id_card_number not between", value1, value2, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("birth_date is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(Date value) {
            addCriterion("birth_date =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(Date value) {
            addCriterion("birth_date <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(Date value) {
            addCriterion("birth_date >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("birth_date >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(Date value) {
            addCriterion("birth_date <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(Date value) {
            addCriterion("birth_date <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<Date> values) {
            addCriterion("birth_date in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<Date> values) {
            addCriterion("birth_date not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(Date value1, Date value2) {
            addCriterion("birth_date between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(Date value1, Date value2) {
            addCriterion("birth_date not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("native_place is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("native_place is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("native_place =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("native_place <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("native_place >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("native_place >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("native_place <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("native_place <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("native_place like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("native_place not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("native_place in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("native_place not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("native_place between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("native_place not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativeHeathIsNull() {
            addCriterion("native_heath is null");
            return (Criteria) this;
        }

        public Criteria andNativeHeathIsNotNull() {
            addCriterion("native_heath is not null");
            return (Criteria) this;
        }

        public Criteria andNativeHeathEqualTo(String value) {
            addCriterion("native_heath =", value, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNativeHeathNotEqualTo(String value) {
            addCriterion("native_heath <>", value, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNativeHeathGreaterThan(String value) {
            addCriterion("native_heath >", value, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNativeHeathGreaterThanOrEqualTo(String value) {
            addCriterion("native_heath >=", value, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNativeHeathLessThan(String value) {
            addCriterion("native_heath <", value, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNativeHeathLessThanOrEqualTo(String value) {
            addCriterion("native_heath <=", value, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNativeHeathLike(String value) {
            addCriterion("native_heath like", value, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNativeHeathNotLike(String value) {
            addCriterion("native_heath not like", value, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNativeHeathIn(List<String> values) {
            addCriterion("native_heath in", values, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNativeHeathNotIn(List<String> values) {
            addCriterion("native_heath not in", values, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNativeHeathBetween(String value1, String value2) {
            addCriterion("native_heath between", value1, value2, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNativeHeathNotBetween(String value1, String value2) {
            addCriterion("native_heath not between", value1, value2, "nativeHeath");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookIsNull() {
            addCriterion("political_outlook is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookIsNotNull() {
            addCriterion("political_outlook is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookEqualTo(String value) {
            addCriterion("political_outlook =", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookNotEqualTo(String value) {
            addCriterion("political_outlook <>", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookGreaterThan(String value) {
            addCriterion("political_outlook >", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookGreaterThanOrEqualTo(String value) {
            addCriterion("political_outlook >=", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookLessThan(String value) {
            addCriterion("political_outlook <", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookLessThanOrEqualTo(String value) {
            addCriterion("political_outlook <=", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookLike(String value) {
            addCriterion("political_outlook like", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookNotLike(String value) {
            addCriterion("political_outlook not like", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookIn(List<String> values) {
            addCriterion("political_outlook in", values, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookNotIn(List<String> values) {
            addCriterion("political_outlook not in", values, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookBetween(String value1, String value2) {
            addCriterion("political_outlook between", value1, value2, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookNotBetween(String value1, String value2) {
            addCriterion("political_outlook not between", value1, value2, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("marital_status like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("marital_status not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusIsNull() {
            addCriterion("health_status is null");
            return (Criteria) this;
        }

        public Criteria andHealthStatusIsNotNull() {
            addCriterion("health_status is not null");
            return (Criteria) this;
        }

        public Criteria andHealthStatusEqualTo(String value) {
            addCriterion("health_status =", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotEqualTo(String value) {
            addCriterion("health_status <>", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusGreaterThan(String value) {
            addCriterion("health_status >", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusGreaterThanOrEqualTo(String value) {
            addCriterion("health_status >=", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusLessThan(String value) {
            addCriterion("health_status <", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusLessThanOrEqualTo(String value) {
            addCriterion("health_status <=", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusLike(String value) {
            addCriterion("health_status like", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotLike(String value) {
            addCriterion("health_status not like", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusIn(List<String> values) {
            addCriterion("health_status in", values, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotIn(List<String> values) {
            addCriterion("health_status not in", values, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusBetween(String value1, String value2) {
            addCriterion("health_status between", value1, value2, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotBetween(String value1, String value2) {
            addCriterion("health_status not between", value1, value2, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateIsNull() {
            addCriterion("join_work_date is null");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateIsNotNull() {
            addCriterion("join_work_date is not null");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateEqualTo(Date value) {
            addCriterion("join_work_date =", value, "joinWorkDate");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateNotEqualTo(Date value) {
            addCriterion("join_work_date <>", value, "joinWorkDate");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateGreaterThan(Date value) {
            addCriterion("join_work_date >", value, "joinWorkDate");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateGreaterThanOrEqualTo(Date value) {
            addCriterion("join_work_date >=", value, "joinWorkDate");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateLessThan(Date value) {
            addCriterion("join_work_date <", value, "joinWorkDate");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateLessThanOrEqualTo(Date value) {
            addCriterion("join_work_date <=", value, "joinWorkDate");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateIn(List<Date> values) {
            addCriterion("join_work_date in", values, "joinWorkDate");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateNotIn(List<Date> values) {
            addCriterion("join_work_date not in", values, "joinWorkDate");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateBetween(Date value1, Date value2) {
            addCriterion("join_work_date between", value1, value2, "joinWorkDate");
            return (Criteria) this;
        }

        public Criteria andJoinWorkDateNotBetween(Date value1, Date value2) {
            addCriterion("join_work_date not between", value1, value2, "joinWorkDate");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateIsNull() {
            addCriterion("join_school_date is null");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateIsNotNull() {
            addCriterion("join_school_date is not null");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateEqualTo(Date value) {
            addCriterion("join_school_date =", value, "joinSchoolDate");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateNotEqualTo(Date value) {
            addCriterion("join_school_date <>", value, "joinSchoolDate");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateGreaterThan(Date value) {
            addCriterion("join_school_date >", value, "joinSchoolDate");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateGreaterThanOrEqualTo(Date value) {
            addCriterion("join_school_date >=", value, "joinSchoolDate");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateLessThan(Date value) {
            addCriterion("join_school_date <", value, "joinSchoolDate");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateLessThanOrEqualTo(Date value) {
            addCriterion("join_school_date <=", value, "joinSchoolDate");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateIn(List<Date> values) {
            addCriterion("join_school_date in", values, "joinSchoolDate");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateNotIn(List<Date> values) {
            addCriterion("join_school_date not in", values, "joinSchoolDate");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateBetween(Date value1, Date value2) {
            addCriterion("join_school_date between", value1, value2, "joinSchoolDate");
            return (Criteria) this;
        }

        public Criteria andJoinSchoolDateNotBetween(Date value1, Date value2) {
            addCriterion("join_school_date not between", value1, value2, "joinSchoolDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginIsNull() {
            addCriterion("employee_origin is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginIsNotNull() {
            addCriterion("employee_origin is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginEqualTo(String value) {
            addCriterion("employee_origin =", value, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginNotEqualTo(String value) {
            addCriterion("employee_origin <>", value, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginGreaterThan(String value) {
            addCriterion("employee_origin >", value, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginGreaterThanOrEqualTo(String value) {
            addCriterion("employee_origin >=", value, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginLessThan(String value) {
            addCriterion("employee_origin <", value, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginLessThanOrEqualTo(String value) {
            addCriterion("employee_origin <=", value, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginLike(String value) {
            addCriterion("employee_origin like", value, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginNotLike(String value) {
            addCriterion("employee_origin not like", value, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginIn(List<String> values) {
            addCriterion("employee_origin in", values, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginNotIn(List<String> values) {
            addCriterion("employee_origin not in", values, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginBetween(String value1, String value2) {
            addCriterion("employee_origin between", value1, value2, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOriginNotBetween(String value1, String value2) {
            addCriterion("employee_origin not between", value1, value2, "employeeOrigin");
            return (Criteria) this;
        }

        public Criteria andMarginStructureIsNull() {
            addCriterion("margin_structure is null");
            return (Criteria) this;
        }

        public Criteria andMarginStructureIsNotNull() {
            addCriterion("margin_structure is not null");
            return (Criteria) this;
        }

        public Criteria andMarginStructureEqualTo(String value) {
            addCriterion("margin_structure =", value, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andMarginStructureNotEqualTo(String value) {
            addCriterion("margin_structure <>", value, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andMarginStructureGreaterThan(String value) {
            addCriterion("margin_structure >", value, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andMarginStructureGreaterThanOrEqualTo(String value) {
            addCriterion("margin_structure >=", value, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andMarginStructureLessThan(String value) {
            addCriterion("margin_structure <", value, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andMarginStructureLessThanOrEqualTo(String value) {
            addCriterion("margin_structure <=", value, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andMarginStructureLike(String value) {
            addCriterion("margin_structure like", value, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andMarginStructureNotLike(String value) {
            addCriterion("margin_structure not like", value, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andMarginStructureIn(List<String> values) {
            addCriterion("margin_structure in", values, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andMarginStructureNotIn(List<String> values) {
            addCriterion("margin_structure not in", values, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andMarginStructureBetween(String value1, String value2) {
            addCriterion("margin_structure between", value1, value2, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andMarginStructureNotBetween(String value1, String value2) {
            addCriterion("margin_structure not between", value1, value2, "marginStructure");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNull() {
            addCriterion("work_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNotNull() {
            addCriterion("work_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeEqualTo(String value) {
            addCriterion("work_type =", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotEqualTo(String value) {
            addCriterion("work_type <>", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThan(String value) {
            addCriterion("work_type >", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("work_type >=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThan(String value) {
            addCriterion("work_type <", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThanOrEqualTo(String value) {
            addCriterion("work_type <=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLike(String value) {
            addCriterion("work_type like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotLike(String value) {
            addCriterion("work_type not like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIn(List<String> values) {
            addCriterion("work_type in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotIn(List<String> values) {
            addCriterion("work_type not in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeBetween(String value1, String value2) {
            addCriterion("work_type between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotBetween(String value1, String value2) {
            addCriterion("work_type not between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationIsNull() {
            addCriterion("is_organization is null");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationIsNotNull() {
            addCriterion("is_organization is not null");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationEqualTo(String value) {
            addCriterion("is_organization =", value, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationNotEqualTo(String value) {
            addCriterion("is_organization <>", value, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationGreaterThan(String value) {
            addCriterion("is_organization >", value, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("is_organization >=", value, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationLessThan(String value) {
            addCriterion("is_organization <", value, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationLessThanOrEqualTo(String value) {
            addCriterion("is_organization <=", value, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationLike(String value) {
            addCriterion("is_organization like", value, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationNotLike(String value) {
            addCriterion("is_organization not like", value, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationIn(List<String> values) {
            addCriterion("is_organization in", values, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationNotIn(List<String> values) {
            addCriterion("is_organization not in", values, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationBetween(String value1, String value2) {
            addCriterion("is_organization between", value1, value2, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andIsOrganizationNotBetween(String value1, String value2) {
            addCriterion("is_organization not between", value1, value2, "isOrganization");
            return (Criteria) this;
        }

        public Criteria andHumanFormIsNull() {
            addCriterion("human_form is null");
            return (Criteria) this;
        }

        public Criteria andHumanFormIsNotNull() {
            addCriterion("human_form is not null");
            return (Criteria) this;
        }

        public Criteria andHumanFormEqualTo(String value) {
            addCriterion("human_form =", value, "humanForm");
            return (Criteria) this;
        }

        public Criteria andHumanFormNotEqualTo(String value) {
            addCriterion("human_form <>", value, "humanForm");
            return (Criteria) this;
        }

        public Criteria andHumanFormGreaterThan(String value) {
            addCriterion("human_form >", value, "humanForm");
            return (Criteria) this;
        }

        public Criteria andHumanFormGreaterThanOrEqualTo(String value) {
            addCriterion("human_form >=", value, "humanForm");
            return (Criteria) this;
        }

        public Criteria andHumanFormLessThan(String value) {
            addCriterion("human_form <", value, "humanForm");
            return (Criteria) this;
        }

        public Criteria andHumanFormLessThanOrEqualTo(String value) {
            addCriterion("human_form <=", value, "humanForm");
            return (Criteria) this;
        }

        public Criteria andHumanFormLike(String value) {
            addCriterion("human_form like", value, "humanForm");
            return (Criteria) this;
        }

        public Criteria andHumanFormNotLike(String value) {
            addCriterion("human_form not like", value, "humanForm");
            return (Criteria) this;
        }

        public Criteria andHumanFormIn(List<String> values) {
            addCriterion("human_form in", values, "humanForm");
            return (Criteria) this;
        }

        public Criteria andHumanFormNotIn(List<String> values) {
            addCriterion("human_form not in", values, "humanForm");
            return (Criteria) this;
        }

        public Criteria andHumanFormBetween(String value1, String value2) {
            addCriterion("human_form between", value1, value2, "humanForm");
            return (Criteria) this;
        }

        public Criteria andHumanFormNotBetween(String value1, String value2) {
            addCriterion("human_form not between", value1, value2, "humanForm");
            return (Criteria) this;
        }

        public Criteria andSignContractIsNull() {
            addCriterion("sign_contract is null");
            return (Criteria) this;
        }

        public Criteria andSignContractIsNotNull() {
            addCriterion("sign_contract is not null");
            return (Criteria) this;
        }

        public Criteria andSignContractEqualTo(String value) {
            addCriterion("sign_contract =", value, "signContract");
            return (Criteria) this;
        }

        public Criteria andSignContractNotEqualTo(String value) {
            addCriterion("sign_contract <>", value, "signContract");
            return (Criteria) this;
        }

        public Criteria andSignContractGreaterThan(String value) {
            addCriterion("sign_contract >", value, "signContract");
            return (Criteria) this;
        }

        public Criteria andSignContractGreaterThanOrEqualTo(String value) {
            addCriterion("sign_contract >=", value, "signContract");
            return (Criteria) this;
        }

        public Criteria andSignContractLessThan(String value) {
            addCriterion("sign_contract <", value, "signContract");
            return (Criteria) this;
        }

        public Criteria andSignContractLessThanOrEqualTo(String value) {
            addCriterion("sign_contract <=", value, "signContract");
            return (Criteria) this;
        }

        public Criteria andSignContractLike(String value) {
            addCriterion("sign_contract like", value, "signContract");
            return (Criteria) this;
        }

        public Criteria andSignContractNotLike(String value) {
            addCriterion("sign_contract not like", value, "signContract");
            return (Criteria) this;
        }

        public Criteria andSignContractIn(List<String> values) {
            addCriterion("sign_contract in", values, "signContract");
            return (Criteria) this;
        }

        public Criteria andSignContractNotIn(List<String> values) {
            addCriterion("sign_contract not in", values, "signContract");
            return (Criteria) this;
        }

        public Criteria andSignContractBetween(String value1, String value2) {
            addCriterion("sign_contract between", value1, value2, "signContract");
            return (Criteria) this;
        }

        public Criteria andSignContractNotBetween(String value1, String value2) {
            addCriterion("sign_contract not between", value1, value2, "signContract");
            return (Criteria) this;
        }

        public Criteria andOrganisationIsNull() {
            addCriterion("organisation is null");
            return (Criteria) this;
        }

        public Criteria andOrganisationIsNotNull() {
            addCriterion("organisation is not null");
            return (Criteria) this;
        }

        public Criteria andOrganisationEqualTo(String value) {
            addCriterion("organisation =", value, "organisation");
            return (Criteria) this;
        }

        public Criteria andOrganisationNotEqualTo(String value) {
            addCriterion("organisation <>", value, "organisation");
            return (Criteria) this;
        }

        public Criteria andOrganisationGreaterThan(String value) {
            addCriterion("organisation >", value, "organisation");
            return (Criteria) this;
        }

        public Criteria andOrganisationGreaterThanOrEqualTo(String value) {
            addCriterion("organisation >=", value, "organisation");
            return (Criteria) this;
        }

        public Criteria andOrganisationLessThan(String value) {
            addCriterion("organisation <", value, "organisation");
            return (Criteria) this;
        }

        public Criteria andOrganisationLessThanOrEqualTo(String value) {
            addCriterion("organisation <=", value, "organisation");
            return (Criteria) this;
        }

        public Criteria andOrganisationLike(String value) {
            addCriterion("organisation like", value, "organisation");
            return (Criteria) this;
        }

        public Criteria andOrganisationNotLike(String value) {
            addCriterion("organisation not like", value, "organisation");
            return (Criteria) this;
        }

        public Criteria andOrganisationIn(List<String> values) {
            addCriterion("organisation in", values, "organisation");
            return (Criteria) this;
        }

        public Criteria andOrganisationNotIn(List<String> values) {
            addCriterion("organisation not in", values, "organisation");
            return (Criteria) this;
        }

        public Criteria andOrganisationBetween(String value1, String value2) {
            addCriterion("organisation between", value1, value2, "organisation");
            return (Criteria) this;
        }

        public Criteria andOrganisationNotBetween(String value1, String value2) {
            addCriterion("organisation not between", value1, value2, "organisation");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelIsNull() {
            addCriterion("state_of_personnel is null");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelIsNotNull() {
            addCriterion("state_of_personnel is not null");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelEqualTo(String value) {
            addCriterion("state_of_personnel =", value, "stateOfPersonnel");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelNotEqualTo(String value) {
            addCriterion("state_of_personnel <>", value, "stateOfPersonnel");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelGreaterThan(String value) {
            addCriterion("state_of_personnel >", value, "stateOfPersonnel");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("state_of_personnel >=", value, "stateOfPersonnel");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelLessThan(String value) {
            addCriterion("state_of_personnel <", value, "stateOfPersonnel");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelLessThanOrEqualTo(String value) {
            addCriterion("state_of_personnel <=", value, "stateOfPersonnel");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelLike(String value) {
            addCriterion("state_of_personnel like", value, "stateOfPersonnel");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelNotLike(String value) {
            addCriterion("state_of_personnel not like", value, "stateOfPersonnel");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelIn(List<String> values) {
            addCriterion("state_of_personnel in", values, "stateOfPersonnel");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelNotIn(List<String> values) {
            addCriterion("state_of_personnel not in", values, "stateOfPersonnel");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelBetween(String value1, String value2) {
            addCriterion("state_of_personnel between", value1, value2, "stateOfPersonnel");
            return (Criteria) this;
        }

        public Criteria andStateOfPersonnelNotBetween(String value1, String value2) {
            addCriterion("state_of_personnel not between", value1, value2, "stateOfPersonnel");
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