package com.macro.mall.communicate.resourcecenter.bean;

import com.macro.mall.model.TPosShopInfo;
import com.macro.mall.model.TSportCoachTeam;
import com.macro.mall.model.TSportShopWindowseat;

import java.util.List;

public class TPosShopInfoDTO extends TPosShopInfo {

    private List<TSportShopWindowseat> shopWindowseatList;//橱窗位
    private List<TSportCoachTeam> coachTeamList; //教练列表
    private String shopDetailStr; //商品详情信息

    public List<TSportCoachTeam> getCoachTeamList() {
        return coachTeamList;
    }
    public void setCoachTeamList(List<TSportCoachTeam> coachTeamList) {
        this.coachTeamList = coachTeamList;
    }
    public List<TSportShopWindowseat> getShopWindowseatList() {
        return shopWindowseatList;
    }
    public void setShopWindowseatList(List<TSportShopWindowseat> shopWindowseatList) {
        this.shopWindowseatList = shopWindowseatList;
    }
    public String getShopDetailStr() {
        return shopDetailStr;
    }
    public void setShopDetailStr(String shopDetailStr) {
        this.shopDetailStr = shopDetailStr;
    }
}
