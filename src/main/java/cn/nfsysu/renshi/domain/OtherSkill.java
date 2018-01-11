package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class OtherSkill implements Serializable {
    private Integer id;

    /**
     * 代表人id
     */
    private Integer father;

    /**
     * 其他技能名称
     */
    private String skillName;

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

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
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
        OtherSkill other = (OtherSkill) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getSkillName() == null ? other.getSkillName() == null : this.getSkillName().equals(other.getSkillName()))
            && (this.getDegreeOfMastery() == null ? other.getDegreeOfMastery() == null : this.getDegreeOfMastery().equals(other.getDegreeOfMastery()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getSkillName() == null) ? 0 : getSkillName().hashCode());
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
        sb.append(", skillName=").append(skillName);
        sb.append(", degreeOfMastery=").append(degreeOfMastery);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}