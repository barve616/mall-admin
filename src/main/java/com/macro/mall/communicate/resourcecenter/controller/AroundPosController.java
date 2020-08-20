package com.macro.mall.communicate.resourcecenter.controller;


import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.bean.AroundPosInfoVO;
import com.macro.mall.communicate.resourcecenter.bean.AroundPosListVO;
import com.macro.mall.communicate.resourcecenter.bean.AroundPosStatusVO;
import com.macro.mall.communicate.resourcecenter.bean.AroundTypeVO;
import com.macro.mall.communicate.resourcecenter.service.AroundPosService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@Api(tags = "AroundPosController", description = "周边推荐商户")
@RequestMapping("/aroundPos")
public class AroundPosController {

    @Autowired
    private AroundPosService aroundPosService;


    @ApiOperation("获取周边商户推荐列表")
    @RequestMapping(value = "/aroundPosList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult aroundPosList(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        return aroundPosService.aroundPosList(pageSize,pageNum);
    }

    @ApiOperation("查询周边商户推荐详情")
    @RequestMapping(value = "/aroundPosDetailById", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult aroundPosDetailById(String aroundPosId) {
        return aroundPosService.aroundPosDetailById(aroundPosId);
    }


    @ApiOperation("增加或者修改周边商户推荐")
    @RequestMapping(value = "/addOrUpdateAroundPos", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addOrUpdateAroundPos(@Valid @RequestBody AroundPosInfoVO aroundPosInfoVO) {
        return aroundPosService.addOrUpdateAroundPos(aroundPosInfoVO);
    }

    @ApiOperation("修改商户商户推荐上下架状态")
    @RequestMapping(value = "/updateAroundPosStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateAroundPosStatus(@RequestBody  AroundPosStatusVO aroundPosStatusVO) {
        return aroundPosService.updateAroundPosStatus(aroundPosStatusVO);
    }


    @ApiOperation("查询周边店铺分类列表")
    @RequestMapping(value = "/getAroundTypeList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAroundTypeList(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        return aroundPosService.getAroundTypeList(pageSize,pageNum);
    }

    @ApiOperation("增加或者修改周边推荐分类")
    @RequestMapping(value = "/addOrUpdateAroundType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addOrUpdateAroundType(@RequestBody AroundTypeVO aroundTypeVO) {
        return aroundPosService.addOrUpdateAroundType(aroundTypeVO);
    }

    @ApiOperation("修改周边推荐分类状态")
    @RequestMapping(value = "/updateAroundTypeStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateAroundTypeStatus(@RequestBody AroundTypeVO aroundTypeVO) {
        return aroundPosService.updateAroundTypeStatus(aroundTypeVO);
    }


    @ApiOperation("查询周边推荐已推荐商户")
    @RequestMapping(value = "/getRecommendAroundPosList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getRecommendAroundPosList(String shopId) {
        return aroundPosService.getRecommendAroundPosList(shopId);
    }

    @ApiOperation("查询周边推荐没有推荐商户")
    @RequestMapping(value = "/getNoRecommendAroundPosList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getNoRecommendAroundPosList(AroundPosListVO aroundPosListVO,
                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        return aroundPosService.getNoRecommendAroundPosList(aroundPosListVO,pageSize,pageNum);
    }



}
