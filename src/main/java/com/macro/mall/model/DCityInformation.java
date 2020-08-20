package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Transient;

import java.io.Serializable;

public class DCityInformation implements Serializable {
    private String provinceId;

    private String provinceName;

    private String cityName;

    private String cityId;

    private String area2;

    private String locationId;

    private String vasCityId;

    private String valsPostionId;

    private String flag;

    private String isHot;

    @Transient
    private String   name;


    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getArea2() {
        return area2;
    }

    public void setArea2(String area2) {
        this.area2 = area2;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getVasCityId() {
        return vasCityId;
    }

    public void setVasCityId(String vasCityId) {
        this.vasCityId = vasCityId;
    }

    public String getValsPostionId() {
        return valsPostionId;
    }

    public void setValsPostionId(String valsPostionId) {
        this.valsPostionId = valsPostionId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", provinceId=").append(provinceId);
        sb.append(", provinceName=").append(provinceName);
        sb.append(", cityName=").append(cityName);
        sb.append(", cityId=").append(cityId);
        sb.append(", area2=").append(area2);
        sb.append(", locationId=").append(locationId);
        sb.append(", vasCityId=").append(vasCityId);
        sb.append(", valsPostionId=").append(valsPostionId);
        sb.append(", flag=").append(flag);
        sb.append(", isHot=").append(isHot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}