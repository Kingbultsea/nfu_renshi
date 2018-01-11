package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class ScientificResearchAchievementsStudent implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 奖励名称
     */
    private String awardName;

    /**
     * 是否具有代表性
     */
    private String isRepresentativeness;

    /**
     * 代表角色
     */
    private String selfRole;

    /**
     * 获奖等级
     */
    private String awardLevel;

    /**
     * 获奖年月
     */
    private String awardTime;

    /**
     * 个人工作描述
     */
    private String selfWorkDescription;

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

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getIsRepresentativeness() {
        return isRepresentativeness;
    }

    public void setIsRepresentativeness(String isRepresentativeness) {
        this.isRepresentativeness = isRepresentativeness;
    }

    public String getSelfRole() {
        return selfRole;
    }

    public void setSelfRole(String selfRole) {
        this.selfRole = selfRole;
    }

    public String getAwardLevel() {
        return awardLevel;
    }

    public void setAwardLevel(String awardLevel) {
        this.awardLevel = awardLevel;
    }

    public String getAwardTime() {
        return awardTime;
    }

    public void setAwardTime(String awardTime) {
        this.awardTime = awardTime;
    }

    public String getSelfWorkDescription() {
        return selfWorkDescription;
    }

    public void setSelfWorkDescription(String selfWorkDescription) {
        this.selfWorkDescription = selfWorkDescription;
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
        ScientificResearchAchievementsStudent other = (ScientificResearchAchievementsStudent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getAwardName() == null ? other.getAwardName() == null : this.getAwardName().equals(other.getAwardName()))
            && (this.getIsRepresentativeness() == null ? other.getIsRepresentativeness() == null : this.getIsRepresentativeness().equals(other.getIsRepresentativeness()))
            && (this.getSelfRole() == null ? other.getSelfRole() == null : this.getSelfRole().equals(other.getSelfRole()))
            && (this.getAwardLevel() == null ? other.getAwardLevel() == null : this.getAwardLevel().equals(other.getAwardLevel()))
            && (this.getAwardTime() == null ? other.getAwardTime() == null : this.getAwardTime().equals(other.getAwardTime()))
            && (this.getSelfWorkDescription() == null ? other.getSelfWorkDescription() == null : this.getSelfWorkDescription().equals(other.getSelfWorkDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getAwardName() == null) ? 0 : getAwardName().hashCode());
        result = prime * result + ((getIsRepresentativeness() == null) ? 0 : getIsRepresentativeness().hashCode());
        result = prime * result + ((getSelfRole() == null) ? 0 : getSelfRole().hashCode());
        result = prime * result + ((getAwardLevel() == null) ? 0 : getAwardLevel().hashCode());
        result = prime * result + ((getAwardTime() == null) ? 0 : getAwardTime().hashCode());
        result = prime * result + ((getSelfWorkDescription() == null) ? 0 : getSelfWorkDescription().hashCode());
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
        sb.append(", awardName=").append(awardName);
        sb.append(", isRepresentativeness=").append(isRepresentativeness);
        sb.append(", selfRole=").append(selfRole);
        sb.append(", awardLevel=").append(awardLevel);
        sb.append(", awardTime=").append(awardTime);
        sb.append(", selfWorkDescription=").append(selfWorkDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}