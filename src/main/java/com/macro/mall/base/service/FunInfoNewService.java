package com.macro.mall.base.service;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.common.api.CommonResult2;

import javax.servlet.http.HttpServletResponse;

public interface FunInfoNewService {
    CommonResult findAll(HttpServletResponse response);

    CommonResult getCityInfo(HttpServletResponse response);
}
