package com.macro.mall.communicate.resourcecenter.bean;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class MerchantVO {

    /**商户id*/
    private String posId;

    /**渠道号(只更新操作用)*/
    private String channel;

    @ApiModelProperty(value = "公司名称", required = true)
    @NotBlank(message = "公司名称不能为空")
    @Size(min = 1, max = 200, message = "公司名称不能超过200个字符！")
    private String companyName;

    @ApiModelProperty(value = "公司注册地址", required = true)
    @NotBlank(message = "公司注册地址不能为空")
    @Size(min = 1, max = 300, message = "公司注册地址不能超过300个字符！")
    private String registerAddress;

    @ApiModelProperty(value = "公司主营业务", required = true)
    @NotBlank(message = "公司主营业务不能为空")
    @Size(min = 1, max = 200, message = "公司主营业务不能超过200个字符！")
    private String companyBusine;

    @ApiModelProperty(value = "公司开户卡号", required = true)
    @NotBlank(message = "公司开户卡号不能为空")
    private String accountCard;

    @ApiModelProperty(value = "公司开户行", required = true)
    @NotBlank(message = "公司开户行不能为空")
    @Size(min = 1, max = 200, message = "公司开户行不能超过200个字符！")
    private String accountBank;

    @ApiModelProperty(value = "联系人姓名", required = true)
    @NotBlank(message = "联系人姓名不能为空")
    @Size(min = 1, max = 32, message = "联系人姓名不能超过32个字符！")
    private String contactsName;

    @ApiModelProperty(value = "手机号", required = true)
    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$", message = "手机号格式不正确！")
    private String phone;

    @ApiModelProperty(value = "电子邮箱", required = true)
    @NotBlank(message = "电子邮箱不能为空")
    @Email(message = "电子邮箱格式不正确！")
    private String email;

    /**推广人员单位*/
    private String promoterUnit;
    /**是否有中银对接运动推广人员 (00-是  01-否)*/
    @ApiModelProperty(value = "推广人员", required = true)
    @NotBlank(message = "请选择是否有推广人员！")
    private String promoterState;

    /**推广人员名字*/
    private String promoterName;

    @ApiModelProperty(value = "营业执照有效期", required = true)
    @NotBlank(message = "营业执照有效期不能为空！")
    private String businessExpiryDate;

    @ApiModelProperty(value = "营业执照编号", required = true)
    @NotBlank(message = "营业执照编号不能为空！")
    private String businessCode;

    @ApiModelProperty(value = "营业执照证件照", required = true)
    @NotBlank(message = "营业执照证件照不能为空！")
    private String businessPic;

    @ApiModelProperty(value = "经营许可证编号", required = true)
    @NotBlank(message = "经营许可证编号不能为空！")
    private String operateCode;

    @ApiModelProperty(value = "经营许可证证件照", required = true)
    @NotBlank(message = "经营许可证证件照不能为空！")
    private String operatePic;

    @ApiModelProperty(value = "法定代表人姓名", required = true)
    @NotBlank(message = "法定代表人姓名不能为空！")
    private String legalPersionName;

    @ApiModelProperty(value = "法定代表人证件号", required = true)
    @NotBlank(message = "法定代表人证件号不能为空！")
    private String legalPersionId;

    @ApiModelProperty(value = "法人代表证件照正面", required = true)
    @NotBlank(message = "法人代表证件照正面不能为空！")
    private String legalPersionFront;

    @ApiModelProperty(value = "法人代表证件照反面", required = true)
    @NotBlank(message = "法人代表证件照反面不能为空！")
    private String legalPersionBack;

    /**审核信息*/
    private String posExamineInfo;

    /**审核状态(00-成功，01-待审核，02-审核失败)*/
    @ApiModelProperty(value = "审核状态", required = true)
    @NotBlank(message = "审核状态不能为空！")
    private String posExamineState;

    /**审核人*/
    private String examinePersion;
    /**审核时间*/
    private String examineTime;

    /**店铺id(只更新操作用)*/
    private String shopId;

    @ApiModelProperty(value = "店铺名称", required = true)
    @NotBlank(message = "店铺名称不能为空！")
    private String shopName;

    @ApiModelProperty(value = "店铺英文名称", required = true)
    @NotBlank(message = "店铺英文名称不能为空！")
    private String shopEnglishName;

    @ApiModelProperty(value = "店铺类型", required = true)
    @NotBlank(message = "店铺类型不能为空！")
    private String shopType;


    @ApiModelProperty(value = "商户代码", required = true)
    @NotBlank(message = "商户代码不能为空！")
    private String posCode;

    @ApiModelProperty(value = "商户终端号", required = true)
    @NotBlank(message = "商户终端号不能为空！")
    private String posTerminalNum;

    @ApiModelProperty(value = "商户链接地址", required = true)
    @NotBlank(message = "商户链接地址为空！")
    private String posUrl;

    @ApiModelProperty(value = "商户后台地址", required = true)
    @NotBlank(message = "商户后台地址不能为空！")
    private String posBackendUrl;

    /**支付方式（01-现金，02-分期，03-积分+现金  多种逗号隔开）*/
    @ApiModelProperty(value = "支付方式", required = true)
    @NotBlank(message = "支付方式不能为空！")
    private String payMethod;

    /**支付卡类型   (1-中行借记卡  2-中行信用卡  3-他行卡  4中行借记卡+中行信用卡  5-中行借记卡+他行卡  6-中行信用卡+他行卡  7-中行借记卡+中行信用卡+他行卡)*/
    @ApiModelProperty(value = "支付卡类型", required = true)
    @NotBlank(message = "支付卡类型不嫩为空！")
    private String payCardType;

    @ApiModelProperty(value = "订单入口标题", required = true)
    @NotBlank(message = "订单入口标题不嫩为空！")
    private String orderEntryTitle;

    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank(message = "用户名不嫩为空！")
    private String userName;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public void setCompanyBusine(String companyBusine) {
        this.companyBusine = companyBusine;
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

    public String getPosUrl() {
        return posUrl;
    }

    public void setPosUrl(String posUrl) {
        this.posUrl = posUrl;
    }

    public String getPosBackendUrl() {
        return posBackendUrl;
    }

    public void setPosBackendUrl(String posBackendUrl) {
        this.posBackendUrl = posBackendUrl;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getPayCardType() {
        return payCardType;
    }

    public void setPayCardType(String payCardType) {
        this.payCardType = payCardType;
    }

    public String getOrderEntryTitle() {
        return orderEntryTitle;
    }

    public void setOrderEntryTitle(String orderEntryTitle) {
        this.orderEntryTitle = orderEntryTitle;
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

    public String getPromoterUnit() {
        return promoterUnit;
    }

    public void setPromoterUnit(String promoterUnit) {
        this.promoterUnit = promoterUnit;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopEnglishName() {
        return shopEnglishName;
    }

    public void setShopEnglishName(String shopEnglishName) {
        this.shopEnglishName = shopEnglishName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getPosCode() {
        return posCode;
    }

    public void setPosCode(String posCode) {
        this.posCode = posCode;
    }

    public String getPosTerminalNum() {
        return posTerminalNum;
    }

    public void setPosTerminalNum(String posTerminalNum) {
        this.posTerminalNum = posTerminalNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
