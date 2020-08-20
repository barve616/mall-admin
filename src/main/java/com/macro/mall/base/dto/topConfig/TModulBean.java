package com.macro.mall.base.dto.topConfig;

public class TModulBean {
    private String	  funId;//模块id
    private String	  id;//数据唯一id
    private String	  type;//操作类型
    private Integer   page;//页码
    private String channel;
    private String msgType;
    
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
    
}
