package com.macro.mall.mapper;

import com.macro.mall.model.TSportCommodityPrice;
import com.macro.mall.model.TSportCommodityPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportCommodityPriceMapper {
    long countByExample(TSportCommodityPriceExample example);

    int deleteByExample(TSportCommodityPriceExample example);

    int deleteByPrimaryKey(String discountTimePriceId);

    int insert(TSportCommodityPrice record);

    int insertSelective(TSportCommodityPrice record);

    List<TSportCommodityPrice> selectByExample(TSportCommodityPriceExample example);

    TSportCommodityPrice selectByPrimaryKey(String discountTimePriceId);

    int updateByExampleSelective(@Param("record") TSportCommodityPrice record, @Param("example") TSportCommodityPriceExample example);

    int updateByExample(@Param("record") TSportCommodityPrice record, @Param("example") TSportCommodityPriceExample example);

    int updateByPrimaryKeySelective(TSportCommodityPrice record);

    int updateByPrimaryKey(TSportCommodityPrice record);

    TSportCommodityPrice selectPriceByCommodityId(@Param("commodityId")String commodityId,@Param("priceDate") String priceDate );
}