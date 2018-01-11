package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class LanguageSkill implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 语言
     */
    private String language;

    /**
     * 掌握程度
     */
    private String degreeOfMastery;

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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDegreeOfMastery() {
        return degreeOfMastery;
    }

    public void setDegreeOfMastery(String degreeOfMastery) {
        this.degreeOfMastery = degreeOfMastery;
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
        LanguageSkill other = (LanguageSkill) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getDegreeOfMastery() == null ? other.getDegreeOfMastery() == null : this.getDegreeOfMastery().equals(other.getDegreeOfMastery()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getDegreeOfMastery() == null) ? 0 : getDegreeOfMastery().hashCode());
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
        sb.append(", language=").append(language);
        sb.append(", degreeOfMastery=").append(degreeOfMastery);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}