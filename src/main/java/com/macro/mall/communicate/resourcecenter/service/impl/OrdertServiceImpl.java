package com.macro.mall.communicate.resourcecenter.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.communicate.resourcecenter.bean.*;
import com.macro.mall.communicate.resourcecenter.service.OrderService;
import com.macro.mall.mapper.*;
import com.macro.mall.model.DSpoOrderInfo;
import com.macro.mall.model.TSportOrderActivity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrdertServiceImpl implements OrderService {

    @Resource
    private DSpoOrderInfoMapper dSpoOrderInfoMapper;
    @Resource
    private TSpoOrderDetailInfoMapper tSpoOrderDetailInfoMapper;
   @Resource
    private TSportOrderActivityMapper tSportOrderActivityMapper;


    /**
     * 查询订单列表
     */
    @Override
    public List<DSpoOrderInfo> list(OrderVO vo) {
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        return dSpoOrderInfoMapper.list(vo);
    }

    /**
     * 订单详情
     */
    @Override
    public Map<String, Object> detail(String orderId) {

        Map<String, Object> map = new HashMap<String, Object>();

        OrderVO vo = new OrderVO();
        vo.setOrderId(orderId);
        //查询订单信息
        DSpoOrderInfo order = dSpoOrderInfoMapper.list(vo).get(0);
        map.put("order", order);

        //查订单的联系人、游客信息
        List<OrderTouristDO> tourists = tSpoOrderDetailInfoMapper.findTourisInfo(orderId);
        map.put("tourists", tourists);

        //查询订单的优惠信息
        List<TSportOrderActivity> discounts = tSportOrderActivityMapper.list(orderId);
        map.put("discounts", discounts);

        return map;
    }


}
