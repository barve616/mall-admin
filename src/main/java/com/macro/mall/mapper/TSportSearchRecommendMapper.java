package com.macro.mall.mapper;

import com.macro.mall.model.TSportSearchRecommend;
import com.macro.mall.model.TSportSearchRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportSearchRecommendMapper {
    long countByExample(TSportSearchRecommendExample example);

    int deleteByExample(TSportSearchRecommendExample example);

    int insert(TSportSearchRecommend record);

    int insertSelective(TSportSearchRecommend record);

    List<TSportSearchRecommend> selectByExample(TSportSearchRecommendExample example);

    int updateByExampleSelective(@Param("record") TSportSearchRecommend record, @Param("example") TSportSearchRecommendExample example);

    int updateByExample(@Param("record") TSportSearchRecommend record, @Param("example") TSportSearchRecommendExample example);

    int updateStateById(@Param("id")String id,@Param("state")String state);
}