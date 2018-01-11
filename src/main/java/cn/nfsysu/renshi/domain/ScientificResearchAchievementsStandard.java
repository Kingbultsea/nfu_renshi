package cn.nfsysu.renshi.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ScientificResearchAchievementsStandard implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 标准号
     */
    private String standardNubmer;

    /**
     * 是否具有代表性
     */
    private String isRepresentativeness;

    /**
     * 本人角色
     */
    private String selfRole;

    /**
     * 发布日期
     */
    private Date releaseDate;

    /**
     * 发布单位名称
     */
    private String unitName;

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

    public String getStandardNubmer() {
        return standardNubmer;
    }

    public void setStandardNubmer(String standardNubmer) {
        this.standardNubmer = standardNubmer;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
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
        ScientificResearchAchievementsStandard other = (ScientificResearchAchievementsStandard) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getStandardNubmer() == null ? other.getStandardNubmer() == null : this.getStandardNubmer().equals(other.getStandardNubmer()))
            && (this.getIsRepresentativeness() == null ? other.getIsRepresentativeness() == null : this.getIsRepresentativeness().equals(other.getIsRepresentativeness()))
            && (this.getSelfRole() == null ? other.getSelfRole() == null : this.getSelfRole().equals(other.getSelfRole()))
            && (this.getReleaseDate() == null ? other.getReleaseDate() == null : this.getReleaseDate().equals(other.getReleaseDate()))
            && (this.getUnitName() == null ? other.getUnitName() == null : this.getUnitName().equals(other.getUnitName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getStandardNubmer() == null) ? 0 : getStandardNubmer().hashCode());
        result = prime * result + ((getIsRepresentativeness() == null) ? 0 : getIsRepresentativeness().hashCode());
        result = prime * result + ((getSelfRole() == null) ? 0 : getSelfRole().hashCode());
        result = prime * result + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        result = prime * result + ((getUnitName() == null) ? 0 : getUnitName().hashCode());
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
        sb.append(", standardNubmer=").append(standardNubmer);
        sb.append(", isRepresentativeness=").append(isRepresentativeness);
        sb.append(", selfRole=").append(selfRole);
        sb.append(", releaseDate=").append(releaseDate);
        sb.append(", unitName=").append(unitName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}