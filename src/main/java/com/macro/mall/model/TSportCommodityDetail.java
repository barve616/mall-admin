package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class TSportCommodityDetail implements Serializable {
    private String commodityDetailId;

    private String commodityId;

    private String posCommodityId;

    private String createTime;

    private String updateTime;

    private String channel;

    private String rotationnChartUrl;

    private String picUrl;

    private String commodityName;

    private String commodityState;

    private Short monthlySales;

    private Short commoditySales;

    private String commodityStock;

    private String reserveDays;

    private String advanceReserveDays;

    private String commodityScore;

    private BigDecimal dailyPrice;

    private BigDecimal vacationPrice;

    private BigDecimal holidayPrice;

    private String commodityField;

    private String commodityDescribe;

    private String purchaseLimits;

    private String timeOutDt;

    private String onFrameTime;

    private String offFrameTime;

    private String onSaleTime;

    private String offSaleTime;

    private String useStartTime;

    private String useEndTime;

    private String limitDate;

    private String detailRemark;

    private String commodityShow;

    private static final long serialVersionUID = 1L;

    public String getCommodityDetailId() {
        return commodityDetailId;
    }

    public void setCommodityDetailId(String commodityDetailId) {
        this.commodityDetailId = commodityDetailId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getPosCommodityId() {
        return posCommodityId;
    }

    public void setPosCommodityId(String posCommodityId) {
        this.posCommodityId = posCommodityId;
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

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityState() {
        return commodityState;
    }

    public void setCommodityState(String commodityState) {
        this.commodityState = commodityState;
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

    public String getCommodityStock() {
        return commodityStock;
    }

    public void setCommodityStock(String commodityStock) {
        this.commodityStock = commodityStock;
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

    public BigDecimal getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(BigDecimal dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public BigDecimal getVacationPrice() {
        return vacationPrice;
    }

    public void setVacationPrice(BigDecimal vacationPrice) {
        this.vacationPrice = vacationPrice;
    }

    public BigDecimal getHolidayPrice() {
        return holidayPrice;
    }

    public void setHolidayPrice(BigDecimal holidayPrice) {
        this.holidayPrice = holidayPrice;
    }

    public String getCommodityField() {
        return commodityField;
    }

    public void setCommodityField(String commodityField) {
        this.commodityField = commodityField;
    }

    public String getCommodityDescribe() {
        return commodityDescribe;
    }

    public void setCommodityDescribe(String commodityDescribe) {
        this.commodityDescribe = commodityDescribe;
    }

    public String getPurchaseLimits() {
        return purchaseLimits;
    }

    public void setPurchaseLimits(String purchaseLimits) {
        this.purchaseLimits = purchaseLimits;
    }

    public String getTimeOutDt() {
        return timeOutDt;
    }

    public void setTimeOutDt(String timeOutDt) {
        this.timeOutDt = timeOutDt;
    }

    public String getOnFrameTime() {
        return onFrameTime;
    }

    public void setOnFrameTime(String onFrameTime) {
        this.onFrameTime = onFrameTime;
    }

    public String getOffFrameTime() {
        return offFrameTime;
    }

    public void setOffFrameTime(String offFrameTime) {
        this.offFrameTime = offFrameTime;
    }

    public String getOnSaleTime() {
        return onSaleTime;
    }

    public void setOnSaleTime(String onSaleTime) {
        this.onSaleTime = onSaleTime;
    }

    public String getOffSaleTime() {
        return offSaleTime;
    }

    public void setOffSaleTime(String offSaleTime) {
        this.offSaleTime = offSaleTime;
    }

    public String getUseStartTime() {
        return useStartTime;
    }

    public void setUseStartTime(String useStartTime) {
        this.useStartTime = useStartTime;
    }

    public String getUseEndTime() {
        return useEndTime;
    }

    public void setUseEndTime(String useEndTime) {
        this.useEndTime = useEndTime;
    }

    public String getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(String limitDate) {
        this.limitDate = limitDate;
    }

    public String getDetailRemark() {
        return detailRemark;
    }

    public void setDetailRemark(String detailRemark) {
        this.detailRemark = detailRemark;
    }

    public String getCommodityShow() {
        return commodityShow;
    }

    public void setCommodityShow(String commodityShow) {
        this.commodityShow = commodityShow;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commodityDetailId=").append(commodityDetailId);
        sb.append(", commodityId=").append(commodityId);
        sb.append(", posCommodityId=").append(posCommodityId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", channel=").append(channel);
        sb.append(", rotationnChartUrl=").append(rotationnChartUrl);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", commodityName=").append(commodityName);
        sb.append(", commodityState=").append(commodityState);
        sb.append(", monthlySales=").append(monthlySales);
        sb.append(", commoditySales=").append(commoditySales);
        sb.append(", commodityStock=").append(commodityStock);
        sb.append(", reserveDays=").append(reserveDays);
        sb.append(", advanceReserveDays=").append(advanceReserveDays);
        sb.append(", commodityScore=").append(commodityScore);
        sb.append(", dailyPrice=").append(dailyPrice);
        sb.append(", vacationPrice=").append(vacationPrice);
        sb.append(", holidayPrice=").append(holidayPrice);
        sb.append(", commodityField=").append(commodityField);
        sb.append(", commodityDescribe=").append(commodityDescribe);
        sb.append(", purchaseLimits=").append(purchaseLimits);
        sb.append(", timeOutDt=").append(timeOutDt);
        sb.append(", onFrameTime=").append(onFrameTime);
        sb.append(", offFrameTime=").append(offFrameTime);
        sb.append(", onSaleTime=").append(onSaleTime);
        sb.append(", offSaleTime=").append(offSaleTime);
        sb.append(", useStartTime=").append(useStartTime);
        sb.append(", useEndTime=").append(useEndTime);
        sb.append(", limitDate=").append(limitDate);
        sb.append(", detailRemark=").append(detailRemark);
        sb.append(", commodityShow=").append(commodityShow);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}