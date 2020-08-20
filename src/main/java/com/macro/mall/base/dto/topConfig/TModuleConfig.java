package com.macro.mall.base.dto.topConfig;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TModuleConfig {
    //Column(name = "ID")
    private String id;

    //Column(name = "FUN_ID")
    private String funId;

    //Column(name = "FUN_IMAGE")
    private String funImage;

    //Column(name = "FUN_TITLE")
    private String funTitle;

    //Column(name = "START_DATE")
    private String startDate;

    //Column(name = "END_DATE")
    private String endDate;

    //Column(name = "REGION")
    private String region;

    private String channel;

    private String keyWord;

    private String funState;

    private String jumpType;

    private String jumpLink;

    private String uiJumpId;

    private String uiParamValue;
    private String msgType;

    private String cityId;
    private String msgInfo;
    private String uiJumpName;
    private String uiJumpPid;
    private List ContentRegionInfo;

    private String type;
    public String getMsgInfo() {
        return msgInfo;
    }

    public void setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
    }

    public String getUiJumpName() {
        return uiJumpName;
    }

    public void setUiJumpName(String uiJumpName) {
        this.uiJumpName = uiJumpName;
    }

    public String getUiJumpPid() {
        return uiJumpPid;
    }

    public void setUiJumpPid(String uiJumpPid) {
        this.uiJumpPid = uiJumpPid;
    }

    public List getContentRegionInfo() {
        return ContentRegionInfo;
    }

    public void setContentRegionInfo(List contentRegionInfo) {
        ContentRegionInfo = contentRegionInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFunId() {
        return funId;
    }

    public void setFunId(String funId) {
        this.funId = funId;
    }

    public String getFunImage() {
        return funImage;
    }

    public void setFunImage(String funImage) {
        this.funImage = funImage;
    }

    public String getFunTitle() {
        return funTitle;
    }

    public void setFunTitle(String funTitle) {
        this.funTitle = funTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getFunState() {
        return funState;
    }

    public void setFunState(String funState) {
        this.funState = funState;
    }

    public String getJumpType() {
        return jumpType;
    }

    public void setJumpType(String jumpType) {
        this.jumpType = jumpType;
    }

    public String getJumpLink() {
        return jumpLink;
    }

    public void setJumpLink(String jumpLink) {
        this.jumpLink = jumpLink;
    }

    public String getUiJumpId() {
        return uiJumpId;
    }

    public void setUiJumpId(String uiJumpId) {
        this.uiJumpId = uiJumpId;
    }

    public String getUiParamValue() {
        return uiParamValue;
    }

    public void setUiParamValue(String uiParamValue) {
        this.uiParamValue = uiParamValue;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
