package com.macro.mall.mapper;

import com.macro.mall.model.DCmdPageType;

import java.util.List;

public interface DCmdPageTypeMapper {

    List<DCmdPageType> lists(DCmdPageType dCmdPageType);

    int deleteByPrimaryKey(String pageTypeId);

    int insert(DCmdPageType record);

    int insertSelective(DCmdPageType record);

    DCmdPageType selectByPrimaryKey(String pageTypeId);

    int updateByPrimaryKeySelective(DCmdPageType record);

    int updateByPrimaryKey(DCmdPageType record);
}