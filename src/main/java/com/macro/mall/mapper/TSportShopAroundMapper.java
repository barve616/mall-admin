package com.macro.mall.mapper;

import com.macro.mall.model.TSportShopAround;
import com.macro.mall.model.TSportShopAroundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportShopAroundMapper {
    long countByExample(TSportShopAroundExample example);

    int deleteByExample(TSportShopAroundExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSportShopAround record);

    int insertSelective(TSportShopAround record);

    List<TSportShopAround> selectByExample(TSportShopAroundExample example);

    TSportShopAround selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSportShopAround record, @Param("example") TSportShopAroundExample example);

    int updateByExample(@Param("record") TSportShopAround record, @Param("example") TSportShopAroundExample example);

    int updateByPrimaryKeySelective(TSportShopAround record);

    int updateByPrimaryKey(TSportShopAround record);

    List<TSportShopAround> getShopAroundByShopIdAndAroundId(@Param("shopId") String shopId,
                                                            @Param("aroundId") String aroundId);

    int deleteShopAroundByShopIdAndAroundId(@Param("shopId") String shopId,
                                            @Param("aroundId") String aroundId);
}