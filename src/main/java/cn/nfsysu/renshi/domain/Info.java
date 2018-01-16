package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class Info implements Serializable {
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 曾用名
     */
    private String oldName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 教职工号
     */
    private String workNumber;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 身份证类型
     */
    private String idCardType;

    /**
     * 身份证号
     */
    private String idCardNumber;

    /**
     * 出生日期
     */
    private String birthDate;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 出生地（行政区代码）
     */
    private String nativeHeath;

    /**
     * 民族
     */
    private String nation;

    /**
     * 政治面貌
     */
    private String politicalOutlook;

    /**
     * 婚姻状况
     */
    private String maritalStatus;

    /**
     * 健康状况
     */
    private String healthStatus;

    /**
     * 参加工作日期
     */
    private String joinWorkDate;

    /**
     * 加入本校时期
     */
    private String joinSchoolDate;

    /**
     * 教职工来源
     */
    private String employeeOrigin;

    /**
     * 学缘结构
     */
    private String marginStructure;

    /**
     * 教职工类别
     */
    private String workType;

    /**
     * 是否在编
     */
    private String isOrganization;

    /**
     * 用人形式
     */
    private String humanForm;

    /**
     * 签订合同情况
     */
    private String signContract;

    /**
     * 所在二级单位（电子通信与软件工程系
     */
    private String organisation;

    /**
     * 人员状态
     */
    private String stateOfPersonnel;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getNativeHeath() {
        return nativeHeath;
    }

    public void setNativeHeath(String nativeHeath) {
        this.nativeHeath = nativeHeath;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPoliticalOutlook() {
        return politicalOutlook;
    }

    public void setPoliticalOutlook(String politicalOutlook) {
        this.politicalOutlook = politicalOutlook;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getJoinWorkDate() {
        return joinWorkDate;
    }

    public void setJoinWorkDate(String joinWorkDate) {
        this.joinWorkDate = joinWorkDate;
    }

    public String getJoinSchoolDate() {
        return joinSchoolDate;
    }

    public void setJoinSchoolDate(String joinSchoolDate) {
        this.joinSchoolDate = joinSchoolDate;
    }

    public String getEmployeeOrigin() {
        return employeeOrigin;
    }

    public void setEmployeeOrigin(String employeeOrigin) {
        this.employeeOrigin = employeeOrigin;
    }

    public String getMarginStructure() {
        return marginStructure;
    }

    public void setMarginStructure(String marginStructure) {
        this.marginStructure = marginStructure;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getIsOrganization() {
        return isOrganization;
    }

    public void setIsOrganization(String isOrganization) {
        this.isOrganization = isOrganization;
    }

    public String getHumanForm() {
        return humanForm;
    }

    public void setHumanForm(String humanForm) {
        this.humanForm = humanForm;
    }

    public String getSignContract() {
        return signContract;
    }

    public void setSignContract(String signContract) {
        this.signContract = signContract;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getStateOfPersonnel() {
        return stateOfPersonnel;
    }

    public void setStateOfPersonnel(String stateOfPersonnel) {
        this.stateOfPersonnel = stateOfPersonnel;
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
        Info other = (Info) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOldName() == null ? other.getOldName() == null : this.getOldName().equals(other.getOldName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getWorkNumber() == null ? other.getWorkNumber() == null : this.getWorkNumber().equals(other.getWorkNumber()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getIdCardType() == null ? other.getIdCardType() == null : this.getIdCardType().equals(other.getIdCardType()))
            && (this.getIdCardNumber() == null ? other.getIdCardNumber() == null : this.getIdCardNumber().equals(other.getIdCardNumber()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getNativePlace() == null ? other.getNativePlace() == null : this.getNativePlace().equals(other.getNativePlace()))
            && (this.getNativeHeath() == null ? other.getNativeHeath() == null : this.getNativeHeath().equals(other.getNativeHeath()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getPoliticalOutlook() == null ? other.getPoliticalOutlook() == null : this.getPoliticalOutlook().equals(other.getPoliticalOutlook()))
            && (this.getMaritalStatus() == null ? other.getMaritalStatus() == null : this.getMaritalStatus().equals(other.getMaritalStatus()))
            && (this.getHealthStatus() == null ? other.getHealthStatus() == null : this.getHealthStatus().equals(other.getHealthStatus()))
            && (this.getJoinWorkDate() == null ? other.getJoinWorkDate() == null : this.getJoinWorkDate().equals(other.getJoinWorkDate()))
            && (this.getJoinSchoolDate() == null ? other.getJoinSchoolDate() == null : this.getJoinSchoolDate().equals(other.getJoinSchoolDate()))
            && (this.getEmployeeOrigin() == null ? other.getEmployeeOrigin() == null : this.getEmployeeOrigin().equals(other.getEmployeeOrigin()))
            && (this.getMarginStructure() == null ? other.getMarginStructure() == null : this.getMarginStructure().equals(other.getMarginStructure()))
            && (this.getWorkType() == null ? other.getWorkType() == null : this.getWorkType().equals(other.getWorkType()))
            && (this.getIsOrganization() == null ? other.getIsOrganization() == null : this.getIsOrganization().equals(other.getIsOrganization()))
            && (this.getHumanForm() == null ? other.getHumanForm() == null : this.getHumanForm().equals(other.getHumanForm()))
            && (this.getSignContract() == null ? other.getSignContract() == null : this.getSignContract().equals(other.getSignContract()))
            && (this.getOrganisation() == null ? other.getOrganisation() == null : this.getOrganisation().equals(other.getOrganisation()))
            && (this.getStateOfPersonnel() == null ? other.getStateOfPersonnel() == null : this.getStateOfPersonnel().equals(other.getStateOfPersonnel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOldName() == null) ? 0 : getOldName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getWorkNumber() == null) ? 0 : getWorkNumber().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getIdCardType() == null) ? 0 : getIdCardType().hashCode());
        result = prime * result + ((getIdCardNumber() == null) ? 0 : getIdCardNumber().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getNativePlace() == null) ? 0 : getNativePlace().hashCode());
        result = prime * result + ((getNativeHeath() == null) ? 0 : getNativeHeath().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getPoliticalOutlook() == null) ? 0 : getPoliticalOutlook().hashCode());
        result = prime * result + ((getMaritalStatus() == null) ? 0 : getMaritalStatus().hashCode());
        result = prime * result + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        result = prime * result + ((getJoinWorkDate() == null) ? 0 : getJoinWorkDate().hashCode());
        result = prime * result + ((getJoinSchoolDate() == null) ? 0 : getJoinSchoolDate().hashCode());
        result = prime * result + ((getEmployeeOrigin() == null) ? 0 : getEmployeeOrigin().hashCode());
        result = prime * result + ((getMarginStructure() == null) ? 0 : getMarginStructure().hashCode());
        result = prime * result + ((getWorkType() == null) ? 0 : getWorkType().hashCode());
        result = prime * result + ((getIsOrganization() == null) ? 0 : getIsOrganization().hashCode());
        result = prime * result + ((getHumanForm() == null) ? 0 : getHumanForm().hashCode());
        result = prime * result + ((getSignContract() == null) ? 0 : getSignContract().hashCode());
        result = prime * result + ((getOrganisation() == null) ? 0 : getOrganisation().hashCode());
        result = prime * result + ((getStateOfPersonnel() == null) ? 0 : getStateOfPersonnel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", oldName=").append(oldName);
        sb.append(", sex=").append(sex);
        sb.append(", workNumber=").append(workNumber);
        sb.append(", nationality=").append(nationality);
        sb.append(", idCardType=").append(idCardType);
        sb.append(", idCardNumber=").append(idCardNumber);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", nativeHeath=").append(nativeHeath);
        sb.append(", nation=").append(nation);
        sb.append(", politicalOutlook=").append(politicalOutlook);
        sb.append(", maritalStatus=").append(maritalStatus);
        sb.append(", healthStatus=").append(healthStatus);
        sb.append(", joinWorkDate=").append(joinWorkDate);
        sb.append(", joinSchoolDate=").append(joinSchoolDate);
        sb.append(", employeeOrigin=").append(employeeOrigin);
        sb.append(", marginStructure=").append(marginStructure);
        sb.append(", workType=").append(workType);
        sb.append(", isOrganization=").append(isOrganization);
        sb.append(", humanForm=").append(humanForm);
        sb.append(", signContract=").append(signContract);
        sb.append(", organisation=").append(organisation);
        sb.append(", stateOfPersonnel=").append(stateOfPersonnel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}