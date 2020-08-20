package com.macro.mall.mapper;

import com.macro.mall.model.DMatchRotationChartInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DMatchRotationChartInfoMapper {
    int insert(DMatchRotationChartInfo record);

    int update(DMatchRotationChartInfo record);

    List<DMatchRotationChartInfo> queryList (DMatchRotationChartInfo dMatchRotationChartInfo);
    DMatchRotationChartInfo queryList1 (DMatchRotationChartInfo dMatchRotationChartInfo);


    int delete(@Param("matchId") String matchId);
}