package com.macro.mall.mapper;

import com.macro.mall.model.TSportCommodityActivity;
import com.macro.mall.model.TSportCommodityActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportCommodityActivityMapper {
    long countByExample(TSportCommodityActivityExample example);

    int deleteByExample(TSportCommodityActivityExample example);

    int insert(TSportCommodityActivity record);

    int insertSelective(TSportCommodityActivity record);

    List<TSportCommodityActivity> selectByExample(TSportCommodityActivityExample example);

    int updateByExampleSelective(@Param("record") TSportCommodityActivity record, @Param("example") TSportCommodityActivityExample example);

    int updateByExample(@Param("record") TSportCommodityActivity record, @Param("example") TSportCommodityActivityExample example);
}