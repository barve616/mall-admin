package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchResultInfo implements Serializable {
    @ApiModelProperty(value = "赛事结果id")
    private String resultId;
    @ApiModelProperty(value = "赛事申请id")
    private String applyId;
    @ApiModelProperty(value = "手机号")
    private String userNm;
    @ApiModelProperty(value = "赛事成绩")
    private String result;
    @ApiModelProperty(value = "奖项信息")
    private String prize;
    @ApiModelProperty(value = "成绩排名")
    private String rankSecond;
    @ApiModelProperty(value = "总分成绩")
    private String totalSecond;
    @ApiModelProperty(value = "票数")
    private String voteNum;
    @ApiModelProperty(value = "赛事类型名称")
    private String matchTpName;
    @ApiModelProperty(value = "赛事名称")
    private  String matchName;
    @ApiModelProperty(value = "队伍名称")
    private  String teamName;
    @ApiModelProperty(value = "下载key")
    private  String matchKey;
    @ApiModelProperty(value = "赛事类型id")
    private String matchTp;


    public String getMatchTp() {
        return matchTp;
    }

    public void setMatchTp(String matchTp) {
        this.matchTp = matchTp;
    }

    private static final long serialVersionUID = 1L;

    public String getMatchKey() {
        return matchKey;
    }

    public void setMatchKey(String matchKey) {
        this.matchKey = matchKey;
    }

    public String getMatchTpName() {
        return matchTpName;
    }

    public void setMatchTpName(String matchTpName) {
        this.matchTpName = matchTpName;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getRankSecond() {
        return rankSecond;
    }

    public void setRankSecond(String rankSecond) {
        this.rankSecond = rankSecond;
    }

    public String getTotalSecond() {
        return totalSecond;
    }

    public void setTotalSecond(String totalSecond) {
        this.totalSecond = totalSecond;
    }

    public String getVoteNum() {
        return voteNum;
    }

    public void setVoteNum(String voteNum) {
        this.voteNum = voteNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resultId=").append(resultId);
        sb.append(", applyId=").append(applyId);
        sb.append(", userNm=").append(userNm);
        sb.append(", result=").append(result);
        sb.append(", prize=").append(prize);
        sb.append(", rankSecond=").append(rankSecond);
        sb.append(", totalSecond=").append(totalSecond);
        sb.append(", voteNum=").append(voteNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}