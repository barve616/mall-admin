package com.macro.mall.mapper;

import com.macro.mall.cms.bean.CMS000018;
import com.macro.mall.model.DFunInfo;
import com.macro.mall.model.DFunInfoSp;

import java.util.List;

public interface DFunInfoMapper {
    List<DFunInfoSp> findAll(CMS000018 bean);
}