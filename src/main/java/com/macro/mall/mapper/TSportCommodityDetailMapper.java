package com.macro.mall.mapper;

import com.macro.mall.model.TSportCommodity;
import com.macro.mall.model.TSportCommodityDetail;
import com.macro.mall.model.TSportCommodityDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportCommodityDetailMapper {
    long countByExample(TSportCommodityDetailExample example);

    int deleteByExample(TSportCommodityDetailExample example);

    int deleteByPrimaryKey(String commodityDetailId);

    int insert(TSportCommodityDetail record);

    int insertSelective(TSportCommodityDetail record);

    List<TSportCommodityDetail> selectByExampleWithBLOBs(TSportCommodityDetailExample example);

    List<TSportCommodityDetail> selectByExample(TSportCommodityDetailExample example);

    TSportCommodityDetail selectByPrimaryKey(String commodityDetailId);

    int updateByExampleSelective(@Param("record") TSportCommodityDetail record, @Param("example") TSportCommodityDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") TSportCommodityDetail record, @Param("example") TSportCommodityDetailExample example);

    int updateByExample(@Param("record") TSportCommodityDetail record, @Param("example") TSportCommodityDetailExample example);

    int updateByPrimaryKeySelective(TSportCommodityDetail record);

    int updateByPrimaryKeyWithBLOBs(TSportCommodityDetail record);

    int updateByPrimaryKey(TSportCommodityDetail record);

}