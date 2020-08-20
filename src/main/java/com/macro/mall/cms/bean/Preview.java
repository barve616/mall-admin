package com.macro.mall.cms.bean;

/**
 * 预览传参
 */
public class Preview {

    /** 模板id */
    private String pageId;

    /** 大模块ID */
    private String[] datasIds;

    /** 子模块状态 */
    private String[] dStatss;

    /** 数据上架时间 */
    private String startTime;

    /** 数据下架时间 */
    private String endTime;

    /** 是否支持缤纷 */
    private String mlifeFlag;

    /** 是否支持手机银行 */
    private String phoneFlag;

    /** 是否支持微信公众号 */
    private String wxFlag;

    /** 是否支持微信小程序 */
    private String xcxFlag;

    /** 用户ID */
    private String userId;

    /** 城市ID */
    private String cityId;

    public Preview(String pageId, String[] datasIds) {
        this.pageId = pageId;
        this.datasIds = datasIds;
    }

    public Preview(String pageId, String[] datasIds, String[] dStatss, String startTime, String endTime, String mlifeFlag, String phoneFlag, String wxFlag, String xcxFlag, String cityId, String userId) {
        this.pageId = pageId;
        this.datasIds = datasIds;
        this.dStatss = dStatss;
        this.startTime = startTime;
        this.endTime = endTime;
        this.mlifeFlag = mlifeFlag;
        this.phoneFlag = phoneFlag;
        this.wxFlag = wxFlag;
        this.xcxFlag = xcxFlag;
        this.cityId = cityId;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String[] getDatasIds() {
        return datasIds;
    }

    public void setDatasIds(String[] datasIds) {
        this.datasIds = datasIds;
    }

    public String[] getdStatss() {
        return dStatss;
    }

    public void setdStatss(String[] dStatss) {
        this.dStatss = dStatss;
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

    public String getMlifeFlag() {
        return mlifeFlag;
    }

    public void setMlifeFlag(String mlifeFlag) {
        this.mlifeFlag = mlifeFlag;
    }

    public String getPhoneFlag() {
        return phoneFlag;
    }

    public void setPhoneFlag(String phoneFlag) {
        this.phoneFlag = phoneFlag;
    }

    public String getWxFlag() {
        return wxFlag;
    }

    public void setWxFlag(String wxFlag) {
        this.wxFlag = wxFlag;
    }

    public String getXcxFlag() {
        return xcxFlag;
    }

    public void setXcxFlag(String xcxFlag) {
        this.xcxFlag = xcxFlag;
    }
}