package com.macro.mall.mapper;


import com.macro.mall.model.DMatchTeamInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DMatchTeamInfoDao {

    List<DMatchTeamInfo> findTeamInfo(DMatchTeamInfo info);

    int updateTeamInfo(DMatchTeamInfo info);

    int updateAllTeamInfo(@Param("loginName")String loginName, @Param("id")String id,@Param("teamCheckDes")String teamCheckDes);

    int updateAllTeamInfo1(@Param("loginName")String loginName, @Param("id")String id,@Param("teamCheckDes")String teamCheckDes);

    List<DMatchTeamInfo> queryMatchTeamApplyByKey(DMatchTeamInfo info);

    String queryTeamInfo(@Param("teamId")String teamId);
    DMatchTeamInfo queryTeamInfo1(@Param("teamId")String teamId);

}