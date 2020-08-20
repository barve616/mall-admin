package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TSportCoachTeam implements Serializable {
    private String coachId;

    private String coachName;

    private String coachGender;

    private String specialty;

    private String teachingAge;

    private String coachHeadUrl;

    private String workState;

    private String shopId;

    private String createDate;

    private static final long serialVersionUID = 1L;

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getCoachGender() {
        return coachGender;
    }

    public void setCoachGender(String coachGender) {
        this.coachGender = coachGender;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getTeachingAge() {
        return teachingAge;
    }

    public void setTeachingAge(String teachingAge) {
        this.teachingAge = teachingAge;
    }

    public String getCoachHeadUrl() {
        return coachHeadUrl;
    }

    public void setCoachHeadUrl(String coachHeadUrl) {
        this.coachHeadUrl = coachHeadUrl;
    }

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", coachId=").append(coachId);
        sb.append(", coachName=").append(coachName);
        sb.append(", coachGender=").append(coachGender);
        sb.append(", specialty=").append(specialty);
        sb.append(", teachingAge=").append(teachingAge);
        sb.append(", coachHeadUrl=").append(coachHeadUrl);
        sb.append(", workState=").append(workState);
        sb.append(", shopId=").append(shopId);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}