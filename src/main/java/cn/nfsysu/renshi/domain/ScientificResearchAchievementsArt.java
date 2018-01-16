package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class ScientificResearchAchievementsArt implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 文艺作品类别
     */
    private String type;

    /**
     * 是否具有代表性
     */
    private String isRepresentativeness;

    /**
     * 作品名称
     */
    private String artName;

    /**
     * 本人角色
     */
    private String selfRole;

    /**
     * 完成时间
     */
    private String completeTime;

    /**
     * 完成地点
     */
    private String completePlace;

    /**
     * 工作描述
     */
    private String jobDescription;

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

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public String getSelfRole() {
        return selfRole;
    }

    public void setSelfRole(String selfRole) {
        this.selfRole = selfRole;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getCompletePlace() {
        return completePlace;
    }

    public void setCompletePlace(String completePlace) {
        this.completePlace = completePlace;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
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
        ScientificResearchAchievementsArt other = (ScientificResearchAchievementsArt) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIsRepresentativeness() == null ? other.getIsRepresentativeness() == null : this.getIsRepresentativeness().equals(other.getIsRepresentativeness()))
            && (this.getArtName() == null ? other.getArtName() == null : this.getArtName().equals(other.getArtName()))
            && (this.getSelfRole() == null ? other.getSelfRole() == null : this.getSelfRole().equals(other.getSelfRole()))
            && (this.getCompleteTime() == null ? other.getCompleteTime() == null : this.getCompleteTime().equals(other.getCompleteTime()))
            && (this.getCompletePlace() == null ? other.getCompletePlace() == null : this.getCompletePlace().equals(other.getCompletePlace()))
            && (this.getJobDescription() == null ? other.getJobDescription() == null : this.getJobDescription().equals(other.getJobDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIsRepresentativeness() == null) ? 0 : getIsRepresentativeness().hashCode());
        result = prime * result + ((getArtName() == null) ? 0 : getArtName().hashCode());
        result = prime * result + ((getSelfRole() == null) ? 0 : getSelfRole().hashCode());
        result = prime * result + ((getCompleteTime() == null) ? 0 : getCompleteTime().hashCode());
        result = prime * result + ((getCompletePlace() == null) ? 0 : getCompletePlace().hashCode());
        result = prime * result + ((getJobDescription() == null) ? 0 : getJobDescription().hashCode());
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
        sb.append(", artName=").append(artName);
        sb.append(", selfRole=").append(selfRole);
        sb.append(", completeTime=").append(completeTime);
        sb.append(", completePlace=").append(completePlace);
        sb.append(", jobDescription=").append(jobDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}