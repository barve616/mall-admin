package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchCommonInfo implements Serializable {
    private String matchCommonId;

    private String matchCommonName;

    private String matchCommonParam;

    private String matchCommonFlag;

    private String matchCommonParam1;
    private static final long serialVersionUID = 1L;

    public String getMatchCommonParam1() {
        return matchCommonParam1;
    }

    public void setMatchCommonParam1(String matchCommonParam1) {
        this.matchCommonParam1 = matchCommonParam1;
    }

    public String getMatchCommonId() {
        return matchCommonId;
    }

    public void setMatchCommonId(String matchCommonId) {
        this.matchCommonId = matchCommonId;
    }

    public String getMatchCommonName() {
        return matchCommonName;
    }

    public void setMatchCommonName(String matchCommonName) {
        this.matchCommonName = matchCommonName;
    }

    public String getMatchCommonParam() {
        return matchCommonParam;
    }

    public void setMatchCommonParam(String matchCommonParam) {
        this.matchCommonParam = matchCommonParam;
    }

    public String getMatchCommonFlag() {
        return matchCommonFlag;
    }

    public void setMatchCommonFlag(String matchCommonFlag) {
        this.matchCommonFlag = matchCommonFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matchCommonId=").append(matchCommonId);
        sb.append(", matchCommonName=").append(matchCommonName);
        sb.append(", matchCommonParam=").append(matchCommonParam);
        sb.append(", matchCommonFlag=").append(matchCommonFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}