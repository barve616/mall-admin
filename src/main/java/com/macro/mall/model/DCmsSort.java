package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DCmsSort implements Serializable {
    private String pageId;

    private String datasId;

    private String saveSort;

    private String tempSort;

    private String dataId;

    private String dataSort;

    private static final long serialVersionUID = 1L;

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getDatasId() {
        return datasId;
    }

    public void setDatasId(String datasId) {
        this.datasId = datasId;
    }

    public String getSaveSort() {
        return saveSort;
    }

    public void setSaveSort(String saveSort) {
        this.saveSort = saveSort;
    }

    public String getTempSort() {
        return tempSort;
    }

    public void setTempSort(String tempSort) {
        this.tempSort = tempSort;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getDataSort() {
        return dataSort;
    }

    public void setDataSort(String dataSort) {
        this.dataSort = dataSort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pageId=").append(pageId);
        sb.append(", datasId=").append(datasId);
        sb.append(", saveSort=").append(saveSort);
        sb.append(", tempSort=").append(tempSort);
        sb.append(", dataId=").append(dataId);
        sb.append(", dataSort=").append(dataSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}