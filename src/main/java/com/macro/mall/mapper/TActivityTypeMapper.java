package com.macro.mall.mapper;

import com.macro.mall.model.TActivityType;
import com.macro.mall.model.TActivityTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TActivityTypeMapper {
    long countByExample(TActivityTypeExample example);

    int deleteByExample(TActivityTypeExample example);

    int insert(TActivityType record);

    int insertSelective(TActivityType record);

    List<TActivityType> selectByExample(TActivityTypeExample example);

    int updateByExampleSelective(@Param("record") TActivityType record, @Param("example") TActivityTypeExample example);

    int updateByExample(@Param("record") TActivityType record, @Param("example") TActivityTypeExample example);
}