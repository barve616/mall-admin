package com.macro.mall.mapper;

import com.macro.mall.model.DCmsFunciton;

import java.util.List;

public interface DCmsFuncitonMapper {

    //查询功能列表
    List<DCmsFunciton> selectFunlist();
    DCmsFunciton   selectFUn(String funId);

}