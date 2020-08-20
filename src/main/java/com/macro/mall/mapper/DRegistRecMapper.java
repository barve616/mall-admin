package com.macro.mall.mapper;


import com.macro.mall.model.DRegistRec;

public interface DRegistRecMapper  {
	DRegistRec selectRegistById(String userId);

	int updateSMSErrCnt(String userId);

	void updateSussSms(String id);

	Boolean insertSmsInfo(DRegistRec dRegistRec);
}