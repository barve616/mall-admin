package com.macro.mall.communicate.resourcecenter.bean;

import io.swagger.annotations.ApiModelProperty;

public class TSportCommodityVO {

    @ApiModelProperty(value = "商品名字")
    private String commdityName;
    @ApiModelProperty(value = "商品id")
    private String commodityId;
    @ApiModelProperty(value = "商品分类")
    private String commdityType;//商品分类
    @ApiModelProperty(value = "商户id")
    private String posId;
    @ApiModelProperty(value = "店铺id")
    private String shopId;
    @ApiModelProperty(value = "渠道")
    private String channel;
    @ApiModelProperty(value = "审核状态  00 上架 01 下架")
    private String commdityStatus;
    @ApiModelProperty(value = "置顶选中数据")
    private String[] topping;
    @ApiModelProperty(value = "分页大小")
    private int pageSize;
    @ApiModelProperty(value = "分页页码")
    private int pageNum;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String[] getTopping() {
        return topping;
    }

    public void setTopping(String[] topping) {
        this.topping = topping;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCommdityName() {
        return commdityName;
    }

    public void setCommdityName(String commdityName) {
        this.commdityName = commdityName;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommdityType() {
        return commdityType;
    }

    public void setCommdityType(String commdityType) {
        this.commdityType = commdityType;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCommdityStatus() {
        return commdityStatus;
    }

    public void setCommdityStatus(String commdityStatus) {
        this.commdityStatus = commdityStatus;
    }

}
