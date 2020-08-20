package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

public class DCmsData implements Serializable {
    private String dataId;

    private String pageId;

    private String funcId;

    private String datasId;

    private String datasGroup;

    private String dStartTime;

    private String dEndTime;

    private String dState;

    private String dMlifeFlag = "02";

    private String mLink;

    private String mJumpId;

    private String mJumpValue;

    private String dPhoneFlag = "02";

    private String pLink;

    private String pJumpId;

    private String pJumpValue;

    private String dWxFlag = "02";

    private String wLink;

    private String wJumpId;

    private String wJumpValue;

    private String dXcxFlag = "02";

    private String xLink;

    private String xJumpId;

    private String xJumpValue;

    private String dataName;

    private String dataImage1;

    private String dataImage2;

    private String dataImage3;

    private String dataImage4;

    private String dataType;

    private String funcsId;

    private String dataSort;

    @Transient
    private String cityId;
    @Transient
    private String peopleId;
    @Transient
    private  String [] state;

    public String[] getState() {
        return state;
    }

    public void setState(String[] state) {
        this.state = state;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId;
    }

    private static final long serialVersionUID = 1L;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public String getDatasId() {
        return datasId;
    }

    public void setDatasId(String datasId) {
        this.datasId = datasId;
    }

    public String getDatasGroup() {
        return datasGroup;
    }

    public void setDatasGroup(String datasGroup) {
        this.datasGroup = datasGroup;
    }

    public String getdStartTime() {
        return dStartTime;
    }

    public void setdStartTime(String dStartTime) {
        this.dStartTime = dStartTime;
    }

    public String getdEndTime() {
        return dEndTime;
    }

    public void setdEndTime(String dEndTime) {
        this.dEndTime = dEndTime;
    }

    public String getdState() {
        return dState;
    }

    public void setdState(String dState) {
        this.dState = dState;
    }

    public String getdMlifeFlag() {
        return dMlifeFlag;
    }

    public void setdMlifeFlag(String dMlifeFlag) {
        this.dMlifeFlag = dMlifeFlag;
    }

    public String getmLink() {
        return mLink;
    }

    public void setmLink(String mLink) {
        this.mLink = mLink;
    }

    public String getmJumpId() {
        return mJumpId;
    }

    public void setmJumpId(String mJumpId) {
        this.mJumpId = mJumpId;
    }

    public String getmJumpValue() {
        return mJumpValue;
    }

    public void setmJumpValue(String mJumpValue) {
        this.mJumpValue = mJumpValue;
    }

    public String getdPhoneFlag() {
        return dPhoneFlag;
    }

    public void setdPhoneFlag(String dPhoneFlag) {
        this.dPhoneFlag = dPhoneFlag;
    }

    public String getpLink() {
        return pLink;
    }

    public void setpLink(String pLink) {
        this.pLink = pLink;
    }

    public String getpJumpId() {
        return pJumpId;
    }

    public void setpJumpId(String pJumpId) {
        this.pJumpId = pJumpId;
    }

    public String getpJumpValue() {
        return pJumpValue;
    }

    public void setpJumpValue(String pJumpValue) {
        this.pJumpValue = pJumpValue;
    }

    public String getdWxFlag() {
        return dWxFlag;
    }

    public void setdWxFlag(String dWxFlag) {
        this.dWxFlag = dWxFlag;
    }

    public String getwLink() {
        return wLink;
    }

    public void setwLink(String wLink) {
        this.wLink = wLink;
    }

    public String getwJumpId() {
        return wJumpId;
    }

    public void setwJumpId(String wJumpId) {
        this.wJumpId = wJumpId;
    }

    public String getwJumpValue() {
        return wJumpValue;
    }

    public void setwJumpValue(String wJumpValue) {
        this.wJumpValue = wJumpValue;
    }

    public String getdXcxFlag() {
        return dXcxFlag;
    }

    public void setdXcxFlag(String dXcxFlag) {
        this.dXcxFlag = dXcxFlag;
    }

    public String getxLink() {
        return xLink;
    }

    public void setxLink(String xLink) {
        this.xLink = xLink;
    }

    public String getxJumpId() {
        return xJumpId;
    }

    public void setxJumpId(String xJumpId) {
        this.xJumpId = xJumpId;
    }

    public String getxJumpValue() {
        return xJumpValue;
    }

    public void setxJumpValue(String xJumpValue) {
        this.xJumpValue = xJumpValue;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getDataImage1() {
        return dataImage1;
    }

    public void setDataImage1(String dataImage1) {
        this.dataImage1 = dataImage1;
    }

    public String getDataImage2() {
        return dataImage2;
    }

    public void setDataImage2(String dataImage2) {
        this.dataImage2 = dataImage2;
    }

    public String getDataImage3() {
        return dataImage3;
    }

    public void setDataImage3(String dataImage3) {
        this.dataImage3 = dataImage3;
    }

    public String getDataImage4() {
        return dataImage4;
    }

    public void setDataImage4(String dataImage4) {
        this.dataImage4 = dataImage4;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getFuncsId() {
        return funcsId;
    }

    public void setFuncsId(String funcsId) {
        this.funcsId = funcsId;
    }

    public String getDataSort() {
        return dataSort;
    }

    public void setDataSort(String dataSort) {
        this.dataSort = dataSort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dataId=").append(dataId);
        sb.append(", pageId=").append(pageId);
        sb.append(", funcId=").append(funcId);
        sb.append(", datasId=").append(datasId);
        sb.append(", datasGroup=").append(datasGroup);
        sb.append(", dStartTime=").append(dStartTime);
        sb.append(", dEndTime=").append(dEndTime);
        sb.append(", dState=").append(dState);
        sb.append(", dMlifeFlag=").append(dMlifeFlag);
        sb.append(", mLink=").append(mLink);
        sb.append(", mJumpId=").append(mJumpId);
        sb.append(", mJumpValue=").append(mJumpValue);
        sb.append(", dPhoneFlag=").append(dPhoneFlag);
        sb.append(", pLink=").append(pLink);
        sb.append(", pJumpId=").append(pJumpId);
        sb.append(", pJumpValue=").append(pJumpValue);
        sb.append(", dWxFlag=").append(dWxFlag);
        sb.append(", wLink=").append(wLink);
        sb.append(", wJumpId=").append(wJumpId);
        sb.append(", wJumpValue=").append(wJumpValue);
        sb.append(", dXcxFlag=").append(dXcxFlag);
        sb.append(", xLink=").append(xLink);
        sb.append(", xJumpId=").append(xJumpId);
        sb.append(", xJumpValue=").append(xJumpValue);
        sb.append(", dataName=").append(dataName);
        sb.append(", dataImage1=").append(dataImage1);
        sb.append(", dataImage2=").append(dataImage2);
        sb.append(", dataImage3=").append(dataImage3);
        sb.append(", dataImage4=").append(dataImage4);
        sb.append(", dataType=").append(dataType);
        sb.append(", funcsId=").append(funcsId);
        sb.append(", dataSort=").append(dataSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}