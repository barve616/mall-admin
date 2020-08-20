package com.macro.mall.communicate.resourcecenter.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.bean.MerchantDO;
import com.macro.mall.communicate.resourcecenter.bean.MerchantVO;
import com.macro.mall.communicate.resourcecenter.service.MerchantService;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.util.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Resource
    private TSportPosMapper tSportPosMapper;
    @Resource
    private TPosShopInfoMapper tPosShopInfoMapper;
    //@Resource
    //private DH5MerTermIdMapper dh5MerTermIdMapper;
    //@Resource
    //private DH5MerInfoMapper dh5MerInfoMapper;
    //@Resource
    //private TSportPosExamineMapper tSportPosExamineMapper;

    /**
     * 新增商户
     */
    @Override
    @Transactional(rollbackFor = SQLException.class)
    public CommonResult addMerchant (MerchantVO vo) {

        //String channel = getChannel(dh5MerTermIdMapper);
        String date = DateUtil.getDate();
        /*入库原商户基础表*/
        /*DH5MerTermId dh5MerTermId = new DH5MerTermId();
        dh5MerTermId.setMerId(vo.getPosCode());
        dh5MerTermId.setTermId(vo.getPosTerminalNum());
        dh5MerTermId.setInfo(vo.getCompanyName());
        dh5MerTermId.setChannel(channel);
        dh5MerTermId.setSupCoupon("Y");
        int i = dh5MerTermIdMapper.insertSelective(dh5MerTermId);*/

        /*入库原商户配置表*/
        /*DH5MerInfo dh5MerInfo = new DH5MerInfo();
        dh5MerInfo.setMerH5Id(IdWorkerUtil.getInstance().nextId()+"");
        //订单入口状态
        dh5MerInfo.setMerState("1");
        dh5MerInfo.setMerH5Url(vo.getPosUrl());
        dh5MerInfo.setMerOrderH5Url(vo.getPosBackendUrl());
        dh5MerInfo.setMerChannel(channel);
        dh5MerInfo.setMerPayType(vo.getPayMethod());
        dh5MerInfo.setMerPayCardType(vo.getPayCardType());
        dh5MerInfo.setOrderEntranceDes(vo.getOrderEntryTitle());
        dh5MerInfo.setMerCreateDate(date);
        int j = dh5MerInfoMapper.insertSelective(dh5MerInfo);*/

        /*入库新商户详情表*/
        TSportPos pos = new TSportPos();
        String posId = UUID.randomUUID().toString().replaceAll("-", "");
        pos.setPosId(posId);
        //pos.setChannel(channel);
        pos.setRegisterAddress(vo.getRegisterAddress());
        pos.setCompanyBusine(vo.getCompanyBusine());
        pos.setAccountCard(vo.getAccountCard());
        pos.setAccountBank(vo.getAccountBank());
        pos.setContactsName(vo.getContactsName());
        pos.setPhone(vo.getPhone());
        pos.setEmail(vo.getEmail());
        pos.setPromoterName(vo.getPromoterName());
        pos.setPromoterState(vo.getPromoterState());
        pos.setBusinessExpiryDate(vo.getBusinessExpiryDate());
        pos.setBusinessCode(vo.getBusinessCode());
        pos.setBusinessPic(vo.getBusinessPic());
        pos.setOperateCode(vo.getOperateCode());
        pos.setOperatePic(vo.getOperatePic());
        pos.setLegalPersionName(vo.getLegalPersionName());
        pos.setLegalPersionId(vo.getLegalPersionId());
        pos.setLegalPersionBack(vo.getLegalPersionBack());
        pos.setLegalPersionFront(vo.getLegalPersionFront());
        pos.setPosExamineState("01");
        pos.setCreatedTime(date);
        pos.setUpdatedTime(date);
        pos.setPromoterName(vo.getPromoterName());
        int k = tSportPosMapper.insertSelective(pos);

        /*入库店铺表*/
        TPosShopInfo shop = new TPosShopInfo();
        shop.setShopId(UUID.randomUUID().toString().replaceAll("-", ""));
        shop.setPosId(posId);
        shop.setShopName(vo.getShopName());
        shop.setShopType(vo.getShopType());
        shop.setShopEnglishName(vo.getShopEnglishName());
        shop.setCreatedTime(date);
        shop.setUpdatedTime(date);
        int h = tPosShopInfoMapper.insertSelective(shop);

        //if (i > 0 && j > 0 && k > 0 && h > 0)
            //return CommonResult.success(i);
       // else
            return CommonResult.failed();
    }


    /**
     * 获取新的渠道号
     */
    /*public static synchronized String getChannel (DH5MerTermIdMapper dh5MerTermIdMapper) {
        String channel = dh5MerTermIdMapper.selectChannel();
        if (StringUtil.isNotEmpty(channel)) {
            int i = Integer.parseInt(channel);
                channel = ""+(i+1);
        } else {
            channel = "10";
        }
        return channel;
    }*/


    /**
     * 获取商户列表
     */
    @Override
    public List<MerchantDO> list(String companyName, String shopType, String posExamineState, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        Map<String, String> map = new HashMap<String, String>();
        map.put("companyName", companyName);
        map.put("shopType", shopType);
        map.put("posExamineState", posExamineState);
        return tSportPosMapper.selectList(map);
    }

    /**
     * 更新
     */
    @Override
    @Transactional(rollbackFor = SQLException.class)
    public CommonResult update(MerchantVO vo) {
        String date = DateUtil.getDate();
        /*更新原商户基础表*/
        /*DH5MerTermId dh5MerTermId = new DH5MerTermId();
        dh5MerTermId.setChannel(vo.getChannel());
        dh5MerTermId.setMerId(vo.getPosCode());
        dh5MerTermId.setTermId(vo.getPosTerminalNum());
        dh5MerTermId.setInfo(vo.getCompanyName());
        int i = dh5MerTermIdMapper.updateInfo(dh5MerTermId);*/

        /*入库原商户配置表*/
        /*DH5MerInfo dh5MerInfo = new DH5MerInfo();
        //订单入口状态
        dh5MerInfo.setMerH5Url(vo.getPosUrl());
        dh5MerInfo.setMerOrderH5Url(vo.getPosBackendUrl());
        dh5MerInfo.setMerChannel(vo.getChannel());
        dh5MerInfo.setMerPayType(vo.getPayMethod());
        dh5MerInfo.setMerPayCardType(vo.getPayCardType());
        dh5MerInfo.setOrderEntranceDes(vo.getOrderEntryTitle());
        dh5MerInfo.setMerCreateDate(date);
        int j = dh5MerInfoMapper.updateInfo(dh5MerInfo);*/

        /*入库新商户详情表*/
        TSportPos pos = new TSportPos();
        pos.setChannel(vo.getChannel());
        pos.setRegisterAddress(vo.getRegisterAddress());
        pos.setCompanyBusine(vo.getCompanyBusine());
        pos.setAccountCard(vo.getAccountCard());
        pos.setAccountBank(vo.getAccountBank());
        pos.setContactsName(vo.getContactsName());
        pos.setPhone(vo.getPhone());
        pos.setEmail(vo.getEmail());
        pos.setPromoterName(vo.getPromoterName());
        pos.setPromoterState(vo.getPromoterState());
        pos.setPromoterUnit(vo.getPromoterUnit());
        pos.setBusinessExpiryDate(vo.getBusinessExpiryDate());
        pos.setBusinessCode(vo.getBusinessCode());
        pos.setBusinessPic(vo.getBusinessPic());
        pos.setOperateCode(vo.getOperateCode());
        pos.setOperatePic(vo.getOperatePic());
        pos.setLegalPersionName(vo.getLegalPersionName());
        pos.setLegalPersionId(vo.getLegalPersionId());
        pos.setLegalPersionBack(vo.getLegalPersionBack());
        pos.setLegalPersionFront(vo.getLegalPersionFront());
        pos.setPosExamineState("01");
        pos.setUpdatedTime(date);
        int k = tSportPosMapper.updateInfo(pos);

        /*入库店铺表*/
        TPosShopInfo shop = new TPosShopInfo();
        shop.setShopId(vo.getShopId());
        shop.setShopName(vo.getShopName());
        shop.setShopType(vo.getShopType());
        shop.setShopEnglishName(vo.getShopEnglishName());
        shop.setUpdatedTime(date);
        int h = tPosShopInfoMapper.updateByPrimaryKeySelective(shop);

        /*入库审核记录表*/
        /*TSportPosExamine examine = new TSportPosExamine();
        examine.setPosId(vo.getPosId());
        examine.setExamineState("01");
        examine.setExamineTime(date);
        examine.setExaminePersion(vo.getUserName());
        int f = tSportPosExamineMapper.insertSelective(examine);*/

        //if (i > 0 && j > 0 && k > 0 && h > 0 && f > 0)
            //return CommonResult.success(i);
       // else
            return CommonResult.failed();
    }


    /**
     * 查看是否存在该商户
     */
    @Override
    public Integer countByMerInfo(Map<String, String> map) {
        return tSportPosMapper.countByMerInfo(map);
    }




}
