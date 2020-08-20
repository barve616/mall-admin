package com.macro.mall.base.dao;

import com.macro.mall.base.dto.topConfig.TSpoContentRegion;

import java.util.List;

public interface TSpoContentRegionDao {
    TSpoContentRegion selectIndexCityInfo(TSpoContentRegion search);

    List<TSpoContentRegion> getContentCityInfo(String id);

    void deleteCityInfoByIDs(String[] ids);

    void insertCityIdList(List<TSpoContentRegion> cityList);

    void deleteContentRegionInfo(String id);
}
