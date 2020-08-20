package com.macro.mall.mapper;

import com.macro.mall.model.DCmsRegion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DCmsRegionMapper {

    void insertCityList(List<DCmsRegion> cityList);

    void delCityListById(@Param("regionId") String dataId);

    List<DCmsRegion> selectListById( @Param("regionId") String regionId);
}