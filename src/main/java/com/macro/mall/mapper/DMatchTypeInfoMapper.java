package com.macro.mall.mapper;

import com.macro.mall.model.DMatchTypeInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DMatchTypeInfoMapper {



    List<DMatchTypeInfo> queryMatchType (DMatchTypeInfo dMatchTypeInfo);
    DMatchTypeInfo queryMatchType1 (DMatchTypeInfo dMatchTypeInfo);
    List<DMatchTypeInfo> queryMatchType2 (DMatchTypeInfo dMatchTypeInfo);

    int insertMatchType(DMatchTypeInfo dMatchTypeInfo);

    int deleteMatchType(String matchTypeId);

    int updateMatchType(DMatchTypeInfo dMatchTypeInfo);
}