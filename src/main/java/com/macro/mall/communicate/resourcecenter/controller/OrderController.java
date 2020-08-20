package com.macro.mall.communicate.resourcecenter.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.bean.MerchantDO;

import com.macro.mall.communicate.resourcecenter.bean.OrderVO;
import com.macro.mall.communicate.resourcecenter.service.OrderService;
import com.macro.mall.model.DMatchApplyInfo;
import com.macro.mall.model.DSpoOrderInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orderManager")
@Api(tags = "OrderController", description = "订单管理")
public class OrderController {

    @Resource
    private OrderService orderService;


    @ApiOperation("订单列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public CommonResult<CommonPage<DSpoOrderInfo>> list (@RequestBody OrderVO vo) {
        List<DSpoOrderInfo> list = orderService.list(vo);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("订单详情")
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public CommonResult list (@RequestParam(value = "orderId", required = true) String orderId) {
        Map<String, Object> map  = orderService.detail(orderId);
        return CommonResult.success(map);
    }

}
