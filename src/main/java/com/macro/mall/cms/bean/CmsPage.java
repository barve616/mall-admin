package com.macro.mall.cms.bean;

public class CmsPage {


    private String	   pageId;
    private String	   pageName;
    private String     titleName;
    private String     pSortId;
    private String     sortName;
    private String	   upTime;
    private String	   startTime;
    private String	   endTime;
    private String     sate;

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getpSortId() {
        return pSortId;
    }

    public void setpSortId(String pSortId) {
        this.pSortId = pSortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

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

    public String getUpTime() {
        return upTime;
    }

    public void setUpTime(String upTime) {
        this.upTime = upTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSate() {
        return sate;
    }

    public void setSate(String sate) {
        this.sate = sate;
    }
}
