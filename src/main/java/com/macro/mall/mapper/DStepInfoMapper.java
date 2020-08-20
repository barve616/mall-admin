package com.macro.mall.mapper;

import com.macro.mall.model.DStepInfo;
import com.macro.mall.model.DStepInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DStepInfoMapper {
    long countByExample(DStepInfoExample example);

    int deleteByExample(DStepInfoExample example);

    int insert(DStepInfo record);

    int insertSelective(DStepInfo record);

    List<DStepInfo> selectByExample(DStepInfoExample example);

    int updateByExampleSelective(@Param("record") DStepInfo record, @Param("example") DStepInfoExample example);

    int updateByExample(@Param("record") DStepInfo record, @Param("example") DStepInfoExample example);
}