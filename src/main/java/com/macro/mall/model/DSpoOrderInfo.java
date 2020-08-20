package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class DSpoOrderInfo implements Serializable {
    private String orderId;

    private String channel;

    private String userId;

    private String userNm;

    private String merName;

    private String merId;

    private String termId;

    private String productId;

    private String productName;

    private Long total;

    private BigDecimal price;

    private String cardNo;

    private String payType;

    private BigDecimal payMoney;

    private BigDecimal payPoint;

    private String timeOutDt;

    private String creatDt;

    private String state;

    private String reSqCode;

    private String zdzOrderId;

    private String payDate;

    private String payTime;

    private String returnMsg;

    private String returnDate;

    private String returnPurchaseDate;

    private String returnPurchaseTime;

    private String seqNo;

    private String isCoupon;

    private String merSeqNo;

    private String payChannel;

    private String certType;

    private String certId;

    private String payCardType;

    private String payStages;

    private String productPicUrl;

    private String orderDetailUrl;

    private String orderType;

    private String orderSecType;

    private String tokenId;

    private String merPayType;

    private String isOverseas;

    private String merCardType;

    private String cardBin;

    private String integralId;

    private BigDecimal discountprice;

    private BigDecimal normalprice;

    private String accountchannel;

    private String wtpno;

    private BigDecimal payRealMoney;

    private BigDecimal payRealPoint;

    private String orderdate;

    private String contactsname;

    private String contactsphone;

    private BigDecimal discountmoney;

    private String unionId;

    private String openId;

    private String returnMoney;

    private String useCoupon;

    private String payLastMoney;

    private String orderSource;

    private String tradeType;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public BigDecimal getPayPoint() {
        return payPoint;
    }

    public void setPayPoint(BigDecimal payPoint) {
        this.payPoint = payPoint;
    }

    public String getTimeOutDt() {
        return timeOutDt;
    }

    public void setTimeOutDt(String timeOutDt) {
        this.timeOutDt = timeOutDt;
    }

    public String getCreatDt() {
        return creatDt;
    }

    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReSqCode() {
        return reSqCode;
    }

    public void setReSqCode(String reSqCode) {
        this.reSqCode = reSqCode;
    }

    public String getZdzOrderId() {
        return zdzOrderId;
    }

    public void setZdzOrderId(String zdzOrderId) {
        this.zdzOrderId = zdzOrderId;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnPurchaseDate() {
        return returnPurchaseDate;
    }

    public void setReturnPurchaseDate(String returnPurchaseDate) {
        this.returnPurchaseDate = returnPurchaseDate;
    }

    public String getReturnPurchaseTime() {
        return returnPurchaseTime;
    }

    public void setReturnPurchaseTime(String returnPurchaseTime) {
        this.returnPurchaseTime = returnPurchaseTime;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getIsCoupon() {
        return isCoupon;
    }

    public void setIsCoupon(String isCoupon) {
        this.isCoupon = isCoupon;
    }

    public String getMerSeqNo() {
        return merSeqNo;
    }

    public void setMerSeqNo(String merSeqNo) {
        this.merSeqNo = merSeqNo;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getPayCardType() {
        return payCardType;
    }

    public void setPayCardType(String payCardType) {
        this.payCardType = payCardType;
    }

    public String getPayStages() {
        return payStages;
    }

    public void setPayStages(String payStages) {
        this.payStages = payStages;
    }

    public String getProductPicUrl() {
        return productPicUrl;
    }

    public void setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl;
    }

    public String getOrderDetailUrl() {
        return orderDetailUrl;
    }

    public void setOrderDetailUrl(String orderDetailUrl) {
        this.orderDetailUrl = orderDetailUrl;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderSecType() {
        return orderSecType;
    }

    public void setOrderSecType(String orderSecType) {
        this.orderSecType = orderSecType;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getMerPayType() {
        return merPayType;
    }

    public void setMerPayType(String merPayType) {
        this.merPayType = merPayType;
    }

    public String getIsOverseas() {
        return isOverseas;
    }

    public void setIsOverseas(String isOverseas) {
        this.isOverseas = isOverseas;
    }

    public String getMerCardType() {
        return merCardType;
    }

    public void setMerCardType(String merCardType) {
        this.merCardType = merCardType;
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    public String getIntegralId() {
        return integralId;
    }

    public void setIntegralId(String integralId) {
        this.integralId = integralId;
    }

    public BigDecimal getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(BigDecimal discountprice) {
        this.discountprice = discountprice;
    }

    public BigDecimal getNormalprice() {
        return normalprice;
    }

    public void setNormalprice(BigDecimal normalprice) {
        this.normalprice = normalprice;
    }

    public String getAccountchannel() {
        return accountchannel;
    }

    public void setAccountchannel(String accountchannel) {
        this.accountchannel = accountchannel;
    }

    public String getWtpno() {
        return wtpno;
    }

    public void setWtpno(String wtpno) {
        this.wtpno = wtpno;
    }

    public BigDecimal getPayRealMoney() {
        return payRealMoney;
    }

    public void setPayRealMoney(BigDecimal payRealMoney) {
        this.payRealMoney = payRealMoney;
    }

    public BigDecimal getPayRealPoint() {
        return payRealPoint;
    }

    public void setPayRealPoint(BigDecimal payRealPoint) {
        this.payRealPoint = payRealPoint;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getContactsname() {
        return contactsname;
    }

    public void setContactsname(String contactsname) {
        this.contactsname = contactsname;
    }

    public String getContactsphone() {
        return contactsphone;
    }

    public void setContactsphone(String contactsphone) {
        this.contactsphone = contactsphone;
    }

    public BigDecimal getDiscountmoney() {
        return discountmoney;
    }

    public void setDiscountmoney(BigDecimal discountmoney) {
        this.discountmoney = discountmoney;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(String returnMoney) {
        this.returnMoney = returnMoney;
    }

    public String getUseCoupon() {
        return useCoupon;
    }

    public void setUseCoupon(String useCoupon) {
        this.useCoupon = useCoupon;
    }

    public String getPayLastMoney() {
        return payLastMoney;
    }

    public void setPayLastMoney(String payLastMoney) {
        this.payLastMoney = payLastMoney;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", channel=").append(channel);
        sb.append(", userId=").append(userId);
        sb.append(", userNm=").append(userNm);
        sb.append(", merName=").append(merName);
        sb.append(", merId=").append(merId);
        sb.append(", termId=").append(termId);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", total=").append(total);
        sb.append(", price=").append(price);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", payType=").append(payType);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", payPoint=").append(payPoint);
        sb.append(", timeOutDt=").append(timeOutDt);
        sb.append(", creatDt=").append(creatDt);
        sb.append(", state=").append(state);
        sb.append(", reSqCode=").append(reSqCode);
        sb.append(", zdzOrderId=").append(zdzOrderId);
        sb.append(", payDate=").append(payDate);
        sb.append(", payTime=").append(payTime);
        sb.append(", returnMsg=").append(returnMsg);
        sb.append(", returnDate=").append(returnDate);
        sb.append(", returnPurchaseDate=").append(returnPurchaseDate);
        sb.append(", returnPurchaseTime=").append(returnPurchaseTime);
        sb.append(", seqNo=").append(seqNo);
        sb.append(", isCoupon=").append(isCoupon);
        sb.append(", merSeqNo=").append(merSeqNo);
        sb.append(", payChannel=").append(payChannel);
        sb.append(", certType=").append(certType);
        sb.append(", certId=").append(certId);
        sb.append(", payCardType=").append(payCardType);
        sb.append(", payStages=").append(payStages);
        sb.append(", productPicUrl=").append(productPicUrl);
        sb.append(", orderDetailUrl=").append(orderDetailUrl);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderSecType=").append(orderSecType);
        sb.append(", tokenId=").append(tokenId);
        sb.append(", merPayType=").append(merPayType);
        sb.append(", isOverseas=").append(isOverseas);
        sb.append(", merCardType=").append(merCardType);
        sb.append(", cardBin=").append(cardBin);
        sb.append(", integralId=").append(integralId);
        sb.append(", discountprice=").append(discountprice);
        sb.append(", normalprice=").append(normalprice);
        sb.append(", accountchannel=").append(accountchannel);
        sb.append(", wtpno=").append(wtpno);
        sb.append(", payRealMoney=").append(payRealMoney);
        sb.append(", payRealPoint=").append(payRealPoint);
        sb.append(", orderdate=").append(orderdate);
        sb.append(", contactsname=").append(contactsname);
        sb.append(", contactsphone=").append(contactsphone);
        sb.append(", discountmoney=").append(discountmoney);
        sb.append(", unionId=").append(unionId);
        sb.append(", openId=").append(openId);
        sb.append(", returnMoney=").append(returnMoney);
        sb.append(", useCoupon=").append(useCoupon);
        sb.append(", payLastMoney=").append(payLastMoney);
        sb.append(", orderSource=").append(orderSource);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}