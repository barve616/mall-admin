package com.macro.mall.communicate.resourcecenter.service;


import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.github.pagehelper.PageHelper;
import com.macro.mall.base.service.impl.ImgUtilsService;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.common.base.MValues;
import com.macro.mall.communicate.resourcecenter.bean.*;
import com.macro.mall.mapper.TSportAroundPosMapper;
import com.macro.mall.mapper.TSportAroundTypeMapper;
import com.macro.mall.mapper.TSportShopAroundMapper;
import com.macro.mall.model.*;
import com.macro.mall.util.DateUtil;
import io.swagger.annotations.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.security.spec.ECField;
import java.util.*;

@Service
public class AroundPosService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AroundPosService.class);

    @Autowired
    private TSportAroundPosMapper aroundPosMapper;
    
    @Autowired
    private TSportAroundTypeMapper aroundTypeMapper;

    @Autowired
    private TSportAroundPosMapper sportAroundPosMapper;

    @Autowired
    private TSportShopAroundMapper sportShopAroundMapper;

    @Autowired
    private ImgUtilsService imgUtilsService;


    /**
     * 查询周边商户推荐列表
     * @param pageSize
     * @param pageNum
     * @return
     */
    public CommonResult<CommonPage<AroundPosDTO>> aroundPosList(Integer pageSize, Integer pageNum){
        try {
            PageHelper.startPage(pageNum,pageSize);
            List<AroundPosDTO> aroundPosList = aroundPosMapper.getAroundPosList();
            return  CommonResult.success(CommonPage.restPage(aroundPosList));
        }catch (Exception e){
            LOGGER.error("查询周边商户推荐列表失败");
            e.printStackTrace();
            return   CommonResult.failed("查询周边商户推荐列表失败");
        }
    }


    /**
     * 根据周边商户id查询周边商户详情信息
     * @param aroundPosId
     * @return
     */
    public CommonResult aroundPosDetailById(String aroundPosId){
        if(StringUtils.isEmpty(aroundPosId)){
            CommonResult.failed("周边商户id不能是空");
        }
        try {
            TSportAroundPos aroundPosDetail = aroundPosMapper.getAroundPosDetail(aroundPosId);

            if(aroundPosDetail == null){
                LOGGER.error("周边商户推荐详情查询是null aroundPosId="+aroundPosId);
                return  CommonResult.failed("周边商户推荐详情查询是null");
            }

            String visitPath2 = MValues.get("visitPath2");
            String rotationChartPic = aroundPosDetail.getRotationChartPic();
            List<RotationChartPicVO> totationChartPicList = JSONUtil.toList(JSONUtil.parseArray(rotationChartPic), RotationChartPicVO.class);
            for (int i = 0; i <totationChartPicList.size() ; i++) {
                RotationChartPicVO rotationChartPicVO = totationChartPicList.get(i);
                String rotationChartPicUrl = rotationChartPicVO.getRotationChartPic();
                rotationChartPicUrl=visitPath2+rotationChartPicUrl;
                rotationChartPicVO.setRotationChartPic(rotationChartPicUrl);
            }
            JSONArray jsonArray = JSONUtil.parseArray(totationChartPicList);
            aroundPosDetail.setRotationChartPic(jsonArray.toString());


            return   CommonResult.success(aroundPosDetail,"查询周边商户推荐详情信息成功");
        }catch (Exception e){
            LOGGER.error("周边商户推荐详情查询失败");
            e.printStackTrace();
            return   CommonResult.failed("周边商户推荐详情查询失败");
        }

    }



    /**
     * 增加或者修改周边商户推荐
     * @param aroundPosInfoVO
     * @return
     */
    public CommonResult addOrUpdateAroundPos(AroundPosInfoVO aroundPosInfoVO){
        if(aroundPosInfoVO == null){
            return CommonResult.failed("周边商户推荐信息不能为空");
        }
        String aroundPosId = aroundPosInfoVO.getAroundPosId();

        TSportAroundPos aroundPos=new TSportAroundPos();
        aroundPos.setPosName(aroundPosInfoVO.getPosName()); //商户名称
        aroundPos.setCityCode(aroundPosInfoVO.getCityCode()); //城市编码
       /*  aroundPos.setRegionCode(aroundPosInfoVO.getRegionCode());// 区县编码
         aroundPos.setStreetCode(aroundPosInfoVO.getStreetCode());//村镇编码*/
        aroundPos.setPhone(aroundPosInfoVO.getPhone());//联系电话
        aroundPos.setBusinessTimeType(aroundPosInfoVO.getBusinessTimeType());//营业时间类型
        aroundPos.setBusinessStartTime(aroundPosInfoVO.getBusinessStartTime());
        aroundPos.setBusinessEndTime(aroundPosInfoVO.getBusinessEndTime());
        aroundPos.setFacilities(aroundPosInfoVO.getFacilities());
        aroundPos.setPrice(aroundPosInfoVO.getPrice());
        aroundPos.setLabel(aroundPosInfoVO.getLabel());
        String shopLogoPic = aroundPosInfoVO.getShopLogo();

        String rotationChartPic = aroundPosInfoVO.getRotationChartPic();
        try {
            if(!StringUtils.isEmpty(rotationChartPic)){
                List<RotationChartPicVO> totationChartPicList = JSONUtil.toList(JSONUtil.parseArray(rotationChartPic), RotationChartPicVO.class);
                for (int i = 0; i < totationChartPicList.size(); i++) {
                    RotationChartPicVO rotationChartPicVO = totationChartPicList.get(i);
                    String rotationChartPicUrl = rotationChartPicVO.getRotationChartPic();
                    if(rotationChartPicUrl.indexOf("/mlife")>=0){
                        continue;
                    }
                    String file = imgUtilsService.uploadImg(rotationChartPicUrl, "file");
                    rotationChartPicVO.setRotationChartPic(file);
                }
                JSONArray jsonArray = JSONUtil.parseArray(totationChartPicList);
                aroundPos.setRotationChartPic(jsonArray.toString());
            }else{
                aroundPos.setRotationChartPic(rotationChartPic);
            }
          if(!StringUtils.isEmpty(shopLogoPic)&& shopLogoPic.indexOf("/mlife")==-1){
              String shopLogo = imgUtilsService.uploadImg(shopLogoPic, "file");
              aroundPos.setShopLogo(shopLogo);
          }else{
              aroundPos.setShopLogo(shopLogoPic);
          }
        }catch (Exception e){
            LOGGER.error("图片上传失败"+"==========="+e.getMessage());
            return CommonResult.failed("上传图片失败");
        }

        aroundPos.setSite(aroundPosInfoVO.getSite());
        aroundPos.setAroundPosType(aroundPosInfoVO.getAroundPosType());
        if(StringUtils.isEmpty(aroundPosId)){  //增加
            String id = String.valueOf(UUID.randomUUID()).replaceAll("-", "");
            aroundPos.setAroundPosId(id);
            aroundPos.setCreateDt(DateUtil.getDate(new Date()));
            aroundPos.setState("00");//默认 开启状态
            try {
                int i = aroundPosMapper.insertSelective(aroundPos);
                if(i>0){
                    return CommonResult.success(null,"增加周边推荐成功");
                }else{
                    return CommonResult.failed(null,"增加周边推荐失败");
                }
            }catch (Exception e){
                LOGGER.error("增加周边推荐失败 aroundPos="+aroundPos.toString());
                e.printStackTrace();
                return   CommonResult.failed("增加周边推荐失败");
            }

        }
        aroundPos.setUpdateDt(DateUtil.getDate(new Date()));
        try {
            TSportAroundPosExample example=new TSportAroundPosExample();
            TSportAroundPosExample.Criteria criteria = example.createCriteria();
            criteria.andAroundPosIdEqualTo(aroundPosId);

            int u = aroundPosMapper.updateByExampleSelective(aroundPos,example);
            if(u>0){
                return CommonResult.success(null,"修改周边推荐成功");
            }else{
                return CommonResult.failed(null,"修改周边推荐失败");
            }
        }catch (Exception e){
            LOGGER.error("修改周边推荐失败 aroundPos="+aroundPos.toString());
            e.printStackTrace();
            return   CommonResult.failed("修改周边推荐失败");
        }
    }

    /**
     * 修改商户推荐上下架状态
     * @param
     * @return
     */
    public CommonResult updateAroundPosStatus(AroundPosStatusVO aroundPosStatusVO){
        if(aroundPosStatusVO == null){
            return  CommonResult.failed("周边商户推荐id不能为空");
        }
        String aroundPosId = aroundPosStatusVO.getAroundPosId();
        String state = aroundPosStatusVO.getState();
        if(StringUtils.isEmpty(aroundPosId)){
            return  CommonResult.failed("周边商户推荐id不能为空");
        }
        if(StringUtils.isEmpty(state)){
            return  CommonResult.failed("状态不能是空");
        }

        TSportAroundPosExample example=new TSportAroundPosExample();
        TSportAroundPosExample.Criteria criteria = example.createCriteria();
        criteria.andAroundPosIdEqualTo(aroundPosId);

        TSportAroundPos aroundPos=new TSportAroundPos();
        aroundPos.setAroundPosId(aroundPosId);
        aroundPos.setState(state);
        try {
            int u = aroundPosMapper.updateByExampleSelective(aroundPos, example);
            if(u>0){
                return CommonResult.success(null,"修改周边商户推荐状态成功");
            }else{
                return CommonResult.failed(null,"修改周边商户推荐状态失败");
            }
        } catch (Exception e){
            LOGGER.error("修改周边商户推荐状态失败 aroundPosId="+aroundPosId +" state="+state );
            e.printStackTrace();
            return  CommonResult.failed("修改周边推荐失败");
        }
    }


    /**
     * 查询周边店铺分类列表
     * @param
     * @return
     */
    public CommonResult<CommonPage<TSportAroundType>> getAroundTypeList(Integer pageSize, Integer pageNum){
        try {
            PageHelper.startPage(pageNum,pageSize);
            List<TSportAroundType> aroundTypeList = aroundTypeMapper.getAroundTypeList();
            return CommonResult.success(CommonPage.restPage(aroundTypeList));
        }catch (Exception e){
            LOGGER.error("查询周边店铺分类列表失败");
            e.printStackTrace();
            return  CommonResult.failed("查询周边店铺分类列表失败");
        }

    }

    /**
     * 增加或者修改周边推荐分类
     * @param
     * @return
     */
    public CommonResult addOrUpdateAroundType(AroundTypeVO aroundTypeVO){
        if(aroundTypeVO !=null && StringUtils.isEmpty(aroundTypeVO.getTypeName())){
            return CommonResult.failed("分类名称不能是null");
        }
        String typeName = aroundTypeVO.getTypeName();
        String id = aroundTypeVO.getId();

        TSportAroundType sportAroundType=new TSportAroundType();
        if(StringUtils.isEmpty(id)){ //增加店铺分类
            sportAroundType.setCreateDate(DateUtil.getDate());
            id = String.valueOf(UUID.randomUUID()).replaceAll("-", "");
            sportAroundType.setId(id);
            sportAroundType.setTypeName(typeName);
            sportAroundType.setTypeStatus("00");//默认 00
            try {
                int i = aroundTypeMapper.insertSelective(sportAroundType);
                if(i>0){
                    return CommonResult.success(null,"增加周边商户分类成功");
                }else {
                    return CommonResult.failed(null, "增加周边商户分类失败");
                }
            }catch (Exception e){
                LOGGER.error("增加周边商户分类失败 id="+id +"  typeName="+typeName );
                e.printStackTrace();
                return CommonResult.failed(null, "增加周边商户分类失败");
            }
        }
        sportAroundType.setId(id);
        sportAroundType.setTypeName(typeName);
        try {
            int u = aroundTypeMapper.updateByPrimaryKeySelective(sportAroundType);
            if(u>0){
                return CommonResult.success(null,"修改周边商户分类成功");
            }else {
                return CommonResult.failed(null, "修改周边商户分类失败");
            }
        }catch (Exception e){
            LOGGER.error("修改周边商户分类失败 id="+id +"  typeName="+typeName );
            e.printStackTrace();
            return CommonResult.failed(null, "修改周边商户分类失败");
        }

    }

    /**
     * 根据id修改分类状态
     * @param
     * @param
     * @return
     */
    public CommonResult updateAroundTypeStatus(AroundTypeVO aroundTypeVO){
        if(aroundTypeVO ==null || StringUtils.isEmpty(aroundTypeVO.getId())){
            return CommonResult.failed("分类id不能是null");
        }
        if(StringUtils.isEmpty(aroundTypeVO.getTypeStatus())){
            return CommonResult.failed("分类状态不能是null");
        }
        String typeStatus = aroundTypeVO.getTypeStatus();
        String id = aroundTypeVO.getId();

        TSportAroundType sportAroundType=new TSportAroundType();
        sportAroundType.setId(id);
        sportAroundType.setTypeStatus(typeStatus);
        try {
            int u = aroundTypeMapper.updateByPrimaryKeySelective(sportAroundType);
            if(u>0){
                return CommonResult.success(null,"修改周边商户分类状态成功");
            }else {
                return CommonResult.failed(null, "修改周边商户分类状态失败");
            }
        }catch (Exception e){
            LOGGER.error("修改周边商户分类状态失败 id="+id +"  typeStatus="+typeStatus );
            e.printStackTrace();
            return CommonResult.failed(null, "修改周边商户分类状态失败");
        }
    }

    /**
     * 根据店铺id查询周边推荐的商户
     * @param shopId
     * @return
     */
    public CommonResult getRecommendAroundPosList(String shopId){
        if(StringUtils.isEmpty(shopId)){
            return CommonResult.failed("店铺id不能是null");
        }
        try {
            List<TSportAroundPos> recommendAroundPosList = sportAroundPosMapper.getRecommendAroundPosList(shopId);
            return  CommonResult.success(recommendAroundPosList,"查询周边推荐商户列表成功");
        }catch (Exception e){
            LOGGER.error("查询周边推荐商户失败 shopId="+shopId);
            e.printStackTrace();
            return  CommonResult.failed("查询周边推荐商户列表失败");
        }
    }

    /**
     * 根据店铺id查询周边没有推荐的商户
     * @param aroundPosListVO
     * @return
     */
    public CommonResult<CommonPage<TSportAroundPos>> getNoRecommendAroundPosList(AroundPosListVO aroundPosListVO,Integer pageSize,Integer pageNum){
        if(aroundPosListVO == null || StringUtils.isEmpty(aroundPosListVO.getShopId())){
            return CommonResult.failed("店铺id不能是null");
        }
        try {
            PageHelper.startPage(pageNum,pageSize);
            List<TSportAroundPos> noRecommendAroundPosList = sportAroundPosMapper.getNoRecommendAroundPosList(aroundPosListVO);
            return  CommonResult.success(CommonPage.restPage(noRecommendAroundPosList),"查询周边没有推荐商户列表成功");
        }catch (Exception e){
            LOGGER.error("查询周边没有推荐商户列表失败 aroundPosListVO="+aroundPosListVO.toString());
            e.printStackTrace();
            return  CommonResult.failed("查询周边没有推荐商户列表失败");
        }
    }


    /**
     * 店铺绑定或者取消周边商户推荐
     * @param shopId
     * @param aroundPosId
     * @param status  00  绑定  01 取消绑定
     * @return
     */
    public CommonResult addOrDeleteShopRecommendAroundPos(String shopId,String aroundPosId,String status) {
        if(StringUtils.isEmpty(shopId)){
            return CommonResult.failed("店铺id不能为null");
        }
        if(StringUtils.isEmpty(aroundPosId)){
            return CommonResult.failed("周边商户id不能为null");
        }
        if(StringUtils.isEmpty(status)){
            return CommonResult.failed("状态不能为null");
        }

        if("00".equals(status)){  //绑定
            try {
                List<TSportShopAround> shopAroundList = sportShopAroundMapper.getShopAroundByShopIdAndAroundId(shopId, aroundPosId);
                if(shopAroundList.size()>0){
                    return CommonResult.failed("该商户已经绑定");
                }
                TSportShopAround shopAround=new TSportShopAround();

                String id = String.valueOf(UUID.randomUUID()).replaceAll("-", "");
                shopAround.setId(id);
                shopAround.setShopId(shopId);
                shopAround.setAroundId(aroundPosId);
                shopAround.setCreateDate(DateUtil.getDate());
                int i = sportShopAroundMapper.insertSelective(shopAround);
                if(i>0){
                    return CommonResult.success(null,"店铺绑定周边商户推荐成功");
                }else {
                    return CommonResult.failed(null, "店铺绑定周边商户推荐失败");
                }
            }catch (Exception e){
                LOGGER.error("店铺绑定周边商户推荐失败 shopId="+shopId +" aroundPosId="+aroundPosId +" status="+status);
                e.printStackTrace();
                return  CommonResult.failed("店铺绑定周边商户推荐失败");
            }
        }

        //取消推荐商户
        try {
            int d = sportShopAroundMapper.deleteShopAroundByShopIdAndAroundId(shopId, aroundPosId);
            if(d>0){
                return CommonResult.success(null,"店铺取消推荐周边商户成功");
            }else {
                return CommonResult.failed(null, "店铺取消推荐周边商户失败");
            }
        }catch (Exception e){
            LOGGER.error("店铺取消推荐周边商户失败 shopId="+shopId +" aroundPosId="+aroundPosId +" status="+status);
            e.printStackTrace();
            return  CommonResult.failed("店铺取消推荐周边商户失败");
        }

    }


}
