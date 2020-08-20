package com.macro.mall.base.dto.topConfig;

import java.io.Serializable;

public class IndexSearchBean implements Serializable {

    private String userPlt;

    private String cityId;
    private Integer pageNum;
    private String pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getUserPlt() {
        return userPlt;
    }

    public void setUserPlt(String userPlt) {
        this.userPlt = userPlt;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
