package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.List;

public class ScientificResearchAchievementsWritingsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ScientificResearchAchievementsWritingsExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andWritingsNameIsNull() {
            addCriterion("writings_name is null");
            return (Criteria) this;
        }

        public Criteria andWritingsNameIsNotNull() {
            addCriterion("writings_name is not null");
            return (Criteria) this;
        }

        public Criteria andWritingsNameEqualTo(String value) {
            addCriterion("writings_name =", value, "writingsName");
            return (Criteria) this;
        }

        public Criteria andWritingsNameNotEqualTo(String value) {
            addCriterion("writings_name <>", value, "writingsName");
            return (Criteria) this;
        }

        public Criteria andWritingsNameGreaterThan(String value) {
            addCriterion("writings_name >", value, "writingsName");
            return (Criteria) this;
        }

        public Criteria andWritingsNameGreaterThanOrEqualTo(String value) {
            addCriterion("writings_name >=", value, "writingsName");
            return (Criteria) this;
        }

        public Criteria andWritingsNameLessThan(String value) {
            addCriterion("writings_name <", value, "writingsName");
            return (Criteria) this;
        }

        public Criteria andWritingsNameLessThanOrEqualTo(String value) {
            addCriterion("writings_name <=", value, "writingsName");
            return (Criteria) this;
        }

        public Criteria andWritingsNameLike(String value) {
            addCriterion("writings_name like", value, "writingsName");
            return (Criteria) this;
        }

        public Criteria andWritingsNameNotLike(String value) {
            addCriterion("writings_name not like", value, "writingsName");
            return (Criteria) this;
        }

        public Criteria andWritingsNameIn(List<String> values) {
            addCriterion("writings_name in", values, "writingsName");
            return (Criteria) this;
        }

        public Criteria andWritingsNameNotIn(List<String> values) {
            addCriterion("writings_name not in", values, "writingsName");
            return (Criteria) this;
        }

        public Criteria andWritingsNameBetween(String value1, String value2) {
            addCriterion("writings_name between", value1, value2, "writingsName");
            return (Criteria) this;
        }

        public Criteria andWritingsNameNotBetween(String value1, String value2) {
            addCriterion("writings_name not between", value1, value2, "writingsName");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasIsNull() {
            addCriterion("subject_areas is null");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasIsNotNull() {
            addCriterion("subject_areas is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasEqualTo(String value) {
            addCriterion("subject_areas =", value, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasNotEqualTo(String value) {
            addCriterion("subject_areas <>", value, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasGreaterThan(String value) {
            addCriterion("subject_areas >", value, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasGreaterThanOrEqualTo(String value) {
            addCriterion("subject_areas >=", value, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasLessThan(String value) {
            addCriterion("subject_areas <", value, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasLessThanOrEqualTo(String value) {
            addCriterion("subject_areas <=", value, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasLike(String value) {
            addCriterion("subject_areas like", value, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasNotLike(String value) {
            addCriterion("subject_areas not like", value, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasIn(List<String> values) {
            addCriterion("subject_areas in", values, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasNotIn(List<String> values) {
            addCriterion("subject_areas not in", values, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasBetween(String value1, String value2) {
            addCriterion("subject_areas between", value1, value2, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andSubjectAreasNotBetween(String value1, String value2) {
            addCriterion("subject_areas not between", value1, value2, "subjectAreas");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIsNull() {
            addCriterion("publication_date is null");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIsNotNull() {
            addCriterion("publication_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationDateEqualTo(String value) {
            addCriterion("publication_date =", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotEqualTo(String value) {
            addCriterion("publication_date <>", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateGreaterThan(String value) {
            addCriterion("publication_date >", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateGreaterThanOrEqualTo(String value) {
            addCriterion("publication_date >=", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLessThan(String value) {
            addCriterion("publication_date <", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLessThanOrEqualTo(String value) {
            addCriterion("publication_date <=", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLike(String value) {
            addCriterion("publication_date like", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotLike(String value) {
            addCriterion("publication_date not like", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIn(List<String> values) {
            addCriterion("publication_date in", values, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotIn(List<String> values) {
            addCriterion("publication_date not in", values, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateBetween(String value1, String value2) {
            addCriterion("publication_date between", value1, value2, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotBetween(String value1, String value2) {
            addCriterion("publication_date not between", value1, value2, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationNameIsNull() {
            addCriterion("publication_name is null");
            return (Criteria) this;
        }

        public Criteria andPublicationNameIsNotNull() {
            addCriterion("publication_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationNameEqualTo(String value) {
            addCriterion("publication_name =", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameNotEqualTo(String value) {
            addCriterion("publication_name <>", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameGreaterThan(String value) {
            addCriterion("publication_name >", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameGreaterThanOrEqualTo(String value) {
            addCriterion("publication_name >=", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameLessThan(String value) {
            addCriterion("publication_name <", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameLessThanOrEqualTo(String value) {
            addCriterion("publication_name <=", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameLike(String value) {
            addCriterion("publication_name like", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameNotLike(String value) {
            addCriterion("publication_name not like", value, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameIn(List<String> values) {
            addCriterion("publication_name in", values, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameNotIn(List<String> values) {
            addCriterion("publication_name not in", values, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameBetween(String value1, String value2) {
            addCriterion("publication_name between", value1, value2, "publicationName");
            return (Criteria) this;
        }

        public Criteria andPublicationNameNotBetween(String value1, String value2) {
            addCriterion("publication_name not between", value1, value2, "publicationName");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNull() {
            addCriterion("numbers is null");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNotNull() {
            addCriterion("numbers is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersEqualTo(String value) {
            addCriterion("numbers =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(String value) {
            addCriterion("numbers <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(String value) {
            addCriterion("numbers >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(String value) {
            addCriterion("numbers >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(String value) {
            addCriterion("numbers <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(String value) {
            addCriterion("numbers <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLike(String value) {
            addCriterion("numbers like", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotLike(String value) {
            addCriterion("numbers not like", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<String> values) {
            addCriterion("numbers in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<String> values) {
            addCriterion("numbers not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(String value1, String value2) {
            addCriterion("numbers between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(String value1, String value2) {
            addCriterion("numbers not between", value1, value2, "numbers");
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

        public Criteria andTotalWordsIsNull() {
            addCriterion("total_words is null");
            return (Criteria) this;
        }

        public Criteria andTotalWordsIsNotNull() {
            addCriterion("total_words is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWordsEqualTo(Integer value) {
            addCriterion("total_words =", value, "totalWords");
            return (Criteria) this;
        }

        public Criteria andTotalWordsNotEqualTo(Integer value) {
            addCriterion("total_words <>", value, "totalWords");
            return (Criteria) this;
        }

        public Criteria andTotalWordsGreaterThan(Integer value) {
            addCriterion("total_words >", value, "totalWords");
            return (Criteria) this;
        }

        public Criteria andTotalWordsGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_words >=", value, "totalWords");
            return (Criteria) this;
        }

        public Criteria andTotalWordsLessThan(Integer value) {
            addCriterion("total_words <", value, "totalWords");
            return (Criteria) this;
        }

        public Criteria andTotalWordsLessThanOrEqualTo(Integer value) {
            addCriterion("total_words <=", value, "totalWords");
            return (Criteria) this;
        }

        public Criteria andTotalWordsIn(List<Integer> values) {
            addCriterion("total_words in", values, "totalWords");
            return (Criteria) this;
        }

        public Criteria andTotalWordsNotIn(List<Integer> values) {
            addCriterion("total_words not in", values, "totalWords");
            return (Criteria) this;
        }

        public Criteria andTotalWordsBetween(Integer value1, Integer value2) {
            addCriterion("total_words between", value1, value2, "totalWords");
            return (Criteria) this;
        }

        public Criteria andTotalWordsNotBetween(Integer value1, Integer value2) {
            addCriterion("total_words not between", value1, value2, "totalWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsIsNull() {
            addCriterion("self_words is null");
            return (Criteria) this;
        }

        public Criteria andSelfWordsIsNotNull() {
            addCriterion("self_words is not null");
            return (Criteria) this;
        }

        public Criteria andSelfWordsEqualTo(String value) {
            addCriterion("self_words =", value, "selfWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsNotEqualTo(String value) {
            addCriterion("self_words <>", value, "selfWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsGreaterThan(String value) {
            addCriterion("self_words >", value, "selfWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsGreaterThanOrEqualTo(String value) {
            addCriterion("self_words >=", value, "selfWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsLessThan(String value) {
            addCriterion("self_words <", value, "selfWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsLessThanOrEqualTo(String value) {
            addCriterion("self_words <=", value, "selfWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsLike(String value) {
            addCriterion("self_words like", value, "selfWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsNotLike(String value) {
            addCriterion("self_words not like", value, "selfWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsIn(List<String> values) {
            addCriterion("self_words in", values, "selfWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsNotIn(List<String> values) {
            addCriterion("self_words not in", values, "selfWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsBetween(String value1, String value2) {
            addCriterion("self_words between", value1, value2, "selfWords");
            return (Criteria) this;
        }

        public Criteria andSelfWordsNotBetween(String value1, String value2) {
            addCriterion("self_words not between", value1, value2, "selfWords");
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