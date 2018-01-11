package cn.nfsysu.renshi.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ScientificResearchAchievementsMedicine implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 证书名称
     */
    private String certificateName;

    /**
     * 是否具有代表性
     */
    private String isRepresentativeness;

    /**
     * 证书批号
     */
    private String certificateNumber;

    /**
     * 本人角色
     */
    private String selfRole;

    /**
     * 颁发时间
     */
    private Date awardTime;

    /**
     * 有效期
     */
    private String validityPeriod;

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

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getIsRepresentativeness() {
        return isRepresentativeness;
    }

    public void setIsRepresentativeness(String isRepresentativeness) {
        this.isRepresentativeness = isRepresentativeness;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getSelfRole() {
        return selfRole;
    }

    public void setSelfRole(String selfRole) {
        this.selfRole = selfRole;
    }

    public Date getAwardTime() {
        return awardTime;
    }

    public void setAwardTime(Date awardTime) {
        this.awardTime = awardTime;
    }

    public String getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(String validityPeriod) {
        this.validityPeriod = validityPeriod;
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
        ScientificResearchAchievementsMedicine other = (ScientificResearchAchievementsMedicine) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getCertificateName() == null ? other.getCertificateName() == null : this.getCertificateName().equals(other.getCertificateName()))
            && (this.getIsRepresentativeness() == null ? other.getIsRepresentativeness() == null : this.getIsRepresentativeness().equals(other.getIsRepresentativeness()))
            && (this.getCertificateNumber() == null ? other.getCertificateNumber() == null : this.getCertificateNumber().equals(other.getCertificateNumber()))
            && (this.getSelfRole() == null ? other.getSelfRole() == null : this.getSelfRole().equals(other.getSelfRole()))
            && (this.getAwardTime() == null ? other.getAwardTime() == null : this.getAwardTime().equals(other.getAwardTime()))
            && (this.getValidityPeriod() == null ? other.getValidityPeriod() == null : this.getValidityPeriod().equals(other.getValidityPeriod()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        result = prime * result + ((getIsRepresentativeness() == null) ? 0 : getIsRepresentativeness().hashCode());
        result = prime * result + ((getCertificateNumber() == null) ? 0 : getCertificateNumber().hashCode());
        result = prime * result + ((getSelfRole() == null) ? 0 : getSelfRole().hashCode());
        result = prime * result + ((getAwardTime() == null) ? 0 : getAwardTime().hashCode());
        result = prime * result + ((getValidityPeriod() == null) ? 0 : getValidityPeriod().hashCode());
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
        sb.append(", certificateName=").append(certificateName);
        sb.append(", isRepresentativeness=").append(isRepresentativeness);
        sb.append(", certificateNumber=").append(certificateNumber);
        sb.append(", selfRole=").append(selfRole);
        sb.append(", awardTime=").append(awardTime);
        sb.append(", validityPeriod=").append(validityPeriod);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}