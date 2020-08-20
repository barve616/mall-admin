package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class TSportCommodity implements Serializable {
    private String commodityId;

    private String createTime;

    private String updateTime;

    private String commodityTypeId;

    private String shopCommodityType;

    private String channel;

    private String rotationnChartUrl;

    private String picUrl;

    private String shopId;

    private String posId;

    private String brandId;

    private String commodityName;

    private Short monthlySales;

    private Short commoditySales;

    private Short commodityStock;

    private String phone;

    private String site;

    private String provinceCode;

    private String cityCode;

    private String regionCode;

    private String reserveDays;

    private String advanceReserveDays;

    private String commodityScore;

    private BigDecimal commodityDailyPrice;

    private BigDecimal commodityMinPrice;

    private BigDecimal commodityMaxPrice;

    private String commodityDescribe;

    private String detailRemark;

    private String examineStatus;

    private String examineFailureReason;

    private String examineTime;

    private String examinePerson;

    private String storeId;

    private String commodityLongitude;

    private String commodityLatitude;

    private String commodityTypeName;

    private String activityStock;

    private String payPrice;

    private static final long serialVersionUID = 1L;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(String commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public String getShopCommodityType() {
        return shopCommodityType;
    }

    public void setShopCommodityType(String shopCommodityType) {
        this.shopCommodityType = shopCommodityType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRotationnChartUrl() {
        return rotationnChartUrl;
    }

    public void setRotationnChartUrl(String rotationnChartUrl) {
        this.rotationnChartUrl = rotationnChartUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Short getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(Short monthlySales) {
        this.monthlySales = monthlySales;
    }

    public Short getCommoditySales() {
        return commoditySales;
    }

    public void setCommoditySales(Short commoditySales) {
        this.commoditySales = commoditySales;
    }

    public Short getCommodityStock() {
        return commodityStock;
    }

    public void setCommodityStock(Short commodityStock) {
        this.commodityStock = commodityStock;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
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

    public String getReserveDays() {
        return reserveDays;
    }

    public void setReserveDays(String reserveDays) {
        this.reserveDays = reserveDays;
    }

    public String getAdvanceReserveDays() {
        return advanceReserveDays;
    }

    public void setAdvanceReserveDays(String advanceReserveDays) {
        this.advanceReserveDays = advanceReserveDays;
    }

    public String getCommodityScore() {
        return commodityScore;
    }

    public void setCommodityScore(String commodityScore) {
        this.commodityScore = commodityScore;
    }

    public BigDecimal getCommodityDailyPrice() {
        return commodityDailyPrice;
    }

    public void setCommodityDailyPrice(BigDecimal commodityDailyPrice) {
        this.commodityDailyPrice = commodityDailyPrice;
    }

    public BigDecimal getCommodityMinPrice() {
        return commodityMinPrice;
    }

    public void setCommodityMinPrice(BigDecimal commodityMinPrice) {
        this.commodityMinPrice = commodityMinPrice;
    }

    public BigDecimal getCommodityMaxPrice() {
        return commodityMaxPrice;
    }

    public void setCommodityMaxPrice(BigDecimal commodityMaxPrice) {
        this.commodityMaxPrice = commodityMaxPrice;
    }

    public String getCommodityDescribe() {
        return commodityDescribe;
    }

    public void setCommodityDescribe(String commodityDescribe) {
        this.commodityDescribe = commodityDescribe;
    }

    public String getDetailRemark() {
        return detailRemark;
    }

    public void setDetailRemark(String detailRemark) {
        this.detailRemark = detailRemark;
    }

    public String getExamineStatus() {
        return examineStatus;
    }

    public void setExamineStatus(String examineStatus) {
        this.examineStatus = examineStatus;
    }

    public String getExamineFailureReason() {
        return examineFailureReason;
    }

    public void setExamineFailureReason(String examineFailureReason) {
        this.examineFailureReason = examineFailureReason;
    }

    public String getExamineTime() {
        return examineTime;
    }

    public void setExamineTime(String examineTime) {
        this.examineTime = examineTime;
    }

    public String getExaminePerson() {
        return examinePerson;
    }

    public void setExaminePerson(String examinePerson) {
        this.examinePerson = examinePerson;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getCommodityLongitude() {
        return commodityLongitude;
    }

    public void setCommodityLongitude(String commodityLongitude) {
        this.commodityLongitude = commodityLongitude;
    }

    public String getCommodityLatitude() {
        return commodityLatitude;
    }

    public void setCommodityLatitude(String commodityLatitude) {
        this.commodityLatitude = commodityLatitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commodityId=").append(commodityId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", commodityTypeId=").append(commodityTypeId);
        sb.append(", shopCommodityType=").append(shopCommodityType);
        sb.append(", channel=").append(channel);
        sb.append(", rotationnChartUrl=").append(rotationnChartUrl);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", shopId=").append(shopId);
        sb.append(", posId=").append(posId);
        sb.append(", brandId=").append(brandId);
        sb.append(", commodityName=").append(commodityName);
        sb.append(", monthlySales=").append(monthlySales);
        sb.append(", commoditySales=").append(commoditySales);
        sb.append(", commodityStock=").append(commodityStock);
        sb.append(", phone=").append(phone);
        sb.append(", site=").append(site);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", reserveDays=").append(reserveDays);
        sb.append(", advanceReserveDays=").append(advanceReserveDays);
        sb.append(", commodityScore=").append(commodityScore);
        sb.append(", commodityDailyPrice=").append(commodityDailyPrice);
        sb.append(", commodityMinPrice=").append(commodityMinPrice);
        sb.append(", commodityMaxPrice=").append(commodityMaxPrice);
        sb.append(", commodityDescribe=").append(commodityDescribe);
        sb.append(", detailRemark=").append(detailRemark);
        sb.append(", examineStatus=").append(examineStatus);
        sb.append(", examineFailureReason=").append(examineFailureReason);
        sb.append(", examineTime=").append(examineTime);
        sb.append(", examinePerson=").append(examinePerson);
        sb.append(", storeId=").append(storeId);
        sb.append(", commodityLongitude=").append(commodityLongitude);
        sb.append(", commodityLatitude=").append(commodityLatitude);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName;
    }

    public String getActivityStock() {
        return activityStock;
    }

    public void setActivityStock(String activityStock) {
        this.activityStock = activityStock;
    }

    public String getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(String payPrice) {
        this.payPrice = payPrice;
    }
}