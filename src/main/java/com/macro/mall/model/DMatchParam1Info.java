package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchParam1Info implements Serializable {
    @ApiModelProperty(value = "参数")
    private String param;
    @ApiModelProperty(value = "参数名")
    private String paramName;
    @ApiModelProperty(value = "id")
    private String id;

    private static final long serialVersionUID = 1L;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", param=").append(param);
        sb.append(", paramName=").append(paramName);
        sb.append(", id=").append(id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}