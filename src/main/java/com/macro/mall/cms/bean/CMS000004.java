package com.macro.mall.cms.bean;



public class CMS000004 {
	/**
	 *首页管理列表查询
	 */
	private static final long serialVersionUID = -6664637872592223125L;

	private String   	pageId;
	private String      type;
	private String        cmsState;
	private String   	pageName;
	private String 		titleName;
	private String 		pSortId;

	public String getpSortId() {
		return pSortId;
	}

	public void setpSortId(String pSortId) {
		this.pSortId = pSortId;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCmsState() {
		return cmsState;
	}

	public void setCmsState(String cmsState) {
		this.cmsState = cmsState;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
}
