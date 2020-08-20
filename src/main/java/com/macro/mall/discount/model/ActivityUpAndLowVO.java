package com.macro.mall.discount.model;

import java.util.List;

public class ActivityUpAndLowVO {
    private List<String> activityId;//活动id
    private String state;//上下架状态


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public List<String> getActivityId() {
        return activityId;
    }

    public void setActivityId(List<String> activityId) {
        this.activityId = activityId;
    }
}
