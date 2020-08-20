package com.macro.mall.communicate.resourcecenter.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.bean.CommodityTypeAndChannelVO;
import com.macro.mall.communicate.resourcecenter.bean.PosCommodityListVo;
import com.macro.mall.communicate.resourcecenter.bean.TSportCommodityVO;
import com.macro.mall.communicate.resourcecenter.bean.UpdateCommodityStatusVO;
import com.macro.mall.communicate.resourcecenter.service.CommodityService;
import com.macro.mall.communicate.resourcecenter.service.CommodityTypeService;
import com.macro.mall.model.DMatchTeamInfo;
import com.macro.mall.model.TSportCommodity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Controller
@Api(tags = "CommodityController", description = "商品信息管理")
@RequestMapping("/commodity")
public class CommodityController {

    @Resource
    private CommodityService commodityService;


    @ApiOperation("获取商品列表信息")
    @RequestMapping(value = "/sportCommodityList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<TSportCommodity>> sportCommodityList(@RequestBody TSportCommodityVO sportCommodityVO) {

        List<TSportCommodity> tSportCommoditieList = commodityService.sportCommodityList(sportCommodityVO);
        return  CommonResult.success(CommonPage.restPage(tSportCommoditieList));
    }

    @ApiOperation("批量审核状态")
    @RequestMapping(value = "/updateCommodityStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateCommodityStatus(@RequestBody  UpdateCommodityStatusVO commodityStatusVO){
        return commodityService.updateCommodityStatus(commodityStatusVO);
    }


    @ApiOperation("获取违规内容")
    @RequestMapping(value = "/getIllegalContent", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getIllegalContent(String commodityId){
        return commodityService.getIllegalContent(commodityId);
    }


    @ApiOperation("修改店铺商品分类和渠道信息")
    @RequestMapping(value = "/updateCommodityTypeAndChannelById", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateCommodityTypeAndChannelById(@RequestBody CommodityTypeAndChannelVO commodityTypeAndChannelVO){
        return commodityService.updateCommodityTypeAndChannelById(commodityTypeAndChannelVO);
    }

    @ApiOperation("获取商品详情")
    @RequestMapping(value = "/getCommodityDetail", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getCommodityDetail(String commodityId) {
        return commodityService.getCommodityDetail(commodityId);
    }




}



