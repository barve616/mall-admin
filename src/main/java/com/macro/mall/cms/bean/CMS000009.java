package com.macro.mall.cms.bean;

import io.swagger.annotations.ApiModelProperty;

public class CMS000009 {
    @ApiModelProperty(value = "接口类型 01新增 02更新")
    private String type;
    @ApiModelProperty(value = "子模块ID 更新时传")
    private String dataId;
    @ApiModelProperty(value = "所属大模块ID")
    private String dataSId;
    @ApiModelProperty(value = "所属功能模块ID")
    private String funId;
    @ApiModelProperty(value = "所在行数")
    private String dataGId;
    @ApiModelProperty(value = "所属页面ID")
    private String  pageId;
    @ApiModelProperty(value = "投放渠道 例如01,02,03")
    private String channel;
    @ApiModelProperty(value = "投放城市 例如 01-011,02-021,03-031")
    private String cityId;
    @ApiModelProperty(value = "投放人群 例如  01,02,03")
    private String peopleType;
    @ApiModelProperty(value = "上架日期时间")
    private String startTime;
    @ApiModelProperty(value = "下架日期时间")
    private String endTime;
    @ApiModelProperty(value = "上架状态 00：审核中 01:上架 02：下架")
    private String funState;
    @ApiModelProperty(value = "图片地址1")
    private String funImage01;
    @ApiModelProperty(value = "图片地址2")
    private String funImage02;
    @ApiModelProperty(value = "图片地址3")
    private String funImage03;
    @ApiModelProperty(value = "图片地址4")
    private String funImage04;
    @ApiModelProperty(value = "标题")
    private String funTitle;
    @ApiModelProperty(value = "是否支持缤纷生活")
    private String mlifeFlag;
    @ApiModelProperty(value = "功能id")
    private String mlifeFunID;
    @ApiModelProperty(value = "功能参数")
    private String mlifeFunVae;
    @ApiModelProperty(value = "H5链接")
    private String mlifelink;
    @ApiModelProperty(value = "是否支持手机银行")
    private String phoneFlag;
    @ApiModelProperty(value = "功能id")
    private String phoneFunID;
    @ApiModelProperty(value = "功能参数")
    private String phoneFunVae;
    @ApiModelProperty(value = "H5链接")
    private String phoneLink;
    @ApiModelProperty(value = "是否支持微信公众号")
    private String wxFlag;
    @ApiModelProperty(value = "功能id")
    private String wxFunID;
    @ApiModelProperty(value = "功能参数")
    private String wxFunVae;
    @ApiModelProperty(value = "H5链接")
    private String wxLink;
    @ApiModelProperty(value = "是否支持微信小程序")
    private String xcxFlag;
    @ApiModelProperty(value = "功能id")
    private String xcxFunID;
    @ApiModelProperty(value = "功能参数")
    private String xcxFunVae;
    @ApiModelProperty(value = "H5链接")
    private String xcxLink;
    @ApiModelProperty(value = "页面id")
    private String dataType;




    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }


    public String getDataSId() {
        return dataSId;
    }

    public void setDataSId(String dataSId) {
        this.dataSId = dataSId;
    }

    public String getFunId() {
        return funId;
    }

    public void setFunId(String funId) {
        this.funId = funId;
    }

    public String getDataGId() {
        return dataGId;
    }

    public void setDataGId(String dataGId) {
        this.dataGId = dataGId;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getPeopleType() {
        return peopleType;
    }

    public void setPeopleType(String peopleType) {
        this.peopleType = peopleType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getFunState() {
        return funState;
    }

    public void setFunState(String funState) {
        this.funState = funState;
    }

    public String getFunImage01() {
        return funImage01;
    }

    public void setFunImage01(String funImage01) {
        this.funImage01 = funImage01;
    }

    public String getFunImage02() {
        return funImage02;
    }

    public void setFunImage02(String funImage02) {
        this.funImage02 = funImage02;
    }

    public String getFunImage03() {
        return funImage03;
    }

    public void setFunImage03(String funImage03) {
        this.funImage03 = funImage03;
    }

    public String getFunImage04() {
        return funImage04;
    }

    public void setFunImage04(String funImage04) {
        this.funImage04 = funImage04;
    }

    public String getFunTitle() {
        return funTitle;
    }

    public void setFunTitle(String funTitle) {
        this.funTitle = funTitle;
    }

    public String getMlifeFlag() {
        return mlifeFlag;
    }

    public void setMlifeFlag(String mlifeFlag) {
        this.mlifeFlag = mlifeFlag;
    }

    public String getMlifeFunID() {
        return mlifeFunID;
    }

    public void setMlifeFunID(String mlifeFunID) {
        this.mlifeFunID = mlifeFunID;
    }

    public String getMlifeFunVae() {
        return mlifeFunVae;
    }

    public void setMlifeFunVae(String mlifeFunVae) {
        this.mlifeFunVae = mlifeFunVae;
    }

    public String getMlifelink() {
        return mlifelink;
    }

    public void setMlifelink(String mlifelink) {
        this.mlifelink = mlifelink;
    }

    public String getPhoneFlag() {
        return phoneFlag;
    }

    public void setPhoneFlag(String phoneFlag) {
        this.phoneFlag = phoneFlag;
    }

    public String getPhoneFunID() {
        return phoneFunID;
    }

    public void setPhoneFunID(String phoneFunID) {
        this.phoneFunID = phoneFunID;
    }

    public String getPhoneFunVae() {
        return phoneFunVae;
    }

    public void setPhoneFunVae(String phoneFunVae) {
        this.phoneFunVae = phoneFunVae;
    }

    public String getPhoneLink() {
        return phoneLink;
    }

    public void setPhoneLink(String phoneLink) {
        this.phoneLink = phoneLink;
    }

    public String getWxFlag() {
        return wxFlag;
    }

    public void setWxFlag(String wxFlag) {
        this.wxFlag = wxFlag;
    }

    public String getWxFunID() {
        return wxFunID;
    }

    public void setWxFunID(String wxFunID) {
        this.wxFunID = wxFunID;
    }

    public String getWxFunVae() {
        return wxFunVae;
    }

    public void setWxFunVae(String wxFunVae) {
        this.wxFunVae = wxFunVae;
    }

    public String getWxLink() {
        return wxLink;
    }

    public void setWxLink(String wxLink) {
        this.wxLink = wxLink;
    }

    public String getXcxFlag() {
        return xcxFlag;
    }

    public void setXcxFlag(String xcxFlag) {
        this.xcxFlag = xcxFlag;
    }

    public String getXcxFunID() {
        return xcxFunID;
    }

    public void setXcxFunID(String xcxFunID) {
        this.xcxFunID = xcxFunID;
    }

    public String getXcxFunVae() {
        return xcxFunVae;
    }

    public void setXcxFunVae(String xcxFunVae) {
        this.xcxFunVae = xcxFunVae;
    }

    public String getXcxLink() {
        return xcxLink;
    }

    public void setXcxLink(String xcxLink) {
        this.xcxLink = xcxLink;
    }
}
