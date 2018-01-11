package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class TeacherQualification implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 教师资格证种类
     */
    private String qualificationType;

    /**
     * 资格证号码
     */
    private String qualificationNumber;

    /**
     * 任教学科
     */
    private String subject;

    /**
     * 颁发日期
     */
    private String dateOfIssuance;

    /**
     * 颁发机构
     */
    private String lssuingUnit;

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

    public String getQualificationType() {
        return qualificationType;
    }

    public void setQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
    }

    public String getQualificationNumber() {
        return qualificationNumber;
    }

    public void setQualificationNumber(String qualificationNumber) {
        this.qualificationNumber = qualificationNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDateOfIssuance() {
        return dateOfIssuance;
    }

    public void setDateOfIssuance(String dateOfIssuance) {
        this.dateOfIssuance = dateOfIssuance;
    }

    public String getLssuingUnit() {
        return lssuingUnit;
    }

    public void setLssuingUnit(String lssuingUnit) {
        this.lssuingUnit = lssuingUnit;
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
        TeacherQualification other = (TeacherQualification) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getQualificationType() == null ? other.getQualificationType() == null : this.getQualificationType().equals(other.getQualificationType()))
            && (this.getQualificationNumber() == null ? other.getQualificationNumber() == null : this.getQualificationNumber().equals(other.getQualificationNumber()))
            && (this.getSubject() == null ? other.getSubject() == null : this.getSubject().equals(other.getSubject()))
            && (this.getDateOfIssuance() == null ? other.getDateOfIssuance() == null : this.getDateOfIssuance().equals(other.getDateOfIssuance()))
            && (this.getLssuingUnit() == null ? other.getLssuingUnit() == null : this.getLssuingUnit().equals(other.getLssuingUnit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getQualificationType() == null) ? 0 : getQualificationType().hashCode());
        result = prime * result + ((getQualificationNumber() == null) ? 0 : getQualificationNumber().hashCode());
        result = prime * result + ((getSubject() == null) ? 0 : getSubject().hashCode());
        result = prime * result + ((getDateOfIssuance() == null) ? 0 : getDateOfIssuance().hashCode());
        result = prime * result + ((getLssuingUnit() == null) ? 0 : getLssuingUnit().hashCode());
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
        sb.append(", qualificationType=").append(qualificationType);
        sb.append(", qualificationNumber=").append(qualificationNumber);
        sb.append(", subject=").append(subject);
        sb.append(", dateOfIssuance=").append(dateOfIssuance);
        sb.append(", lssuingUnit=").append(lssuingUnit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}