package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class ScientificResearchAchievementsPaper implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 论文名称
     */
    private String paperName;

    /**
     * 是否具有代表性
     */
    private String isRepresentativeness;

    /**
     * 期刊名称
     */
    private String journalName;

    /**
     * 发表年月
     */
    private String publishedTime;

    /**
     * 卷号
     */
    private Integer volumeNumber;

    /**
     * 期号
     */
    private String issue;

    /**
     * 起始页码
     */
    private Integer beginPageNumber;

    /**
     * 结束页码
     */
    private Integer endPageNumber;

    /**
     * 本人角色
     */
    private String selfRole;

    /**
     * 学科领域
     */
    private String subjectAreas;

    /**
     * 收录情况
     */
    private String includedState;

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

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getIsRepresentativeness() {
        return isRepresentativeness;
    }

    public void setIsRepresentativeness(String isRepresentativeness) {
        this.isRepresentativeness = isRepresentativeness;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public String getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    public Integer getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(Integer volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public Integer getBeginPageNumber() {
        return beginPageNumber;
    }

    public void setBeginPageNumber(Integer beginPageNumber) {
        this.beginPageNumber = beginPageNumber;
    }

    public Integer getEndPageNumber() {
        return endPageNumber;
    }

    public void setEndPageNumber(Integer endPageNumber) {
        this.endPageNumber = endPageNumber;
    }

    public String getSelfRole() {
        return selfRole;
    }

    public void setSelfRole(String selfRole) {
        this.selfRole = selfRole;
    }

    public String getSubjectAreas() {
        return subjectAreas;
    }

    public void setSubjectAreas(String subjectAreas) {
        this.subjectAreas = subjectAreas;
    }

    public String getIncludedState() {
        return includedState;
    }

    public void setIncludedState(String includedState) {
        this.includedState = includedState;
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
        ScientificResearchAchievementsPaper other = (ScientificResearchAchievementsPaper) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getPaperName() == null ? other.getPaperName() == null : this.getPaperName().equals(other.getPaperName()))
            && (this.getIsRepresentativeness() == null ? other.getIsRepresentativeness() == null : this.getIsRepresentativeness().equals(other.getIsRepresentativeness()))
            && (this.getJournalName() == null ? other.getJournalName() == null : this.getJournalName().equals(other.getJournalName()))
            && (this.getPublishedTime() == null ? other.getPublishedTime() == null : this.getPublishedTime().equals(other.getPublishedTime()))
            && (this.getVolumeNumber() == null ? other.getVolumeNumber() == null : this.getVolumeNumber().equals(other.getVolumeNumber()))
            && (this.getIssue() == null ? other.getIssue() == null : this.getIssue().equals(other.getIssue()))
            && (this.getBeginPageNumber() == null ? other.getBeginPageNumber() == null : this.getBeginPageNumber().equals(other.getBeginPageNumber()))
            && (this.getEndPageNumber() == null ? other.getEndPageNumber() == null : this.getEndPageNumber().equals(other.getEndPageNumber()))
            && (this.getSelfRole() == null ? other.getSelfRole() == null : this.getSelfRole().equals(other.getSelfRole()))
            && (this.getSubjectAreas() == null ? other.getSubjectAreas() == null : this.getSubjectAreas().equals(other.getSubjectAreas()))
            && (this.getIncludedState() == null ? other.getIncludedState() == null : this.getIncludedState().equals(other.getIncludedState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getPaperName() == null) ? 0 : getPaperName().hashCode());
        result = prime * result + ((getIsRepresentativeness() == null) ? 0 : getIsRepresentativeness().hashCode());
        result = prime * result + ((getJournalName() == null) ? 0 : getJournalName().hashCode());
        result = prime * result + ((getPublishedTime() == null) ? 0 : getPublishedTime().hashCode());
        result = prime * result + ((getVolumeNumber() == null) ? 0 : getVolumeNumber().hashCode());
        result = prime * result + ((getIssue() == null) ? 0 : getIssue().hashCode());
        result = prime * result + ((getBeginPageNumber() == null) ? 0 : getBeginPageNumber().hashCode());
        result = prime * result + ((getEndPageNumber() == null) ? 0 : getEndPageNumber().hashCode());
        result = prime * result + ((getSelfRole() == null) ? 0 : getSelfRole().hashCode());
        result = prime * result + ((getSubjectAreas() == null) ? 0 : getSubjectAreas().hashCode());
        result = prime * result + ((getIncludedState() == null) ? 0 : getIncludedState().hashCode());
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
        sb.append(", paperName=").append(paperName);
        sb.append(", isRepresentativeness=").append(isRepresentativeness);
        sb.append(", journalName=").append(journalName);
        sb.append(", publishedTime=").append(publishedTime);
        sb.append(", volumeNumber=").append(volumeNumber);
        sb.append(", issue=").append(issue);
        sb.append(", beginPageNumber=").append(beginPageNumber);
        sb.append(", endPageNumber=").append(endPageNumber);
        sb.append(", selfRole=").append(selfRole);
        sb.append(", subjectAreas=").append(subjectAreas);
        sb.append(", includedState=").append(includedState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}