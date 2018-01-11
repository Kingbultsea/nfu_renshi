package cn.nfsysu.renshi.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class DomesticTraining implements Serializable {
    private Integer id;

    /**
     * 属于哪个id的人的信息
     */
    private Integer father;

    /**
     * 培训年度 如2016
     */
    private Integer trainYear;

    /**
     * 培训类别
     */
    private String trainType;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 培训机构
     */
    private String trainInstitutions;

    /**
     * 培训方式
     */
    private String trainMode;

    /**
     * 培训获得学时
     */
    private Integer trainGetTime;

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

    public Integer getTrainYear() {
        return trainYear;
    }

    public void setTrainYear(Integer trainYear) {
        this.trainYear = trainYear;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTrainInstitutions() {
        return trainInstitutions;
    }

    public void setTrainInstitutions(String trainInstitutions) {
        this.trainInstitutions = trainInstitutions;
    }

    public String getTrainMode() {
        return trainMode;
    }

    public void setTrainMode(String trainMode) {
        this.trainMode = trainMode;
    }

    public Integer getTrainGetTime() {
        return trainGetTime;
    }

    public void setTrainGetTime(Integer trainGetTime) {
        this.trainGetTime = trainGetTime;
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
        DomesticTraining other = (DomesticTraining) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getTrainYear() == null ? other.getTrainYear() == null : this.getTrainYear().equals(other.getTrainYear()))
            && (this.getTrainType() == null ? other.getTrainType() == null : this.getTrainType().equals(other.getTrainType()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getTrainInstitutions() == null ? other.getTrainInstitutions() == null : this.getTrainInstitutions().equals(other.getTrainInstitutions()))
            && (this.getTrainMode() == null ? other.getTrainMode() == null : this.getTrainMode().equals(other.getTrainMode()))
            && (this.getTrainGetTime() == null ? other.getTrainGetTime() == null : this.getTrainGetTime().equals(other.getTrainGetTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getTrainYear() == null) ? 0 : getTrainYear().hashCode());
        result = prime * result + ((getTrainType() == null) ? 0 : getTrainType().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getTrainInstitutions() == null) ? 0 : getTrainInstitutions().hashCode());
        result = prime * result + ((getTrainMode() == null) ? 0 : getTrainMode().hashCode());
        result = prime * result + ((getTrainGetTime() == null) ? 0 : getTrainGetTime().hashCode());
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
        sb.append(", trainYear=").append(trainYear);
        sb.append(", trainType=").append(trainType);
        sb.append(", projectName=").append(projectName);
        sb.append(", trainInstitutions=").append(trainInstitutions);
        sb.append(", trainMode=").append(trainMode);
        sb.append(", trainGetTime=").append(trainGetTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}