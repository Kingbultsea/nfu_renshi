package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class Education implements Serializable {
    private Integer id;

    private String father;

    /**
     * 年度
     */
    private String years;

    /**
     * 学期
     */
    private String term;

    /**
     * 导师类别
     */
    private String mentorCategory;

    /**
     * 现从事领域
     */
    private String nowScienceArea;

    /**
     * 是否为本科生上课
     */
    private String isForUndergraduate;

    /**
     * 教学学时
     */
    private Integer teachingHours;

    /**
     * 其他工作折合时数
     */
    private String otherHours;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getMentorCategory() {
        return mentorCategory;
    }

    public void setMentorCategory(String mentorCategory) {
        this.mentorCategory = mentorCategory;
    }

    public String getNowScienceArea() {
        return nowScienceArea;
    }

    public void setNowScienceArea(String nowScienceArea) {
        this.nowScienceArea = nowScienceArea;
    }

    public String getIsForUndergraduate() {
        return isForUndergraduate;
    }

    public void setIsForUndergraduate(String isForUndergraduate) {
        this.isForUndergraduate = isForUndergraduate;
    }

    public Integer getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(Integer teachingHours) {
        this.teachingHours = teachingHours;
    }

    public String getOtherHours() {
        return otherHours;
    }

    public void setOtherHours(String otherHours) {
        this.otherHours = otherHours;
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
        Education other = (Education) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getYears() == null ? other.getYears() == null : this.getYears().equals(other.getYears()))
            && (this.getTerm() == null ? other.getTerm() == null : this.getTerm().equals(other.getTerm()))
            && (this.getMentorCategory() == null ? other.getMentorCategory() == null : this.getMentorCategory().equals(other.getMentorCategory()))
            && (this.getNowScienceArea() == null ? other.getNowScienceArea() == null : this.getNowScienceArea().equals(other.getNowScienceArea()))
            && (this.getIsForUndergraduate() == null ? other.getIsForUndergraduate() == null : this.getIsForUndergraduate().equals(other.getIsForUndergraduate()))
            && (this.getTeachingHours() == null ? other.getTeachingHours() == null : this.getTeachingHours().equals(other.getTeachingHours()))
            && (this.getOtherHours() == null ? other.getOtherHours() == null : this.getOtherHours().equals(other.getOtherHours()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getYears() == null) ? 0 : getYears().hashCode());
        result = prime * result + ((getTerm() == null) ? 0 : getTerm().hashCode());
        result = prime * result + ((getMentorCategory() == null) ? 0 : getMentorCategory().hashCode());
        result = prime * result + ((getNowScienceArea() == null) ? 0 : getNowScienceArea().hashCode());
        result = prime * result + ((getIsForUndergraduate() == null) ? 0 : getIsForUndergraduate().hashCode());
        result = prime * result + ((getTeachingHours() == null) ? 0 : getTeachingHours().hashCode());
        result = prime * result + ((getOtherHours() == null) ? 0 : getOtherHours().hashCode());
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
        sb.append(", years=").append(years);
        sb.append(", term=").append(term);
        sb.append(", mentorCategory=").append(mentorCategory);
        sb.append(", nowScienceArea=").append(nowScienceArea);
        sb.append(", isForUndergraduate=").append(isForUndergraduate);
        sb.append(", teachingHours=").append(teachingHours);
        sb.append(", otherHours=").append(otherHours);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}