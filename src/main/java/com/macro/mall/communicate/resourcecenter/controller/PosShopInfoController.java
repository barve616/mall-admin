package com.macro.mall.communicate.resourcecenter.controller;


import com.macro.mall.base.service.impl.ImgUtilsService;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.bean.*;
import com.macro.mall.communicate.resourcecenter.service.PosShopInfoService;
import com.macro.mall.model.TPosShopType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@Api(tags = "PosShopInfoController", description = "商户店铺信息管理")
@RequestMapping("/posShop")
public class PosShopInfoController {

    @Autowired
    private PosShopInfoService posShopInfoService;
    @Autowired
    private ImgUtilsService imgUtilsService;

    @ApiOperation("获取店铺信息")
    @RequestMapping(value = "/getPosShopInfoByPosId", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getPosShopInfoByPosId(String posId) {
        return posShopInfoService.getPosShopInfoByPosId(posId);
    }


    @ApiOperation("修改店铺")
    @RequestMapping(value = "/updatePosShop", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePosShop(@Valid @RequestBody TPosShopInfoVO posShopInfoVO) {
        return posShopInfoService.updatePosShop(posShopInfoVO);
    }


    @ApiOperation("查询雪场详情")
    @RequestMapping(value = "/getShopDetailByShopId", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getShopDetailByShopId(String  shopId) {
        return posShopInfoService.getShopDetailByShopId(shopId);
    }

    @ApiOperation("修改雪场详情")
    @RequestMapping(value = "/updateShopDetail", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateShopDetail(@Valid @RequestBody TPosShopDetailInfo posShopInfoVO) {
        return posShopInfoService.updateShopDetail(posShopInfoVO);
    }


    @ApiOperation("获取店铺商品类型列表")
    @RequestMapping(value = "/selectShopCommodityTypeAllList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult selectShopCommodityTypeAllList(@RequestBody ShopCommodityTypeAllList shopCommodityTypeAllList) {
        return posShopInfoService.selectShopCommodityTypeAllList(shopCommodityTypeAllList.getPosShopId());
    }
    @ApiOperation("增加或者修改商品类型")
    @RequestMapping(value = "/saveOrUploadShopCommodityType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult saveOrUploadShopCommodityType(@RequestBody TPosShopType posShopType) {
        return posShopInfoService.saveOrUploadShopCommodityType(posShopType);
    }

    @ApiOperation("修改商品店铺类型状态")
    @RequestMapping(value = "/updateShopCommodityStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePosShopTypeStatus(String  commodityTypeId,String commodityTypeStatus) {
        return posShopInfoService.updatePosShopTypeStatus(commodityTypeId,commodityTypeStatus);
    }

    @ApiOperation("根据分类名称判断是否已经存在")
    @RequestMapping(value = "/existShopCommodityTypeByName", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult existShopCommodityTypeByName(String shopTypeName) {
        return posShopInfoService.existShopCommodityTypeByName(shopTypeName);
    }


}
