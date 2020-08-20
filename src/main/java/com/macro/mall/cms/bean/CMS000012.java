package com.macro.mall.cms.bean;


import io.swagger.annotations.ApiModelProperty;

public class CMS000012 {
	/**
	 *首页管理列表查询
	 */
	private static final long serialVersionUID = -6664637872592223125L;

	/** 页面名称 */
	@ApiModelProperty(value = "模板名称")
	private String      pageName;

	/** 页面名称 */
	@ApiModelProperty(value = "页面名称")
	private String 		titleName;

	/** 页面子类型ID */
	@ApiModelProperty(value = "页面子类型ID")
	private String pSortId;

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

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
}
