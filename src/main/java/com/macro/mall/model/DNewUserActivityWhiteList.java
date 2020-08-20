package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DNewUserActivityWhiteList implements Serializable {
    private String listId;

    private String listName;

    private String certType;

    private String certId;

    private String state;

    private String id;

    private String digitalFlag;

    private static final long serialVersionUID = 1L;

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDigitalFlag() {
        return digitalFlag;
    }

    public void setDigitalFlag(String digitalFlag) {
        this.digitalFlag = digitalFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", listId=").append(listId);
        sb.append(", listName=").append(listName);
        sb.append(", certType=").append(certType);
        sb.append(", certId=").append(certId);
        sb.append(", state=").append(state);
        sb.append(", id=").append(id);
        sb.append(", digitalFlag=").append(digitalFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}