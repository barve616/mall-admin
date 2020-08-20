package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TSportPos implements Serializable {
    private String posId;

    private String channel;

    private String registerAddress;

    private String companyBusine;

    private String accountCard;

    private String accountBank;

    private String contactsName;

    private String phone;

    private String email;

    private String promoterUnit;

    private String promoterState;

    private String promoterName;

    private String businessExpiryDate;

    private String businessCode;

    private String businessPic;

    private String operateCode;

    private String operatePic;

    private String legalPersionName;

    private String legalPersionId;

    private String legalPersionFront;

    private String legalPersionBack;

    private String posExamineInfo;

    private String posExamineState;

    private String examinePersion;

    private String examineTime;

    private String createdTime;

    private String updatedTime;

    private String signBank;

    private static final long serialVersionUID = 1L;

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getCompanyBusine() {
        return companyBusine;
    }

    public void setCompanyBusine(String companyBusine) {
        this.companyBusine = companyBusine;
    }

    public String getAccountCard() {
        return accountCard;
    }

    public void setAccountCard(String accountCard) {
        this.accountCard = accountCard;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank;
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPromoterUnit() {
        return promoterUnit;
    }

    public void setPromoterUnit(String promoterUnit) {
        this.promoterUnit = promoterUnit;
    }

    public String getPromoterState() {
        return promoterState;
    }

    public void setPromoterState(String promoterState) {
        this.promoterState = promoterState;
    }

    public String getPromoterName() {
        return promoterName;
    }

    public void setPromoterName(String promoterName) {
        this.promoterName = promoterName;
    }

    public String getBusinessExpiryDate() {
        return businessExpiryDate;
    }

    public void setBusinessExpiryDate(String businessExpiryDate) {
        this.businessExpiryDate = businessExpiryDate;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getBusinessPic() {
        return businessPic;
    }

    public void setBusinessPic(String businessPic) {
        this.businessPic = businessPic;
    }

    public String getOperateCode() {
        return operateCode;
    }

    public void setOperateCode(String operateCode) {
        this.operateCode = operateCode;
    }

    public String getOperatePic() {
        return operatePic;
    }

    public void setOperatePic(String operatePic) {
        this.operatePic = operatePic;
    }

    public String getLegalPersionName() {
        return legalPersionName;
    }

    public void setLegalPersionName(String legalPersionName) {
        this.legalPersionName = legalPersionName;
    }

    public String getLegalPersionId() {
        return legalPersionId;
    }

    public void setLegalPersionId(String legalPersionId) {
        this.legalPersionId = legalPersionId;
    }

    public String getLegalPersionFront() {
        return legalPersionFront;
    }

    public void setLegalPersionFront(String legalPersionFront) {
        this.legalPersionFront = legalPersionFront;
    }

    public String getLegalPersionBack() {
        return legalPersionBack;
    }

    public void setLegalPersionBack(String legalPersionBack) {
        this.legalPersionBack = legalPersionBack;
    }

    public String getPosExamineInfo() {
        return posExamineInfo;
    }

    public void setPosExamineInfo(String posExamineInfo) {
        this.posExamineInfo = posExamineInfo;
    }

    public String getPosExamineState() {
        return posExamineState;
    }

    public void setPosExamineState(String posExamineState) {
        this.posExamineState = posExamineState;
    }

    public String getExaminePersion() {
        return examinePersion;
    }

    public void setExaminePersion(String examinePersion) {
        this.examinePersion = examinePersion;
    }

    public String getExamineTime() {
        return examineTime;
    }

    public void setExamineTime(String examineTime) {
        this.examineTime = examineTime;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getSignBank() {
        return signBank;
    }

    public void setSignBank(String signBank) {
        this.signBank = signBank;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", posId=").append(posId);
        sb.append(", channel=").append(channel);
        sb.append(", registerAddress=").append(registerAddress);
        sb.append(", companyBusine=").append(companyBusine);
        sb.append(", accountCard=").append(accountCard);
        sb.append(", accountBank=").append(accountBank);
        sb.append(", contactsName=").append(contactsName);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", promoterUnit=").append(promoterUnit);
        sb.append(", promoterState=").append(promoterState);
        sb.append(", promoterName=").append(promoterName);
        sb.append(", businessExpiryDate=").append(businessExpiryDate);
        sb.append(", businessCode=").append(businessCode);
        sb.append(", businessPic=").append(businessPic);
        sb.append(", operateCode=").append(operateCode);
        sb.append(", operatePic=").append(operatePic);
        sb.append(", legalPersionName=").append(legalPersionName);
        sb.append(", legalPersionId=").append(legalPersionId);
        sb.append(", legalPersionFront=").append(legalPersionFront);
        sb.append(", legalPersionBack=").append(legalPersionBack);
        sb.append(", posExamineInfo=").append(posExamineInfo);
        sb.append(", posExamineState=").append(posExamineState);
        sb.append(", examinePersion=").append(examinePersion);
        sb.append(", examineTime=").append(examineTime);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", signBank=").append(signBank);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}