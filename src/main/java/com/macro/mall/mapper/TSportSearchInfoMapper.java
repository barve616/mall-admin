package com.macro.mall.mapper;

import com.macro.mall.model.TSportSearchInfo;
import com.macro.mall.model.TSportSearchInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportSearchInfoMapper {
    long countByExample(TSportSearchInfoExample example);

    int deleteByExample(TSportSearchInfoExample example);

    int insert(TSportSearchInfo record);

    int insertSelective(TSportSearchInfo record);

    List<TSportSearchInfo> selectByExample(TSportSearchInfoExample example);

    int updateByExampleSelective(@Param("record") TSportSearchInfo record, @Param("example") TSportSearchInfoExample example);

    int updateByExample(@Param("record") TSportSearchInfo record, @Param("example") TSportSearchInfoExample example);

    int updateStateById(@Param("id")String id,@Param("state")String state);
}