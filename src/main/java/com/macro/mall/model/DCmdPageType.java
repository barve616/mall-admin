package com.macro.mall.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
    * 模板类别
    */
@ApiModel(value="com-macro-mall-model-DCmdPageType")
public class DCmdPageType {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private String pageTypeId;

    /**
    * 类别名称
    */
    @ApiModelProperty(value="类别名称")
    private String typeName;

    public String getPageTypeId() {
        return pageTypeId;
    }

    public void setPageTypeId(String pageTypeId) {
        this.pageTypeId = pageTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}