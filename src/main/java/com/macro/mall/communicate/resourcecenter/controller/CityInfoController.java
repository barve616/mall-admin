package com.macro.mall.communicate.resourcecenter.controller;


import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.service.CityInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "CityInfoController", description = "省市查询")
@RequestMapping("/CityInfoController")
public class CityInfoController {

    @Autowired
    private CityInfoService cityInfoService;

    @ApiOperation("查询省列表")
    @RequestMapping(value = "/getProvinceList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getProvinceList() {
        return cityInfoService.getProvinceList();
    }

    @ApiOperation("查询市列表")
    @RequestMapping(value = "/getCityListByProvinceId", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getCityListByProvinceId(String provinceId) {
        return cityInfoService.getCityListByProvinceId(provinceId);
    }

}
