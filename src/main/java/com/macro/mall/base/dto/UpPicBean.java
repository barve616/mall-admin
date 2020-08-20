package com.macro.mall.base.dto;

import io.swagger.annotations.ApiModelProperty;

public class UpPicBean {
    private  String picUrl;
    private  String fileName;

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
