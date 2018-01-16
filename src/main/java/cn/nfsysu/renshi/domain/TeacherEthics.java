package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class TeacherEthics implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 荣誉界别
     */
    private String level;

    /**
     * 荣誉名称
     */
    private String honorName;

    /**
     * 时间
     */
    private String honorTime;

    /**
     * 荣誉描述
     */
    private String honorDescribe;

    /**
     * 单位名称
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getHonorName() {
        return honorName;
    }

    public void setHonorName(String honorName) {
        this.honorName = honorName;
    }

    public String getHonorTime() {
        return honorTime;
    }

    public void setHonorTime(String honorTime) {
        this.honorTime = honorTime;
    }

    public String getHonorDescribe() {
        return honorDescribe;
    }

    public void setHonorDescribe(String honorDescribe) {
        this.honorDescribe = honorDescribe;
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
        TeacherEthics other = (TeacherEthics) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getHonorName() == null ? other.getHonorName() == null : this.getHonorName().equals(other.getHonorName()))
            && (this.getHonorTime() == null ? other.getHonorTime() == null : this.getHonorTime().equals(other.getHonorTime()))
            && (this.getHonorDescribe() == null ? other.getHonorDescribe() == null : this.getHonorDescribe().equals(other.getHonorDescribe()))
            && (this.getUnitName() == null ? other.getUnitName() == null : this.getUnitName().equals(other.getUnitName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getHonorName() == null) ? 0 : getHonorName().hashCode());
        result = prime * result + ((getHonorTime() == null) ? 0 : getHonorTime().hashCode());
        result = prime * result + ((getHonorDescribe() == null) ? 0 : getHonorDescribe().hashCode());
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
        sb.append(", level=").append(level);
        sb.append(", honorName=").append(honorName);
        sb.append(", honorTime=").append(honorTime);
        sb.append(", honorDescribe=").append(honorDescribe);
        sb.append(", unitName=").append(unitName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}