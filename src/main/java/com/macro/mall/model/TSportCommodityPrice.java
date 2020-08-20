package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class TSportCommodityPrice implements Serializable {
    private String discountTimePriceId;

    private String commodityDetailId;

    private String createTime;

    private String updateTime;

    private String priceDate;

    private BigDecimal parce;

    private Short stock;

    private String commodityId;

    private static final long serialVersionUID = 1L;

    public String getDiscountTimePriceId() {
        return discountTimePriceId;
    }

    public void setDiscountTimePriceId(String discountTimePriceId) {
        this.discountTimePriceId = discountTimePriceId;
    }

    public String getCommodityDetailId() {
        return commodityDetailId;
    }

    public void setCommodityDetailId(String commodityDetailId) {
        this.commodityDetailId = commodityDetailId;
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

    public String getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(String priceDate) {
        this.priceDate = priceDate;
    }

    public BigDecimal getParce() {
        return parce;
    }

    public void setParce(BigDecimal parce) {
        this.parce = parce;
    }

    public Short getStock() {
        return stock;
    }

    public void setStock(Short stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", discountTimePriceId=").append(discountTimePriceId);
        sb.append(", commodityDetailId=").append(commodityDetailId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", priceDate=").append(priceDate);
        sb.append(", parce=").append(parce);
        sb.append(", stock=").append(stock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }
}