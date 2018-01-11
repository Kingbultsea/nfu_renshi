package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class SkillCertificate implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 证书类型
     */
    private String certificateType;

    /**
     * 语言证书名称
     */
    private String languageCertificateName;

    /**
     * 证书名称
     */
    private String certificateName;

    /**
     * 颁发年月
     */
    private String years;

    /**
     * 颁发单位
     */
    private String lssuingUnit;

    /**
     * 证书号
     */
    private String certificateNumber;

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

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getLanguageCertificateName() {
        return languageCertificateName;
    }

    public void setLanguageCertificateName(String languageCertificateName) {
        this.languageCertificateName = languageCertificateName;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getLssuingUnit() {
        return lssuingUnit;
    }

    public void setLssuingUnit(String lssuingUnit) {
        this.lssuingUnit = lssuingUnit;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
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
        SkillCertificate other = (SkillCertificate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getCertificateType() == null ? other.getCertificateType() == null : this.getCertificateType().equals(other.getCertificateType()))
            && (this.getLanguageCertificateName() == null ? other.getLanguageCertificateName() == null : this.getLanguageCertificateName().equals(other.getLanguageCertificateName()))
            && (this.getCertificateName() == null ? other.getCertificateName() == null : this.getCertificateName().equals(other.getCertificateName()))
            && (this.getYears() == null ? other.getYears() == null : this.getYears().equals(other.getYears()))
            && (this.getLssuingUnit() == null ? other.getLssuingUnit() == null : this.getLssuingUnit().equals(other.getLssuingUnit()))
            && (this.getCertificateNumber() == null ? other.getCertificateNumber() == null : this.getCertificateNumber().equals(other.getCertificateNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getCertificateType() == null) ? 0 : getCertificateType().hashCode());
        result = prime * result + ((getLanguageCertificateName() == null) ? 0 : getLanguageCertificateName().hashCode());
        result = prime * result + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        result = prime * result + ((getYears() == null) ? 0 : getYears().hashCode());
        result = prime * result + ((getLssuingUnit() == null) ? 0 : getLssuingUnit().hashCode());
        result = prime * result + ((getCertificateNumber() == null) ? 0 : getCertificateNumber().hashCode());
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
        sb.append(", certificateType=").append(certificateType);
        sb.append(", languageCertificateName=").append(languageCertificateName);
        sb.append(", certificateName=").append(certificateName);
        sb.append(", years=").append(years);
        sb.append(", lssuingUnit=").append(lssuingUnit);
        sb.append(", certificateNumber=").append(certificateNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}