package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchMaxterm implements Serializable {
    @ApiModelProperty(value = "赛事大项id")
    private String matchMaxId;
    @ApiModelProperty(value = "赛事大项名称")
    private String matchMaxName;
    @ApiModelProperty(value = " ")
    private String matchMaxDetail;
    @ApiModelProperty(value = "赛事类型id")
    private String matchMaxTypeId;
    @ApiModelProperty(value = "赛事详情")
    private byte[] matchDetail;
    @ApiModelProperty(value = "赛事详情String")
    private String matchDetailString;

    private static final long serialVersionUID = 1L;

    public String getMatchDetailString() {
        return matchDetailString;
    }

    public void setMatchDetailString(String matchDetailString) {
        this.matchDetailString = matchDetailString;
    }

    public byte[] getMatchDetail() {
        return matchDetail;
    }

    public void setMatchDetail(byte[] matchDetail) {
        this.matchDetail = matchDetail;
    }

    public String getMatchMaxId() {
        return matchMaxId;
    }

    public void setMatchMaxId(String matchMaxId) {
        this.matchMaxId = matchMaxId;
    }

    public String getMatchMaxName() {
        return matchMaxName;
    }

    public void setMatchMaxName(String matchMaxName) {
        this.matchMaxName = matchMaxName;
    }

    public String getMatchMaxDetail() {
        return matchMaxDetail;
    }

    public void setMatchMaxDetail(String matchMaxDetail) {
        this.matchMaxDetail = matchMaxDetail;
    }

    public String getMatchMaxTypeId() {
        return matchMaxTypeId;
    }

    public void setMatchMaxTypeId(String matchMaxTypeId) {
        this.matchMaxTypeId = matchMaxTypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matchMaxId=").append(matchMaxId);
        sb.append(", matchMaxName=").append(matchMaxName);
        sb.append(", matchMaxDetail=").append(matchMaxDetail);
        sb.append(", matchMaxTypeId=").append(matchMaxTypeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}