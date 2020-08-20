package com.macro.mall.communicate.match.bean;

import io.swagger.annotations.ApiModelProperty;

public class UpdateBean {
    @ApiModelProperty(value = "队伍id")
    private  String teamId;
    @ApiModelProperty(value = "赛事标记")
    private  String flag;
    @ApiModelProperty(value = "登录名")
    private  String loginName;
    @ApiModelProperty(value = "审核原因")
    private  String teamCheckDes;

    public String getTeamCheckDes() {
        return teamCheckDes;
    }

    public void setTeamCheckDes(String teamCheckDes) {
        this.teamCheckDes = teamCheckDes;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
