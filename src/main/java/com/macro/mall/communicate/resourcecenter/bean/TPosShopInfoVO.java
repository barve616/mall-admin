package com.macro.mall.communicate.resourcecenter.bean;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Validated
public class TPosShopInfoVO implements Serializable {
    @ApiModelProperty(value = "店铺id")
    private String shopId;

    @ApiModelProperty(value = "商户id")
    @NotEmpty(message = "商户id不能为为空")
    private String posId;

    @ApiModelProperty(value = "店铺Logo")
    @NotEmpty(message = "店铺Logo不能为空")
    private String shopLogo;

    @ApiModelProperty(value = "店铺标签")
    @NotEmpty(message = "店铺标签不能为空")
    private String shopLabel;

    @ApiModelProperty(value = "店铺名字")
    private String shopName;

    @ApiModelProperty(value = "店铺英文名字")
    private String shopEnglishName;

    @ApiModelProperty(value = "店铺类型")
    private String shopType;

    @ApiModelProperty(value = "店铺简述")
    private String shopDescription;

    @ApiModelProperty(value = "省编码")
    @NotEmpty(message = "省编码不能为空")
    private String provinceCode;

    @ApiModelProperty(value = "市编码")
    @NotEmpty(message = "市编码不能为空")
    private String cityCode;

    @ApiModelProperty(value = "区编码")
    //@NotEmpty(message = "区编码不能为空")
    private String regionCode;

    @ApiModelProperty(value = "详细地址")
    //@NotEmpty(message = "详细地址不能为空")
    private String shopAddress;

    @ApiModelProperty(value = "搜索页广告图")
    //@NotEmpty(message = "搜索页广告图不能为空")
    private String searchPageImage;

    @ApiModelProperty(value = "首页轮播图信息")
    @NotEmpty(message = "首页轮播图信息不能为空")
    private String rotationnChartInfo;

    @ApiModelProperty(value = "首页橱窗页")
    @NotEmpty(message = "首页橱窗页不能为空")
    private String shopWindowSeat;

    @ApiModelProperty(value = "首页橱窗页")
    @NotEmpty(message = "搜索框铺底数据不能为空")
    private String searchFoundationData;


    @ApiModelProperty(value = "店铺详情")
    private String shopDetail;

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


    public String getShopDetail() {
        return shopDetail;
    }

    public void setShopDetail(String shopDetail) {
        this.shopDetail = shopDetail;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSearchFoundationData() {
        return searchFoundationData;
    }

    public void setSearchFoundationData(String searchFoundationData) {
        this.searchFoundationData = searchFoundationData;
    }

    @Override
    public String toString() {
        return "TPosShopInfoVO{" +
                "shopId='" + shopId + '\'' +
                ", posId='" + posId + '\'' +
                ", shopLogo='" + shopLogo + '\'' +
                ", shopLabel='" + shopLabel + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopEnglishName='" + shopEnglishName + '\'' +
                ", shopType='" + shopType + '\'' +
                ", shopDescription='" + shopDescription + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", regionCode='" + regionCode + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", searchPageImage='" + searchPageImage + '\'' +
                ", rotationnChartInfo='" + rotationnChartInfo + '\'' +
                ", shopWindowSeat='" + shopWindowSeat + '\'' +
                ", searchFoundationData='" + searchFoundationData + '\'' +
                ", shopDetail='" + shopDetail + '\'' +
                '}';
    }
}