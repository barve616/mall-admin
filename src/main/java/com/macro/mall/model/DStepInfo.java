package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DStepInfo implements Serializable {
    private String userNm;

    private String certId;

    private String certType;

    private String applyDate;

    private String applyTime;

    private String stepNum;

    private String stepTotalNum;

    private String stepUpdateDate;

    private String stepInfo;

    private String name;

    private String cardNo;

    private String cardType;

    private String userPlt;

    private String userType;

    private String stepDays;

    private static final long serialVersionUID = 1L;

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getStepNum() {
        return stepNum;
    }

    public void setStepNum(String stepNum) {
        this.stepNum = stepNum;
    }

    public String getStepTotalNum() {
        return stepTotalNum;
    }

    public void setStepTotalNum(String stepTotalNum) {
        this.stepTotalNum = stepTotalNum;
    }

    public String getStepUpdateDate() {
        return stepUpdateDate;
    }

    public void setStepUpdateDate(String stepUpdateDate) {
        this.stepUpdateDate = stepUpdateDate;
    }

    public String getStepInfo() {
        return stepInfo;
    }

    public void setStepInfo(String stepInfo) {
        this.stepInfo = stepInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getUserPlt() {
        return userPlt;
    }

    public void setUserPlt(String userPlt) {
        this.userPlt = userPlt;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getStepDays() {
        return stepDays;
    }

    public void setStepDays(String stepDays) {
        this.stepDays = stepDays;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userNm=").append(userNm);
        sb.append(", certId=").append(certId);
        sb.append(", certType=").append(certType);
        sb.append(", applyDate=").append(applyDate);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", stepNum=").append(stepNum);
        sb.append(", stepTotalNum=").append(stepTotalNum);
        sb.append(", stepUpdateDate=").append(stepUpdateDate);
        sb.append(", stepInfo=").append(stepInfo);
        sb.append(", name=").append(name);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", cardType=").append(cardType);
        sb.append(", userPlt=").append(userPlt);
        sb.append(", userType=").append(userType);
        sb.append(", stepDays=").append(stepDays);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}