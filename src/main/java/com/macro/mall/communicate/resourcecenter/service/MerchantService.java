package com.macro.mall.communicate.resourcecenter.service;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.bean.MerchantDO;
import com.macro.mall.communicate.resourcecenter.bean.MerchantVO;

import java.util.List;
import java.util.Map;

public interface MerchantService {

    /**
     * 新增商户
     */
    public CommonResult  addMerchant (MerchantVO vo);

    /**
     * 商户列表、商户审核列表
     */
    public List<MerchantDO> list (String companyName, String shopType, String posExamineState, Integer pageSize, Integer pageNum);

    /**
     *查看是否存在该商户
     */
    public Integer countByMerInfo (Map<String, String> map);

    /**
     * 更新
     */
    public CommonResult update (MerchantVO vo);

}
