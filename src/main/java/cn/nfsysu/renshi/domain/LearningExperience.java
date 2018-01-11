package cn.nfsysu.renshi.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class LearningExperience implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 获得学历
     */
    private String educational;

    /**
     * 获得学历的国家
     */
    private String country;

    /**
     * 哪个大学
     */
    private String university;

    /**
     * 专业
     */
    private String majors;

    /**
     * 入学年月
     */
    private Date beginTime;

    /**
     * 毕业年月
     */
    private String endTime;

    /**
     * 学位层次
     */
    private String degree;

    /**
     * 学位名称
     */
    private String degreeName;

    /**
     * 学位授予年月
     */
    private Date degreeAwardedTime;

    /**
     * 学习方式
     */
    private String learningStyle;

    /**
     * 学校类别
     */
    private String schoolClasses;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFather() {
        return father;
    }

    public void setFather(Integer father) {
        this.father = father;
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public Date getDegreeAwardedTime() {
        return degreeAwardedTime;
    }

    public void setDegreeAwardedTime(Date degreeAwardedTime) {
        this.degreeAwardedTime = degreeAwardedTime;
    }

    public String getLearningStyle() {
        return learningStyle;
    }

    public void setLearningStyle(String learningStyle) {
        this.learningStyle = learningStyle;
    }

    public String getSchoolClasses() {
        return schoolClasses;
    }

    public void setSchoolClasses(String schoolClasses) {
        this.schoolClasses = schoolClasses;
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
        LearningExperience other = (LearningExperience) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getEducational() == null ? other.getEducational() == null : this.getEducational().equals(other.getEducational()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getUniversity() == null ? other.getUniversity() == null : this.getUniversity().equals(other.getUniversity()))
            && (this.getMajors() == null ? other.getMajors() == null : this.getMajors().equals(other.getMajors()))
            && (this.getBeginTime() == null ? other.getBeginTime() == null : this.getBeginTime().equals(other.getBeginTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getDegree() == null ? other.getDegree() == null : this.getDegree().equals(other.getDegree()))
            && (this.getDegreeName() == null ? other.getDegreeName() == null : this.getDegreeName().equals(other.getDegreeName()))
            && (this.getDegreeAwardedTime() == null ? other.getDegreeAwardedTime() == null : this.getDegreeAwardedTime().equals(other.getDegreeAwardedTime()))
            && (this.getLearningStyle() == null ? other.getLearningStyle() == null : this.getLearningStyle().equals(other.getLearningStyle()))
            && (this.getSchoolClasses() == null ? other.getSchoolClasses() == null : this.getSchoolClasses().equals(other.getSchoolClasses()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getEducational() == null) ? 0 : getEducational().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getUniversity() == null) ? 0 : getUniversity().hashCode());
        result = prime * result + ((getMajors() == null) ? 0 : getMajors().hashCode());
        result = prime * result + ((getBeginTime() == null) ? 0 : getBeginTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getDegree() == null) ? 0 : getDegree().hashCode());
        result = prime * result + ((getDegreeName() == null) ? 0 : getDegreeName().hashCode());
        result = prime * result + ((getDegreeAwardedTime() == null) ? 0 : getDegreeAwardedTime().hashCode());
        result = prime * result + ((getLearningStyle() == null) ? 0 : getLearningStyle().hashCode());
        result = prime * result + ((getSchoolClasses() == null) ? 0 : getSchoolClasses().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", father=").append(father);
        sb.append(", educational=").append(educational);
        sb.append(", country=").append(country);
        sb.append(", university=").append(university);
        sb.append(", majors=").append(majors);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", degree=").append(degree);
        sb.append(", degreeName=").append(degreeName);
        sb.append(", degreeAwardedTime=").append(degreeAwardedTime);
        sb.append(", learningStyle=").append(learningStyle);
        sb.append(", schoolClasses=").append(schoolClasses);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}