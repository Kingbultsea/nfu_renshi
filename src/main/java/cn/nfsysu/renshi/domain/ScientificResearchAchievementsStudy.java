package cn.nfsysu.renshi.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ScientificResearchAchievementsStudy implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 标题
     */
    private String title;

    /**
     * 是否具有代表性
     */
    private String isRepresentativeness;

    /**
     * 本人角色
     */
    private String selfRole;

    /**
     * 报告时间
     */
    private Date reportTime;

    /**
     * 委托方
     */
    private String entrustingParty;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getEntrustingParty() {
        return entrustingParty;
    }

    public void setEntrustingParty(String entrustingParty) {
        this.entrustingParty = entrustingParty;
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
        ScientificResearchAchievementsStudy other = (ScientificResearchAchievementsStudy) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getIsRepresentativeness() == null ? other.getIsRepresentativeness() == null : this.getIsRepresentativeness().equals(other.getIsRepresentativeness()))
            && (this.getSelfRole() == null ? other.getSelfRole() == null : this.getSelfRole().equals(other.getSelfRole()))
            && (this.getReportTime() == null ? other.getReportTime() == null : this.getReportTime().equals(other.getReportTime()))
            && (this.getEntrustingParty() == null ? other.getEntrustingParty() == null : this.getEntrustingParty().equals(other.getEntrustingParty()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getIsRepresentativeness() == null) ? 0 : getIsRepresentativeness().hashCode());
        result = prime * result + ((getSelfRole() == null) ? 0 : getSelfRole().hashCode());
        result = prime * result + ((getReportTime() == null) ? 0 : getReportTime().hashCode());
        result = prime * result + ((getEntrustingParty() == null) ? 0 : getEntrustingParty().hashCode());
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
        sb.append(", title=").append(title);
        sb.append(", isRepresentativeness=").append(isRepresentativeness);
        sb.append(", selfRole=").append(selfRole);
        sb.append(", reportTime=").append(reportTime);
        sb.append(", entrustingParty=").append(entrustingParty);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}