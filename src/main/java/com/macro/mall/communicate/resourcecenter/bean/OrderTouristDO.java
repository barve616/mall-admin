package com.macro.mall.communicate.resourcecenter.bean;

public class OrderTouristDO {

    /**订单id*/
    private String orderId;
    /**联系人姓名*/
    private String contactsName;
    /**联系人手机号*/
    private String contactsPhone;
    /**联系人邮箱*/
    private String contactsEmail;
    /**游客姓名*/
    private String visitorName;
    /**游客性别*/
    private String visitorGender;
    /**游客手机号*/
    private String visitorPhone;
    /**游客身份类型*/
    private String visitorIdType;
    /**游客身份证号*/
    private Integer visitorIdNum;
    /**游客电子邮箱*/
    private Integer visitorEmail;
    /**游客年龄*/
    private Integer visitorAge;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public String getContactsEmail() {
        return contactsEmail;
    }

    public void setContactsEmail(String contactsEmail) {
        this.contactsEmail = contactsEmail;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVisitorGender() {
        return visitorGender;
    }

    public void setVisitorGender(String visitorGender) {
        this.visitorGender = visitorGender;
    }

    public String getVisitorPhone() {
        return visitorPhone;
    }

    public void setVisitorPhone(String visitorPhone) {
        this.visitorPhone = visitorPhone;
    }

    public String getVisitorIdType() {
        return visitorIdType;
    }

    public void setVisitorIdType(String visitorIdType) {
        this.visitorIdType = visitorIdType;
    }

    public Integer getVisitorIdNum() {
        return visitorIdNum;
    }

    public void setVisitorIdNum(Integer visitorIdNum) {
        this.visitorIdNum = visitorIdNum;
    }

    public Integer getVisitorEmail() {
        return visitorEmail;
    }

    public void setVisitorEmail(Integer visitorEmail) {
        this.visitorEmail = visitorEmail;
    }

    public Integer getVisitorAge() {
        return visitorAge;
    }

    public void setVisitorAge(Integer visitorAge) {
        this.visitorAge = visitorAge;
    }
}
