package com.macro.mall.cms.bean;



public class CMS000001  {
	/**
	 *首页管理列表查询
	 */
	private static final long serialVersionUID = -6664637872592223125L;
	private String      pageName;
	private String		putStartTime;
	private String      putEndTime;
	private String		pageState;
	private String 		pSortId;
	private String		pageSize;
	private String		pageNum;

	public String getpSortId() {
		return pSortId;
	}

	public void setpSortId(String pSortId) {
		this.pSortId = pSortId;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNum() {
		return pageNum;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
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
