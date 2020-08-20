package com.macro.mall.mapper;

import com.macro.mall.model.DMatchResultInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DMatchResultInfoMapper {


    int insert(DMatchResultInfo record);

    List<DMatchResultInfo> queryList(DMatchResultInfo example);

    int insertList(@Param("list") List<DMatchResultInfo> list);

    int delete (@Param("resultId") String resultId);



}