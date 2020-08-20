package com.macro.mall.communicate.resourcecenter.bean;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;


@Validated
public class UpdateCommodityStatusVO {


    @ApiModelProperty(value = "商品id集合字符串")
    @NotEmpty(message = "商品id不能为空")
    private String commodityIdArr;

    @ApiModelProperty(value = "审核状态")
    @NotEmpty(message = "审核状态不能为空")
    private String examineStatus;

    @ApiModelProperty(value = "审核失败原因")
    private String examineFailureReason;

    public String getCommodityIdArr() {
        return commodityIdArr;
    }

    public void setCommodityIdArr(String commodityIdArr) {
        this.commodityIdArr = commodityIdArr;
    }

    public String getExamineStatus() {
        return examineStatus;
    }

    public void setExamineStatus(String examineStatus) {
        this.examineStatus = examineStatus;
    }

    public String getExamineFailureReason() {
        return examineFailureReason;
    }

    public void setExamineFailureReason(String examineFailureReason) {
        this.examineFailureReason = examineFailureReason;
    }
}
