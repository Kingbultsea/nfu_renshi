package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.List;

public class ScientificResearchAchievementsProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ScientificResearchAchievementsProjectExample() {
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

        public Criteria andApproveNumberIsNull() {
            addCriterion("approve_number is null");
            return (Criteria) this;
        }

        public Criteria andApproveNumberIsNotNull() {
            addCriterion("approve_number is not null");
            return (Criteria) this;
        }

        public Criteria andApproveNumberEqualTo(String value) {
            addCriterion("approve_number =", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberNotEqualTo(String value) {
            addCriterion("approve_number <>", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberGreaterThan(String value) {
            addCriterion("approve_number >", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberGreaterThanOrEqualTo(String value) {
            addCriterion("approve_number >=", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberLessThan(String value) {
            addCriterion("approve_number <", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberLessThanOrEqualTo(String value) {
            addCriterion("approve_number <=", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberLike(String value) {
            addCriterion("approve_number like", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberNotLike(String value) {
            addCriterion("approve_number not like", value, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberIn(List<String> values) {
            addCriterion("approve_number in", values, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberNotIn(List<String> values) {
            addCriterion("approve_number not in", values, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberBetween(String value1, String value2) {
            addCriterion("approve_number between", value1, value2, "approveNumber");
            return (Criteria) this;
        }

        public Criteria andApproveNumberNotBetween(String value1, String value2) {
            addCriterion("approve_number not between", value1, value2, "approveNumber");
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

        public Criteria andFundingIsNull() {
            addCriterion("funding is null");
            return (Criteria) this;
        }

        public Criteria andFundingIsNotNull() {
            addCriterion("funding is not null");
            return (Criteria) this;
        }

        public Criteria andFundingEqualTo(Integer value) {
            addCriterion("funding =", value, "funding");
            return (Criteria) this;
        }

        public Criteria andFundingNotEqualTo(Integer value) {
            addCriterion("funding <>", value, "funding");
            return (Criteria) this;
        }

        public Criteria andFundingGreaterThan(Integer value) {
            addCriterion("funding >", value, "funding");
            return (Criteria) this;
        }

        public Criteria andFundingGreaterThanOrEqualTo(Integer value) {
            addCriterion("funding >=", value, "funding");
            return (Criteria) this;
        }

        public Criteria andFundingLessThan(Integer value) {
            addCriterion("funding <", value, "funding");
            return (Criteria) this;
        }

        public Criteria andFundingLessThanOrEqualTo(Integer value) {
            addCriterion("funding <=", value, "funding");
            return (Criteria) this;
        }

        public Criteria andFundingIn(List<Integer> values) {
            addCriterion("funding in", values, "funding");
            return (Criteria) this;
        }

        public Criteria andFundingNotIn(List<Integer> values) {
            addCriterion("funding not in", values, "funding");
            return (Criteria) this;
        }

        public Criteria andFundingBetween(Integer value1, Integer value2) {
            addCriterion("funding between", value1, value2, "funding");
            return (Criteria) this;
        }

        public Criteria andFundingNotBetween(Integer value1, Integer value2) {
            addCriterion("funding not between", value1, value2, "funding");
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

        public Criteria andSelfRankIsNull() {
            addCriterion("self_rank is null");
            return (Criteria) this;
        }

        public Criteria andSelfRankIsNotNull() {
            addCriterion("self_rank is not null");
            return (Criteria) this;
        }

        public Criteria andSelfRankEqualTo(String value) {
            addCriterion("self_rank =", value, "selfRank");
            return (Criteria) this;
        }

        public Criteria andSelfRankNotEqualTo(String value) {
            addCriterion("self_rank <>", value, "selfRank");
            return (Criteria) this;
        }

        public Criteria andSelfRankGreaterThan(String value) {
            addCriterion("self_rank >", value, "selfRank");
            return (Criteria) this;
        }

        public Criteria andSelfRankGreaterThanOrEqualTo(String value) {
            addCriterion("self_rank >=", value, "selfRank");
            return (Criteria) this;
        }

        public Criteria andSelfRankLessThan(String value) {
            addCriterion("self_rank <", value, "selfRank");
            return (Criteria) this;
        }

        public Criteria andSelfRankLessThanOrEqualTo(String value) {
            addCriterion("self_rank <=", value, "selfRank");
            return (Criteria) this;
        }

        public Criteria andSelfRankLike(String value) {
            addCriterion("self_rank like", value, "selfRank");
            return (Criteria) this;
        }

        public Criteria andSelfRankNotLike(String value) {
            addCriterion("self_rank not like", value, "selfRank");
            return (Criteria) this;
        }

        public Criteria andSelfRankIn(List<String> values) {
            addCriterion("self_rank in", values, "selfRank");
            return (Criteria) this;
        }

        public Criteria andSelfRankNotIn(List<String> values) {
            addCriterion("self_rank not in", values, "selfRank");
            return (Criteria) this;
        }

        public Criteria andSelfRankBetween(String value1, String value2) {
            addCriterion("self_rank between", value1, value2, "selfRank");
            return (Criteria) this;
        }

        public Criteria andSelfRankNotBetween(String value1, String value2) {
            addCriterion("self_rank not between", value1, value2, "selfRank");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitIsNull() {
            addCriterion("authorized_unit is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitIsNotNull() {
            addCriterion("authorized_unit is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitEqualTo(String value) {
            addCriterion("authorized_unit =", value, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitNotEqualTo(String value) {
            addCriterion("authorized_unit <>", value, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitGreaterThan(String value) {
            addCriterion("authorized_unit >", value, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitGreaterThanOrEqualTo(String value) {
            addCriterion("authorized_unit >=", value, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitLessThan(String value) {
            addCriterion("authorized_unit <", value, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitLessThanOrEqualTo(String value) {
            addCriterion("authorized_unit <=", value, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitLike(String value) {
            addCriterion("authorized_unit like", value, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitNotLike(String value) {
            addCriterion("authorized_unit not like", value, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitIn(List<String> values) {
            addCriterion("authorized_unit in", values, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitNotIn(List<String> values) {
            addCriterion("authorized_unit not in", values, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitBetween(String value1, String value2) {
            addCriterion("authorized_unit between", value1, value2, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizedUnitNotBetween(String value1, String value2) {
            addCriterion("authorized_unit not between", value1, value2, "authorizedUnit");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIsNull() {
            addCriterion("project_source is null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIsNotNull() {
            addCriterion("project_source is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceEqualTo(String value) {
            addCriterion("project_source =", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNotEqualTo(String value) {
            addCriterion("project_source <>", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceGreaterThan(String value) {
            addCriterion("project_source >", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceGreaterThanOrEqualTo(String value) {
            addCriterion("project_source >=", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceLessThan(String value) {
            addCriterion("project_source <", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceLessThanOrEqualTo(String value) {
            addCriterion("project_source <=", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceLike(String value) {
            addCriterion("project_source like", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNotLike(String value) {
            addCriterion("project_source not like", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIn(List<String> values) {
            addCriterion("project_source in", values, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNotIn(List<String> values) {
            addCriterion("project_source not in", values, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceBetween(String value1, String value2) {
            addCriterion("project_source between", value1, value2, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNotBetween(String value1, String value2) {
            addCriterion("project_source not between", value1, value2, "projectSource");
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