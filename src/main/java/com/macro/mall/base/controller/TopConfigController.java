package com.macro.mall.base.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.base.dto.topConfig.IndexSearchBean;
import com.macro.mall.base.dto.topConfig.TModulBean;
import com.macro.mall.base.dto.topConfig.TModuleConfig;
import com.macro.mall.base.service.DynamicConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(tags = "TopConfigController", description = "运动专区首页配置")
@RequestMapping("/sfcg")
public class TopConfigController {
    @Autowired
    private DynamicConfigService dynamicConfigService;

    @ApiOperation("查询首页配置")
    @RequestMapping(value = "/SFC000002", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getIndexInfo(@RequestBody IndexSearchBean bean){
        return (CommonResult) dynamicConfigService.getList(bean);
    }
    @ApiOperation("查询或删除配置信息")
    @ResponseBody
    @RequestMapping(value = "/SFC000003", method = RequestMethod.POST)
    public CommonResult searchConList(@RequestBody TModulBean bean) throws Exception{
        return dynamicConfigService.selAndDelCOnfig(bean);
    }

    @ApiOperation("新增或修改配置信息")
    @ResponseBody
    @RequestMapping(value = "/SFC000004", method = RequestMethod.POST)
    public CommonResult operatorFunInfo(@RequestBody TModuleConfig config) throws Exception{
        return dynamicConfigService.addOrUpdateInfo(config,config.getType());
    }

    @ApiOperation("上架，下架")
    @ResponseBody
    @RequestMapping(value = "/SFC000005", method = RequestMethod.POST)
    public CommonResult updateState(@RequestParam(value = "id")String id,
                              @RequestParam(value = "funState")String funState) throws Exception{
        return dynamicConfigService.updateState(id,funState);
    }

    @ApiOperation("查询资讯列表")
    @ResponseBody
    @RequestMapping(value = "/SFC000006", method = RequestMethod.POST)
    public CommonResult selectMsgInfo() throws Exception{
        return dynamicConfigService.selectMsgInfo();
    }
}
