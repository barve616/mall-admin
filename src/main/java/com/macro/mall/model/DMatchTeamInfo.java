package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


public class DMatchTeamInfo implements Serializable{
    @ApiModelProperty(value = "队伍id")
    private String teamId;

    @ApiModelProperty(value = "队伍编码")
    private String teamCode;

    @ApiModelProperty(value = "赛事id")
    private String matchId;

    @ApiModelProperty(value = "队伍名称")
    private String teamName;

    @ApiModelProperty(value = "审核时间")
    private String teamUpdateTime;

    @ApiModelProperty(value = "队长姓名")
    private String teamHeaderName;

    @ApiModelProperty(value = "队长手机")
    private String teamHeaderPhone;

    @ApiModelProperty(value = "队伍状态 0:待审核 1:组队中 2:组队成功 3:已解散 4:审核失败")
    private String teamState;

    @ApiModelProperty(value = "队伍最大人数")
    private String teamNum;

    @ApiModelProperty(value = "审核原因")
    private String teamCheckDes;

    @ApiModelProperty(value = "赛事大项id")
    private String matchMaxId;

    @ApiModelProperty(value = "赛事小项id")
    private String matchMinId;

    @ApiModelProperty(value = "赛事大项名称")
    private String matchMaxName;

    @ApiModelProperty(value = "赛事小项名称")
    private String matchMinDetail;


    @ApiModelProperty(value = "队伍创建时间")
    private String teamCreateTime;

    @ApiModelProperty(value = "性别 0:男 1:女")
    private String gender;

    @ApiModelProperty(value = "年龄")
    private String age;

    @ApiModelProperty(value = "证件类型")
    private String certType;

    @ApiModelProperty(value = "证件号")
    private String certId;

    @ApiModelProperty(value = "紧急联系人姓名")
    private String emergencyName;

    @ApiModelProperty(value = "紧急联系人手机号")
    private String emergencyPhone;

    @ApiModelProperty(value = "紧急联系人住址")
    private String emergencyAddress;

    @ApiModelProperty(value = "已参团人数")
    private String num;

    @ApiModelProperty(value = "赛事类型")
    private String matchTp;

    @ApiModelProperty(value = "赛事类型名称")
    private String matchTpName;

    @ApiModelProperty(value = "登录名")
    private String loginName;

    @ApiModelProperty(value = "开始时间")
    private String startTime;

    @ApiModelProperty(value = "结束时间")
    private String endTime;

    @ApiModelProperty(value = "卡号")
    private  String bankCard;

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getMatchTp() {
        return matchTp;
    }

    public void setMatchTp(String matchTp) {
        this.matchTp = matchTp;
    }

    public String getMatchTpName() {
        return matchTpName;
    }

    public void setMatchTpName(String matchTpName) {
        this.matchTpName = matchTpName;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTeamCreateTime() {
        return teamCreateTime;
    }

    public void setTeamCreateTime(String teamCreateTime) {
        this.teamCreateTime = teamCreateTime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public String getMatchMaxId() {
        return matchMaxId;
    }

    public void setMatchMaxId(String matchMaxId) {
        this.matchMaxId = matchMaxId;
    }

    public String getMatchMinId() {
        return matchMinId;
    }

    public void setMatchMinId(String matchMinId) {
        this.matchMinId = matchMinId;
    }

    public String getMatchMaxName() {
        return matchMaxName;
    }

    public void setMatchMaxName(String matchMaxName) {
        this.matchMaxName = matchMaxName;
    }

    public String getMatchMinDetail() {
        return matchMinDetail;
    }

    public void setMatchMinDetail(String matchMinDetail) {
        this.matchMinDetail = matchMinDetail;
    }

    public String getTeamUpdateTime() {
        return teamUpdateTime;
    }

    public void setTeamUpdateTime(String teamUpdateTime) {
        this.teamUpdateTime = teamUpdateTime;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }



    public String getTeamHeaderName() {
        return teamHeaderName;
    }

    public void setTeamHeaderName(String teamHeaderName) {
        this.teamHeaderName = teamHeaderName;
    }

    public String getTeamHeaderPhone() {
        return teamHeaderPhone;
    }

    public void setTeamHeaderPhone(String teamHeaderPhone) {
        this.teamHeaderPhone = teamHeaderPhone;
    }

    public String getTeamState() {
        return teamState;
    }

    public void setTeamState(String teamState) {
        this.teamState = teamState;
    }

    public String getTeamNum() {
        return teamNum;
    }

    public void setTeamNum(String teamNum) {
        this.teamNum = teamNum;
    }

    public String getTeamCheckDes() {
        return teamCheckDes;
    }

    public void setTeamCheckDes(String teamCheckDes) {
        this.teamCheckDes = teamCheckDes;
    }
}