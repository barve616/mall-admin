package com.macro.mall.discount.model;

import java.util.List;

public class AddCommodityToActivityVO {
    private String activityTypeId;//活动类型id
    private String activityId;//活动id
    private List<String> commodityIds;//商品id
    private List<String> commodityTypeIds;//商品类型id
    private String timeSlotId;//时间段id

    public String getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(String activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public List<String> getCommodityIds() {
        return commodityIds;
    }

    public void setCommodityIds(List<String> commodityIds) {
        this.commodityIds = commodityIds;
    }

    public List<String> getCommodityTypeIds() {
        return commodityTypeIds;
    }

    public void setCommodityTypeIds(List<String> commodityTypeIds) {
        this.commodityTypeIds = commodityTypeIds;
    }

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
    }
}
