package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DMatchRegister implements Serializable {
    @ApiModelProperty(value = "手机号")
    private String userPhone;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "状态 01 待发送短信 02已发送短信 03已报名")
    private String state;


    private static final long serialVersionUID = 1L;

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userPhone=").append(userPhone);
        sb.append(", name=").append(name);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}