package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TSportCommodityActivity implements Serializable {
    private String commodityId;

    private String activityId;

    private String activityStock;

    private String commodityActivityState;

    private String timeSlotId;

    private String spikePrice;

    private static final long serialVersionUID = 1L;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityStock() {
        return activityStock;
    }

    public void setActivityStock(String activityStock) {
        this.activityStock = activityStock;
    }

    public String getCommodityActivityState() {
        return commodityActivityState;
    }

    public void setCommodityActivityState(String commodityActivityState) {
        this.commodityActivityState = commodityActivityState;
    }

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public String getSpikePrice() {
        return spikePrice;
    }

    public void setSpikePrice(String spikePrice) {
        this.spikePrice = spikePrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commodityId=").append(commodityId);
        sb.append(", activityId=").append(activityId);
        sb.append(", activityStock=").append(activityStock);
        sb.append(", commodityActivityState=").append(commodityActivityState);
        sb.append(", timeSlotId=").append(timeSlotId);
        sb.append(", spikePrice=").append(spikePrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}