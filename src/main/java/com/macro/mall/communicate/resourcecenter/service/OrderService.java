package com.macro.mall.communicate.resourcecenter.service;

import com.macro.mall.communicate.resourcecenter.bean.OrderVO;
import com.macro.mall.model.DSpoOrderInfo;

import java.util.List;
import java.util.Map;

public interface OrderService {

    /**
     * 订单列表
     */
    public List<DSpoOrderInfo> list(OrderVO vo);

    /**
     * 订单详情
     */
    public Map<String, Object> detail(String orderId);

}
