package com.macro.mall.cms.bean;

public class CmsData {


    private String  funTitle;
    private String  dataId;
    /** 大模块主键 */
    private String  dataSId;
    private String  dataGId;
    private String  funImage01;
    private String  funImage02;
    private String  funImage03;
    private String  funImage04;
    /** 小模块排序号 */
    private String dataSort;
    private String datastate;

    public String getDatastate() {
        return datastate;
    }

    public void setDatastate(String datastate) {
        this.datastate = datastate;
    }

    public String getDataSort() {
        return dataSort;
    }

    public void setDataSort(String dataSort) {
        this.dataSort = dataSort;
    }
    public String getFunTitle() {
        return funTitle;
    }

    public void setFunTitle(String funTitle) {
        this.funTitle = funTitle;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getDataSId() {
        return dataSId;
    }

    public void setDataSId(String dataSId) {
        this.dataSId = dataSId;
    }

    public String getDataGId() {
        return dataGId;
    }

    public void setDataGId(String dataGId) {
        this.dataGId = dataGId;
    }

    public String getFunImage01() {
        return funImage01;
    }

    public void setFunImage01(String funImage01) {
        this.funImage01 = funImage01;
    }

    public String getFunImage02() {
        return funImage02;
    }

    public void setFunImage02(String funImage02) {
        this.funImage02 = funImage02;
    }

    public String getFunImage03() {
        return funImage03;
    }

    public void setFunImage03(String funImage03) {
        this.funImage03 = funImage03;
    }

    public String getFunImage04() {
        return funImage04;
    }

    public void setFunImage04(String funImage04) {
        this.funImage04 = funImage04;
    }
}
