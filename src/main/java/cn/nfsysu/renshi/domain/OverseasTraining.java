package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class OverseasTraining implements Serializable {
    private Integer id;

    /**
     * 是否有海外访学经历
     */
    private String isHasExperience;

    /**
     * 开始日期
     */
    private String beginTime;

    /**
     * 结束日期
     */
    private String endTime;

    /**
     * 国家
     */
    private String country;

    /**
     * 机构名称
     */
    private String organizationName;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 组织单位名称
     */
    private String organizationalUnit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsHasExperience() {
        return isHasExperience;
    }

    public void setIsHasExperience(String isHasExperience) {
        this.isHasExperience = isHasExperience;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
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
        OverseasTraining other = (OverseasTraining) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIsHasExperience() == null ? other.getIsHasExperience() == null : this.getIsHasExperience().equals(other.getIsHasExperience()))
            && (this.getBeginTime() == null ? other.getBeginTime() == null : this.getBeginTime().equals(other.getBeginTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getOrganizationName() == null ? other.getOrganizationName() == null : this.getOrganizationName().equals(other.getOrganizationName()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getOrganizationalUnit() == null ? other.getOrganizationalUnit() == null : this.getOrganizationalUnit().equals(other.getOrganizationalUnit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIsHasExperience() == null) ? 0 : getIsHasExperience().hashCode());
        result = prime * result + ((getBeginTime() == null) ? 0 : getBeginTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getOrganizationName() == null) ? 0 : getOrganizationName().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getOrganizationalUnit() == null) ? 0 : getOrganizationalUnit().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", isHasExperience=").append(isHasExperience);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", country=").append(country);
        sb.append(", organizationName=").append(organizationName);
        sb.append(", projectName=").append(projectName);
        sb.append(", organizationalUnit=").append(organizationalUnit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}