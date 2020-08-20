package com.macro.mall.mapper;

import com.macro.mall.model.DMatchCommonInfo;

import java.util.List;
public interface DMatchCommonInfoMapper {

    List<DMatchCommonInfo> queryList(DMatchCommonInfo dMatchCommonInfo);

    int update(DMatchCommonInfo dMatchCommonInfo);
}