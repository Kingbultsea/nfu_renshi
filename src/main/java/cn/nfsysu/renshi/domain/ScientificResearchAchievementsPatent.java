package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class ScientificResearchAchievementsPatent implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 专利类型
     */
    private String type;

    /**
     * 是否具有代表性
     */
    private String isRepresentativeness;

    /**
     * 专利名称
     */
    private String patentName;

    /**
     * 学科领域
     */
    private String subjectAreas;

    /**
     * 批准日期
     */
    private String approveTime;

    /**
     * 本人角色
     */
    private String selfRole;

    /**
     * 专利号
     */
    private String patentNumber;

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

    public String getPatentName() {
        return patentName;
    }

    public void setPatentName(String patentName) {
        this.patentName = patentName;
    }

    public String getSubjectAreas() {
        return subjectAreas;
    }

    public void setSubjectAreas(String subjectAreas) {
        this.subjectAreas = subjectAreas;
    }

    public String getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(String approveTime) {
        this.approveTime = approveTime;
    }

    public String getSelfRole() {
        return selfRole;
    }

    public void setSelfRole(String selfRole) {
        this.selfRole = selfRole;
    }

    public String getPatentNumber() {
        return patentNumber;
    }

    public void setPatentNumber(String patentNumber) {
        this.patentNumber = patentNumber;
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
        ScientificResearchAchievementsPatent other = (ScientificResearchAchievementsPatent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIsRepresentativeness() == null ? other.getIsRepresentativeness() == null : this.getIsRepresentativeness().equals(other.getIsRepresentativeness()))
            && (this.getPatentName() == null ? other.getPatentName() == null : this.getPatentName().equals(other.getPatentName()))
            && (this.getSubjectAreas() == null ? other.getSubjectAreas() == null : this.getSubjectAreas().equals(other.getSubjectAreas()))
            && (this.getApproveTime() == null ? other.getApproveTime() == null : this.getApproveTime().equals(other.getApproveTime()))
            && (this.getSelfRole() == null ? other.getSelfRole() == null : this.getSelfRole().equals(other.getSelfRole()))
            && (this.getPatentNumber() == null ? other.getPatentNumber() == null : this.getPatentNumber().equals(other.getPatentNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIsRepresentativeness() == null) ? 0 : getIsRepresentativeness().hashCode());
        result = prime * result + ((getPatentName() == null) ? 0 : getPatentName().hashCode());
        result = prime * result + ((getSubjectAreas() == null) ? 0 : getSubjectAreas().hashCode());
        result = prime * result + ((getApproveTime() == null) ? 0 : getApproveTime().hashCode());
        result = prime * result + ((getSelfRole() == null) ? 0 : getSelfRole().hashCode());
        result = prime * result + ((getPatentNumber() == null) ? 0 : getPatentNumber().hashCode());
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
        sb.append(", patentName=").append(patentName);
        sb.append(", subjectAreas=").append(subjectAreas);
        sb.append(", approveTime=").append(approveTime);
        sb.append(", selfRole=").append(selfRole);
        sb.append(", patentNumber=").append(patentNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}