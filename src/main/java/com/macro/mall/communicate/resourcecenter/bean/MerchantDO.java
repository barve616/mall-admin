package com.macro.mall.communicate.resourcecenter.bean;

import com.macro.mall.model.TSportPos;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MerchantDO extends TSportPos {

    /**渠道号*/
    private String channel;
    /**公司名称*/
    private String companyName;
    /**店铺id*/
    private String shopId;
    /**店铺名称*/
    private String shopName;
    /**店铺英文名称*/
    private String shopEnglishName;
    /**店铺类型*/
    private String shopType;
    /**商品数量*/
    private String commodityNum;
    /**审核次数*/
    private String auditNum;

    @Override
    public String getChannel() {
        return channel;
    }

    @Override
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
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

    public String getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(String commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getAuditNum() {
        return auditNum;
    }

    public void setAuditNum(String auditNum) {
        this.auditNum = auditNum;
    }
}
