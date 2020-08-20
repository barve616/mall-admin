package com.macro.mall.communicate.resourcecenter.controller;


import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.service.CommodityTypeService;
import com.macro.mall.model.TSportCommodityType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@Api(tags = "CommodityTypeController", description = "商品类型信息管理")
@RequestMapping("/commodityType")
public class CommodityTypeController {

    @Resource
    private CommodityTypeService commodityTypeService;


    @ApiOperation("查询商品分类列表")
    @RequestMapping(value = "/selectCommoditcyTypeAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult selectCommoditcyTypeAll() {
        return CommonResult.success(commodityTypeService.selectCommodityTypeAllList());
    }
    @ApiOperation("查询商品分类前两级列表")
    @RequestMapping(value = "/selectCommodityTypeFisetTwoLevelList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult selectCommodityTypeFisetTwoLevelList() {
        return CommonResult.success(commodityTypeService.selectCommodityTypeFisetTwoLevelList());
    }



    @ApiOperation("增加或者修改商品分类")
    @RequestMapping(value = "/saveOrUploadCommodityType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult saveOrUploadCommodityType(@RequestBody  TSportCommodityType commodityType) {
        return commodityTypeService.saveOrUploadCommodityType(commodityType);
    }

    @ApiOperation("修改商品分类状态")
    @RequestMapping(value = "/updateStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateStatus(@RequestBody TSportCommodityType commodityType) {
        return commodityTypeService.updateStatus(commodityType);
    }


    @ApiOperation("根据分类名称判断是否已经存在")
    @RequestMapping(value = "/existCommodityTypeByName", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult existCommodityTypeByName(String typeName) {
        return commodityTypeService.existCommodityTypeByName(typeName);
    }


}
