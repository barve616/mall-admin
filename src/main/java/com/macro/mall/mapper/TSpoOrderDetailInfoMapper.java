package com.macro.mall.mapper;

import com.macro.mall.communicate.resourcecenter.bean.OrderTouristDO;
import com.macro.mall.model.TSpoOrderDetailInfo;
import com.macro.mall.model.TSpoOrderDetailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSpoOrderDetailInfoMapper {
    long countByExample(TSpoOrderDetailInfoExample example);

    int deleteByExample(TSpoOrderDetailInfoExample example);

    int deleteByPrimaryKey(String orderDetailId);

    int insert(TSpoOrderDetailInfo record);

    int insertSelective(TSpoOrderDetailInfo record);

    List<TSpoOrderDetailInfo> selectByExample(TSpoOrderDetailInfoExample example);

    TSpoOrderDetailInfo selectByPrimaryKey(String orderDetailId);

    int updateByExampleSelective(@Param("record") TSpoOrderDetailInfo record, @Param("example") TSpoOrderDetailInfoExample example);

    int updateByExample(@Param("record") TSpoOrderDetailInfo record, @Param("example") TSpoOrderDetailInfoExample example);

    int updateByPrimaryKeySelective(TSpoOrderDetailInfo record);

    int updateByPrimaryKey(TSpoOrderDetailInfo record);


    List<OrderTouristDO> findTourisInfo(String orderId);
}