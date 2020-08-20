package com.macro.mall.communicate.resourcecenter.bean;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Validated
public class AroundPosInfoVO {

    @ApiModelProperty(value = "周边商户id")
    private String aroundPosId;

    @ApiModelProperty(value = "店铺id")
    private String shopId;

    @ApiModelProperty(value = "商户名称")
    private String posName;

    @ApiModelProperty(value = "商户分类")
    private String aroundPosType;


    @ApiModelProperty(value = "城市编码")
    private String cityCode;

   /* @ApiModelProperty(value = "区（县）编码")
    @NotBlank(message = "区（县）编码不能为为空")
    private String regionCode;*/

    /*@ApiModelProperty(value = "村（镇）编码")
    @NotBlank(message = "村（镇）编码不能为为空")
    private String streetCode;*/

    @ApiModelProperty(value = "店铺地址")
    @Size(min = 1, max = 100, message = "铺地址不能超过100个字符！")
    private String site;

    @ApiModelProperty(value = "联系电话")
    //@Pattern(regexp = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$", message = "联系电话格式不正确！")
    private String phone;

    @ApiModelProperty(value = "营业时间类型")
    //@NotEmpty(message = "营业时间类型不能为空")
    private String businessTimeType;

    @ApiModelProperty(value = "营业开始时间")
    //@NotBlank(message = "营业开始时间不能为空")
    private String businessStartTime;

    @ApiModelProperty(value = "营业结束时间")
    //@NotBlank(message = "营业结束时间不能为空")
    private String businessEndTime;

    @ApiModelProperty(value = "服务设施")
    //@NotBlank(message = "服务设施不能为空")
    @Size(min = 1, max = 200, message = "服务设施不能超过200个字符！")
    private String facilities;

    @ApiModelProperty(value = "人均价格")
    //@NotBlank(message = "人均价格不能为空")
    private String price;

    @ApiModelProperty(value = "商户标签")
    //@NotBlank(message = "商户标签不能为空")
    private String label;

    @ApiModelProperty(value = "店铺LOGO")
    //@NotBlank(message = "店铺LOGO不能为空")
    private String shopLogo;

    @ApiModelProperty(value = "首页轮播图")
    //@NotBlank(message = "首页轮播图不能为空")
    private String rotationChartPic;


    public String getAroundPosId() {
        return aroundPosId;
    }

    public void setAroundPosId(String aroundPosId) {
        this.aroundPosId = aroundPosId;
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


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAroundPosType() {
        return aroundPosType;
    }

    public void setAroundPosType(String aroundPosType) {
        this.aroundPosType = aroundPosType;
    }

    public AroundPosInfoVO() {}

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public String toString() {
        return "AroundPosInfoVO{" +
                "aroundPosId='" + aroundPosId + '\'' +
                ", shopId='" + shopId + '\'' +
                ", posName='" + posName + '\'' +
                ", aroundPosType='" + aroundPosType + '\'' +
                ", site='" + site + '\'' +
                ", phone='" + phone + '\'' +
                ", businessTimeType='" + businessTimeType + '\'' +
                ", businessStartTime='" + businessStartTime + '\'' +
                ", businessEndTime='" + businessEndTime + '\'' +
                ", facilities='" + facilities + '\'' +
                ", price='" + price + '\'' +
                ", label='" + label + '\'' +
                ", shopLogo='" + shopLogo + '\'' +
                ", rotationChartPic='" + rotationChartPic + '\'' +
                '}';
    }
}
