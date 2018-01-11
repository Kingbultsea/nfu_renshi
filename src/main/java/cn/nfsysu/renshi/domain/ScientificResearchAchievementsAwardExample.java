package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.List;

public class ScientificResearchAchievementsAwardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ScientificResearchAchievementsAwardExample() {
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

        public Criteria andDateOfAwardIsNull() {
            addCriterion("date_of_award is null");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardIsNotNull() {
            addCriterion("date_of_award is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardEqualTo(String value) {
            addCriterion("date_of_award =", value, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardNotEqualTo(String value) {
            addCriterion("date_of_award <>", value, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardGreaterThan(String value) {
            addCriterion("date_of_award >", value, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardGreaterThanOrEqualTo(String value) {
            addCriterion("date_of_award >=", value, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardLessThan(String value) {
            addCriterion("date_of_award <", value, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardLessThanOrEqualTo(String value) {
            addCriterion("date_of_award <=", value, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardLike(String value) {
            addCriterion("date_of_award like", value, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardNotLike(String value) {
            addCriterion("date_of_award not like", value, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardIn(List<String> values) {
            addCriterion("date_of_award in", values, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardNotIn(List<String> values) {
            addCriterion("date_of_award not in", values, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardBetween(String value1, String value2) {
            addCriterion("date_of_award between", value1, value2, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andDateOfAwardNotBetween(String value1, String value2) {
            addCriterion("date_of_award not between", value1, value2, "dateOfAward");
            return (Criteria) this;
        }

        public Criteria andAwardNameIsNull() {
            addCriterion("award_name is null");
            return (Criteria) this;
        }

        public Criteria andAwardNameIsNotNull() {
            addCriterion("award_name is not null");
            return (Criteria) this;
        }

        public Criteria andAwardNameEqualTo(String value) {
            addCriterion("award_name =", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotEqualTo(String value) {
            addCriterion("award_name <>", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameGreaterThan(String value) {
            addCriterion("award_name >", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameGreaterThanOrEqualTo(String value) {
            addCriterion("award_name >=", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLessThan(String value) {
            addCriterion("award_name <", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLessThanOrEqualTo(String value) {
            addCriterion("award_name <=", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLike(String value) {
            addCriterion("award_name like", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotLike(String value) {
            addCriterion("award_name not like", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameIn(List<String> values) {
            addCriterion("award_name in", values, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotIn(List<String> values) {
            addCriterion("award_name not in", values, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameBetween(String value1, String value2) {
            addCriterion("award_name between", value1, value2, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotBetween(String value1, String value2) {
            addCriterion("award_name not between", value1, value2, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIsNull() {
            addCriterion("award_level is null");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIsNotNull() {
            addCriterion("award_level is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLevelEqualTo(String value) {
            addCriterion("award_level =", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotEqualTo(String value) {
            addCriterion("award_level <>", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelGreaterThan(String value) {
            addCriterion("award_level >", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelGreaterThanOrEqualTo(String value) {
            addCriterion("award_level >=", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLessThan(String value) {
            addCriterion("award_level <", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLessThanOrEqualTo(String value) {
            addCriterion("award_level <=", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLike(String value) {
            addCriterion("award_level like", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotLike(String value) {
            addCriterion("award_level not like", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIn(List<String> values) {
            addCriterion("award_level in", values, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotIn(List<String> values) {
            addCriterion("award_level not in", values, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelBetween(String value1, String value2) {
            addCriterion("award_level between", value1, value2, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotBetween(String value1, String value2) {
            addCriterion("award_level not between", value1, value2, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelIsNull() {
            addCriterion("other_level is null");
            return (Criteria) this;
        }

        public Criteria andOtherLevelIsNotNull() {
            addCriterion("other_level is not null");
            return (Criteria) this;
        }

        public Criteria andOtherLevelEqualTo(String value) {
            addCriterion("other_level =", value, "otherLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelNotEqualTo(String value) {
            addCriterion("other_level <>", value, "otherLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelGreaterThan(String value) {
            addCriterion("other_level >", value, "otherLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelGreaterThanOrEqualTo(String value) {
            addCriterion("other_level >=", value, "otherLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelLessThan(String value) {
            addCriterion("other_level <", value, "otherLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelLessThanOrEqualTo(String value) {
            addCriterion("other_level <=", value, "otherLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelLike(String value) {
            addCriterion("other_level like", value, "otherLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelNotLike(String value) {
            addCriterion("other_level not like", value, "otherLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelIn(List<String> values) {
            addCriterion("other_level in", values, "otherLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelNotIn(List<String> values) {
            addCriterion("other_level not in", values, "otherLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelBetween(String value1, String value2) {
            addCriterion("other_level between", value1, value2, "otherLevel");
            return (Criteria) this;
        }

        public Criteria andOtherLevelNotBetween(String value1, String value2) {
            addCriterion("other_level not between", value1, value2, "otherLevel");
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

        public Criteria andStateOfPrizesIsNull() {
            addCriterion("state_of_prizes is null");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesIsNotNull() {
            addCriterion("state_of_prizes is not null");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesEqualTo(String value) {
            addCriterion("state_of_prizes =", value, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesNotEqualTo(String value) {
            addCriterion("state_of_prizes <>", value, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesGreaterThan(String value) {
            addCriterion("state_of_prizes >", value, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesGreaterThanOrEqualTo(String value) {
            addCriterion("state_of_prizes >=", value, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesLessThan(String value) {
            addCriterion("state_of_prizes <", value, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesLessThanOrEqualTo(String value) {
            addCriterion("state_of_prizes <=", value, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesLike(String value) {
            addCriterion("state_of_prizes like", value, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesNotLike(String value) {
            addCriterion("state_of_prizes not like", value, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesIn(List<String> values) {
            addCriterion("state_of_prizes in", values, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesNotIn(List<String> values) {
            addCriterion("state_of_prizes not in", values, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesBetween(String value1, String value2) {
            addCriterion("state_of_prizes between", value1, value2, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andStateOfPrizesNotBetween(String value1, String value2) {
            addCriterion("state_of_prizes not between", value1, value2, "stateOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesIsNull() {
            addCriterion("unit_of_prizes is null");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesIsNotNull() {
            addCriterion("unit_of_prizes is not null");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesEqualTo(String value) {
            addCriterion("unit_of_prizes =", value, "unitOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesNotEqualTo(String value) {
            addCriterion("unit_of_prizes <>", value, "unitOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesGreaterThan(String value) {
            addCriterion("unit_of_prizes >", value, "unitOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesGreaterThanOrEqualTo(String value) {
            addCriterion("unit_of_prizes >=", value, "unitOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesLessThan(String value) {
            addCriterion("unit_of_prizes <", value, "unitOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesLessThanOrEqualTo(String value) {
            addCriterion("unit_of_prizes <=", value, "unitOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesLike(String value) {
            addCriterion("unit_of_prizes like", value, "unitOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesNotLike(String value) {
            addCriterion("unit_of_prizes not like", value, "unitOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesIn(List<String> values) {
            addCriterion("unit_of_prizes in", values, "unitOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesNotIn(List<String> values) {
            addCriterion("unit_of_prizes not in", values, "unitOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesBetween(String value1, String value2) {
            addCriterion("unit_of_prizes between", value1, value2, "unitOfPrizes");
            return (Criteria) this;
        }

        public Criteria andUnitOfPrizesNotBetween(String value1, String value2) {
            addCriterion("unit_of_prizes not between", value1, value2, "unitOfPrizes");
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