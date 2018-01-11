package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class ContactInformation implements Serializable {
    private Integer id;

    private Integer father;

    /**
     * 通讯住址
     */
    private String address;

    /**
     * 电话号
     */
    private String phoneNumber;

    /**
     * 手机号
     */
    private String telNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 其他联系方式
     */
    private String otherTelNumber;

    /**
     * 紧急联系人
     */
    private String emergencyContact;

    /**
     * 紧急联系人号码
     */
    private String emergencyNumber;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOtherTelNumber() {
        return otherTelNumber;
    }

    public void setOtherTelNumber(String otherTelNumber) {
        this.otherTelNumber = otherTelNumber;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
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
        ContactInformation other = (ContactInformation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getTelNumber() == null ? other.getTelNumber() == null : this.getTelNumber().equals(other.getTelNumber()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getOtherTelNumber() == null ? other.getOtherTelNumber() == null : this.getOtherTelNumber().equals(other.getOtherTelNumber()))
            && (this.getEmergencyContact() == null ? other.getEmergencyContact() == null : this.getEmergencyContact().equals(other.getEmergencyContact()))
            && (this.getEmergencyNumber() == null ? other.getEmergencyNumber() == null : this.getEmergencyNumber().equals(other.getEmergencyNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getTelNumber() == null) ? 0 : getTelNumber().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getOtherTelNumber() == null) ? 0 : getOtherTelNumber().hashCode());
        result = prime * result + ((getEmergencyContact() == null) ? 0 : getEmergencyContact().hashCode());
        result = prime * result + ((getEmergencyNumber() == null) ? 0 : getEmergencyNumber().hashCode());
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
        sb.append(", address=").append(address);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", telNumber=").append(telNumber);
        sb.append(", email=").append(email);
        sb.append(", otherTelNumber=").append(otherTelNumber);
        sb.append(", emergencyContact=").append(emergencyContact);
        sb.append(", emergencyNumber=").append(emergencyNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}