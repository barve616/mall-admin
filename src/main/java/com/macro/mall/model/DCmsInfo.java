package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DCmsInfo implements Serializable {
    private String infoId;

    private String infoImage;

    private String infoName;

    private String infoType;

    private String infoTime;

    private String infoSort;

    private static final long serialVersionUID = 1L;

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public String getInfoImage() {
        return infoImage;
    }

    public void setInfoImage(String infoImage) {
        this.infoImage = infoImage;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public String getInfoTime() {
        return infoTime;
    }

    public void setInfoTime(String infoTime) {
        this.infoTime = infoTime;
    }

    public String getInfoSort() {
        return infoSort;
    }

    public void setInfoSort(String infoSort) {
        this.infoSort = infoSort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", infoId=").append(infoId);
        sb.append(", infoImage=").append(infoImage);
        sb.append(", infoName=").append(infoName);
        sb.append(", infoType=").append(infoType);
        sb.append(", infoTime=").append(infoTime);
        sb.append(", infoSort=").append(infoSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}