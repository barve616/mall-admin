package com.macro.mall.communicate.resourcecenter.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.bean.MerchantDO;
import com.macro.mall.communicate.resourcecenter.bean.MerchantVO;
import com.macro.mall.communicate.resourcecenter.service.MerchantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/merchant")
@Api(tags = "MerchantController", description = "商户管理")
public class MerchantController {

    @Resource
    private MerchantService merchantService;


    @ApiOperation("新增商户")
    @RequestMapping(value = "/addMerchant", method = RequestMethod.POST)
    public CommonResult addMerchant (@Valid @RequestBody MerchantVO vo) {
        return merchantService.addMerchant(vo);
    }


    @ApiOperation("商户列表、商户审核列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public CommonResult list (@RequestParam(value = "companyName", required=false) String companyName,
                              @RequestParam(value = "shopType", required=false) String shopType,
                              @RequestParam(value = "posExamineState", required=false) String posExamineState,
                              @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                              @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<MerchantDO> list = merchantService.list(companyName, shopType, posExamineState, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }


    /**
     *查看是否存在该商户
     * @param merId 商户代码
     * @param termId 终端号
     * @param info 商户名称
     * @param businessCode 营业执照编号
     * @param operateCode 经营许可证编号
     * @param shopName 店铺名称
     * @return
     */
    @ApiOperation("查看是否存在该商户")
    @RequestMapping(value = "/countByMerInfo", method = RequestMethod.GET)
    public CommonResult countByMerInfo (@RequestParam(value = "merId", required=false) String merId,
                                        @RequestParam(value = "termId", required=false) String termId,
                                        @RequestParam(value = "info", required=false) String info,
                                        @RequestParam(value = "businessCode", required=false) String businessCode,
                                        @RequestParam(value = "operateCode", required=false) String operateCode,
                                        @RequestParam(value = "shopName", required=false) String shopName) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("merId", merId);
        map.put("termId", termId);
        map.put("info", info);
        map.put("businessCode", businessCode);
        map.put("operateCode", operateCode);
        map.put("shopName", shopName);
        return CommonResult.success(merchantService.countByMerInfo(map));
    }


    @ApiOperation("更新商户")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult update (@Valid @RequestBody MerchantVO vo) {
        return merchantService.update(vo);
    }

}
