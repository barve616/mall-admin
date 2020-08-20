package com.macro.mall.searchkeywords.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.searchkeywords.model.KeyWordVO;
import com.macro.mall.searchkeywords.service.KeyWordService;
import com.macro.mall.model.TSportSearchInfo;
import com.macro.mall.model.TSportSearchRecommend;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
@Api(tags = "DiscountActivityController", description = "首页搜索维护")
public class KeyWordsController {
    @Autowired
    KeyWordService keyWordService;
    /*添加关键字*/
    @ApiOperation("添加铺底关键字")
    @RequestMapping(value = "/addactivity",method = RequestMethod.POST)
    public CommonResult addKeyWord(KeyWordVO param) throws Exception{
        // TSportDiscountActivity activity = JSONObject.parseObject(param, TSportDiscountActivity.class);
        return keyWordService.addKeyWord(param);
    }

    /*修改铺底关键字*/
    @ApiOperation("修改铺底关键字")
    @RequestMapping(value = "/upDateSearchKeyWord",method = RequestMethod.POST)
    public CommonResult upDateSearchKeyWord(TSportSearchInfo param) throws Exception{
        // TSportDiscountActivity activity = JSONObject.parseObject(param, TSportDiscountActivity.class);
        return keyWordService.upDateSearchKeyWord(param);
    }

    /*修改推荐关键字*/
    @ApiOperation("修改推荐关键字")
    @RequestMapping(value = "/upDateRecommendKeyWord",method = RequestMethod.POST)
    public CommonResult upDateRecommendKeyWord(TSportSearchRecommend param) throws Exception{
        // TSportDiscountActivity activity = JSONObject.parseObject(param, TSportDiscountActivity.class);
        return keyWordService.upDateRecommendKeyWord(param);
    }

    /*关键字推荐状态*/
    @ApiOperation("关键字推荐状态")
    @RequestMapping(value = "/upDateStateById",method = RequestMethod.POST)
    public CommonResult upDateStateById(KeyWordVO param) throws Exception{
        // TSportDiscountActivity activity = JSONObject.parseObject(param, TSportDiscountActivity.class);
        return keyWordService.upDateStateById(param);
    }
}
