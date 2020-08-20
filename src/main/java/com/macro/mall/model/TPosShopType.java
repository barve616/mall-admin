package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TPosShopType implements Serializable {

    private List<TPosShopType> posShopTypeList;

    public List<TPosShopType> getPosShopTypeList() {
        return posShopTypeList;
    }

    public void setPosShopTypeList(List<TPosShopType> posShopTypeList) {
        this.posShopTypeList = posShopTypeList;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    /////////////////////////////////////////////////////////////////////////////////////

    private String commodityTypeId;

    private String posShopId;

    private String commodityTypeName;

    private String commodityTypePid;

    private String stratum;

    private String state;

    private String commodityTypeNo;

    private String createdTime;

    private String updatedTime;

    private static final long serialVersionUID = 1L;

    public String getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(String commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public String getPosShopId() {
        return posShopId;
    }

    public void setPosShopId(String posShopId) {
        this.posShopId = posShopId;
    }

    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName;
    }

    public String getCommodityTypePid() {
        return commodityTypePid;
    }

    public void setCommodityTypePid(String commodityTypePid) {
        this.commodityTypePid = commodityTypePid;
    }

    public String getStratum() {
        return stratum;
    }

    public void setStratum(String stratum) {
        this.stratum = stratum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCommodityTypeNo() {
        return commodityTypeNo;
    }

    public void setCommodityTypeNo(String commodityTypeNo) {
        this.commodityTypeNo = commodityTypeNo;
    }


    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }


    @Override
    public String toString() {
        return "TPosShopType{" +
                "posShopTypeList=" + posShopTypeList +
                ", commodityTypeId='" + commodityTypeId + '\'' +
                ", posShopId='" + posShopId + '\'' +
                ", commodityTypeName='" + commodityTypeName + '\'' +
                ", commodityTypePid='" + commodityTypePid + '\'' +
                ", stratum='" + stratum + '\'' +
                ", state='" + state + '\'' +
                ", commodityTypeNo='" + commodityTypeNo + '\'' +
                ", createdTime='" + createdTime + '\'' +
                ", updatedTime='" + updatedTime + '\'' +
                '}';
    }
}