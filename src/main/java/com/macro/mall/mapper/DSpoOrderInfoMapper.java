package com.macro.mall.mapper;

import com.macro.mall.communicate.resourcecenter.bean.OrderVO;
import com.macro.mall.model.DSpoOrderInfo;
import com.macro.mall.model.DSpoOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DSpoOrderInfoMapper {
    long countByExample(DSpoOrderInfoExample example);

    int deleteByExample(DSpoOrderInfoExample example);

    int deleteByPrimaryKey(@Param("orderId") String orderId, @Param("channel") String channel);

    int insert(DSpoOrderInfo record);

    int insertSelective(DSpoOrderInfo record);

    List<DSpoOrderInfo> selectByExample(DSpoOrderInfoExample example);

    List<DSpoOrderInfo> list(OrderVO vo);

    DSpoOrderInfo selectByPrimaryKey(@Param("orderId") String orderId, @Param("channel") String channel);

    int updateByExampleSelective(@Param("record") DSpoOrderInfo record, @Param("example") DSpoOrderInfoExample example);

    int updateByExample(@Param("record") DSpoOrderInfo record, @Param("example") DSpoOrderInfoExample example);

    int updateByPrimaryKeySelective(DSpoOrderInfo record);

    int updateByPrimaryKey(DSpoOrderInfo record);


}