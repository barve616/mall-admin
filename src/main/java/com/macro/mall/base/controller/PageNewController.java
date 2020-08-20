package com.macro.mall.base.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.base.dto.topConfig.CityInfo;
import com.macro.mall.base.service.FunInfoNewService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Api(tags = "PageNewController", description = "查询本地功能和城市列表")
@Controller
@RequestMapping("/pageNew")
public class PageNewController{

    private static final long serialVersionUID = 7813199164092251469L;


    @Autowired
	private FunInfoNewService funInfoNewService;


	@ApiOperation("获取本地功能列表")
    @ResponseBody
    @RequestMapping(value="/getFunInfo",method = RequestMethod.POST)
	public CommonResult getFunInfo(HttpServletRequest request, HttpServletResponse response) throws Exception{
		return funInfoNewService.findAll(response);
	}

    /**
     * 获取城市列表
     * @param request
     * @param cityInfo
     * @return
     * @throws Exception
     */
	@ApiOperation("获取城市列表")
	@ResponseBody
	@RequestMapping(value="/getCityInfo",method = RequestMethod.POST)
	public CommonResult getCityInfo(HttpServletRequest request, CityInfo cityInfo, HttpServletResponse response) throws Exception {
    	return funInfoNewService.getCityInfo(response);
	}

    


    

}
