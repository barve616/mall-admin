package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class DMatchTypeInfo implements Serializable {
    @ApiModelProperty(value = "赛事类型id")
    private String matchTypeId;
    @ApiModelProperty(value = "赛事类型名称")
    private String matchTypeName;
    @ApiModelProperty(value = "赛事类型状态  0启用  1不启用")
    private String matchTypeFlag;

    private static final long serialVersionUID = 1L;

    public String getMatchTypeId() {
        return matchTypeId;
    }

    public void setMatchTypeId(String matchTypeId) {
        this.matchTypeId = matchTypeId;
    }

    public String getMatchTypeName() {
        return matchTypeName;
    }

    public void setMatchTypeName(String matchTypeName) {
        this.matchTypeName = matchTypeName;
    }

    public String getMatchTypeFlag() {
        return matchTypeFlag;
    }

    public void setMatchTypeFlag(String matchTypeFlag) {
        this.matchTypeFlag = matchTypeFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matchTypeId=").append(matchTypeId);
        sb.append(", matchTypeName=").append(matchTypeName);
        sb.append(", matchTypeFlag=").append(matchTypeFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}