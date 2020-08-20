package com.macro.mall.discount.controller;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.discount.model.CommoditySearchVO;
import com.macro.mall.discount.model.AddCommodityToActivityVO;
import com.macro.mall.discount.service.CommodityBindService;
import com.macro.mall.model.TSportTimeSlot;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commoditybind")
@Api(tags = "CommodityBindServiceController", description = "优惠活动管理")
public class CommodityBindServiceController {
    @Autowired
    CommodityBindService commodityBindService;
    /*根据活动id查询该活动下的所有商品*/
    @ApiOperation("根据活动id查询该活动下的所有商品")
    @RequestMapping(value = "/selectactivitycommodity",method = RequestMethod.GET)
    public CommonResult selectActivityCommodity(CommoditySearchVO param) throws Exception{
        return commodityBindService.selectActivityCommodity(param);
    }

    /*查询没参与此活动的所有商品*/
    @ApiOperation("查询没参与此活动的所有商品")
    @RequestMapping(value = "/selectNoActivityCommodity",method = RequestMethod.GET)
    public CommonResult selectNoActivityCommodity(CommoditySearchVO param) throws Exception{
        return commodityBindService.selectNoActivityCommodity(param);
    }

    /*添加商品按商品id*/
    @ApiOperation("添加商品按商品id")
    @RequestMapping(value = "/addCommodityByIds",method = RequestMethod.GET)
    public CommonResult addCommodityByIds(AddCommodityToActivityVO param) throws Exception{
        return commodityBindService.addCommodity(param);
    }

    /*添加商品按商品类型*/
    @ApiOperation("添加商品按商品类型")
    @RequestMapping(value = "/addCommodityByType",method = RequestMethod.GET)
    public CommonResult addCommodityByType(AddCommodityToActivityVO param) throws Exception{
        return commodityBindService.addCommodityByType(param);
    }
    /*查询秒杀时间段的商品*/
    @ApiOperation("查询秒杀时间段的商品")
    @RequestMapping(value = "/selectCommodityByTimeSlotId",method = RequestMethod.GET)
    public CommonResult selectCommodityByTimeSlotId(CommoditySearchVO param) throws Exception{
        return commodityBindService.selectCommodityByTimeSlotId(param);
    }

    /*查询不在这个时间段参与秒杀的商品*/
    @ApiOperation("查询不在这个时间段参与秒杀的商品")
    @RequestMapping(value = "/selectNoTimeSlotCommodity",method = RequestMethod.POST)
    public CommonResult selectNoTimeSlotCommodity(TSportTimeSlot param) throws Exception{
        return commodityBindService.selectNoTimeSlotCommodity(param);
    }
}

