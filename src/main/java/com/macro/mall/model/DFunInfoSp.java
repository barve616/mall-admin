package com.macro.mall.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value="com-macro-mall-model-DFunInfoSp")
public class DFunInfoSp {
    /**
    * 功能id
    */
    @ApiModelProperty(value="功能id")
    private String funId;

    /**
    * 功能名称
    */
    @ApiModelProperty(value="功能名称")
    private String funName;

    /**
    * 功能PID
    */
    @ApiModelProperty(value="功能PID")
    private String funPid;

    /**
    * 功能顺序
    */
    @ApiModelProperty(value="功能顺序")
    private Integer funSeq;

    /**
    * 00 本地功能 01 远程功能
    */
    @ApiModelProperty(value="00 本地功能 01 远程功能")
    private String funStyle;

    /**
    * 功能类型:00 标题 01 功能
    */
    @ApiModelProperty(value="功能类型:00 标题 01 功能")
    private String funType;

    /**
    * 00 上线 01 下线
    */
    @ApiModelProperty(value="00 上线 01 下线")
    private String funState;

    /**
    * 参数提示 空为不上送
    */
    @ApiModelProperty(value="参数提示 空为不上送")
    private String funParm;

    /**
    * 6：表示跨境专区需要给H5传参数
    */
    @ApiModelProperty(value="6：表示跨境专区需要给H5传参数")
    private String modeType;

    /**
    * 是否支持缤纷生活
    */
    @ApiModelProperty(value="是否支持缤纷生活")
    private String mlifeFlag;

    /**
    * 是否支持手机银行
    */
    @ApiModelProperty(value="是否支持手机银行")
    private String phoneFlag;

    /**
    * 是否支持微信公众号
    */
    @ApiModelProperty(value="是否支持微信公众号")
    private String wxFlag;

    /**
    * 是否支持小程序
    */
    @ApiModelProperty(value="是否支持小程序")
    private String xcxFlag;


    /**
     * 子级
     */
    @ApiModelProperty(value="子级")
    private List<DFunInfoSp> funInfo;

    /**
    * 00 缤纷生活app、 01 手机银行app、02 运动本地功能
    */
    @ApiModelProperty(value="00 缤纷生活app、 01 手机银行app、02 运动本地功能")
    private String appFunType;

    public List<DFunInfoSp> getFunInfo() {
        return funInfo;
    }

    public void setFunInfo(List<DFunInfoSp> funInfo) {
        this.funInfo = funInfo;
    }

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

    public String getFunPid() {
        return funPid;
    }

    public void setFunPid(String funPid) {
        this.funPid = funPid;
    }

    public Integer getFunSeq() {
        return funSeq;
    }

    public void setFunSeq(Integer funSeq) {
        this.funSeq = funSeq;
    }

    public String getFunStyle() {
        return funStyle;
    }

    public void setFunStyle(String funStyle) {
        this.funStyle = funStyle;
    }

    public String getFunType() {
        return funType;
    }

    public void setFunType(String funType) {
        this.funType = funType;
    }

    public String getFunState() {
        return funState;
    }

    public void setFunState(String funState) {
        this.funState = funState;
    }

    public String getFunParm() {
        return funParm;
    }

    public void setFunParm(String funParm) {
        this.funParm = funParm;
    }

    public String getModeType() {
        return modeType;
    }

    public void setModeType(String modeType) {
        this.modeType = modeType;
    }

    public String getMlifeFlag() {
        return mlifeFlag;
    }

    public void setMlifeFlag(String mlifeFlag) {
        this.mlifeFlag = mlifeFlag;
    }

    public String getPhoneFlag() {
        return phoneFlag;
    }

    public void setPhoneFlag(String phoneFlag) {
        this.phoneFlag = phoneFlag;
    }

    public String getWxFlag() {
        return wxFlag;
    }

    public void setWxFlag(String wxFlag) {
        this.wxFlag = wxFlag;
    }

    public String getXcxFlag() {
        return xcxFlag;
    }

    public void setXcxFlag(String xcxFlag) {
        this.xcxFlag = xcxFlag;
    }

    public String getAppFunType() {
        return appFunType;
    }

    public void setAppFunType(String appFunType) {
        this.appFunType = appFunType;
    }
}