package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DCmsPage implements Serializable {
    private String pageId;

    private String pageName;

    private String titleName;

    private String pStartTime;

    private String pEndTime;

    private String pSortId;

    private String pageFlag;

    private String pageState;

    private String pUpTime;

    private String pTemSort;

    private String pSaveSort;

    private String nowDate;

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getNowDate() {
        return nowDate;
    }

    public void setNowDate(String nowDate) {
        this.nowDate = nowDate;
    }

    private static final long serialVersionUID = 1L;

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getpStartTime() {
        return pStartTime;
    }

    public void setpStartTime(String pStartTime) {
        this.pStartTime = pStartTime;
    }

    public String getpEndTime() {
        return pEndTime;
    }

    public void setpEndTime(String pEndTime) {
        this.pEndTime = pEndTime;
    }

    public String getpSortId() {
        return pSortId;
    }

    public void setpSortId(String pSortId) {
        this.pSortId = pSortId;
    }

    public String getPageFlag() {
        return pageFlag;
    }

    public void setPageFlag(String pageFlag) {
        this.pageFlag = pageFlag;
    }

    public String getPageState() {
        return pageState;
    }

    public void setPageState(String pageState) {
        this.pageState = pageState;
    }

    public String getpUpTime() {
        return pUpTime;
    }

    public void setpUpTime(String pUpTime) {
        this.pUpTime = pUpTime;
    }

    public String getpTemSort() {
        return pTemSort;
    }

    public void setpTemSort(String pTemSort) {
        this.pTemSort = pTemSort;
    }

    public String getpSaveSort() {
        return pSaveSort;
    }

    public void setpSaveSort(String pSaveSort) {
        this.pSaveSort = pSaveSort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pageId=").append(pageId);
        sb.append(", pageName=").append(pageName);
        sb.append(", pStartTime=").append(pStartTime);
        sb.append(", pEndTime=").append(pEndTime);
        sb.append(", pSortId=").append(pSortId);
        sb.append(", pageFlag=").append(pageFlag);
        sb.append(", pageState=").append(pageState);
        sb.append(", pUpTime=").append(pUpTime);
        sb.append(", pTemSort=").append(pTemSort);
        sb.append(", pSaveSort=").append(pSaveSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}