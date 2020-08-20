package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TSportTimeSlot implements Serializable {
    private String timeSlotId;

    private String activityId;

    private String timeSlotName;

    private String startTime;

    private String endTime;

    private String cycle;

    private String state;

    private String createTime;

    private String updateTime;

    private String cycleType;

    private static final long serialVersionUID = 1L;

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getTimeSlotName() {
        return timeSlotName;
    }

    public void setTimeSlotName(String timeSlotName) {
        this.timeSlotName = timeSlotName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getCycleType() {
        return cycleType;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timeSlotId=").append(timeSlotId);
        sb.append(", activityId=").append(activityId);
        sb.append(", timeSlotName=").append(timeSlotName);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", cycle=").append(cycle);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", cycleType=").append(cycleType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}