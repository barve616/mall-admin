package com.macro.mall.mapper;

import com.macro.mall.communicate.resourcecenter.bean.MerchantDO;
import com.macro.mall.model.TSportPos;
import com.macro.mall.model.TSportPosExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TSportPosMapper {
    long countByExample(TSportPosExample example);

    int deleteByExample(TSportPosExample example);

    int deleteByPrimaryKey(String posId);

    int insert(TSportPos record);

    int insertSelective(TSportPos record);

    List<TSportPos> selectByExample(TSportPosExample example);

    TSportPos selectByPrimaryKey(String posId);

    int updateByExampleSelective(@Param("record") TSportPos record, @Param("example") TSportPosExample example);

    int updateByExample(@Param("record") TSportPos record, @Param("example") TSportPosExample example);

    int updateByPrimaryKeySelective(TSportPos record);

    int updateByPrimaryKey(TSportPos record);


    int countByMerInfo(Map<String, String> map);
    /**查询列表*/
    List<MerchantDO> selectList (Map<String, String> map);

    int updateInfo(TSportPos record);
}