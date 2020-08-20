package com.macro.mall.communicate.resourcecenter.bean;

public class AroundPosListVO {

    private String posName;//商户名称
    private String site; //商户地址
    private String aroundPosType;//商户类型
    private String state;//推荐状态
    private String shopId;//店铺id

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getAroundPosType() {
        return aroundPosType;
    }

    public void setAroundPosType(String aroundPosType) {
        this.aroundPosType = aroundPosType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "AroundPosListVO{" +
                "posName='" + posName + '\'' +
                ", site='" + site + '\'' +
                ", aroundPosType='" + aroundPosType + '\'' +
                ", state='" + state + '\'' +
                ", shopId='" + shopId + '\'' +
                '}';
    }
}
