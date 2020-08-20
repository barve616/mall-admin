package com.macro.mall.cms.bean;

import org.springframework.data.annotation.Transient;

import java.io.Serializable;

public class CmsCity implements Serializable {
    private String provinceId;


    private String cityId;

    private String   name;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }


    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}