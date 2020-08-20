package com.macro.mall.base.dao;

import com.macro.mall.base.dto.FunInfo;

import java.util.List;

public interface FunInfoDao {
    Object findByfunId(String uiJumpId);

    List<FunInfo> findAll();
}
