package com.macro.mall.discount.model;

public class ActivitySearchVO {

    private String typeId;//活动类型id
    private String searchInfo;//搜索词
    private String starTime;//搜索开始时间
    private String endTime;//搜索结束时间
    private String playType;//玩法类型



    public String getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(String searchInfo) {
        this.searchInfo = searchInfo;
    }

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPlayType() {
        return playType;
    }

    public void setPlayType(String playType) {
        this.playType = playType;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
}
