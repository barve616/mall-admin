package com.macro.mall.mapper;

import com.macro.mall.model.DStepActivity;
import com.macro.mall.model.DStepActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DStepActivityMapper {
    long countByExample(DStepActivityExample example);

    int deleteByExample(DStepActivityExample example);

    int insert(DStepActivity record);

    int insertSelective(DStepActivity record);

    List<DStepActivity> selectByExample(DStepActivityExample example);

    int updateByExampleSelective(@Param("record") DStepActivity record, @Param("example") DStepActivityExample example);

    int updateByExample(@Param("record") DStepActivity record, @Param("example") DStepActivityExample example);

    DStepActivity queryStepActivity();
}