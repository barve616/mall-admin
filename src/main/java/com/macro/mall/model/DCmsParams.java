package com.macro.mall.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "com-macro-mall-model-DCmsParams")
public class DCmsParams {
    /**
     * 页面id
     */
    @ApiModelProperty(value = "页面id")
    private String pageId;

    /**
     * 功能id
     */
    @ApiModelProperty(value = "功能id")
    private String fucId;

    /**
     * 模块行id
     */
    @ApiModelProperty(value = "模块行id")
    private String datasId;

    /**
     * 是否显示标题 01：显示 02 ：不显示
     */
    @ApiModelProperty(value = "是否显示标题 01：显示 02 ：不显示")
    private String paramsFlag;

    /**
     * 是否隐藏间隙 01：隐藏   02 ：不隐藏
     */
    @ApiModelProperty(value = "是否隐藏间隙 01：隐藏   02 ：不隐藏")
    private String spaceFlag;

    /**
     * 标题文字说明
     */
    @ApiModelProperty(value = "标题文字说明")
    private String paramsName;

    /**
     * 字号
     */
    @ApiModelProperty(value = "字号")
    private String fontSize;

    /**
     * 色值
     */
    @ApiModelProperty(value = "色值")
    private String fontColor;

    /**
     * R参数
     */
    @ApiModelProperty(value = "R参数")
    private String colorR;

    /**
     * G参数
     */
    @ApiModelProperty(value = "G参数")
    private String colorG;

    /**
     * B参数
     */
    @ApiModelProperty(value = "B参数")
    private String colorB;

    /**
     * 倒计时截止日期
     */
    @ApiModelProperty(value = "倒计时截止日期")
    private String pDownTime;

    /**
     * 读取资讯条数
     */
    @ApiModelProperty(value = "读取资讯条数")
    private String pNewsNum;

    /**
     * 是否显示更多按钮
     */
    @ApiModelProperty(value = "是否显示更多按钮")
    private String pButFlag;

    /**
     * 更多按钮参数
     */
    @ApiModelProperty(value = "更多按钮参数")
    private String pButValue;

    /**
     * 模块图片
     */
    @ApiModelProperty(value = "模块图片")
    private String modelImage;

    /**
     * 投放渠道
     */
    @ApiModelProperty(value = "投放渠道")
    private String channel;

    /**
     * 几行展示
     */
    @ApiModelProperty(value = "几行展示")
    private String rowNum;

    public String getRowNum() {
        return rowNum;
    }

    public void setRowNum(String rowNum) {
        this.rowNum = rowNum;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getFucId() {
        return fucId;
    }

    public void setFucId(String fucId) {
        this.fucId = fucId;
    }

    public String getDatasId() {
        return datasId;
    }

    public void setDatasId(String datasId) {
        this.datasId = datasId;
    }

    public String getParamsFlag() {
        return paramsFlag;
    }

    public void setParamsFlag(String paramsFlag) {
        this.paramsFlag = paramsFlag;
    }

    public String getSpaceFlag() {
        return spaceFlag;
    }

    public void setSpaceFlag(String spaceFlag) {
        this.spaceFlag = spaceFlag;
    }

    public String getParamsName() {
        return paramsName;
    }

    public void setParamsName(String paramsName) {
        this.paramsName = paramsName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getColorR() {
        return colorR;
    }

    public void setColorR(String colorR) {
        this.colorR = colorR;
    }

    public String getColorG() {
        return colorG;
    }

    public void setColorG(String colorG) {
        this.colorG = colorG;
    }

    public String getColorB() {
        return colorB;
    }

    public void setColorB(String colorB) {
        this.colorB = colorB;
    }

    public String getpDownTime() {
        return pDownTime;
    }

    public void setpDownTime(String pDownTime) {
        this.pDownTime = pDownTime;
    }

    public String getpNewsNum() {
        return pNewsNum;
    }

    public void setpNewsNum(String pNewsNum) {
        this.pNewsNum = pNewsNum;
    }

    public String getpButFlag() {
        return pButFlag;
    }

    public void setpButFlag(String pButFlag) {
        this.pButFlag = pButFlag;
    }

    public String getpButValue() {
        return pButValue;
    }

    public void setpButValue(String pButValue) {
        this.pButValue = pButValue;
    }

    public String getModelImage() {
        return modelImage;
    }

    public void setModelImage(String modelImage) {
        this.modelImage = modelImage;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}

