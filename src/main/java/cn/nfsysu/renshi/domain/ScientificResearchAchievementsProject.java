package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class ScientificResearchAchievementsProject implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 项目类型
     */
    private String type;

    /**
     * 是否具有代表性
     */
    private String isRepresentativeness;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目批准号
     */
    private String approveNumber;

    /**
     * 学科领域
     */
    private String subjectAreas;

    /**
     * 经费
     */
    private Integer funding;

    /**
     * 开始年月
     */
    private String beginTime;

    /**
     * 结束年月
     */
    private String endTime;

    /**
     * 本人角色
     */
    private String selfRole;

    /**
     * 本人排名
     */
    private String selfRank;

    /**
     * 委托单位
     */
    private String authorizedUnit;

    /**
     * 项目来源
     */
    private String projectSource;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsRepresentativeness() {
        return isRepresentativeness;
    }

    public void setIsRepresentativeness(String isRepresentativeness) {
        this.isRepresentativeness = isRepresentativeness;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getApproveNumber() {
        return approveNumber;
    }

    public void setApproveNumber(String approveNumber) {
        this.approveNumber = approveNumber;
    }

    public String getSubjectAreas() {
        return subjectAreas;
    }

    public void setSubjectAreas(String subjectAreas) {
        this.subjectAreas = subjectAreas;
    }

    public Integer getFunding() {
        return funding;
    }

    public void setFunding(Integer funding) {
        this.funding = funding;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSelfRole() {
        return selfRole;
    }

    public void setSelfRole(String selfRole) {
        this.selfRole = selfRole;
    }

    public String getSelfRank() {
        return selfRank;
    }

    public void setSelfRank(String selfRank) {
        this.selfRank = selfRank;
    }

    public String getAuthorizedUnit() {
        return authorizedUnit;
    }

    public void setAuthorizedUnit(String authorizedUnit) {
        this.authorizedUnit = authorizedUnit;
    }

    public String getProjectSource() {
        return projectSource;
    }

    public void setProjectSource(String projectSource) {
        this.projectSource = projectSource;
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
        ScientificResearchAchievementsProject other = (ScientificResearchAchievementsProject) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIsRepresentativeness() == null ? other.getIsRepresentativeness() == null : this.getIsRepresentativeness().equals(other.getIsRepresentativeness()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getApproveNumber() == null ? other.getApproveNumber() == null : this.getApproveNumber().equals(other.getApproveNumber()))
            && (this.getSubjectAreas() == null ? other.getSubjectAreas() == null : this.getSubjectAreas().equals(other.getSubjectAreas()))
            && (this.getFunding() == null ? other.getFunding() == null : this.getFunding().equals(other.getFunding()))
            && (this.getBeginTime() == null ? other.getBeginTime() == null : this.getBeginTime().equals(other.getBeginTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getSelfRole() == null ? other.getSelfRole() == null : this.getSelfRole().equals(other.getSelfRole()))
            && (this.getSelfRank() == null ? other.getSelfRank() == null : this.getSelfRank().equals(other.getSelfRank()))
            && (this.getAuthorizedUnit() == null ? other.getAuthorizedUnit() == null : this.getAuthorizedUnit().equals(other.getAuthorizedUnit()))
            && (this.getProjectSource() == null ? other.getProjectSource() == null : this.getProjectSource().equals(other.getProjectSource()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIsRepresentativeness() == null) ? 0 : getIsRepresentativeness().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getApproveNumber() == null) ? 0 : getApproveNumber().hashCode());
        result = prime * result + ((getSubjectAreas() == null) ? 0 : getSubjectAreas().hashCode());
        result = prime * result + ((getFunding() == null) ? 0 : getFunding().hashCode());
        result = prime * result + ((getBeginTime() == null) ? 0 : getBeginTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getSelfRole() == null) ? 0 : getSelfRole().hashCode());
        result = prime * result + ((getSelfRank() == null) ? 0 : getSelfRank().hashCode());
        result = prime * result + ((getAuthorizedUnit() == null) ? 0 : getAuthorizedUnit().hashCode());
        result = prime * result + ((getProjectSource() == null) ? 0 : getProjectSource().hashCode());
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
        sb.append(", type=").append(type);
        sb.append(", isRepresentativeness=").append(isRepresentativeness);
        sb.append(", projectName=").append(projectName);
        sb.append(", approveNumber=").append(approveNumber);
        sb.append(", subjectAreas=").append(subjectAreas);
        sb.append(", funding=").append(funding);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", selfRole=").append(selfRole);
        sb.append(", selfRank=").append(selfRank);
        sb.append(", authorizedUnit=").append(authorizedUnit);
        sb.append(", projectSource=").append(projectSource);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}