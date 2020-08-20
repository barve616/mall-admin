package com.macro.mall.model;

import com.macro.mall.base.dto.FunInfo;

import java.io.Serializable;
import java.util.List;

public class DFunInfo implements Serializable {
    private String funId;

    private String funName;

    private String funPid;

    private Integer funSeq;

    private String funStyle;

    private String funType;

    private String funState;

    private String funParm;

    private String modeType;

    private static final long serialVersionUID = 1L;

    private List<DFunInfo> funInfo;

    public List<DFunInfo> getFunInfo() {
        return funInfo;
    }

    public void setFunInfo(List<DFunInfo> funInfo) {
        this.funInfo = funInfo;
    }

    public String getFunId() {
        return funId;
    }

    public void setFunId(String funId) {
        this.funId = funId;
    }

    public String getFunName() {
        return funName;
    }

    public void setFunName(String funName) {
        this.funName = funName;
    }

    public String getFunPid() {
        return funPid;
    }

    public void setFunPid(String funPid) {
        this.funPid = funPid;
    }

    public Integer getFunSeq() {
        return funSeq;
    }

    public void setFunSeq(Integer funSeq) {
        this.funSeq = funSeq;
    }

    public String getFunStyle() {
        return funStyle;
    }

    public void setFunStyle(String funStyle) {
        this.funStyle = funStyle;
    }

    public String getFunType() {
        return funType;
    }

    public void setFunType(String funType) {
        this.funType = funType;
    }

    public String getFunState() {
        return funState;
    }

    public void setFunState(String funState) {
        this.funState = funState;
    }

    public String getFunParm() {
        return funParm;
    }

    public void setFunParm(String funParm) {
        this.funParm = funParm;
    }

    public String getModeType() {
        return modeType;
    }

    public void setModeType(String modeType) {
        this.modeType = modeType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", funId=").append(funId);
        sb.append(", funName=").append(funName);
        sb.append(", funPid=").append(funPid);
        sb.append(", funSeq=").append(funSeq);
        sb.append(", funStyle=").append(funStyle);
        sb.append(", funType=").append(funType);
        sb.append(", funState=").append(funState);
        sb.append(", funParm=").append(funParm);
        sb.append(", modeType=").append(modeType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}