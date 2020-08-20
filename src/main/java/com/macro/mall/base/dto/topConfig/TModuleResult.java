package com.macro.mall.base.dto.topConfig;

import java.util.List;



public class TModuleResult {
    private String	  funId;//模块id
    private String	  id;//数据唯一id
    private String	  funImage;//图片地址
    private String	  funTitle;//标题
    private String	  startDate;//生效日期
    private String	  endDate;//失效日期
    private String	  region;//区域限制
    private String	  channel;//发布渠道
    private String	  funState;//状态
    private String    keyWord;
    private String   jumpType;

    private String jumpLink;

    private String uiJumpId;
    private String uiJumpName;
    private String uiJumpPid;
    private String msgType;
    
    
    public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getUiJumpName() {
		return uiJumpName;
	}
	public void setUiJumpName(String uiJumpName) {
		this.uiJumpName = uiJumpName;
	}
	public String getUiJumpPid() {
		return uiJumpPid;
	}
	public void setUiJumpPid(String uiJumpPid) {
		this.uiJumpPid = uiJumpPid;
	}
	private String uiParamValue; 
    public String getJumpType() {
		return jumpType;
	}
	public void setJumpType(String jumpType) {
		this.jumpType = jumpType;
	}
	public String getJumpLink() {
		return jumpLink;
	}
	public void setJumpLink(String jumpLink) {
		this.jumpLink = jumpLink;
	}

    
    public String getUiJumpId() {
		return uiJumpId;
	}
	public void setUiJumpId(String uiJumpId) {
		this.uiJumpId = uiJumpId;
	}
	public String getUiParamValue() {
		return uiParamValue;
	}
	public void setUiParamValue(String uiParamValue) {
		this.uiParamValue = uiParamValue;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	private List<TSpoContentRegion> contentRegionInfo;
    
	
	public List<TSpoContentRegion> getContentRegionInfo() {
		return contentRegionInfo;
	}
	public void setContentRegionInfo(List<TSpoContentRegion> contentRegionInfo) {
		this.contentRegionInfo = contentRegionInfo;
	}
	public String getFunId() {
		return funId;
	}
	public void setFunId(String funId) {
		this.funId = funId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFunImage() {
		return funImage;
	}
	public void setFunImage(String funImage) {
		this.funImage = funImage;
	}
	public String getFunTitle() {
		return funTitle;
	}
	public void setFunTitle(String funTitle) {
		this.funTitle = funTitle;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getFunState() {
		return funState;
	}
	public void setFunState(String funState) {
		this.funState = funState;
	}

}
