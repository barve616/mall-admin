package com.macro.mall.mapper;

import com.macro.mall.model.DCityInformation;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DCityInformationMapper {


    List<DCityInformation> getCityMapInfo();

    //查询省列表
    List<DCityInformation> getProvinceList();

    //查询市列表
    List<DCityInformation> getCityListByProvinceId(String provinceId);
}