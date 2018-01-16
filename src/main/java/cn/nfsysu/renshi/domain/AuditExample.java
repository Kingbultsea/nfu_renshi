package cn.nfsysu.renshi.domain;

import java.util.ArrayList;
import java.util.List;

public class AuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AuditExample() {
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

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingIsNull() {
            addCriterion("domestic_training is null");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingIsNotNull() {
            addCriterion("domestic_training is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingEqualTo(String value) {
            addCriterion("domestic_training =", value, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingNotEqualTo(String value) {
            addCriterion("domestic_training <>", value, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingGreaterThan(String value) {
            addCriterion("domestic_training >", value, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingGreaterThanOrEqualTo(String value) {
            addCriterion("domestic_training >=", value, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingLessThan(String value) {
            addCriterion("domestic_training <", value, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingLessThanOrEqualTo(String value) {
            addCriterion("domestic_training <=", value, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingLike(String value) {
            addCriterion("domestic_training like", value, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingNotLike(String value) {
            addCriterion("domestic_training not like", value, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingIn(List<String> values) {
            addCriterion("domestic_training in", values, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingNotIn(List<String> values) {
            addCriterion("domestic_training not in", values, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingBetween(String value1, String value2) {
            addCriterion("domestic_training between", value1, value2, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andDomesticTrainingNotBetween(String value1, String value2) {
            addCriterion("domestic_training not between", value1, value2, "domesticTraining");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillIsNull() {
            addCriterion("language_skill is null");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillIsNotNull() {
            addCriterion("language_skill is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillEqualTo(String value) {
            addCriterion("language_skill =", value, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillNotEqualTo(String value) {
            addCriterion("language_skill <>", value, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillGreaterThan(String value) {
            addCriterion("language_skill >", value, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillGreaterThanOrEqualTo(String value) {
            addCriterion("language_skill >=", value, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillLessThan(String value) {
            addCriterion("language_skill <", value, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillLessThanOrEqualTo(String value) {
            addCriterion("language_skill <=", value, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillLike(String value) {
            addCriterion("language_skill like", value, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillNotLike(String value) {
            addCriterion("language_skill not like", value, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillIn(List<String> values) {
            addCriterion("language_skill in", values, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillNotIn(List<String> values) {
            addCriterion("language_skill not in", values, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillBetween(String value1, String value2) {
            addCriterion("language_skill between", value1, value2, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillNotBetween(String value1, String value2) {
            addCriterion("language_skill not between", value1, value2, "languageSkill");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceIsNull() {
            addCriterion("learning_experience is null");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceIsNotNull() {
            addCriterion("learning_experience is not null");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceEqualTo(String value) {
            addCriterion("learning_experience =", value, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceNotEqualTo(String value) {
            addCriterion("learning_experience <>", value, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceGreaterThan(String value) {
            addCriterion("learning_experience >", value, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("learning_experience >=", value, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceLessThan(String value) {
            addCriterion("learning_experience <", value, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceLessThanOrEqualTo(String value) {
            addCriterion("learning_experience <=", value, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceLike(String value) {
            addCriterion("learning_experience like", value, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceNotLike(String value) {
            addCriterion("learning_experience not like", value, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceIn(List<String> values) {
            addCriterion("learning_experience in", values, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceNotIn(List<String> values) {
            addCriterion("learning_experience not in", values, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceBetween(String value1, String value2) {
            addCriterion("learning_experience between", value1, value2, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andLearningExperienceNotBetween(String value1, String value2) {
            addCriterion("learning_experience not between", value1, value2, "learningExperience");
            return (Criteria) this;
        }

        public Criteria andOtherSkillIsNull() {
            addCriterion("other_skill is null");
            return (Criteria) this;
        }

        public Criteria andOtherSkillIsNotNull() {
            addCriterion("other_skill is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSkillEqualTo(String value) {
            addCriterion("other_skill =", value, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOtherSkillNotEqualTo(String value) {
            addCriterion("other_skill <>", value, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOtherSkillGreaterThan(String value) {
            addCriterion("other_skill >", value, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOtherSkillGreaterThanOrEqualTo(String value) {
            addCriterion("other_skill >=", value, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOtherSkillLessThan(String value) {
            addCriterion("other_skill <", value, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOtherSkillLessThanOrEqualTo(String value) {
            addCriterion("other_skill <=", value, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOtherSkillLike(String value) {
            addCriterion("other_skill like", value, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOtherSkillNotLike(String value) {
            addCriterion("other_skill not like", value, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOtherSkillIn(List<String> values) {
            addCriterion("other_skill in", values, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOtherSkillNotIn(List<String> values) {
            addCriterion("other_skill not in", values, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOtherSkillBetween(String value1, String value2) {
            addCriterion("other_skill between", value1, value2, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOtherSkillNotBetween(String value1, String value2) {
            addCriterion("other_skill not between", value1, value2, "otherSkill");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingIsNull() {
            addCriterion("overseas_training is null");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingIsNotNull() {
            addCriterion("overseas_training is not null");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingEqualTo(String value) {
            addCriterion("overseas_training =", value, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingNotEqualTo(String value) {
            addCriterion("overseas_training <>", value, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingGreaterThan(String value) {
            addCriterion("overseas_training >", value, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingGreaterThanOrEqualTo(String value) {
            addCriterion("overseas_training >=", value, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingLessThan(String value) {
            addCriterion("overseas_training <", value, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingLessThanOrEqualTo(String value) {
            addCriterion("overseas_training <=", value, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingLike(String value) {
            addCriterion("overseas_training like", value, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingNotLike(String value) {
            addCriterion("overseas_training not like", value, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingIn(List<String> values) {
            addCriterion("overseas_training in", values, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingNotIn(List<String> values) {
            addCriterion("overseas_training not in", values, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingBetween(String value1, String value2) {
            addCriterion("overseas_training between", value1, value2, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingNotBetween(String value1, String value2) {
            addCriterion("overseas_training not between", value1, value2, "overseasTraining");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesIsNull() {
            addCriterion("professional_duties is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesIsNotNull() {
            addCriterion("professional_duties is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesEqualTo(String value) {
            addCriterion("professional_duties =", value, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesNotEqualTo(String value) {
            addCriterion("professional_duties <>", value, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesGreaterThan(String value) {
            addCriterion("professional_duties >", value, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("professional_duties >=", value, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesLessThan(String value) {
            addCriterion("professional_duties <", value, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesLessThanOrEqualTo(String value) {
            addCriterion("professional_duties <=", value, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesLike(String value) {
            addCriterion("professional_duties like", value, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesNotLike(String value) {
            addCriterion("professional_duties not like", value, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesIn(List<String> values) {
            addCriterion("professional_duties in", values, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesNotIn(List<String> values) {
            addCriterion("professional_duties not in", values, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesBetween(String value1, String value2) {
            addCriterion("professional_duties between", value1, value2, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andProfessionalDutiesNotBetween(String value1, String value2) {
            addCriterion("professional_duties not between", value1, value2, "professionalDuties");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtIsNull() {
            addCriterion("scientific_research_achievements_art is null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtIsNotNull() {
            addCriterion("scientific_research_achievements_art is not null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtEqualTo(String value) {
            addCriterion("scientific_research_achievements_art =", value, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtNotEqualTo(String value) {
            addCriterion("scientific_research_achievements_art <>", value, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtGreaterThan(String value) {
            addCriterion("scientific_research_achievements_art >", value, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtGreaterThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_art >=", value, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtLessThan(String value) {
            addCriterion("scientific_research_achievements_art <", value, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtLessThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_art <=", value, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtLike(String value) {
            addCriterion("scientific_research_achievements_art like", value, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtNotLike(String value) {
            addCriterion("scientific_research_achievements_art not like", value, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtIn(List<String> values) {
            addCriterion("scientific_research_achievements_art in", values, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtNotIn(List<String> values) {
            addCriterion("scientific_research_achievements_art not in", values, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_art between", value1, value2, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsArtNotBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_art not between", value1, value2, "scientificResearchAchievementsArt");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardIsNull() {
            addCriterion("scientific_research_achievements_award is null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardIsNotNull() {
            addCriterion("scientific_research_achievements_award is not null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardEqualTo(String value) {
            addCriterion("scientific_research_achievements_award =", value, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardNotEqualTo(String value) {
            addCriterion("scientific_research_achievements_award <>", value, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardGreaterThan(String value) {
            addCriterion("scientific_research_achievements_award >", value, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardGreaterThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_award >=", value, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardLessThan(String value) {
            addCriterion("scientific_research_achievements_award <", value, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardLessThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_award <=", value, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardLike(String value) {
            addCriterion("scientific_research_achievements_award like", value, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardNotLike(String value) {
            addCriterion("scientific_research_achievements_award not like", value, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardIn(List<String> values) {
            addCriterion("scientific_research_achievements_award in", values, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardNotIn(List<String> values) {
            addCriterion("scientific_research_achievements_award not in", values, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_award between", value1, value2, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsAwardNotBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_award not between", value1, value2, "scientificResearchAchievementsAward");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineIsNull() {
            addCriterion("scientific_research_achievements_medicine is null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineIsNotNull() {
            addCriterion("scientific_research_achievements_medicine is not null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineEqualTo(String value) {
            addCriterion("scientific_research_achievements_medicine =", value, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineNotEqualTo(String value) {
            addCriterion("scientific_research_achievements_medicine <>", value, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineGreaterThan(String value) {
            addCriterion("scientific_research_achievements_medicine >", value, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineGreaterThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_medicine >=", value, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineLessThan(String value) {
            addCriterion("scientific_research_achievements_medicine <", value, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineLessThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_medicine <=", value, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineLike(String value) {
            addCriterion("scientific_research_achievements_medicine like", value, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineNotLike(String value) {
            addCriterion("scientific_research_achievements_medicine not like", value, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineIn(List<String> values) {
            addCriterion("scientific_research_achievements_medicine in", values, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineNotIn(List<String> values) {
            addCriterion("scientific_research_achievements_medicine not in", values, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_medicine between", value1, value2, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsMedicineNotBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_medicine not between", value1, value2, "scientificResearchAchievementsMedicine");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperIsNull() {
            addCriterion("scientific_research_achievements_paper is null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperIsNotNull() {
            addCriterion("scientific_research_achievements_paper is not null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperEqualTo(String value) {
            addCriterion("scientific_research_achievements_paper =", value, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperNotEqualTo(String value) {
            addCriterion("scientific_research_achievements_paper <>", value, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperGreaterThan(String value) {
            addCriterion("scientific_research_achievements_paper >", value, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperGreaterThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_paper >=", value, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperLessThan(String value) {
            addCriterion("scientific_research_achievements_paper <", value, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperLessThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_paper <=", value, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperLike(String value) {
            addCriterion("scientific_research_achievements_paper like", value, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperNotLike(String value) {
            addCriterion("scientific_research_achievements_paper not like", value, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperIn(List<String> values) {
            addCriterion("scientific_research_achievements_paper in", values, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperNotIn(List<String> values) {
            addCriterion("scientific_research_achievements_paper not in", values, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_paper between", value1, value2, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPaperNotBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_paper not between", value1, value2, "scientificResearchAchievementsPaper");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentIsNull() {
            addCriterion("scientific_research_achievements_patent is null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentIsNotNull() {
            addCriterion("scientific_research_achievements_patent is not null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentEqualTo(String value) {
            addCriterion("scientific_research_achievements_patent =", value, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentNotEqualTo(String value) {
            addCriterion("scientific_research_achievements_patent <>", value, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentGreaterThan(String value) {
            addCriterion("scientific_research_achievements_patent >", value, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentGreaterThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_patent >=", value, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentLessThan(String value) {
            addCriterion("scientific_research_achievements_patent <", value, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentLessThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_patent <=", value, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentLike(String value) {
            addCriterion("scientific_research_achievements_patent like", value, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentNotLike(String value) {
            addCriterion("scientific_research_achievements_patent not like", value, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentIn(List<String> values) {
            addCriterion("scientific_research_achievements_patent in", values, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentNotIn(List<String> values) {
            addCriterion("scientific_research_achievements_patent not in", values, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_patent between", value1, value2, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsPatentNotBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_patent not between", value1, value2, "scientificResearchAchievementsPatent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectIsNull() {
            addCriterion("scientific_research_achievements_project is null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectIsNotNull() {
            addCriterion("scientific_research_achievements_project is not null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectEqualTo(String value) {
            addCriterion("scientific_research_achievements_project =", value, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectNotEqualTo(String value) {
            addCriterion("scientific_research_achievements_project <>", value, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectGreaterThan(String value) {
            addCriterion("scientific_research_achievements_project >", value, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectGreaterThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_project >=", value, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectLessThan(String value) {
            addCriterion("scientific_research_achievements_project <", value, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectLessThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_project <=", value, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectLike(String value) {
            addCriterion("scientific_research_achievements_project like", value, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectNotLike(String value) {
            addCriterion("scientific_research_achievements_project not like", value, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectIn(List<String> values) {
            addCriterion("scientific_research_achievements_project in", values, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectNotIn(List<String> values) {
            addCriterion("scientific_research_achievements_project not in", values, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_project between", value1, value2, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsProjectNotBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_project not between", value1, value2, "scientificResearchAchievementsProject");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardIsNull() {
            addCriterion("scientific_research_achievements_standard is null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardIsNotNull() {
            addCriterion("scientific_research_achievements_standard is not null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardEqualTo(String value) {
            addCriterion("scientific_research_achievements_standard =", value, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardNotEqualTo(String value) {
            addCriterion("scientific_research_achievements_standard <>", value, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardGreaterThan(String value) {
            addCriterion("scientific_research_achievements_standard >", value, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardGreaterThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_standard >=", value, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardLessThan(String value) {
            addCriterion("scientific_research_achievements_standard <", value, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardLessThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_standard <=", value, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardLike(String value) {
            addCriterion("scientific_research_achievements_standard like", value, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardNotLike(String value) {
            addCriterion("scientific_research_achievements_standard not like", value, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardIn(List<String> values) {
            addCriterion("scientific_research_achievements_standard in", values, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardNotIn(List<String> values) {
            addCriterion("scientific_research_achievements_standard not in", values, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_standard between", value1, value2, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStandardNotBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_standard not between", value1, value2, "scientificResearchAchievementsStandard");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentIsNull() {
            addCriterion("scientific_research_achievements_student is null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentIsNotNull() {
            addCriterion("scientific_research_achievements_student is not null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentEqualTo(String value) {
            addCriterion("scientific_research_achievements_student =", value, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentNotEqualTo(String value) {
            addCriterion("scientific_research_achievements_student <>", value, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentGreaterThan(String value) {
            addCriterion("scientific_research_achievements_student >", value, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentGreaterThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_student >=", value, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentLessThan(String value) {
            addCriterion("scientific_research_achievements_student <", value, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentLessThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_student <=", value, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentLike(String value) {
            addCriterion("scientific_research_achievements_student like", value, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentNotLike(String value) {
            addCriterion("scientific_research_achievements_student not like", value, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentIn(List<String> values) {
            addCriterion("scientific_research_achievements_student in", values, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentNotIn(List<String> values) {
            addCriterion("scientific_research_achievements_student not in", values, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_student between", value1, value2, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudentNotBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_student not between", value1, value2, "scientificResearchAchievementsStudent");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyIsNull() {
            addCriterion("scientific_research_achievements_study is null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyIsNotNull() {
            addCriterion("scientific_research_achievements_study is not null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyEqualTo(String value) {
            addCriterion("scientific_research_achievements_study =", value, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyNotEqualTo(String value) {
            addCriterion("scientific_research_achievements_study <>", value, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyGreaterThan(String value) {
            addCriterion("scientific_research_achievements_study >", value, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyGreaterThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_study >=", value, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyLessThan(String value) {
            addCriterion("scientific_research_achievements_study <", value, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyLessThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_study <=", value, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyLike(String value) {
            addCriterion("scientific_research_achievements_study like", value, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyNotLike(String value) {
            addCriterion("scientific_research_achievements_study not like", value, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyIn(List<String> values) {
            addCriterion("scientific_research_achievements_study in", values, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyNotIn(List<String> values) {
            addCriterion("scientific_research_achievements_study not in", values, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_study between", value1, value2, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsStudyNotBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_study not between", value1, value2, "scientificResearchAchievementsStudy");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsIsNull() {
            addCriterion("scientific_research_achievements_writings is null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsIsNotNull() {
            addCriterion("scientific_research_achievements_writings is not null");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsEqualTo(String value) {
            addCriterion("scientific_research_achievements_writings =", value, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsNotEqualTo(String value) {
            addCriterion("scientific_research_achievements_writings <>", value, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsGreaterThan(String value) {
            addCriterion("scientific_research_achievements_writings >", value, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsGreaterThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_writings >=", value, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsLessThan(String value) {
            addCriterion("scientific_research_achievements_writings <", value, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsLessThanOrEqualTo(String value) {
            addCriterion("scientific_research_achievements_writings <=", value, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsLike(String value) {
            addCriterion("scientific_research_achievements_writings like", value, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsNotLike(String value) {
            addCriterion("scientific_research_achievements_writings not like", value, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsIn(List<String> values) {
            addCriterion("scientific_research_achievements_writings in", values, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsNotIn(List<String> values) {
            addCriterion("scientific_research_achievements_writings not in", values, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_writings between", value1, value2, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andScientificResearchAchievementsWritingsNotBetween(String value1, String value2) {
            addCriterion("scientific_research_achievements_writings not between", value1, value2, "scientificResearchAchievementsWritings");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateIsNull() {
            addCriterion("skill_certificate is null");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateIsNotNull() {
            addCriterion("skill_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateEqualTo(String value) {
            addCriterion("skill_certificate =", value, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateNotEqualTo(String value) {
            addCriterion("skill_certificate <>", value, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateGreaterThan(String value) {
            addCriterion("skill_certificate >", value, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("skill_certificate >=", value, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateLessThan(String value) {
            addCriterion("skill_certificate <", value, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateLessThanOrEqualTo(String value) {
            addCriterion("skill_certificate <=", value, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateLike(String value) {
            addCriterion("skill_certificate like", value, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateNotLike(String value) {
            addCriterion("skill_certificate not like", value, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateIn(List<String> values) {
            addCriterion("skill_certificate in", values, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateNotIn(List<String> values) {
            addCriterion("skill_certificate not in", values, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateBetween(String value1, String value2) {
            addCriterion("skill_certificate between", value1, value2, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andSkillCertificateNotBetween(String value1, String value2) {
            addCriterion("skill_certificate not between", value1, value2, "skillCertificate");
            return (Criteria) this;
        }

        public Criteria andTalentProjectIsNull() {
            addCriterion("talent_project is null");
            return (Criteria) this;
        }

        public Criteria andTalentProjectIsNotNull() {
            addCriterion("talent_project is not null");
            return (Criteria) this;
        }

        public Criteria andTalentProjectEqualTo(String value) {
            addCriterion("talent_project =", value, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTalentProjectNotEqualTo(String value) {
            addCriterion("talent_project <>", value, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTalentProjectGreaterThan(String value) {
            addCriterion("talent_project >", value, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTalentProjectGreaterThanOrEqualTo(String value) {
            addCriterion("talent_project >=", value, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTalentProjectLessThan(String value) {
            addCriterion("talent_project <", value, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTalentProjectLessThanOrEqualTo(String value) {
            addCriterion("talent_project <=", value, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTalentProjectLike(String value) {
            addCriterion("talent_project like", value, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTalentProjectNotLike(String value) {
            addCriterion("talent_project not like", value, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTalentProjectIn(List<String> values) {
            addCriterion("talent_project in", values, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTalentProjectNotIn(List<String> values) {
            addCriterion("talent_project not in", values, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTalentProjectBetween(String value1, String value2) {
            addCriterion("talent_project between", value1, value2, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTalentProjectNotBetween(String value1, String value2) {
            addCriterion("talent_project not between", value1, value2, "talentProject");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsIsNull() {
            addCriterion("teacher_ethics is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsIsNotNull() {
            addCriterion("teacher_ethics is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsEqualTo(String value) {
            addCriterion("teacher_ethics =", value, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsNotEqualTo(String value) {
            addCriterion("teacher_ethics <>", value, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsGreaterThan(String value) {
            addCriterion("teacher_ethics >", value, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_ethics >=", value, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsLessThan(String value) {
            addCriterion("teacher_ethics <", value, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsLessThanOrEqualTo(String value) {
            addCriterion("teacher_ethics <=", value, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsLike(String value) {
            addCriterion("teacher_ethics like", value, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsNotLike(String value) {
            addCriterion("teacher_ethics not like", value, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsIn(List<String> values) {
            addCriterion("teacher_ethics in", values, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsNotIn(List<String> values) {
            addCriterion("teacher_ethics not in", values, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsBetween(String value1, String value2) {
            addCriterion("teacher_ethics between", value1, value2, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherEthicsNotBetween(String value1, String value2) {
            addCriterion("teacher_ethics not between", value1, value2, "teacherEthics");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationIsNull() {
            addCriterion("teacher_qualification is null");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationIsNotNull() {
            addCriterion("teacher_qualification is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationEqualTo(String value) {
            addCriterion("teacher_qualification =", value, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationNotEqualTo(String value) {
            addCriterion("teacher_qualification <>", value, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationGreaterThan(String value) {
            addCriterion("teacher_qualification >", value, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_qualification >=", value, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationLessThan(String value) {
            addCriterion("teacher_qualification <", value, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationLessThanOrEqualTo(String value) {
            addCriterion("teacher_qualification <=", value, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationLike(String value) {
            addCriterion("teacher_qualification like", value, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationNotLike(String value) {
            addCriterion("teacher_qualification not like", value, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationIn(List<String> values) {
            addCriterion("teacher_qualification in", values, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationNotIn(List<String> values) {
            addCriterion("teacher_qualification not in", values, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationBetween(String value1, String value2) {
            addCriterion("teacher_qualification between", value1, value2, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andTeacherQualificationNotBetween(String value1, String value2) {
            addCriterion("teacher_qualification not between", value1, value2, "teacherQualification");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIsNull() {
            addCriterion("work_experience is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIsNotNull() {
            addCriterion("work_experience is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceEqualTo(String value) {
            addCriterion("work_experience =", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotEqualTo(String value) {
            addCriterion("work_experience <>", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceGreaterThan(String value) {
            addCriterion("work_experience >", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("work_experience >=", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLessThan(String value) {
            addCriterion("work_experience <", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLessThanOrEqualTo(String value) {
            addCriterion("work_experience <=", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLike(String value) {
            addCriterion("work_experience like", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotLike(String value) {
            addCriterion("work_experience not like", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIn(List<String> values) {
            addCriterion("work_experience in", values, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotIn(List<String> values) {
            addCriterion("work_experience not in", values, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceBetween(String value1, String value2) {
            addCriterion("work_experience between", value1, value2, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotBetween(String value1, String value2) {
            addCriterion("work_experience not between", value1, value2, "workExperience");
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