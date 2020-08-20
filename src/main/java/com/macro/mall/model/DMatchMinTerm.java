package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


public class DMatchMinTerm implements Serializable{


    @ApiModelProperty(value = "赛事大项id")
    private String matchMaxId;

    @ApiModelProperty(value = "赛事小项id")
    private String matchMinId;

    @ApiModelProperty(value = "赛事大项名称")
    private String matchMaxName;

    @ApiModelProperty(value = "赛事小项名称")
    private String matchMinDetail;

    @ApiModelProperty(value = "赛事类型")
    private String matchTp;

    @ApiModelProperty(value = "赛事类型名称")
    private String matchTpName;

    public String getMatchTp() {
        return matchTp;
    }

    public void setMatchTp(String matchTp) {
        this.matchTp = matchTp;
    }

    public String getMatchTpName() {
        return matchTpName;
    }

    public void setMatchTpName(String matchTpName) {
        this.matchTpName = matchTpName;
    }

    public String getMatchMaxId() {
        return matchMaxId;
    }

    public void setMatchMaxId(String matchMaxId) {
        this.matchMaxId = matchMaxId;
    }

    public String getMatchMinId() {
        return matchMinId;
    }

    public void setMatchMinId(String matchMinId) {
        this.matchMinId = matchMinId;
    }

    public String getMatchMaxName() {
        return matchMaxName;
    }

    public void setMatchMaxName(String matchMaxName) {
        this.matchMaxName = matchMaxName;
    }

    public String getMatchMinDetail() {
        return matchMinDetail;
    }

    public void setMatchMinDetail(String matchMinDetail) {
        this.matchMinDetail = matchMinDetail;
    }
}