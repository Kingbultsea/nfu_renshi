package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class ScientificResearchAchievementsWritings implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 著作类别
     */
    private String type;

    /**
     * 是否具有代表性
     */
    private String isRepresentativeness;

    /**
     * 著作名称
     */
    private String writingsName;

    /**
     * 学科领域
     */
    private String subjectAreas;

    /**
     * 出版日期
     */
    private String publicationDate;

    /**
     * 出版社名称
     */
    private String publicationName;

    /**
     * 出版号
     */
    private String numbers;

    /**
     * 本人角色
     */
    private String selfRole;

    /**
     * 总字数
     */
    private Integer totalWords;

    /**
     * 本人撰写字数
     */
    private String selfWords;

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

    public String getWritingsName() {
        return writingsName;
    }

    public void setWritingsName(String writingsName) {
        this.writingsName = writingsName;
    }

    public String getSubjectAreas() {
        return subjectAreas;
    }

    public void setSubjectAreas(String subjectAreas) {
        this.subjectAreas = subjectAreas;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getSelfRole() {
        return selfRole;
    }

    public void setSelfRole(String selfRole) {
        this.selfRole = selfRole;
    }

    public Integer getTotalWords() {
        return totalWords;
    }

    public void setTotalWords(Integer totalWords) {
        this.totalWords = totalWords;
    }

    public String getSelfWords() {
        return selfWords;
    }

    public void setSelfWords(String selfWords) {
        this.selfWords = selfWords;
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
        ScientificResearchAchievementsWritings other = (ScientificResearchAchievementsWritings) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIsRepresentativeness() == null ? other.getIsRepresentativeness() == null : this.getIsRepresentativeness().equals(other.getIsRepresentativeness()))
            && (this.getWritingsName() == null ? other.getWritingsName() == null : this.getWritingsName().equals(other.getWritingsName()))
            && (this.getSubjectAreas() == null ? other.getSubjectAreas() == null : this.getSubjectAreas().equals(other.getSubjectAreas()))
            && (this.getPublicationDate() == null ? other.getPublicationDate() == null : this.getPublicationDate().equals(other.getPublicationDate()))
            && (this.getPublicationName() == null ? other.getPublicationName() == null : this.getPublicationName().equals(other.getPublicationName()))
            && (this.getNumbers() == null ? other.getNumbers() == null : this.getNumbers().equals(other.getNumbers()))
            && (this.getSelfRole() == null ? other.getSelfRole() == null : this.getSelfRole().equals(other.getSelfRole()))
            && (this.getTotalWords() == null ? other.getTotalWords() == null : this.getTotalWords().equals(other.getTotalWords()))
            && (this.getSelfWords() == null ? other.getSelfWords() == null : this.getSelfWords().equals(other.getSelfWords()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIsRepresentativeness() == null) ? 0 : getIsRepresentativeness().hashCode());
        result = prime * result + ((getWritingsName() == null) ? 0 : getWritingsName().hashCode());
        result = prime * result + ((getSubjectAreas() == null) ? 0 : getSubjectAreas().hashCode());
        result = prime * result + ((getPublicationDate() == null) ? 0 : getPublicationDate().hashCode());
        result = prime * result + ((getPublicationName() == null) ? 0 : getPublicationName().hashCode());
        result = prime * result + ((getNumbers() == null) ? 0 : getNumbers().hashCode());
        result = prime * result + ((getSelfRole() == null) ? 0 : getSelfRole().hashCode());
        result = prime * result + ((getTotalWords() == null) ? 0 : getTotalWords().hashCode());
        result = prime * result + ((getSelfWords() == null) ? 0 : getSelfWords().hashCode());
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
        sb.append(", writingsName=").append(writingsName);
        sb.append(", subjectAreas=").append(subjectAreas);
        sb.append(", publicationDate=").append(publicationDate);
        sb.append(", publicationName=").append(publicationName);
        sb.append(", numbers=").append(numbers);
        sb.append(", selfRole=").append(selfRole);
        sb.append(", totalWords=").append(totalWords);
        sb.append(", selfWords=").append(selfWords);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}