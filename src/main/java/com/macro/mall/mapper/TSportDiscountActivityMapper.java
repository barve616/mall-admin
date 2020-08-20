package com.macro.mall.mapper;

import com.macro.mall.model.TSportDiscountActivity;
import com.macro.mall.model.TSportDiscountActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportDiscountActivityMapper {
    long countByExample(TSportDiscountActivityExample example);

    int deleteByExample(TSportDiscountActivityExample example);

    int insert(TSportDiscountActivity record);

    int insertSelective(TSportDiscountActivity record);

    List<TSportDiscountActivity> selectByExample(TSportDiscountActivityExample example);

    int updateByExampleSelective(@Param("record") TSportDiscountActivity record, @Param("example") TSportDiscountActivityExample example);

    int updateByExample(@Param("record") TSportDiscountActivity record, @Param("example") TSportDiscountActivityExample example);

    List<TSportDiscountActivity> selectByCondition(@Param("typeId")String typeId,
                                                   @Param("searchInfo")String searchInfo,
                                                   @Param("starTime")String starTime,
                                                   @Param("endTime")String endTime,
                                                   @Param("playType")String playType);



}