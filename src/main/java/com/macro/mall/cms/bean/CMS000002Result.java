package com.macro.mall.cms.bean;

import java.util.List;

public class CMS000002Result {
    /**
     *
     */
    private String funId;

    /**
     *
     */
    private String funName;

    /**
     *
     */
    private String pageId;

    /**
     *
     */
    private String datasId;

    /**
     *
     */
    private String paramsFlag;

    /**
     *
     */
    private String spaceFlag;

    /**
     *
     */
    private String paramsName;

    /**
     *
     */
    private String fontSize;

    /**
     *
     */
    private String fontColor;

    /**
     *
     */
    private String colorR;

    /**
     *
     */
    private String colorG;

    /**
     *
     */
    private String colorB;

    /**
     *
     */
    private String pDownTime;

    /**
     *
     */
    private String pNewsNum;

    /**
     *
     */
    private String pButFlag;

    /**
     *
     */
    private String pButValue;

    /**
     *
     */
    private String modelImage;

    /**
     *
     */
    private String channel;

    private String rowNum;

    private List<CmsData> cmsDatas;

    public String getRowNum() {
        return rowNum;
    }

    public void setRowNum(String rowNum) {
        this.rowNum = rowNum;
    }

    public String getDatasId() {
        return datasId;
    }

    public void setDatasId(String datasId) {
        this.datasId = datasId;
    }

    public List<CmsData> getCmsDatas() {
        return cmsDatas;
    }

    public void setCmsDatas(List<CmsData> cmsDatas) {
        this.cmsDatas = cmsDatas;
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

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
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

