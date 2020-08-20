package com.macro.mall.cms.bean;


import io.swagger.annotations.ApiModelProperty;

public class CMS000002 {
	/**
	 *首页管理列表查询
	 */
	private static final long serialVersionUID = -6664637872592223125L;

	@ApiModelProperty(value = "页面id")
	private String      pageId;

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
}
