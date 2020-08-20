package com.macro.mall.communicate.match.bean;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class DMatchTypeDetailInfoBean implements Serializable {
    @ApiModelProperty(value = "主键id")
    private String matchTypeDetailId;
    @ApiModelProperty(value = "赛事标题")
    private String matchTitle;
//    @ApiModelProperty(value = "赛事图片地址")
//    private String matchPicture;
    @ApiModelProperty(value = "赛事资讯类型id")
    private String matchTypeId;
//    @ApiModelProperty(value = "赛事资讯类型名称")
//    private String matchTypeName;
    @ApiModelProperty(value = "赛事资讯是否置顶  0 置顶  1不置顶")
    private String matchStickFlag;
    @ApiModelProperty(value = "赛事资讯状态  0 开启  1关闭")
    private String matchState;
    @ApiModelProperty(value = "赛事资讯创建时间")
    private String matchCreateTime;
    @ApiModelProperty(value = "赛事资讯详情")
    private String matchDetails;
    @ApiModelProperty(value = "赛事资讯详情")
    private String matchSubtitle;

    private static final long serialVersionUID = 1L;

    public String getMatchSubtitle() {
        return matchSubtitle;
    }

    public void setMatchSubtitle(String matchSubtitle) {
        this.matchSubtitle = matchSubtitle;
    }

    public String getMatchTypeDetailId() {
        return matchTypeDetailId;
    }

    public void setMatchTypeDetailId(String matchTypeDetailId) {
        this.matchTypeDetailId = matchTypeDetailId;
    }

    public String getMatchTitle() {
        return matchTitle;
    }

    public void setMatchTitle(String matchTitle) {
        this.matchTitle = matchTitle;
    }
//
//    public String getMatchPicture() {
//        return matchPicture;
//    }
//
//    public void setMatchPicture(String matchPicture) {
//        this.matchPicture = matchPicture;
//    }

    public String getMatchTypeId() {
        return matchTypeId;
    }

    public void setMatchTypeId(String matchTypeId) {
        this.matchTypeId = matchTypeId;
    }

//    public String getMatchTypeName() {
//        return matchTypeName;
//    }
//
//    public void setMatchTypeName(String matchTypeName) {
//        this.matchTypeName = matchTypeName;
//    }

    public String getMatchStickFlag() {
        return matchStickFlag;
    }

    public void setMatchStickFlag(String matchStickFlag) {
        this.matchStickFlag = matchStickFlag;
    }

    public String getMatchState() {
        return matchState;
    }

    public void setMatchState(String matchState) {
        this.matchState = matchState;
    }

    public String getMatchCreateTime() {
        return matchCreateTime;
    }

    public void setMatchCreateTime(String matchCreateTime) {
        this.matchCreateTime = matchCreateTime;
    }

    public String getMatchDetails() {
        return matchDetails;
    }

    public void setMatchDetails(String matchDetails) {
        this.matchDetails = matchDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matchTypeDetailId=").append(matchTypeDetailId);
        sb.append(", matchTitle=").append(matchTitle);
//        sb.append(", matchPicture=").append(matchPicture);
        sb.append(", matchTypeId=").append(matchTypeId);
//        sb.append(", matchTypeName=").append(matchTypeName);
        sb.append(", matchStickFlag=").append(matchStickFlag);
        sb.append(", matchState=").append(matchState);
        sb.append(", matchCreateTime=").append(matchCreateTime);
        sb.append(", matchDetails=").append(matchDetails);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}