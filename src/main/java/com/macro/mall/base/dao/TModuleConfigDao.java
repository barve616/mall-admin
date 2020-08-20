package com.macro.mall.base.dao;

import com.macro.mall.base.dto.topConfig.TModulBean;
import com.macro.mall.base.dto.topConfig.TModuleConfig;

import java.util.List;
import java.util.Map;

public interface TModuleConfigDao {

    List<TModuleConfig> selectInfoByChannleAndCity(String userPlt);

    List<TModuleConfig> getTModuleConfigList(TModulBean bean);

    void deleteTModuleConfigByid(String[] ids);

    void insertInfoList(List<TModuleConfig> infoList);

    void updateModuleConfig(TModuleConfig config);

    void updateFunStateById(Map map);

//    Object selectIndexCityInfo(DLayoutContentRegion search);
}
