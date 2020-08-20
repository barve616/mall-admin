package com.macro.mall.mapper;

import com.macro.mall.model.TSportCoachTeam;
import com.macro.mall.model.TSportCoachTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportCoachTeamMapper {
    long countByExample(TSportCoachTeamExample example);

    int deleteByExample(TSportCoachTeamExample example);

    int deleteByPrimaryKey(String coachId);

    int insert(TSportCoachTeam record);

    int insertSelective(TSportCoachTeam record);

    List<TSportCoachTeam> selectByExample(TSportCoachTeamExample example);

    TSportCoachTeam selectByPrimaryKey(String coachId);

    int updateByExampleSelective(@Param("record") TSportCoachTeam record, @Param("example") TSportCoachTeamExample example);

    int updateByExample(@Param("record") TSportCoachTeam record, @Param("example") TSportCoachTeamExample example);

    int updateByPrimaryKeySelective(TSportCoachTeam record);

    int updateByPrimaryKey(TSportCoachTeam record);


    //根据店铺id查询有效的教练信息-
    List<TSportCoachTeam> getCoachTeamByShopId(@Param("shopId") String shopId,
                                               @Param("workState") String workState);
}