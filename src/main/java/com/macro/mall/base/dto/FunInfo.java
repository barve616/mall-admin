package com.macro.mall.base.dto;

import java.io.Serializable;
import java.util.List;
public class FunInfo implements Serializable {
	private static final long serialVersionUID = 3631506388265212268L;
	private String funId;
	private String funName;
	private String funPid;
	private int funSeq;
	
	
	private List<FunInfo> funInfo;
	/**
	 * @return the funInfo
	 */
	public List<FunInfo> getFunInfo() {
		return funInfo;
	}
	/**
	 * @param funInfo the funInfo to set
	 */
	public void setFunInfo(List<FunInfo> funInfo) {
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
	public int getFunSeq() {
		return funSeq;
	}
	public void setFunSeq(int funSeq) {
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
	private String funStyle;
	private String funType;
	private String funState;
	private String funParm;//功能附件参数
}
