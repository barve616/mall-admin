package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchMaxtype implements Serializable {
    @ApiModelProperty(value = "赛事项目类型id")
    private String matchMaxTypeId;
    @ApiModelProperty(value = "赛事项目类型名称")
    private String matchMaxTypeName;
    @ApiModelProperty(value = "创建时间")
    private  String matchCreateTime;

    public String getMatchCreateTime() {
        return matchCreateTime;
    }

    public void setMatchCreateTime(String matchCreateTime) {
        this.matchCreateTime = matchCreateTime;
    }

    private static final long serialVersionUID = 1L;

    public String getMatchMaxTypeId() {
        return matchMaxTypeId;
    }

    public void setMatchMaxTypeId(String matchMaxTypeId) {
        this.matchMaxTypeId = matchMaxTypeId;
    }

    public String getMatchMaxTypeName() {
        return matchMaxTypeName;
    }

    public void setMatchMaxTypeName(String matchMaxTypeName) {
        this.matchMaxTypeName = matchMaxTypeName;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matchMaxTypeId=").append(matchMaxTypeId);
        sb.append(", matchMaxTypeName=").append(matchMaxTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}