package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;

public class TSportCommodityType implements Serializable {


    private List<TSportCommodityType> commodityTypeList; //商品分类子集列表

    public List<TSportCommodityType> getCommodityTypeList() {
        return commodityTypeList;
    }

    public void setCommodityTypeList(List<TSportCommodityType> commodityTypeList) {
        this.commodityTypeList = commodityTypeList;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////

    @ApiModelProperty(value = "商品类型id")
    private String commodityTypeId;
    @ApiModelProperty(value = "商品类型名字")
    private String commodityTypeName;
    @ApiModelProperty(value = "商品类型父级id")
    private String commodityPId;
    @ApiModelProperty(value = "层级")
    private String stratum;

    private String createTime;

    private String updateTime;

    @ApiModelProperty(value = "序号")
    private String commodityTypeNo;
    @ApiModelProperty(value = "状态")
    private String commodityTypeStatus;

    private static final long serialVersionUID = 1L;

    public String getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(String commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName;
    }

    public String getCommodityPId() {
        return commodityPId;
    }

    public void setCommodityPId(String commodityPId) {
        this.commodityPId = commodityPId;
    }

    public String getStratum() {
        return stratum;
    }

    public void setStratum(String stratum) {
        this.stratum = stratum;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCommodityTypeNo() {
        return commodityTypeNo;
    }

    public void setCommodityTypeNo(String commodityTypeNo) {
        this.commodityTypeNo = commodityTypeNo;
    }

    public String getCommodityTypeStatus() {
        return commodityTypeStatus;
    }

    public void setCommodityTypeStatus(String commodityTypeStatus) {
        this.commodityTypeStatus = commodityTypeStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commodityTypeId=").append(commodityTypeId);
        sb.append(", commodityTypeName=").append(commodityTypeName);
        sb.append(", commodityPId=").append(commodityPId);
        sb.append(", stratum=").append(stratum);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", commodityTypeNo=").append(commodityTypeNo);
        sb.append(", commodityTypeStatus=").append(commodityTypeStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}