package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class ScientificResearchAchievementsAward implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 奖励类别
     */
    private String type;

    /**
     * 是否为代表性成果
     */
    private String isRepresentativeness;

    /**
     * 获奖日期
     */
    private String dateOfAward;

    /**
     * 获奖名称
     */
    private String awardName;

    /**
     * 奖励等级
     */
    private String awardLevel;

    /**
     * 其他等级
     */
    private String otherLevel;

    /**
     * 本人排名
     */
    private String selfRank;

    /**
     * 授奖国家
     */
    private String stateOfPrizes;

    /**
     * 授奖单位
     */
    private String unitOfPrizes;

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

    public String getDateOfAward() {
        return dateOfAward;
    }

    public void setDateOfAward(String dateOfAward) {
        this.dateOfAward = dateOfAward;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAwardLevel() {
        return awardLevel;
    }

    public void setAwardLevel(String awardLevel) {
        this.awardLevel = awardLevel;
    }

    public String getOtherLevel() {
        return otherLevel;
    }

    public void setOtherLevel(String otherLevel) {
        this.otherLevel = otherLevel;
    }

    public String getSelfRank() {
        return selfRank;
    }

    public void setSelfRank(String selfRank) {
        this.selfRank = selfRank;
    }

    public String getStateOfPrizes() {
        return stateOfPrizes;
    }

    public void setStateOfPrizes(String stateOfPrizes) {
        this.stateOfPrizes = stateOfPrizes;
    }

    public String getUnitOfPrizes() {
        return unitOfPrizes;
    }

    public void setUnitOfPrizes(String unitOfPrizes) {
        this.unitOfPrizes = unitOfPrizes;
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
        ScientificResearchAchievementsAward other = (ScientificResearchAchievementsAward) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIsRepresentativeness() == null ? other.getIsRepresentativeness() == null : this.getIsRepresentativeness().equals(other.getIsRepresentativeness()))
            && (this.getDateOfAward() == null ? other.getDateOfAward() == null : this.getDateOfAward().equals(other.getDateOfAward()))
            && (this.getAwardName() == null ? other.getAwardName() == null : this.getAwardName().equals(other.getAwardName()))
            && (this.getAwardLevel() == null ? other.getAwardLevel() == null : this.getAwardLevel().equals(other.getAwardLevel()))
            && (this.getOtherLevel() == null ? other.getOtherLevel() == null : this.getOtherLevel().equals(other.getOtherLevel()))
            && (this.getSelfRank() == null ? other.getSelfRank() == null : this.getSelfRank().equals(other.getSelfRank()))
            && (this.getStateOfPrizes() == null ? other.getStateOfPrizes() == null : this.getStateOfPrizes().equals(other.getStateOfPrizes()))
            && (this.getUnitOfPrizes() == null ? other.getUnitOfPrizes() == null : this.getUnitOfPrizes().equals(other.getUnitOfPrizes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIsRepresentativeness() == null) ? 0 : getIsRepresentativeness().hashCode());
        result = prime * result + ((getDateOfAward() == null) ? 0 : getDateOfAward().hashCode());
        result = prime * result + ((getAwardName() == null) ? 0 : getAwardName().hashCode());
        result = prime * result + ((getAwardLevel() == null) ? 0 : getAwardLevel().hashCode());
        result = prime * result + ((getOtherLevel() == null) ? 0 : getOtherLevel().hashCode());
        result = prime * result + ((getSelfRank() == null) ? 0 : getSelfRank().hashCode());
        result = prime * result + ((getStateOfPrizes() == null) ? 0 : getStateOfPrizes().hashCode());
        result = prime * result + ((getUnitOfPrizes() == null) ? 0 : getUnitOfPrizes().hashCode());
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
        sb.append(", dateOfAward=").append(dateOfAward);
        sb.append(", awardName=").append(awardName);
        sb.append(", awardLevel=").append(awardLevel);
        sb.append(", otherLevel=").append(otherLevel);
        sb.append(", selfRank=").append(selfRank);
        sb.append(", stateOfPrizes=").append(stateOfPrizes);
        sb.append(", unitOfPrizes=").append(unitOfPrizes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}