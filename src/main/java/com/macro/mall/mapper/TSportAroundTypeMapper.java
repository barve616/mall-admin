package com.macro.mall.mapper;

import com.macro.mall.model.TSportAroundType;
import com.macro.mall.model.TSportAroundTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportAroundTypeMapper {
    long countByExample(TSportAroundTypeExample example);

    int deleteByExample(TSportAroundTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSportAroundType record);

    int insertSelective(TSportAroundType record);

    List<TSportAroundType> selectByExample(TSportAroundTypeExample example);

    TSportAroundType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSportAroundType record, @Param("example") TSportAroundTypeExample example);

    int updateByExample(@Param("record") TSportAroundType record, @Param("example") TSportAroundTypeExample example);

    int updateByPrimaryKeySelective(TSportAroundType record);

    int updateByPrimaryKey(TSportAroundType record);


    /**
     * 查询周边推荐分类列表
     * @return
     */
    List<TSportAroundType> getAroundTypeList();
}