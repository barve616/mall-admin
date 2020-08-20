package com.macro.mall.mapper;

import com.macro.mall.model.TSportOrderActivity;
import com.macro.mall.model.TSportOrderActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportOrderActivityMapper {
    long countByExample(TSportOrderActivityExample example);

    int deleteByExample(TSportOrderActivityExample example);

    int insert(TSportOrderActivity record);

    int insertSelective(TSportOrderActivity record);

    List<TSportOrderActivity> selectByExample(TSportOrderActivityExample example);

    int updateByExampleSelective(@Param("record") TSportOrderActivity record, @Param("example") TSportOrderActivityExample example);

    int updateByExample(@Param("record") TSportOrderActivity record, @Param("example") TSportOrderActivityExample example);


    List<TSportOrderActivity> list(String orderId);
}