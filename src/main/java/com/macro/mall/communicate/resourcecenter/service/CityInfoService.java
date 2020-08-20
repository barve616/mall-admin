package com.macro.mall.communicate.resourcecenter.service;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.mapper.DCityInformationMapper;
import com.macro.mall.model.DCityInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityInfoService {

    @Autowired
    private DCityInformationMapper informationMapper;


    //查询省列表
    public CommonResult getProvinceList(){
        List<DCityInformation> provinceList = informationMapper.getProvinceList();
        return CommonResult.success(provinceList,"查询省成功");
    };


    //查询省列表
    public CommonResult getCityListByProvinceId(String provinceId){
        List<DCityInformation> cityList = informationMapper.getCityListByProvinceId(provinceId);
        return CommonResult.success(cityList,"查询市成功");
    };
}
