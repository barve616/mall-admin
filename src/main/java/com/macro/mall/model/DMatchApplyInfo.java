package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchApplyInfo implements Serializable {

    @ApiModelProperty(value = "主键id")
    private String id;

    @ApiModelProperty(value = "赛事id")
    private String matchId;

    @ApiModelProperty(value = "赛事类型 0:个人 1:团体")
    private String matchType;

    @ApiModelProperty(value = "队伍id")
    private String teamId;

    @ApiModelProperty(value = "参赛人姓名")
    private String realName;

    @ApiModelProperty(value = "参赛人手机号")
    private String userPhone;

    @ApiModelProperty(value = "证件号码")
    private String certId;

    @ApiModelProperty(value = "证件类型")
    private String certType;

    @ApiModelProperty(value = "银行卡号")
    private String bankCard;

    @ApiModelProperty(value = "卡片类型  C：信用卡  D：借记卡")
    private String cardType;

    @ApiModelProperty(value = "性别 0:男 1:女")
    private String gender;

    @ApiModelProperty(value = "个性化参数")
    private String otherParam;

    @ApiModelProperty(value = "报名申请日期 yyyy-MM-dd")
    private String applyCreateDate;

    @ApiModelProperty(value = "报名申请时间 hh24:mi:ss")
    private String applyCreateTime;

    @ApiModelProperty(value = "报名成功日期 yyyy-MM-dd")
    private String applySuccessDate;

    @ApiModelProperty(value = "报名成功时间 hh24:mi:ss")
    private String applySuccessTime;

    @ApiModelProperty(value = "报名渠道 缤纷:MLIFE  手机银行:BOC")
    private String applyChannel;

    @ApiModelProperty(value = "状态 00:报名成功 01:待支付报名费 02:待支付保险费 03:创建队伍申请中" +
            "     04:组队审核中 05:组队申请失败 06:被队长移除队伍 07:被队长拒绝 08:组队失败 09:退赛成功 10:报名取消")
    private String applyState;

    @ApiModelProperty(value = "保险订单号")
    private String safeOrderno;

    @ApiModelProperty(value = "紧急联系人姓名")
    private String emergencyName;

    @ApiModelProperty(value = "紧急联系人手机号")
    private String emergencyPhone;

    @ApiModelProperty(value = "紧急联系人住址")
    private String emergencyAddress;

    @ApiModelProperty(value = "年龄")
    private String age;

    @ApiModelProperty(value = "报名状态更新时间：yyyy-MM-dd hhmmss")
    private String updateDateTime;

    @ApiModelProperty(value = "批量状态 01：待发送   02：修改个人信息  03：退赛     04：已发送")
    private String flag;

    @ApiModelProperty(value = "所属地区")
    private String region;

    @ApiModelProperty(value = "所属社区")
    private String community;

    @ApiModelProperty(value = "身份  队长 0  队员 1")
    private String headFlag;

    @ApiModelProperty(value = "队伍名称")
    private  String teamName;

    @ApiModelProperty(value = "队伍状态")
    private  String teamState;

    @ApiModelProperty(value = "队伍创建时间")
    private  String teamCreateTime;


    @ApiModelProperty(value = "赛事小项名称")
    private  String matchMinDetail;

    @ApiModelProperty(value = "赛事类型名称")
    private  String matchTpName;

    @ApiModelProperty(value = "赛事大项名称")
    private  String matchMaxName;

    @ApiModelProperty(value = "赛事报表Key值")
    private  String matchKey;
    @ApiModelProperty(value = "赛事名称")
    private  String matchName;
    @ApiModelProperty(value = "地址")
    private  String detailAddress;

    private  String applyChanel;

    private  String startTime;

    private  String endTime;

    public String getApplyChanel() {
        return applyChanel;
    }

    public void setApplyChanel(String applyChanel) {
        this.applyChanel = applyChanel;
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

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getMatchKey() {
        return matchKey;
    }

    public void setMatchKey(String matchKey) {
        this.matchKey = matchKey;
    }

    public String getMatchMinDetail() {
        return matchMinDetail;
    }

    public void setMatchMinDetail(String matchMinDetail) {
        this.matchMinDetail = matchMinDetail;
    }

    public String getMatchTpName() {
        return matchTpName;
    }

    public void setMatchTpName(String matchTpName) {
        this.matchTpName = matchTpName;
    }

    public String getMatchMaxName() {
        return matchMaxName;
    }

    public void setMatchMaxName(String matchMaxName) {
        this.matchMaxName = matchMaxName;
    }

    public String getTeamState() {
        return teamState;
    }

    public void setTeamState(String teamState) {
        this.teamState = teamState;
    }

    public String getTeamCreateTime() {
        return teamCreateTime;
    }

    public void setTeamCreateTime(String teamCreateTime) {
        this.teamCreateTime = teamCreateTime;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getHeadFlag() {
        return headFlag;
    }

    public void setHeadFlag(String headFlag) {
        this.headFlag = headFlag;
    }

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
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

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOtherParam() {
        return otherParam;
    }

    public void setOtherParam(String otherParam) {
        this.otherParam = otherParam;
    }

    public String getApplyCreateDate() {
        return applyCreateDate;
    }

    public void setApplyCreateDate(String applyCreateDate) {
        this.applyCreateDate = applyCreateDate;
    }

    public String getApplyCreateTime() {
        return applyCreateTime;
    }

    public void setApplyCreateTime(String applyCreateTime) {
        this.applyCreateTime = applyCreateTime;
    }

    public String getApplySuccessDate() {
        return applySuccessDate;
    }

    public void setApplySuccessDate(String applySuccessDate) {
        this.applySuccessDate = applySuccessDate;
    }

    public String getApplySuccessTime() {
        return applySuccessTime;
    }

    public void setApplySuccessTime(String applySuccessTime) {
        this.applySuccessTime = applySuccessTime;
    }

    public String getApplyChannel() {
        return applyChannel;
    }

    public void setApplyChannel(String applyChannel) {
        this.applyChannel = applyChannel;
    }

    public String getApplyState() {
        return applyState;
    }

    public void setApplyState(String applyState) {
        this.applyState = applyState;
    }

    public String getSafeOrderno() {
        return safeOrderno;
    }

    public void setSafeOrderno(String safeOrderno) {
        this.safeOrderno = safeOrderno;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public String getEmergencyAddress() {
        return emergencyAddress;
    }

    public void setEmergencyAddress(String emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", matchId=").append(matchId);
        sb.append(", matchType=").append(matchType);
        sb.append(", teamId=").append(teamId);
        sb.append(", realName=").append(realName);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", certId=").append(certId);
        sb.append(", certType=").append(certType);
        sb.append(", bankCard=").append(bankCard);
        sb.append(", cardType=").append(cardType);
        sb.append(", gender=").append(gender);
        sb.append(", otherParam=").append(otherParam);
        sb.append(", applyCreateDate=").append(applyCreateDate);
        sb.append(", applyCreateTime=").append(applyCreateTime);
        sb.append(", applySuccessDate=").append(applySuccessDate);
        sb.append(", applySuccessTime=").append(applySuccessTime);
        sb.append(", applyChannel=").append(applyChannel);
        sb.append(", applyState=").append(applyState);
        sb.append(", safeOrderno=").append(safeOrderno);
        sb.append(", emergencyName=").append(emergencyName);
        sb.append(", emergencyPhone=").append(emergencyPhone);
        sb.append(", emergencyAddress=").append(emergencyAddress);
        sb.append(", age=").append(age);
        sb.append(", updateDateTime=").append(updateDateTime);
        sb.append(", flag=").append(flag);
        sb.append(", region=").append(region);
        sb.append(", community=").append(community);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}