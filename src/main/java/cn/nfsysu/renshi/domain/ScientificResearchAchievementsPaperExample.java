package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.List;

public class ScientificResearchAchievementsPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ScientificResearchAchievementsPaperExample() {
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

        public Criteria andPaperNameIsNull() {
            addCriterion("paper_name is null");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNotNull() {
            addCriterion("paper_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNameEqualTo(String value) {
            addCriterion("paper_name =", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotEqualTo(String value) {
            addCriterion("paper_name <>", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThan(String value) {
            addCriterion("paper_name >", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("paper_name >=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThan(String value) {
            addCriterion("paper_name <", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThanOrEqualTo(String value) {
            addCriterion("paper_name <=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLike(String value) {
            addCriterion("paper_name like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotLike(String value) {
            addCriterion("paper_name not like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameIn(List<String> values) {
            addCriterion("paper_name in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotIn(List<String> values) {
            addCriterion("paper_name not in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameBetween(String value1, String value2) {
            addCriterion("paper_name between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotBetween(String value1, String value2) {
            addCriterion("paper_name not between", value1, value2, "paperName");
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

        public Criteria andJournalNameIsNull() {
            addCriterion("journal_name is null");
            return (Criteria) this;
        }

        public Criteria andJournalNameIsNotNull() {
            addCriterion("journal_name is not null");
            return (Criteria) this;
        }

        public Criteria andJournalNameEqualTo(String value) {
            addCriterion("journal_name =", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameNotEqualTo(String value) {
            addCriterion("journal_name <>", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameGreaterThan(String value) {
            addCriterion("journal_name >", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameGreaterThanOrEqualTo(String value) {
            addCriterion("journal_name >=", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameLessThan(String value) {
            addCriterion("journal_name <", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameLessThanOrEqualTo(String value) {
            addCriterion("journal_name <=", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameLike(String value) {
            addCriterion("journal_name like", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameNotLike(String value) {
            addCriterion("journal_name not like", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameIn(List<String> values) {
            addCriterion("journal_name in", values, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameNotIn(List<String> values) {
            addCriterion("journal_name not in", values, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameBetween(String value1, String value2) {
            addCriterion("journal_name between", value1, value2, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameNotBetween(String value1, String value2) {
            addCriterion("journal_name not between", value1, value2, "journalName");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeIsNull() {
            addCriterion("published_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeIsNotNull() {
            addCriterion("published_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeEqualTo(String value) {
            addCriterion("published_time =", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeNotEqualTo(String value) {
            addCriterion("published_time <>", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeGreaterThan(String value) {
            addCriterion("published_time >", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("published_time >=", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeLessThan(String value) {
            addCriterion("published_time <", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeLessThanOrEqualTo(String value) {
            addCriterion("published_time <=", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeLike(String value) {
            addCriterion("published_time like", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeNotLike(String value) {
            addCriterion("published_time not like", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeIn(List<String> values) {
            addCriterion("published_time in", values, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeNotIn(List<String> values) {
            addCriterion("published_time not in", values, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeBetween(String value1, String value2) {
            addCriterion("published_time between", value1, value2, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeNotBetween(String value1, String value2) {
            addCriterion("published_time not between", value1, value2, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberIsNull() {
            addCriterion("volume_number is null");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberIsNotNull() {
            addCriterion("volume_number is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberEqualTo(Integer value) {
            addCriterion("volume_number =", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberNotEqualTo(Integer value) {
            addCriterion("volume_number <>", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberGreaterThan(Integer value) {
            addCriterion("volume_number >", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume_number >=", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberLessThan(Integer value) {
            addCriterion("volume_number <", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("volume_number <=", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberIn(List<Integer> values) {
            addCriterion("volume_number in", values, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberNotIn(List<Integer> values) {
            addCriterion("volume_number not in", values, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberBetween(Integer value1, Integer value2) {
            addCriterion("volume_number between", value1, value2, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("volume_number not between", value1, value2, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andIssueIsNull() {
            addCriterion("issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(String value) {
            addCriterion("issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(String value) {
            addCriterion("issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(String value) {
            addCriterion("issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(String value) {
            addCriterion("issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(String value) {
            addCriterion("issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(String value) {
            addCriterion("issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLike(String value) {
            addCriterion("issue like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotLike(String value) {
            addCriterion("issue not like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<String> values) {
            addCriterion("issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<String> values) {
            addCriterion("issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(String value1, String value2) {
            addCriterion("issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(String value1, String value2) {
            addCriterion("issue not between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberIsNull() {
            addCriterion("begin_page_number is null");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberIsNotNull() {
            addCriterion("begin_page_number is not null");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberEqualTo(Integer value) {
            addCriterion("begin_page_number =", value, "beginPageNumber");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberNotEqualTo(Integer value) {
            addCriterion("begin_page_number <>", value, "beginPageNumber");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberGreaterThan(Integer value) {
            addCriterion("begin_page_number >", value, "beginPageNumber");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("begin_page_number >=", value, "beginPageNumber");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberLessThan(Integer value) {
            addCriterion("begin_page_number <", value, "beginPageNumber");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberLessThanOrEqualTo(Integer value) {
            addCriterion("begin_page_number <=", value, "beginPageNumber");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberIn(List<Integer> values) {
            addCriterion("begin_page_number in", values, "beginPageNumber");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberNotIn(List<Integer> values) {
            addCriterion("begin_page_number not in", values, "beginPageNumber");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberBetween(Integer value1, Integer value2) {
            addCriterion("begin_page_number between", value1, value2, "beginPageNumber");
            return (Criteria) this;
        }

        public Criteria andBeginPageNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("begin_page_number not between", value1, value2, "beginPageNumber");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberIsNull() {
            addCriterion("end_page_number is null");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberIsNotNull() {
            addCriterion("end_page_number is not null");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberEqualTo(Integer value) {
            addCriterion("end_page_number =", value, "endPageNumber");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberNotEqualTo(Integer value) {
            addCriterion("end_page_number <>", value, "endPageNumber");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberGreaterThan(Integer value) {
            addCriterion("end_page_number >", value, "endPageNumber");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_page_number >=", value, "endPageNumber");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberLessThan(Integer value) {
            addCriterion("end_page_number <", value, "endPageNumber");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberLessThanOrEqualTo(Integer value) {
            addCriterion("end_page_number <=", value, "endPageNumber");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberIn(List<Integer> values) {
            addCriterion("end_page_number in", values, "endPageNumber");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberNotIn(List<Integer> values) {
            addCriterion("end_page_number not in", values, "endPageNumber");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberBetween(Integer value1, Integer value2) {
            addCriterion("end_page_number between", value1, value2, "endPageNumber");
            return (Criteria) this;
        }

        public Criteria andEndPageNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("end_page_number not between", value1, value2, "endPageNumber");
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

        public Criteria andIncludedStateIsNull() {
            addCriterion("included_state is null");
            return (Criteria) this;
        }

        public Criteria andIncludedStateIsNotNull() {
            addCriterion("included_state is not null");
            return (Criteria) this;
        }

        public Criteria andIncludedStateEqualTo(String value) {
            addCriterion("included_state =", value, "includedState");
            return (Criteria) this;
        }

        public Criteria andIncludedStateNotEqualTo(String value) {
            addCriterion("included_state <>", value, "includedState");
            return (Criteria) this;
        }

        public Criteria andIncludedStateGreaterThan(String value) {
            addCriterion("included_state >", value, "includedState");
            return (Criteria) this;
        }

        public Criteria andIncludedStateGreaterThanOrEqualTo(String value) {
            addCriterion("included_state >=", value, "includedState");
            return (Criteria) this;
        }

        public Criteria andIncludedStateLessThan(String value) {
            addCriterion("included_state <", value, "includedState");
            return (Criteria) this;
        }

        public Criteria andIncludedStateLessThanOrEqualTo(String value) {
            addCriterion("included_state <=", value, "includedState");
            return (Criteria) this;
        }

        public Criteria andIncludedStateLike(String value) {
            addCriterion("included_state like", value, "includedState");
            return (Criteria) this;
        }

        public Criteria andIncludedStateNotLike(String value) {
            addCriterion("included_state not like", value, "includedState");
            return (Criteria) this;
        }

        public Criteria andIncludedStateIn(List<String> values) {
            addCriterion("included_state in", values, "includedState");
            return (Criteria) this;
        }

        public Criteria andIncludedStateNotIn(List<String> values) {
            addCriterion("included_state not in", values, "includedState");
            return (Criteria) this;
        }

        public Criteria andIncludedStateBetween(String value1, String value2) {
            addCriterion("included_state between", value1, value2, "includedState");
            return (Criteria) this;
        }

        public Criteria andIncludedStateNotBetween(String value1, String value2) {
            addCriterion("included_state not between", value1, value2, "includedState");
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