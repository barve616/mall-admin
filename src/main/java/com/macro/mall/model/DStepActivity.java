package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DStepActivity implements Serializable {
    private String activityName;

    private String activityStartDt;

    private String activityEndDt;

    private String activityId;

    private static final long serialVersionUID = 1L;

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityStartDt() {
        return activityStartDt;
    }

    public void setActivityStartDt(String activityStartDt) {
        this.activityStartDt = activityStartDt;
    }

    public String getActivityEndDt() {
        return activityEndDt;
    }

    public void setActivityEndDt(String activityEndDt) {
        this.activityEndDt = activityEndDt;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activityName=").append(activityName);
        sb.append(", activityStartDt=").append(activityStartDt);
        sb.append(", activityEndDt=").append(activityEndDt);
        sb.append(", activityId=").append(activityId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}