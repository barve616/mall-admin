package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TSportAroundPos implements Serializable {
    private String aroundPosId;

    private String createDt;

    private String updateDt;

    private String shopId;

    private String posName;

    private String cityCode;

    private String regionCode;

    private String streetCode;

    private String site;

    private String phone;

    private String businessTimeType;

    private String businessStartTime;

    private String businessEndTime;

    private String facilities;

    private String label;

    private String shopLogo;

    private String rotationChartPic;

    private String state;

    private String aroundPosType;

    private String price;

    private String posType;

    private static final long serialVersionUID = 1L;

    public String getAroundPosId() {
        return aroundPosId;
    }

    public void setAroundPosId(String aroundPosId) {
        this.aroundPosId = aroundPosId;
    }

    public String getCreateDt() {
        return createDt;
    }

    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }

    public String getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(String updateDt) {
        this.updateDt = updateDt;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBusinessTimeType() {
        return businessTimeType;
    }

    public void setBusinessTimeType(String businessTimeType) {
        this.businessTimeType = businessTimeType;
    }

    public String getBusinessStartTime() {
        return businessStartTime;
    }

    public void setBusinessStartTime(String businessStartTime) {
        this.businessStartTime = businessStartTime;
    }

    public String getBusinessEndTime() {
        return businessEndTime;
    }

    public void setBusinessEndTime(String businessEndTime) {
        this.businessEndTime = businessEndTime;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    public String getRotationChartPic() {
        return rotationChartPic;
    }

    public void setRotationChartPic(String rotationChartPic) {
        this.rotationChartPic = rotationChartPic;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAroundPosType() {
        return aroundPosType;
    }

    public void setAroundPosType(String aroundPosType) {
        this.aroundPosType = aroundPosType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPosType() {
        return posType;
    }

    public void setPosType(String posType) {
        this.posType = posType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aroundPosId=").append(aroundPosId);
        sb.append(", createDt=").append(createDt);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", shopId=").append(shopId);
        sb.append(", posName=").append(posName);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", streetCode=").append(streetCode);
        sb.append(", site=").append(site);
        sb.append(", phone=").append(phone);
        sb.append(", businessTimeType=").append(businessTimeType);
        sb.append(", businessStartTime=").append(businessStartTime);
        sb.append(", businessEndTime=").append(businessEndTime);
        sb.append(", facilities=").append(facilities);
        sb.append(", label=").append(label);
        sb.append(", shopLogo=").append(shopLogo);
        sb.append(", rotationChartPic=").append(rotationChartPic);
        sb.append(", state=").append(state);
        sb.append(", aroundPosType=").append(aroundPosType);
        sb.append(", price=").append(price);
        sb.append(", posType=").append(posType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}