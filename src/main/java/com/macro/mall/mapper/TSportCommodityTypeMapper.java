package com.macro.mall.mapper;

import com.macro.mall.model.TSportCommodityType;
import com.macro.mall.model.TSportCommodityTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportCommodityTypeMapper {
    long countByExample(TSportCommodityTypeExample example);

    int deleteByExample(TSportCommodityTypeExample example);

    int deleteByPrimaryKey(String commodityTypeId);

    int insert(TSportCommodityType record);

    int insertSelective(TSportCommodityType record);

    List<TSportCommodityType> selectByExample(TSportCommodityTypeExample example);

    TSportCommodityType selectByPrimaryKey(String commodityTypeId);

    int updateByExampleSelective(@Param("record") TSportCommodityType record, @Param("example") TSportCommodityTypeExample example);

    int updateByExample(@Param("record") TSportCommodityType record, @Param("example") TSportCommodityTypeExample example);

    int updateByPrimaryKeySelective(TSportCommodityType record);

    int updateByPrimaryKey(TSportCommodityType record);

    /**
     * 通过父级id查询商品分类
     * @param commodityPId
     * @return
     */
    List<TSportCommodityType> commodityTypeByPidList(@Param("commodityPId") String commodityPId);

    //根据父级id获取最大id
    String nextCommodityTypeId(@Param("commodityPId") String commodityPId);

    /**
     * 根据名字查询分类 不是like
     * @param typeName
     * @return
     */
    List<TSportCommodityType> commodityTypeByName(String typeName);
}