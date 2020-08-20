package com.macro.mall.communicate.resourcecenter.bean;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

public class CommodityTypeAndChannelVO {

    @ApiModelProperty(value = "商品id")
    @NotEmpty(message = "商品id不能为空")
    private String commodityId;

    @ApiModelProperty(value = "渠道")
    private String channel;

    @ApiModelProperty(value = "店铺商品分类")
    private String shopCommodityType;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getShopCommodityType() {
        return shopCommodityType;
    }

    public void setShopCommodityType(String shopCommodityType) {
        this.shopCommodityType = shopCommodityType;
    }

    @Override
    public String toString() {
        return "CommodityTypeAndChannelVO{" +
                "commodityId='" + commodityId + '\'' +
                ", channel='" + channel + '\'' +
                ", shopCommodityType='" + shopCommodityType + '\'' +
                '}';
    }
}
