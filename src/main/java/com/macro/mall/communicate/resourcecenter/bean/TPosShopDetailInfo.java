package com.macro.mall.communicate.resourcecenter.bean;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;


@Validated
public class TPosShopDetailInfo {

    @ApiModelProperty(value = "店铺id")
    @NotEmpty(message = "店铺id不能为为空")
    private String shopId;


    @ApiModelProperty(value = "店铺详情")
    @NotEmpty(message = "详情信息不能为为空")
    private String shopDetail;

    @ApiModelProperty(value = "教练id")
    private String coachId;


    public String getShopDetail() {
        return shopDetail;
    }

    public void setShopDetail(String shopDetail) {
        this.shopDetail = shopDetail;
    }

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "TPosShopDetailInfo{" +
                "shopId='" + shopId + '\'' +
                ", shopDetail='" + shopDetail + '\'' +
                ", coachId='" + coachId + '\'' +
                '}';
    }
}
