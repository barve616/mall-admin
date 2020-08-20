package com.macro.mall.communicate.resourcecenter.service;


import com.github.pagehelper.PageHelper;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.bean.CommodityTypeAndChannelVO;
import com.macro.mall.communicate.resourcecenter.bean.PosCommodityListVo;
import com.macro.mall.communicate.resourcecenter.bean.TSportCommodityVO;
import com.macro.mall.communicate.resourcecenter.bean.UpdateCommodityStatusVO;
import com.macro.mall.mapper.TPosShopTypeMapper;
import com.macro.mall.mapper.TSportCommodityMapper;
import com.macro.mall.model.DMatchTeamInfo;
import com.macro.mall.model.TPosShopType;
import com.macro.mall.model.TSportCommodity;
import com.macro.mall.model.TSportCommodityType;
import com.macro.mall.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Service
public class CommodityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommodityService.class);
    @Autowired
    private TSportCommodityMapper commodityMapper;



    //查询商品列表
    public List<TSportCommodity> sportCommodityList(TSportCommodityVO tSportCommodityVO) {
        PageHelper.startPage(tSportCommodityVO.getPageNum(),tSportCommodityVO.getPageSize());
        List<TSportCommodity> sportCommoditieList = commodityMapper.selectSportCommodityList(tSportCommodityVO);
        //获取店铺商品类型祖级
        for (TSportCommodity tSportCommodity : sportCommoditieList) {
            tSportCommodity.setCommodityTypeName(getShopCommodityType(tSportCommodity.getCommodityTypeId()));
        }
        return  sportCommoditieList;
    }

    /**
     * 获取店铺商品类型祖级
     * @param id
     * @return
     */
    private String getShopCommodityType(String id){
        List<TSportCommodityType> shopCommodityType = commodityMapper.getShopCommodityType(id);
        StringBuilder commodityTypeName = new StringBuilder();
        for (TSportCommodityType tPosShopType : shopCommodityType) {
            if(tPosShopType.getCommodityTypeName() != null){
                commodityTypeName.append(tPosShopType.getCommodityTypeName()).append(">");
            }
        }
        if(commodityTypeName.length() > 0){
            commodityTypeName.deleteCharAt(commodityTypeName.length() - 1);
        }
        return commodityTypeName.toString();
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        TPosShopType tPosShopType = new TPosShopType();
        stringBuilder.append(tPosShopType.getCommodityTypeId());
    }

    //修改状态
    public CommonResult updateCommodityStatus(UpdateCommodityStatusVO commodityStatusVO) {
        String commodityIdArr = commodityStatusVO.getCommodityIdArr();
        String examineStatus = commodityStatusVO.getExamineStatus();
        String examineFailureReason = commodityStatusVO.getExamineFailureReason();

        if (StringUtils.isEmpty(commodityStatusVO.getCommodityIdArr())) {
            return CommonResult.failed("商品id不能为空");
        }
        if(StringUtils.isEmpty(commodityStatusVO.getExamineStatus())){
            return CommonResult.failed("审核状态不能为空");
        }
        if("02".equals(examineStatus) && StringUtils.isEmpty(examineFailureReason)){
            return CommonResult.failed("违规内容不能是空");
        }
        try {
            List<String> strList = Arrays.asList(commodityIdArr.split(","));
            for (int i=0;i<strList.size();i++){
                TSportCommodity sportCommodity=new TSportCommodity();
                String str = strList.get(i);
                sportCommodity.setCommodityId(str);
                sportCommodity.setExamineStatus(examineStatus);
                if("02".equals(examineStatus)){
                    sportCommodity.setExamineFailureReason(examineFailureReason);
                }
                sportCommodity.setExamineTime(DateUtil.getDate());
                commodityMapper.updateByPrimaryKeySelective(sportCommodity);
            }
            return CommonResult.success(null,"修改状态成功");
        }catch (Exception e){
            LOGGER.info("修改状态失败");
            e.printStackTrace();
        }
        return CommonResult.failed("修改状态失败");
    }


    /**
     * 获取违规信息
     * @param commodityId
     * @return
     */
    public CommonResult getIllegalContent(String commodityId) {
        if (StringUtils.isEmpty(commodityId)) {
            return CommonResult.failed("商品id不能为空");
        }
        TSportCommodity sportCommodity = commodityMapper.selectByPrimaryKey(commodityId);
        if(sportCommodity==null){
            return CommonResult.failed("查找不到商品信息");
        }
        if("00".equals(sportCommodity.getExamineStatus())){
            return CommonResult.failed("当前商品状态是上架状态");
        }
        String examineFailureReason = sportCommodity.getExamineFailureReason();

        return CommonResult.success(examineFailureReason,"查询成功");
    }

    /**‘
     * 修改店铺商品分类和渠道信息
     * @return
     */
    public CommonResult updateCommodityTypeAndChannelById(CommodityTypeAndChannelVO commodityTypeAndChannelVO){
        String commodityId=commodityTypeAndChannelVO.getCommodityId();
        String channel=commodityTypeAndChannelVO.getChannel();
        String shopCommodityType=commodityTypeAndChannelVO.getShopCommodityType();
        if (StringUtils.isEmpty(commodityId)) {
            return CommonResult.failed("商品id不能为空");
        }
        if(StringUtils.isEmpty(channel) && StringUtils.isEmpty(shopCommodityType)){
            return CommonResult.failed("修改的信息不能是空");
        }
        TSportCommodity sportCommodity=new TSportCommodity();
        sportCommodity.setChannel(channel);
        sportCommodity.setShopCommodityType(shopCommodityType);
        sportCommodity.setCommodityId(commodityId);
        sportCommodity.setUpdateTime(DateUtil.getDate(new Date()));
        try {
            int updateNum = commodityMapper.updateCommodityTypeAndChannelById(sportCommodity);
            if(updateNum>0){
                return CommonResult.success("修改成功");
            }
            return CommonResult.failed("修改店铺商品分类和渠道信息失败");
        }catch (Exception e){
            LOGGER.error("修改店铺商品分类和渠道信息 CommodityTypeAndChannelVO="+commodityTypeAndChannelVO.toString());
            e.printStackTrace();
            return CommonResult.failed("修改店铺商品分类和渠道信息失败");
        }

    };

    /**
     * 获取详情信息
     * @param commodityId
     * @return
     */
    public CommonResult getCommodityDetail(String commodityId) {
        if (StringUtils.isEmpty(commodityId)) {
            return CommonResult.failed("商品id不能为空");
        }
        TSportCommodity sportCommodity = commodityMapper.selectByPrimaryKey(commodityId);
        if(sportCommodity==null){
            return CommonResult.failed("查找不到商品信息");
        }
        return CommonResult.success(sportCommodity,"查询成功");
    }

}
