package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchTimingInfo implements Serializable {
    private String timerName;

    private String startDt;

    private String startTimes;

    private String endDt;

    private String endTimes;

    private String exeInfo;

    private String state;

    private static final long serialVersionUID = 1L;

    public String getTimerName() {
        return timerName;
    }

    public void setTimerName(String timerName) {
        this.timerName = timerName;
    }

    public String getStartDt() {
        return startDt;
    }

    public void setStartDt(String startDt) {
        this.startDt = startDt;
    }

    public String getStartTimes() {
        return startTimes;
    }

    public void setStartTimes(String startTimes) {
        this.startTimes = startTimes;
    }

    public String getEndDt() {
        return endDt;
    }

    public void setEndDt(String endDt) {
        this.endDt = endDt;
    }

    public String getEndTimes() {
        return endTimes;
    }

    public void setEndTimes(String endTimes) {
        this.endTimes = endTimes;
    }

    public String getExeInfo() {
        return exeInfo;
    }

    public void setExeInfo(String exeInfo) {
        this.exeInfo = exeInfo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timerName=").append(timerName);
        sb.append(", startDt=").append(startDt);
        sb.append(", startTimes=").append(startTimes);
        sb.append(", endDt=").append(endDt);
        sb.append(", endTimes=").append(endTimes);
        sb.append(", exeInfo=").append(exeInfo);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}