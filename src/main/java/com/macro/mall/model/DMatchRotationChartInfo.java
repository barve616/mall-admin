package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchRotationChartInfo implements Serializable {
    @ApiModelProperty(value="主键id")
    private String matchId;
    @ApiModelProperty(value="排序")
    private String matchSeq;
    @ApiModelProperty(value="赛事轮播状态 0 启用 1禁用")
    private String matchState;
    @ApiModelProperty(value="赛事轮播地址")
    private String matchPicture;
    @ApiModelProperty(value = "赛事轮播跳转地址")
    private String matchJumpUrl;
    @ApiModelProperty(value = "赛事轮播跳转开关  0 无跳转 1跳转")
    private String matchJumpFlag;

    private static final long serialVersionUID = 1L;

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getMatchSeq() {
        return matchSeq;
    }

    public void setMatchSeq(String matchSeq) {
        this.matchSeq = matchSeq;
    }

    public String getMatchState() {
        return matchState;
    }

    public void setMatchState(String matchState) {
        this.matchState = matchState;
    }

    public String getMatchPicture() {
        return matchPicture;
    }

    public void setMatchPicture(String matchPicture) {
        this.matchPicture = matchPicture;
    }

    public String getMatchJumpUrl() {
        return matchJumpUrl;
    }

    public void setMatchJumpUrl(String matchJumpUrl) {
        this.matchJumpUrl = matchJumpUrl;
    }

    public String getMatchJumpFlag() {
        return matchJumpFlag;
    }

    public void setMatchJumpFlag(String matchJumpFlag) {
        this.matchJumpFlag = matchJumpFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matchId=").append(matchId);
        sb.append(", matchSeq=").append(matchSeq);
        sb.append(", matchState=").append(matchState);
        sb.append(", matchPicture=").append(matchPicture);
        sb.append(", matchJumpUrl=").append(matchJumpUrl);
        sb.append(", matchJumpFlag=").append(matchJumpFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}