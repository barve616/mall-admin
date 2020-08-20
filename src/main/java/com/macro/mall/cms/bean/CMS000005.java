package com.macro.mall.cms.bean;



public class CMS000005 {

	private static final long serialVersionUID = -6664637872592223125L;

	private String   	pageId;
	private String   	sortNum;
	private String      putStartTime;
	private String      putEndTime;
	private String   	pageState;
	private String      type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}



	public String getSortNum() {
		return sortNum;
	}

	public void setSortNum(String sortNum) {
		this.sortNum = sortNum;
	}

	public String getPutStartTime() {
		return putStartTime;
	}

	public void setPutStartTime(String putStartTime) {
		this.putStartTime = putStartTime;
	}

	public String getPutEndTime() {
		return putEndTime;
	}

	public void setPutEndTime(String putEndTime) {
		this.putEndTime = putEndTime;
	}

	public String getPageState() {
		return pageState;
	}

	public void setPageState(String pageState) {
		this.pageState = pageState;
	}
}
