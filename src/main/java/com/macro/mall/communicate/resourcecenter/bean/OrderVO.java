package com.macro.mall.communicate.resourcecenter.bean;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

public class OrderVO {

    /**订单号*/
    private String orderId;
    /**订单类型*/
    private String orderType;
    /**订单状态*/
    private String orderStat;
    /**手机号*/
    private String phone;
    /**购买渠道*/
    private String buyChannel;
    /**订单开始时间*/
    private String startDate;
    /**订单结束时间*/
    private String endDate;
    /**每页条数*/
    private Integer pageSize;
    /**页数*/
    private Integer pageNum;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderStat() {
        return orderStat;
    }

    public void setOrderStat(String orderStat) {
        this.orderStat = orderStat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBuyChannel() {
        return buyChannel;
    }

    public void setBuyChannel(String buyChannel) {
        this.buyChannel = buyChannel;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
