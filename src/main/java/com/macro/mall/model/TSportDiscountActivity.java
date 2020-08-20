package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TSportDiscountActivity implements Serializable {
    private String activityId;

    private String activityName;

    private String activityTypeId;

    private String playType;

    private String state;

    private String activityStatus;

    private String cardLimit;

    private String cardId;

    private String fullAmount;

    private String reduction;

    private String limitRule;

    private String limitRange;

    private String limitNum;

    private String immediatelyReduction;

    private String discount;

    private String onlineChannel;

    private String notice;

    private String brief;

    private String activityStartTime;

    private String activityEndTime;

    private String createTime;

    private String updateTime;

    private static final long serialVersionUID = 1L;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(String activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public String getPlayType() {
        return playType;
    }

    public void setPlayType(String playType) {
        this.playType = playType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(String cardLimit) {
        this.cardLimit = cardLimit;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getFullAmount() {
        return fullAmount;
    }

    public void setFullAmount(String fullAmount) {
        this.fullAmount = fullAmount;
    }

    public String getReduction() {
        return reduction;
    }

    public void setReduction(String reduction) {
        this.reduction = reduction;
    }

    public String getLimitRule() {
        return limitRule;
    }

    public void setLimitRule(String limitRule) {
        this.limitRule = limitRule;
    }

    public String getLimitRange() {
        return limitRange;
    }

    public void setLimitRange(String limitRange) {
        this.limitRange = limitRange;
    }

    public String getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(String limitNum) {
        this.limitNum = limitNum;
    }

    public String getImmediatelyReduction() {
        return immediatelyReduction;
    }

    public void setImmediatelyReduction(String immediatelyReduction) {
        this.immediatelyReduction = immediatelyReduction;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getOnlineChannel() {
        return onlineChannel;
    }

    public void setOnlineChannel(String onlineChannel) {
        this.onlineChannel = onlineChannel;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(String activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public String getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(String activityEndTime) {
        this.activityEndTime = activityEndTime;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activityId=").append(activityId);
        sb.append(", activityName=").append(activityName);
        sb.append(", activityTypeId=").append(activityTypeId);
        sb.append(", playType=").append(playType);
        sb.append(", state=").append(state);
        sb.append(", activityStatus=").append(activityStatus);
        sb.append(", cardLimit=").append(cardLimit);
        sb.append(", cardId=").append(cardId);
        sb.append(", fullAmount=").append(fullAmount);
        sb.append(", reduction=").append(reduction);
        sb.append(", limitRule=").append(limitRule);
        sb.append(", limitRange=").append(limitRange);
        sb.append(", limitNum=").append(limitNum);
        sb.append(", immediatelyReduction=").append(immediatelyReduction);
        sb.append(", discount=").append(discount);
        sb.append(", onlineChannel=").append(onlineChannel);
        sb.append(", notice=").append(notice);
        sb.append(", brief=").append(brief);
        sb.append(", activityStartTime=").append(activityStartTime);
        sb.append(", activityEndTime=").append(activityEndTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}