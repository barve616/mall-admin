package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TPosShopInfo implements Serializable {
    private String shopId;

    private String posId;

    private String shopLogo;

    private String shopLabel;

    private String shopName;

    private String shopEnglishName;

    private String shopType;

    private String shopDescription;

    private String provinceCode;

    private String cityCode;

    private String regionCode;

    private String shopAddress;

    private String searchPageImage;

    private String rotationnChartInfo;

    private String shopWindowSeat;

    private String createTime;

    private String updateTime;

    private String coachId;

    private String merId;

    private String termId;

    private String termName;

    private String shopStatus;

    private String searchFoundationData;

    private byte[] shopDetail;

    private String createdTime;

    private String updatedTime;

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    private static final long serialVersionUID = 1L;

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

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    public String getShopLabel() {
        return shopLabel;
    }

    public void setShopLabel(String shopLabel) {
        this.shopLabel = shopLabel;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopEnglishName() {
        return shopEnglishName;
    }

    public void setShopEnglishName(String shopEnglishName) {
        this.shopEnglishName = shopEnglishName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
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

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getSearchPageImage() {
        return searchPageImage;
    }

    public void setSearchPageImage(String searchPageImage) {
        this.searchPageImage = searchPageImage;
    }

    public String getRotationnChartInfo() {
        return rotationnChartInfo;
    }

    public void setRotationnChartInfo(String rotationnChartInfo) {
        this.rotationnChartInfo = rotationnChartInfo;
    }

    public String getShopWindowSeat() {
        return shopWindowSeat;
    }

    public void setShopWindowSeat(String shopWindowSeat) {
        this.shopWindowSeat = shopWindowSeat;
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

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }

    public String getSearchFoundationData() {
        return searchFoundationData;
    }

    public void setSearchFoundationData(String searchFoundationData) {
        this.searchFoundationData = searchFoundationData;
    }

    public byte[] getShopDetail() {
        return shopDetail;
    }

    public void setShopDetail(byte[] shopDetail) {
        this.shopDetail = shopDetail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopId=").append(shopId);
        sb.append(", posId=").append(posId);
        sb.append(", shopLogo=").append(shopLogo);
        sb.append(", shopLabel=").append(shopLabel);
        sb.append(", shopName=").append(shopName);
        sb.append(", shopEnglishName=").append(shopEnglishName);
        sb.append(", shopType=").append(shopType);
        sb.append(", shopDescription=").append(shopDescription);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", shopAddress=").append(shopAddress);
        sb.append(", searchPageImage=").append(searchPageImage);
        sb.append(", rotationnChartInfo=").append(rotationnChartInfo);
        sb.append(", shopWindowSeat=").append(shopWindowSeat);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", coachId=").append(coachId);
        sb.append(", merId=").append(merId);
        sb.append(", termId=").append(termId);
        sb.append(", termName=").append(termName);
        sb.append(", shopStatus=").append(shopStatus);
        sb.append(", searchFoundationData=").append(searchFoundationData);
        sb.append(", shopDetail=").append(shopDetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}