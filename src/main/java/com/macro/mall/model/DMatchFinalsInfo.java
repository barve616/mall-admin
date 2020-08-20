package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchFinalsInfo implements Serializable {
    private String id;

    private String matchId;

    private String userNm;

    private String certNo;

    private String userName;

    private String state;

    private String details;

    private String creatTime;

    private String removeTime;

    private String matchType;

    private String headFlag;

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
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

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", matchId=").append(matchId);
        sb.append(", userNm=").append(userNm);
        sb.append(", certNo=").append(certNo);
        sb.append(", userName=").append(userName);
        sb.append(", state=").append(state);
        sb.append(", details=").append(details);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", removeTime=").append(removeTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}