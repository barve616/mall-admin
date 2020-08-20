package com.macro.mall.discount.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.discount.model.ActivitySearchVO;
import com.macro.mall.discount.model.ActivityUpAndLowVO;
import com.macro.mall.discount.service.DiscountActivityService;
import com.macro.mall.model.TSportDiscountActivity;
import com.macro.mall.model.TSportTimeSlot;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discount")
@Api(tags = "DiscountActivityController", description = "优惠活动管理")
public class DiscountActivityController {
    @Autowired
    DiscountActivityService discountActivityService;

    @ApiOperation("测试")
    @RequestMapping(value = "/",method =RequestMethod.POST )
    public String test(){
        return "Hello";
    }
    /*根据活动类型查询此类型所有活动*/
    @ApiOperation("根据活动类型查询此类型所有活动")
    @RequestMapping(value = "/querybytype",method = RequestMethod.POST)
    public CommonResult queryByType(ActivitySearchVO param) throws Exception{
        return CommonResult.success(CommonPage.restPage(discountActivityService.queryByType(param)));
    }

    /*条件查询活动信息*/
    @ApiOperation("条件查询活动信息")
    @RequestMapping(value = "/querybycondition",method = RequestMethod.POST)
    public CommonResult queryByCondition(ActivitySearchVO param) throws Exception{
        return CommonResult.success(CommonPage.restPage(discountActivityService.queryByCondition(param)));
    }

    /*添加活动*/
    @ApiOperation("添加活动")
    @RequestMapping(value = "/addactivity",method = RequestMethod.POST)
    public CommonResult addActivity(TSportDiscountActivity param) throws Exception{
       // TSportDiscountActivity activity = JSONObject.parseObject(param, TSportDiscountActivity.class);
        return discountActivityService.addActivity(param);
    }

    /*活动上下架*/
    @ApiOperation("活动上下架")
    @RequestMapping(value = "/updatestate",method = RequestMethod.POST)
    public CommonResult updateState(ActivityUpAndLowVO param) throws Exception{
        return discountActivityService.updateState(param);
    }


    @ApiOperation("秒杀活动添加时间段")
    @RequestMapping(value = "/addtimeslot",method = RequestMethod.POST)
    public CommonResult addTimeSlot(TSportTimeSlot param) throws Exception{
        return discountActivityService.addTimeSlot(param);
    }


    @ApiOperation("查询活动下的时间段")
    @RequestMapping(value = "/selectTimeSlotByActivityId",method = RequestMethod.POST)
    public CommonResult selectTimeSlotByActivityId(String activityId) throws Exception{
        return discountActivityService.selectTimeSlotByActivityId(activityId);
    }

    /*编辑活动*/
    @ApiOperation("编辑活动")
    @RequestMapping(value = "/updateactivity",method = RequestMethod.POST)
    public CommonResult updateActivity(TSportDiscountActivity param) throws Exception{
        return discountActivityService.updateActivity(param);
    }
    /*编辑时间段*/
    @ApiOperation("编辑时间段")
    @RequestMapping(value = "/updateTimeSlot",method = RequestMethod.POST)
    public CommonResult updateTimeSlot(TSportTimeSlot param) throws Exception{
        return discountActivityService.updateTimeSlot(param);
    }
}
