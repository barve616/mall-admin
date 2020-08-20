package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;

public class TSportShopWindowseat implements Serializable {

    //商品列表
    List<TSportCommodity>  commodityList;

    public List<TSportCommodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<TSportCommodity> commodityList) {
        this.commodityList = commodityList;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private String windowseatId;

    private String windowseatName;

    private String windowseatCommodityId;

    private String shopId;

    private String createDate;

    private static final long serialVersionUID = 1L;

    public String getWindowseatId() {
        return windowseatId;
    }

    public void setWindowseatId(String windowseatId) {
        this.windowseatId = windowseatId;
    }

    public String getWindowseatName() {
        return windowseatName;
    }

    public void setWindowseatName(String windowseatName) {
        this.windowseatName = windowseatName;
    }

    public String getWindowseatCommodityId() {
        return windowseatCommodityId;
    }

    public void setWindowseatCommodityId(String windowseatCommodityId) {
        this.windowseatCommodityId = windowseatCommodityId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", windowseatId=").append(windowseatId);
        sb.append(", windowseatName=").append(windowseatName);
        sb.append(", windowseatCommodityId=").append(windowseatCommodityId);
        sb.append(", shopId=").append(shopId);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}