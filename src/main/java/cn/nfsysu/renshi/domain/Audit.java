package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class Audit implements Serializable {
    private Integer id;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 国内培训
     */
    private String domesticTraining;

    /**
     * 教育教学
     */
    private String education;

    /**
     * 基本信息表
     */
    private String info;

    /**
     * 语言技能
     */
    private String languageSkill;

    /**
     * 学习经历
     */
    private String learningExperience;

    /**
     * 其他技能
     */
    private String otherSkill;

    /**
     * 海外培训
     */
    private String overseasTraining;

    /**
     * 专业职务任聘
     */
    private String professionalDuties;

    /**
     * 科研成果（文艺作品）
     */
    private String scientificResearchAchievementsArt;

    /**
     * 科研成果（奖励）
     */
    private String scientificResearchAchievementsAward;

    /**
     * 科研成果（国家医药证书）
     */
    private String scientificResearchAchievementsMedicine;

    /**
     * 论文
     */
    private String scientificResearchAchievementsPaper;

    /**
     * 专利
     */
    private String scientificResearchAchievementsPatent;

    /**
     * 科研成果(项目或课题）
     */
    private String scientificResearchAchievementsProject;

    /**
     * 科研成果（国家标准或行业标准）
     */
    private String scientificResearchAchievementsStandard;

    /**
     * 学生获奖
     */
    private String scientificResearchAchievementsStudent;

    /**
     * 科研成果（咨询报告或研究报告）
     */
    private String scientificResearchAchievementsStudy;

    /**
     * 科研成果(著作）
     */
    private String scientificResearchAchievementsWritings;

    /**
     * 技能证书
     */
    private String skillCertificate;

    /**
     * 入选人才项目
     */
    private String talentProject;

    /**
     * 师德信息（荣誉）
     */
    private String teacherEthics;

    /**
     * 教师资格
     */
    private String teacherQualification;

    /**
     * 工作经验
     */
    private String workExperience;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDomesticTraining() {
        return domesticTraining;
    }

    public void setDomesticTraining(String domesticTraining) {
        this.domesticTraining = domesticTraining;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getLanguageSkill() {
        return languageSkill;
    }

    public void setLanguageSkill(String languageSkill) {
        this.languageSkill = languageSkill;
    }

    public String getLearningExperience() {
        return learningExperience;
    }

    public void setLearningExperience(String learningExperience) {
        this.learningExperience = learningExperience;
    }

    public String getOtherSkill() {
        return otherSkill;
    }

    public void setOtherSkill(String otherSkill) {
        this.otherSkill = otherSkill;
    }

    public String getOverseasTraining() {
        return overseasTraining;
    }

    public void setOverseasTraining(String overseasTraining) {
        this.overseasTraining = overseasTraining;
    }

    public String getProfessionalDuties() {
        return professionalDuties;
    }

    public void setProfessionalDuties(String professionalDuties) {
        this.professionalDuties = professionalDuties;
    }

    public String getScientificResearchAchievementsArt() {
        return scientificResearchAchievementsArt;
    }

    public void setScientificResearchAchievementsArt(String scientificResearchAchievementsArt) {
        this.scientificResearchAchievementsArt = scientificResearchAchievementsArt;
    }

    public String getScientificResearchAchievementsAward() {
        return scientificResearchAchievementsAward;
    }

    public void setScientificResearchAchievementsAward(String scientificResearchAchievementsAward) {
        this.scientificResearchAchievementsAward = scientificResearchAchievementsAward;
    }

    public String getScientificResearchAchievementsMedicine() {
        return scientificResearchAchievementsMedicine;
    }

    public void setScientificResearchAchievementsMedicine(String scientificResearchAchievementsMedicine) {
        this.scientificResearchAchievementsMedicine = scientificResearchAchievementsMedicine;
    }

    public String getScientificResearchAchievementsPaper() {
        return scientificResearchAchievementsPaper;
    }

    public void setScientificResearchAchievementsPaper(String scientificResearchAchievementsPaper) {
        this.scientificResearchAchievementsPaper = scientificResearchAchievementsPaper;
    }

    public String getScientificResearchAchievementsPatent() {
        return scientificResearchAchievementsPatent;
    }

    public void setScientificResearchAchievementsPatent(String scientificResearchAchievementsPatent) {
        this.scientificResearchAchievementsPatent = scientificResearchAchievementsPatent;
    }

    public String getScientificResearchAchievementsProject() {
        return scientificResearchAchievementsProject;
    }

    public void setScientificResearchAchievementsProject(String scientificResearchAchievementsProject) {
        this.scientificResearchAchievementsProject = scientificResearchAchievementsProject;
    }

    public String getScientificResearchAchievementsStandard() {
        return scientificResearchAchievementsStandard;
    }

    public void setScientificResearchAchievementsStandard(String scientificResearchAchievementsStandard) {
        this.scientificResearchAchievementsStandard = scientificResearchAchievementsStandard;
    }

    public String getScientificResearchAchievementsStudent() {
        return scientificResearchAchievementsStudent;
    }

    public void setScientificResearchAchievementsStudent(String scientificResearchAchievementsStudent) {
        this.scientificResearchAchievementsStudent = scientificResearchAchievementsStudent;
    }

    public String getScientificResearchAchievementsStudy() {
        return scientificResearchAchievementsStudy;
    }

    public void setScientificResearchAchievementsStudy(String scientificResearchAchievementsStudy) {
        this.scientificResearchAchievementsStudy = scientificResearchAchievementsStudy;
    }

    public String getScientificResearchAchievementsWritings() {
        return scientificResearchAchievementsWritings;
    }

    public void setScientificResearchAchievementsWritings(String scientificResearchAchievementsWritings) {
        this.scientificResearchAchievementsWritings = scientificResearchAchievementsWritings;
    }

    public String getSkillCertificate() {
        return skillCertificate;
    }

    public void setSkillCertificate(String skillCertificate) {
        this.skillCertificate = skillCertificate;
    }

    public String getTalentProject() {
        return talentProject;
    }

    public void setTalentProject(String talentProject) {
        this.talentProject = talentProject;
    }

    public String getTeacherEthics() {
        return teacherEthics;
    }

    public void setTeacherEthics(String teacherEthics) {
        this.teacherEthics = teacherEthics;
    }

    public String getTeacherQualification() {
        return teacherQualification;
    }

    public void setTeacherQualification(String teacherQualification) {
        this.teacherQualification = teacherQualification;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Audit other = (Audit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getDomesticTraining() == null ? other.getDomesticTraining() == null : this.getDomesticTraining().equals(other.getDomesticTraining()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()))
            && (this.getLanguageSkill() == null ? other.getLanguageSkill() == null : this.getLanguageSkill().equals(other.getLanguageSkill()))
            && (this.getLearningExperience() == null ? other.getLearningExperience() == null : this.getLearningExperience().equals(other.getLearningExperience()))
            && (this.getOtherSkill() == null ? other.getOtherSkill() == null : this.getOtherSkill().equals(other.getOtherSkill()))
            && (this.getOverseasTraining() == null ? other.getOverseasTraining() == null : this.getOverseasTraining().equals(other.getOverseasTraining()))
            && (this.getProfessionalDuties() == null ? other.getProfessionalDuties() == null : this.getProfessionalDuties().equals(other.getProfessionalDuties()))
            && (this.getScientificResearchAchievementsArt() == null ? other.getScientificResearchAchievementsArt() == null : this.getScientificResearchAchievementsArt().equals(other.getScientificResearchAchievementsArt()))
            && (this.getScientificResearchAchievementsAward() == null ? other.getScientificResearchAchievementsAward() == null : this.getScientificResearchAchievementsAward().equals(other.getScientificResearchAchievementsAward()))
            && (this.getScientificResearchAchievementsMedicine() == null ? other.getScientificResearchAchievementsMedicine() == null : this.getScientificResearchAchievementsMedicine().equals(other.getScientificResearchAchievementsMedicine()))
            && (this.getScientificResearchAchievementsPaper() == null ? other.getScientificResearchAchievementsPaper() == null : this.getScientificResearchAchievementsPaper().equals(other.getScientificResearchAchievementsPaper()))
            && (this.getScientificResearchAchievementsPatent() == null ? other.getScientificResearchAchievementsPatent() == null : this.getScientificResearchAchievementsPatent().equals(other.getScientificResearchAchievementsPatent()))
            && (this.getScientificResearchAchievementsProject() == null ? other.getScientificResearchAchievementsProject() == null : this.getScientificResearchAchievementsProject().equals(other.getScientificResearchAchievementsProject()))
            && (this.getScientificResearchAchievementsStandard() == null ? other.getScientificResearchAchievementsStandard() == null : this.getScientificResearchAchievementsStandard().equals(other.getScientificResearchAchievementsStandard()))
            && (this.getScientificResearchAchievementsStudent() == null ? other.getScientificResearchAchievementsStudent() == null : this.getScientificResearchAchievementsStudent().equals(other.getScientificResearchAchievementsStudent()))
            && (this.getScientificResearchAchievementsStudy() == null ? other.getScientificResearchAchievementsStudy() == null : this.getScientificResearchAchievementsStudy().equals(other.getScientificResearchAchievementsStudy()))
            && (this.getScientificResearchAchievementsWritings() == null ? other.getScientificResearchAchievementsWritings() == null : this.getScientificResearchAchievementsWritings().equals(other.getScientificResearchAchievementsWritings()))
            && (this.getSkillCertificate() == null ? other.getSkillCertificate() == null : this.getSkillCertificate().equals(other.getSkillCertificate()))
            && (this.getTalentProject() == null ? other.getTalentProject() == null : this.getTalentProject().equals(other.getTalentProject()))
            && (this.getTeacherEthics() == null ? other.getTeacherEthics() == null : this.getTeacherEthics().equals(other.getTeacherEthics()))
            && (this.getTeacherQualification() == null ? other.getTeacherQualification() == null : this.getTeacherQualification().equals(other.getTeacherQualification()))
            && (this.getWorkExperience() == null ? other.getWorkExperience() == null : this.getWorkExperience().equals(other.getWorkExperience()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getDomesticTraining() == null) ? 0 : getDomesticTraining().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
        result = prime * result + ((getLanguageSkill() == null) ? 0 : getLanguageSkill().hashCode());
        result = prime * result + ((getLearningExperience() == null) ? 0 : getLearningExperience().hashCode());
        result = prime * result + ((getOtherSkill() == null) ? 0 : getOtherSkill().hashCode());
        result = prime * result + ((getOverseasTraining() == null) ? 0 : getOverseasTraining().hashCode());
        result = prime * result + ((getProfessionalDuties() == null) ? 0 : getProfessionalDuties().hashCode());
        result = prime * result + ((getScientificResearchAchievementsArt() == null) ? 0 : getScientificResearchAchievementsArt().hashCode());
        result = prime * result + ((getScientificResearchAchievementsAward() == null) ? 0 : getScientificResearchAchievementsAward().hashCode());
        result = prime * result + ((getScientificResearchAchievementsMedicine() == null) ? 0 : getScientificResearchAchievementsMedicine().hashCode());
        result = prime * result + ((getScientificResearchAchievementsPaper() == null) ? 0 : getScientificResearchAchievementsPaper().hashCode());
        result = prime * result + ((getScientificResearchAchievementsPatent() == null) ? 0 : getScientificResearchAchievementsPatent().hashCode());
        result = prime * result + ((getScientificResearchAchievementsProject() == null) ? 0 : getScientificResearchAchievementsProject().hashCode());
        result = prime * result + ((getScientificResearchAchievementsStandard() == null) ? 0 : getScientificResearchAchievementsStandard().hashCode());
        result = prime * result + ((getScientificResearchAchievementsStudent() == null) ? 0 : getScientificResearchAchievementsStudent().hashCode());
        result = prime * result + ((getScientificResearchAchievementsStudy() == null) ? 0 : getScientificResearchAchievementsStudy().hashCode());
        result = prime * result + ((getScientificResearchAchievementsWritings() == null) ? 0 : getScientificResearchAchievementsWritings().hashCode());
        result = prime * result + ((getSkillCertificate() == null) ? 0 : getSkillCertificate().hashCode());
        result = prime * result + ((getTalentProject() == null) ? 0 : getTalentProject().hashCode());
        result = prime * result + ((getTeacherEthics() == null) ? 0 : getTeacherEthics().hashCode());
        result = prime * result + ((getTeacherQualification() == null) ? 0 : getTeacherQualification().hashCode());
        result = prime * result + ((getWorkExperience() == null) ? 0 : getWorkExperience().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", contact=").append(contact);
        sb.append(", domesticTraining=").append(domesticTraining);
        sb.append(", education=").append(education);
        sb.append(", info=").append(info);
        sb.append(", languageSkill=").append(languageSkill);
        sb.append(", learningExperience=").append(learningExperience);
        sb.append(", otherSkill=").append(otherSkill);
        sb.append(", overseasTraining=").append(overseasTraining);
        sb.append(", professionalDuties=").append(professionalDuties);
        sb.append(", scientificResearchAchievementsArt=").append(scientificResearchAchievementsArt);
        sb.append(", scientificResearchAchievementsAward=").append(scientificResearchAchievementsAward);
        sb.append(", scientificResearchAchievementsMedicine=").append(scientificResearchAchievementsMedicine);
        sb.append(", scientificResearchAchievementsPaper=").append(scientificResearchAchievementsPaper);
        sb.append(", scientificResearchAchievementsPatent=").append(scientificResearchAchievementsPatent);
        sb.append(", scientificResearchAchievementsProject=").append(scientificResearchAchievementsProject);
        sb.append(", scientificResearchAchievementsStandard=").append(scientificResearchAchievementsStandard);
        sb.append(", scientificResearchAchievementsStudent=").append(scientificResearchAchievementsStudent);
        sb.append(", scientificResearchAchievementsStudy=").append(scientificResearchAchievementsStudy);
        sb.append(", scientificResearchAchievementsWritings=").append(scientificResearchAchievementsWritings);
        sb.append(", skillCertificate=").append(skillCertificate);
        sb.append(", talentProject=").append(talentProject);
        sb.append(", teacherEthics=").append(teacherEthics);
        sb.append(", teacherQualification=").append(teacherQualification);
        sb.append(", workExperience=").append(workExperience);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}