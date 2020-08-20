package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DCmsFunciton implements Serializable {
    private String funId;

    private String funName;

    private String funImage;

    private String funFlag;

    private static final long serialVersionUID = 1L;

    public String getFunId() {
        return funId;
    }

    public void setFunId(String funId) {
        this.funId = funId;
    }

    public String getFunName() {
        return funName;
    }

    public void setFunName(String funName) {
        this.funName = funName;
    }

    public String getFunImage() {
        return funImage;
    }

    public void setFunImage(String funImage) {
        this.funImage = funImage;
    }

    public String getFunFlag() {
        return funFlag;
    }

    public void setFunFlag(String funFlag) {
        this.funFlag = funFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", funId=").append(funId);
        sb.append(", funName=").append(funName);
        sb.append(", funImage=").append(funImage);
        sb.append(", funFlag=").append(funFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}