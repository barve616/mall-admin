package com.macro.mall.mapper;

import com.macro.mall.model.TSportShopWindowseat;
import com.macro.mall.model.TSportShopWindowseatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportShopWindowseatMapper {
    long countByExample(TSportShopWindowseatExample example);

    int deleteByExample(TSportShopWindowseatExample example);

    int deleteByPrimaryKey(String windowseatId);

    int insert(TSportShopWindowseat record);

    int insertSelective(TSportShopWindowseat record);

    List<TSportShopWindowseat> selectByExample(TSportShopWindowseatExample example);

    TSportShopWindowseat selectByPrimaryKey(String windowseatId);

    int updateByExampleSelective(@Param("record") TSportShopWindowseat record, @Param("example") TSportShopWindowseatExample example);

    int updateByExample(@Param("record") TSportShopWindowseat record, @Param("example") TSportShopWindowseatExample example);

    int updateByPrimaryKeySelective(TSportShopWindowseat record);

    int updateByPrimaryKey(TSportShopWindowseat record);
}