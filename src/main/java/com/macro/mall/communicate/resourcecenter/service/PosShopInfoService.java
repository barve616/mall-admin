package com.macro.mall.communicate.resourcecenter.service;



import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.github.pagehelper.PageHelper;
import com.macro.mall.base.service.impl.ImgUtilsService;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.common.base.MValues;
import com.macro.mall.communicate.resourcecenter.bean.*;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class PosShopInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PosShopInfoService.class);
    @Autowired
    private TPosShopInfoMapper posShopInfoMapper;
    @Autowired
    private TPosShopTypeMapper posShopTypeMapper;
    @Autowired
    private TSportShopWindowseatMapper sportShopWindowseatMapper;
    @Autowired
    private TSportCommodityMapper commodityMapper;
    @Autowired
    private TSportCoachTeamMapper coachTeamMapper;
    @Autowired
    private ImgUtilsService imgUtilsService;

    /**
     * 根据商户id获取店铺信息
     * @param posId
     * @return
     */
    public CommonResult getPosShopInfoByPosId(String posId){
        if(StringUtils.isEmpty(posId)){
            return CommonResult.failed("商户id不能是空");
        }
        try {
            TPosShopInfoDTO posShopInfo = posShopInfoMapper.selectPosShopInfoByPosId(posId);
            String visitPath2 = MValues.get("visitPath2");

            String rotationnChartInfo = posShopInfo.getRotationnChartInfo();
            List<RotationChartPicVO> totationChartPicList = JSONUtil.toList(JSONUtil.parseArray(rotationnChartInfo), RotationChartPicVO.class);
            for (int i = 0; totationChartPicList!=null && i <totationChartPicList.size() ; i++) {
                RotationChartPicVO rotationChartPicVO = totationChartPicList.get(i);
                String rotationChartPicUrl = rotationChartPicVO.getRotationChartPic();
                rotationChartPicUrl=visitPath2+rotationChartPicUrl;
                rotationChartPicVO.setRotationChartPic(rotationChartPicUrl);
            }
            JSONArray jsonArray = JSONUtil.parseArray(totationChartPicList);
            posShopInfo.setRotationnChartInfo(jsonArray.toString());

            TSportShopWindowseatExample example=new TSportShopWindowseatExample();
            TSportShopWindowseatExample.Criteria criteria = example.createCriteria();
            criteria.andShopIdEqualTo(posShopInfo.getShopId());

            List<TSportShopWindowseat> shopWindowseatList = sportShopWindowseatMapper.selectByExample(example);
            //橱窗位 商品信息查询
            if(shopWindowseatList!=null){
                for (int i = 0; i <shopWindowseatList.size() ; i++) {
                    TSportShopWindowseat tSportShopWindowseat = shopWindowseatList.get(i);
                    String windowseatCommodityId = tSportShopWindowseat.getWindowseatCommodityId();

                    List<TSportCommodity>  commodityList=new ArrayList<>();
                    if(StringUtils.isEmpty(windowseatCommodityId)){
                        continue;
                    }
                    String[] commodityArr = windowseatCommodityId.split(",");
                    for (String commodityId: commodityArr) {
                        TSportCommodity sportCommodity = commodityMapper.selectByPrimaryKey(commodityId);
                        commodityList.add(sportCommodity);
                    }
                    tSportShopWindowseat.setCommodityList(commodityList);
                }
                posShopInfo.setShopWindowseatList(shopWindowseatList);
            }

            return CommonResult.success(posShopInfo);
        }catch (Exception e){
            LOGGER.error("根据商户id获取店铺信息查询失败");
            e.printStackTrace();
        }
        return CommonResult.failed("获取店铺信息查询失败");
    }




    //修改商户店铺信息
    @Transactional
    public CommonResult updatePosShop(TPosShopInfoVO posShopInfoVO){
        // posId = posShopInfoVO.getPosId();
        String shopId = posShopInfoVO.getShopId();
        
        try {
            //TPosShopInfo posShopInfo = posShopInfoMapper.selectPosShopInfoByPosId(posId);
            TPosShopInfo posShopInfo = posShopInfoMapper.selectByPrimaryKey(shopId);
            if(posShopInfo==null){
                LOGGER.error("店铺信息不存在 shopId="+shopId);
                return CommonResult.failed("店铺信息不存在，无法修改");
            }
            posShopInfo.setShopDescription(posShopInfoVO.getShopDescription());//店铺简述
            posShopInfo.setProvinceCode(posShopInfoVO.getProvinceCode()); //省编码
            posShopInfo.setCityCode(posShopInfoVO.getCityCode());//市编码
            posShopInfo.setRegionCode(posShopInfoVO.getRegionCode());//区编码
            posShopInfo.setShopAddress(posShopInfoVO.getShopAddress());//详细地址
            posShopInfo.setShopLabel(posShopInfoVO.getShopLabel());//店铺标签
            posShopInfo.setSearchFoundationData(posShopInfoVO.getSearchFoundationData()); //铺底数据
            posShopInfo.setShopWindowSeat(posShopInfoVO.getShopWindowSeat()); //橱窗位
            posShopInfo.setPosId(posShopInfoVO.getPosId());

            String shopLogoPic = posShopInfoVO.getShopLogo();
            String searchPageImagePic = posShopInfoVO.getSearchPageImage();
            String rotationnChartInfo = posShopInfoVO.getRotationnChartInfo();

            try {
                List<RotationChartPicVO> totationChartPicList = JSONUtil.toList(JSONUtil.parseArray(rotationnChartInfo), RotationChartPicVO.class);
                for (int i = 0; i < totationChartPicList.size(); i++) {
                    RotationChartPicVO rotationChartPicVO = totationChartPicList.get(i);
                    String rotationChartPicUrl = rotationChartPicVO.getRotationChartPic();
                    if(rotationChartPicUrl.indexOf("/uploadfile")>=0){
                        continue;
                    }
                    String file = imgUtilsService.uploadImgCMS(rotationChartPicUrl, "file");
                    rotationChartPicVO.setRotationChartPic(file.substring(11, file.length()));
                }
                JSONArray jsonArray = JSONUtil.parseArray(totationChartPicList);
                posShopInfo.setRotationnChartInfo(jsonArray.toString());//首页轮播图信息
                if(shopLogoPic.indexOf("/uploadfile")==-1){
                    String shopLogo = imgUtilsService.uploadImgCMS(shopLogoPic, "file");
                    posShopInfo.setShopLogo(shopLogo.substring(11, shopLogo.length()));//店铺logo
                }else{
                    posShopInfo.setShopLogo(posShopInfoVO.getShopLogo());//店铺logo
                }
                if(!StringUtils.isEmpty(searchPageImagePic)&&searchPageImagePic.indexOf("/uploadfile")==-1){
                    String searchPageImage = imgUtilsService.uploadImgCMS(searchPageImagePic, "file");
                    posShopInfo.setSearchPageImage(searchPageImage.substring(11, searchPageImage.length()));//搜索页图片
                }else{
                    posShopInfo.setSearchPageImage(posShopInfoVO.getSearchPageImage());//搜索页图片
                }

            }catch (Exception e){
                LOGGER.error("图片上传失败"+"==========="+e.getMessage());
                return CommonResult.failed("上传图片失败");
            }

            posShopInfo.setUpdateTime(DateUtil.getDate(new Date()));
            int updateNum = posShopInfoMapper.updateByPrimaryKeySelective(posShopInfo);
            if(updateNum>0){
                return CommonResult.success(null,"编码店铺信息成功");
            }
            String shopWindowSeat = posShopInfoVO.getShopWindowSeat();
            List<TSportShopWindowseat> shopWindowseatList = JSONUtil.toList(JSONUtil.parseArray(shopWindowSeat), TSportShopWindowseat.class);

            TSportShopWindowseatExample example=new TSportShopWindowseatExample();
            TSportShopWindowseatExample.Criteria criteria = example.createCriteria();
            criteria.andShopIdEqualTo(shopId);
            int d = sportShopWindowseatMapper.deleteByExample(example);
            if(d>0){
                for (int i = 0; i <shopWindowseatList.size()  ; i++) {
                    TSportShopWindowseat shopWindowseat = shopWindowseatList.get(i);
                    shopWindowseat.setShopId(shopId);
                    shopWindowseat.setCreateDate(DateUtil.getDate());
                    String id=String.valueOf(UUID.randomUUID()).replaceAll("-","");
                    shopWindowseat.setWindowseatId(id);
                    sportShopWindowseatMapper.insertSelective(shopWindowseat);
                }
            }
            return CommonResult.failed("编码店铺信息失败");
        }catch (Exception e){
            LOGGER.error("编辑店铺信息失败");
            e.printStackTrace();
            return CommonResult.failed("编辑店铺信息失败");
        }
    }


    public CommonResult getShopDetailByShopId(String shopId){
        if(StringUtils.isEmpty(shopId)){
            LOGGER.error("店铺id不能是空");
            return CommonResult.failed("店铺id不能是空");
        }
        try {
            //返回实体
            TPosShopInfoDTO posShopInfoDTO=new TPosShopInfoDTO();

            TPosShopInfo posShopInfo = posShopInfoMapper.selectByPrimaryKey(shopId);
            if(posShopInfo==null){
                LOGGER.error("店铺信息已失效 shopId="+shopId);
                return CommonResult.failed("店铺信息已失效");
            }


            byte[] shopDetail = posShopInfo.getShopDetail();
            if(shopDetail !=null){
                posShopInfoDTO.setShopDetailStr(new String(shopDetail,"GBK"));
            }

            //教练id 查询教练信息
            String coachIdStr = posShopInfo.getCoachId();
            if(!StringUtils.isEmpty(coachIdStr)){
                List<TSportCoachTeam> coachTeamList=new ArrayList<>();

                String[] coachIdArr = coachIdStr.split(",");
                for (String coachId:coachIdArr){
                    TSportCoachTeam sportCoachTeam = coachTeamMapper.selectByPrimaryKey(coachId);
                    coachTeamList.add(sportCoachTeam);
                }
                posShopInfoDTO.setCoachTeamList(coachTeamList);
            }

            posShopInfoDTO.setShopId(posShopInfo.getShopId());

            return CommonResult.success(posShopInfoDTO,"查询雪场详情信息成功");
        }catch (Exception e){
            LOGGER.error("查询雪场详情失败 shopId="+shopId);
            e.printStackTrace();
            return CommonResult.failed("查询雪场详情失败");
        }
    }

    /**
     * 修改雪场详情
     * @param posShopDetailInfo
     * @return
     */
    public CommonResult updateShopDetail(TPosShopDetailInfo posShopDetailInfo){
        String shopId = posShopDetailInfo.getShopId();
        try {
            TPosShopInfo posShopInfo = posShopInfoMapper.selectByPrimaryKey(shopId);
            if(posShopInfo==null){
                LOGGER.error("店铺信息不存在 posShopDetailInfo="+posShopDetailInfo.toString());
                return CommonResult.failed("店铺信息不存在，无法修改");
            }

            String shopDetail = posShopDetailInfo.getShopDetail();
            String coachId = posShopDetailInfo.getCoachId();//教练id
            posShopInfo.setShopDetail(shopDetail.getBytes("GBK"));
            posShopInfo.setShopId(shopId);
            
            if(StringUtils.isEmpty(coachId)){
                posShopInfo.setCoachId(coachId);
            }

            int updateNum = posShopInfoMapper.updateByPrimaryKeySelective(posShopInfo);
            if(updateNum>0){
                return CommonResult.success(null,"编辑详情信息成功");
            }
            return CommonResult.failed("编辑详情信息失败");

        }catch (Exception e){
            LOGGER.error("编辑详情信息失败");
            e.printStackTrace();
            return CommonResult.failed("编辑详情信息失败");
        }
    };



    /**
     * 查询店铺商品分类列表
     * @return
     */
    public  CommonResult selectShopCommodityTypeAllList(String posShopId){
        TPosShopType posShopType=new TPosShopType();
        posShopType.setPosShopId(posShopId);
        posShopType.setState("00");
        posShopType.setCommodityTypePid("0");
        List<TPosShopType> posShopTypeList = shopCommodityTypeList(posShopType);
        return CommonResult.success(posShopTypeList,"查询成功");
    }

    public List<TPosShopType>  shopCommodityTypeList(TPosShopType posShopType) {
        List<TPosShopType> posShopTypeList = posShopTypeMapper.posShopTypeByPidList(posShopType);
        if(posShopTypeList!=null&&posShopTypeList.size()>0){
            for (int i = 0; i <posShopTypeList.size() ; i++) {
                String commodityTypeId = posShopTypeList.get(i).getCommodityTypeId();
                posShopType.setCommodityTypePid(commodityTypeId);
                posShopTypeList.get(i).setPosShopTypeList(shopCommodityTypeList(posShopType));
            }
        }
        return posShopTypeList;
    }


    /**
     * 增加或者修改商品分类
     */
    public CommonResult saveOrUploadShopCommodityType(TPosShopType posShopType){
        if(posShopType==null){
            return CommonResult.failed("店铺商品分类不能为是null");
        }
        if(StringUtils.isEmpty(posShopType.getCommodityTypeName())){
            return CommonResult.failed("商品分类名字不能是null");
        }
        if(StringUtils.isEmpty(posShopType.getPosShopId())){
            return CommonResult.failed("商户店铺id不能是null");
        }

        try {
            posShopType.setUpdatedTime(DateUtil.getDate(new Date()));

            if(StringUtils.isEmpty(posShopType.getCommodityTypeId())){  //增加商品分类
                String commodityTypePId = posShopType.getCommodityTypePid();
                String commodityTypeId="";

                if(StringUtils.isEmpty(commodityTypePId)){ //没有父级id
                    posShopType.setCommodityTypePid("0");
                    commodityTypeId = posShopTypeMapper.nextShopCommodityTypeId("0");
                    commodityTypeId="1".equals(commodityTypeId)?"001":commodityTypeId;
                }else{
                    commodityTypeId = posShopTypeMapper.nextShopCommodityTypeId(commodityTypePId);
                    commodityTypeId ="1".equals(commodityTypeId)?commodityTypePId+"001":commodityTypeId;
                }
                if(commodityTypeId.length() == 1){
                    commodityTypeId="00"+commodityTypeId;
                }
                if(commodityTypeId.length() == 2){
                    commodityTypeId="0"+commodityTypeId;
                }
                posShopType.setState("00");
                posShopType.setCommodityTypeId(commodityTypeId);
                posShopType.setCreatedTime(DateUtil.getDate(new Date()));

                int saveNum = posShopTypeMapper.insertSelective(posShopType);
                if(saveNum>0){
                    return CommonResult.success(null,"保存成功");
                }
                return CommonResult.failed("保存失败");
            }

            TPosShopType getTPosShopTypeInfo = posShopTypeMapper.selectByPrimaryKey(posShopType.getCommodityTypeId());

            getTPosShopTypeInfo.setCommodityTypeName(posShopType.getCommodityTypeName());
            getTPosShopTypeInfo.setUpdatedTime(DateUtil.getDate());

            TPosShopTypeExample example=new TPosShopTypeExample();
            TPosShopTypeExample.Criteria criteria = example.createCriteria();
            criteria.andCommodityTypeIdEqualTo(posShopType.getCommodityTypeId());

            int updateNum = posShopTypeMapper.updateByExampleSelective(getTPosShopTypeInfo,example);
            if(updateNum>0){
                return CommonResult.success(null,"修改成功");
            }
            return CommonResult.failed("修改失败");
        }catch (Exception e){
            LOGGER.info("增加或者修改失败");
            e.printStackTrace();
        }

        return CommonResult.failed("保存失败");
    }




    /**
     * 根据商品类型id修改类型上架下架
     * @param 
     * @return
     */
    public CommonResult updatePosShopTypeStatus(String  commodityTypeId,String commodityTypeStatus){

        if(StringUtils.isEmpty(commodityTypeId)){
            return CommonResult.failed("店铺分类id不能为空");
        }
        if(StringUtils.isEmpty(commodityTypeStatus)){
            return CommonResult.failed("店铺分类状态不能为空");
        }
        TPosShopType posShopType=posShopTypeMapper.selectByPrimaryKey(commodityTypeId);
        if(posShopType == null){
            return CommonResult.failed("店铺分类已经失效 commodityTypeId="+commodityTypeId);
        }

        TPosShopTypeExample example=new TPosShopTypeExample();
        TPosShopTypeExample.Criteria criteria = example.createCriteria();
        criteria.andCommodityTypeIdEqualTo(commodityTypeId);

        try {
            if("01".equals(commodityTypeStatus)){ //下架
                posShopType.setState("01");
                posShopType.setUpdatedTime(DateUtil.getDate(new Date()));
                int updateNum = posShopTypeMapper.updateByExampleSelective(posShopType,example);
                if(updateNum>0){

                    TPosShopType newShopType=new TPosShopType();
                    newShopType.setPosShopId(posShopType.getPosShopId());
                    newShopType.setCommodityTypePid(posShopType.getCommodityTypeId());

                    uploadCommodityStatus(newShopType);
                }
            }else if("00".equals(commodityTypeStatus)){  //上架
                String commodityPId = posShopType.getCommodityTypePid();
                TPosShopType posShopTypeInfo = posShopTypeMapper.selectByPrimaryKey(commodityPId);
                if(posShopTypeInfo!=null && "01".equals(posShopTypeInfo.getState())){
                    return CommonResult.failed("商品父级分类已经下架！请先上架父级分类");
                }

                posShopType.setState("00");
                posShopType.setUpdatedTime(DateUtil.getDate(new Date()));
                int updateNum = posShopTypeMapper.updateByExampleSelective(posShopType,example);
                if(updateNum>0){
                    return CommonResult.success("修改店铺商品状态成功");
                }
                return CommonResult.success("修改店铺商品状态失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.info("修改店铺商品类型失败 posShopType="+posShopType.toString());
        }

        return  null;
    }


    public void  uploadCommodityStatus(TPosShopType posShopType) throws  Exception {
        try {
            TPosShopTypeExample example=new TPosShopTypeExample();
            TPosShopTypeExample.Criteria criteria = example.createCriteria();

            List<TPosShopType> posShopTypeList = posShopTypeMapper.posShopTypeByPidList(posShopType);
            if (posShopTypeList != null && posShopTypeList.size() > 0) {
                for (int i = 0; i < posShopTypeList.size(); i++) {
                    TPosShopType posShopType1 = posShopTypeList.get(i);
                    posShopType1.setUpdatedTime(DateUtil.getDate(new Date()));
                    //将类型下架
                    posShopType1.setState("01");

                    criteria.andCommodityTypeIdEqualTo(posShopType1.getCommodityTypeId());
                    int updateNum = posShopTypeMapper.updateByExampleSelective(posShopType1,example);

                    TPosShopType newShopType=new TPosShopType();
                    newShopType.setPosShopId(posShopType1.getPosShopId());
                    newShopType.setCommodityTypePid(posShopType1.getCommodityTypeId());
                    //递归调用
                    uploadCommodityStatus(newShopType);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    /**
     * 根据分类名称判断是否已经存在
     * @param shopTypeName
     * @return
     */
    public CommonResult  existShopCommodityTypeByName(String shopTypeName)  {
        if(StringUtils.isEmpty(shopTypeName)){
            return CommonResult.failed("商品分类名称不能为空");
        }
        List<TPosShopType> sportCommodityList = posShopTypeMapper.posShopTypeListByName(shopTypeName);
        if(sportCommodityList != null && sportCommodityList.size()>0){
            return CommonResult.success("01"); //证明已经存在
        }else{
            return CommonResult.success("00"); //证明不存在
        }

    }

}
