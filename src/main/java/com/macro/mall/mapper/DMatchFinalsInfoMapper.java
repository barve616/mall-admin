package com.macro.mall.mapper;

import com.macro.mall.model.DMatchFinalsInfo;
import com.macro.mall.model.DMatchFinalsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DMatchFinalsInfoMapper {
    long countByExample(DMatchFinalsInfoExample example);

    int deleteByExample(DMatchFinalsInfoExample example);

    int insert(DMatchFinalsInfo record);

    int insertSelective(DMatchFinalsInfo record);

    List<DMatchFinalsInfo> selectByExample(DMatchFinalsInfoExample example);

    int updateByExampleSelective(@Param("record") DMatchFinalsInfo record, @Param("example") DMatchFinalsInfoExample example);

    int updateByExample(@Param("record") DMatchFinalsInfo record, @Param("example") DMatchFinalsInfoExample example);

    List<DMatchFinalsInfo> queryPreMatchList(@Param("matchId") String matchId);

    int insertFinalMatch(DMatchFinalsInfo finalInfo);
    int insertFinalMatchList(List<DMatchFinalsInfo> list);

    int updateRemoveById(@Param("ids") String[] ids);
}