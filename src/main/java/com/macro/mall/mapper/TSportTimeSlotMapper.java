package com.macro.mall.mapper;

import com.macro.mall.model.TSportTimeSlot;
import com.macro.mall.model.TSportTimeSlotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportTimeSlotMapper {
    long countByExample(TSportTimeSlotExample example);

    int deleteByExample(TSportTimeSlotExample example);

    int insert(TSportTimeSlot record);

    int insertSelective(TSportTimeSlot record);

    List<TSportTimeSlot> selectByExample(TSportTimeSlotExample example);

    int updateByExampleSelective(@Param("record") TSportTimeSlot record, @Param("example") TSportTimeSlotExample example);

    int updateByExample(@Param("record") TSportTimeSlot record, @Param("example") TSportTimeSlotExample example);


    List<TSportTimeSlot> selectTimeSlotByActivityId(@Param("activityId")String activityId);

    TSportTimeSlot selectByPrimaryKey(@Param("timeSlotId") String timeSlotId);

    int updateByPrimaryKey(TSportTimeSlot record);
}