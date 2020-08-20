package com.macro.mall.base.service;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.base.dto.topConfig.IndexSearchBean;
import com.macro.mall.base.dto.topConfig.TModulBean;
import com.macro.mall.base.dto.topConfig.TModuleConfig;

public interface DynamicConfigService {
    CommonResult getList(IndexSearchBean bean);

    CommonResult selAndDelCOnfig(TModulBean bean);

    CommonResult addOrUpdateInfo(TModuleConfig config, String type) throws Exception;

    CommonResult updateState(String id, String funState);

    CommonResult selectMsgInfo();
}
