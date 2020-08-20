package com.macro.mall.mapper;


import com.macro.mall.model.DSmsConfig;

public interface DSmsConfigMapper  {
	DSmsConfig selectSmsId(String userId);

	DSmsConfig  selectSmsById(String userId);
}