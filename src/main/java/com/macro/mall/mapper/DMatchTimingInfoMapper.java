package com.macro.mall.mapper;

import com.macro.mall.model.DMatchTimingInfo;
import com.macro.mall.model.DMatchTimingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DMatchTimingInfoMapper {
    long countByExample(DMatchTimingInfoExample example);

    int deleteByExample(DMatchTimingInfoExample example);

    int deleteByPrimaryKey(String timerName);

    int insert(DMatchTimingInfo record);

    int insertSelective(DMatchTimingInfo record);

    List<DMatchTimingInfo> selectByExample(DMatchTimingInfoExample example);

    DMatchTimingInfo selectByPrimaryKey(String timerName);

    int updateByExampleSelective(@Param("record") DMatchTimingInfo record, @Param("example") DMatchTimingInfoExample example);

    int updateByExample(@Param("record") DMatchTimingInfo record, @Param("example") DMatchTimingInfoExample example);

    int updateByPrimaryKeySelective(DMatchTimingInfo record);

    int updateByPrimaryKey(DMatchTimingInfo record);
}