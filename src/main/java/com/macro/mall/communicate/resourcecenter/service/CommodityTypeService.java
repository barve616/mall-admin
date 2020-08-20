package com.macro.mall.communicate.resourcecenter.service;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.mapper.TSportCommodityMapper;
import com.macro.mall.mapper.TSportCommodityTypeMapper;
import com.macro.mall.model.TSportCommodityType;
import com.macro.mall.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CommodityTypeService {

    @Autowired
    private TSportCommodityTypeMapper sportCommodityTypeMapper;

    @Autowired
    private TSportCommodityMapper commodityMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(CommodityTypeService.class);

    /**
     * 查询商品分类列表
     * @return
     */
    public  List<TSportCommodityType> selectCommodityTypeAllList(){
        List<TSportCommodityType> commodityTypeList = commodityTypeList("0","");
        return commodityTypeList;
    }

    /**
     * 查询商品分类前两级
     * @return
     */
    public  List<TSportCommodityType> selectCommodityTypeFisetTwoLevelList(){
        List<TSportCommodityType> commodityTypeList = commodityTypeList("0","1");
        return commodityTypeList;
    }

    public List<TSportCommodityType>  commodityTypeList(String commodityPId,String levelNum) {
        List<TSportCommodityType> sportCommodityTypeList = sportCommodityTypeMapper.commodityTypeByPidList(commodityPId);
        if(sportCommodityTypeList!=null&&sportCommodityTypeList.size()>0){
            for (int i = 0; i <sportCommodityTypeList.size() ; i++) {
                TSportCommodityType tSportCommodityType = sportCommodityTypeList.get(i);
                String stratum = tSportCommodityType.getStratum();
                if(!StringUtils.isEmpty(levelNum) && stratum.equals(levelNum)){
                    sportCommodityTypeList.get(i).setCommodityTypeList(new ArrayList<TSportCommodityType>());
                    continue;
                }
                String commodityTypeId = tSportCommodityType.getCommodityTypeId();
                sportCommodityTypeList.get(i).setCommodityTypeList(commodityTypeList(commodityTypeId,levelNum));
            }
        }
        return sportCommodityTypeList;
    }


    /**
     * 增加商品分类
     */
    public CommonResult saveOrUploadCommodityType(TSportCommodityType commodityType){
        if(commodityType==null){
            return CommonResult.failed("商品分类不能为是null");
        }
        String commodityTypeName = commodityType.getCommodityTypeName();
        if(StringUtils.isEmpty(commodityType.getCommodityTypeName())){
            return CommonResult.failed("商品分类名字不能是null");
        }

        try {
            List<TSportCommodityType> tSportCommodityTypes = sportCommodityTypeMapper.commodityTypeByName(commodityTypeName);
            if(tSportCommodityTypes == null && tSportCommodityTypes.size()>0){
                return CommonResult.failed("商品分类名字已经存在，不能增加");
            }

            commodityType.setUpdateTime(DateUtil.getDate(new Date()));

            if(StringUtils.isEmpty(commodityType.getCommodityTypeId())){  //增加商品分类
                if(StringUtils.isEmpty(commodityType.getStratum())){
                    return CommonResult.failed("商品分类层级不能是null");
                };
                String commodityPId = commodityType.getCommodityPId();
                String commodityTypeId="";
                
                if(StringUtils.isEmpty(commodityPId)){ //没有父级id
                    commodityType.setCommodityPId("0");
                    commodityTypeId = sportCommodityTypeMapper.nextCommodityTypeId("0");
                    commodityTypeId="1".equals(commodityTypeId)?"0000001":commodityTypeId;
                }else{
                    commodityTypeId = sportCommodityTypeMapper.nextCommodityTypeId(commodityPId);
                    commodityTypeId ="1".equals(commodityTypeId)?commodityPId+"001":commodityTypeId;
                }
                
                commodityType.setCommodityTypeId(commodityTypeId);
                commodityType.setCommodityTypeStatus("00");
                commodityType.setCreateTime(DateUtil.getDate(new Date()));

                int saveNum = sportCommodityTypeMapper.insertSelective(commodityType);
                if(saveNum>0){
                    return CommonResult.success(null,"保存成功");
                }
                return CommonResult.failed("保存失败");

            }


            int updateNum = sportCommodityTypeMapper.updateByPrimaryKeySelective(commodityType);
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
     * @param commodityType
     * @return
     */
    public CommonResult updateStatus(TSportCommodityType commodityType){
        String commodityTypeId = commodityType.getCommodityTypeId();
        String commodityTypeStatus = commodityType.getCommodityTypeStatus();
        
        if(StringUtils.isEmpty(commodityTypeId)){
            return CommonResult.failed("商品分类id不能为空");
        }
        if(StringUtils.isEmpty(commodityTypeStatus)){
            return CommonResult.failed("商品状态不能为空");
        }

        try {
             if("01".equals(commodityTypeStatus)){ //下架
                 commodityType.setCommodityTypeStatus("01");
                 commodityType.setUpdateTime(DateUtil.getDate(new Date()));
                 int updateNum = sportCommodityTypeMapper.updateByPrimaryKeySelective(commodityType);
                 if(updateNum>0){
                     uploadCommodityStatus(commodityTypeId);
                 }
             }else if("00".equals(commodityTypeStatus)){  //上架
                 String commodityPId = commodityType.getCommodityPId();
                 TSportCommodityType sportCommodityType = sportCommodityTypeMapper.selectByPrimaryKey(commodityPId);
                 if(sportCommodityType!=null && "01".equals(sportCommodityType.getCommodityTypeStatus())){
                       return CommonResult.failed("商品父级分类不能下架！");
                 }

                 commodityType.setCommodityTypeStatus("00");
                 commodityType.setUpdateTime(DateUtil.getDate(new Date()));
                 int updateNum = sportCommodityTypeMapper.updateByPrimaryKeySelective(commodityType);
                 if(updateNum>0){
                     return CommonResult.success("修改商品分类状态成功");
                 }
                 return CommonResult.success("修改商品状态失败");
             }
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.info("修改商品类型失败 commodityType="+commodityType.toString());
        }

        return  null;
    }

    public void  uploadCommodityStatus(String commodityPId) throws  Exception {
        try {
            List<TSportCommodityType> sportCommodityTypeList = sportCommodityTypeMapper.commodityTypeByPidList(commodityPId);
            if (sportCommodityTypeList != null && sportCommodityTypeList.size() > 0) {
                for (int i = 0; i < sportCommodityTypeList.size(); i++) {
                    TSportCommodityType sportCommodityType = sportCommodityTypeList.get(i);
                    sportCommodityType.setUpdateTime(DateUtil.getDate(new Date()));
                    //将类型下架
                    sportCommodityType.setCommodityTypeStatus("01");
                    int updateNum = sportCommodityTypeMapper.updateByPrimaryKeySelective(sportCommodityType);
                   /* if(updateNum>0){
                        //修改商品审核状态 下架
                        commodityMapper.updateCommodityByTypeId(sportCommodityType.getCommodityTypeId(),"01");
                    }*/
                    //递归调用
                    uploadCommodityStatus(sportCommodityType.getCommodityTypeId());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * 根据分类名称判断是否已经存在
     * @param typeName
     * @return
     */
    public CommonResult  existCommodityTypeByName(String typeName)  {
        if(StringUtils.isEmpty(typeName)){
            return CommonResult.failed("商品分类名称不能为空");
        }
        List<TSportCommodityType> sportCommodityList = sportCommodityTypeMapper.commodityTypeByName(typeName);
        if(sportCommodityList != null && sportCommodityList.size()>0){
            return CommonResult.success("01"); //证明已经存在
        }else{
            return CommonResult.success("00"); //证明不存在
        }

    }

}
