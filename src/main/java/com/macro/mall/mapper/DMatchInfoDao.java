package com.macro.mall.mapper;


import com.macro.mall.model.DMatchInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DMatchInfoDao {

  List<DMatchInfo> queryMatchReportList(DMatchInfo dMatchInfo);
  int queryMatchStockNum(@Param("matchId")String matchId);
  int updateStockNum(@Param("matchId")String matchId);
  List<DMatchInfo> queryList(DMatchInfo dMatchInfo);
  DMatchInfo queryList1(DMatchInfo dMatchInfo);

  int insert(DMatchInfo dMatchInfo);
  int update(DMatchInfo dMatchInfo);
  int delete(@Param("matchId")String matchId);

  List<DMatchInfo> queryPreMatchList(@Param("matchGroupId")String matchGroupId);
  //add by liubo
  DMatchInfo getPreMatchInfo(@Param("matchId")String matchId);

  DMatchInfo selectPreMatchById(@Param("matchPreId")String matchPreId);



}