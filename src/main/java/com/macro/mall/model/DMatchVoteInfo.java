package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchVoteInfo implements Serializable {
    @ApiModelProperty(value = "下载key")
    private String matchKey;
    @ApiModelProperty(value = "投票id")
    private String voteId;
    @ApiModelProperty(value = "自然周数")
    private Short weekNo;
    @ApiModelProperty(value = "队伍id")
    private String teamId;
    @ApiModelProperty(value="投票人证件号(cert_id)")
    private String userId;
    @ApiModelProperty(value="投票人手机号")
    private String userNm;
    @ApiModelProperty(value="投票数")
    private Short voteNum;
    @ApiModelProperty(value="投票时间")
    private String voteTime;
    @ApiModelProperty(value = "赛事名称")
    private String matchName;
    @ApiModelProperty(value = "项目类型")
    private String matchTpName;
    @ApiModelProperty(value = "项目类型id")
    private String matchTp;
    @ApiModelProperty(value = "团队名称")
    private String teamName;
    @ApiModelProperty(value = "领队名称")
    private  String teamHeaderName;


    private static final long serialVersionUID = 1L;


    public String getMatchKey() {
        return matchKey;
    }

    public void setMatchKey(String matchKey) {
        this.matchKey = matchKey;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getMatchTpName() {
        return matchTpName;
    }

    public void setMatchTpName(String matchTpName) {
        this.matchTpName = matchTpName;
    }

    public String getMatchTp() {
        return matchTp;
    }

    public void setMatchTp(String matchTp) {
        this.matchTp = matchTp;
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

    public String getVoteId() {
        return voteId;
    }

    public void setVoteId(String voteId) {
        this.voteId = voteId;
    }

    public Short getWeekNo() {
        return weekNo;
    }

    public void setWeekNo(Short weekNo) {
        this.weekNo = weekNo;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
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

    public Short getVoteNum() {
        return voteNum;
    }

    public void setVoteNum(Short voteNum) {
        this.voteNum = voteNum;
    }

    public String getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(String voteTime) {
        this.voteTime = voteTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voteId=").append(voteId);
        sb.append(", weekNo=").append(weekNo);
        sb.append(", teamId=").append(teamId);
        sb.append(", userId=").append(userId);
        sb.append(", userNm=").append(userNm);
        sb.append(", voteNum=").append(voteNum);
        sb.append(", voteTime=").append(voteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}