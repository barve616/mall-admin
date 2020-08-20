package com.macro.mall.discount.service;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.discount.model.CommoditySearchVO;
import com.macro.mall.discount.model.AddCommodityToActivityVO;
import com.macro.mall.discount.model.CommodityCountByTypeVO;
import com.macro.mall.mapper.*;
import com.macro.mall.model.TSportCommodity;
import com.macro.mall.model.TSportCommodityActivity;
import com.macro.mall.model.TSportCommodityPrice;
import com.macro.mall.model.TSportTimeSlot;
import com.macro.mall.util.MLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class CommodityBindService {
    @Autowired
    public TSportDiscountActivityMapper tSportDiscountActivityMapper;
    @Autowired
    public TSportCommodityMapper tSportCommodityMapper;
    @Autowired
    public TSportCommodityTypeMapper tSportCommodityTypeMapper;
    @Autowired
    public TSportCommodityActivityMapper tSportCommodityActivityMapper;
    @Autowired
    public TSportCommodityPriceMapper tSportCommodityPriceMapper;
//查询某活动下的所有商品
    public CommonResult selectActivityCommodity(CommoditySearchVO search) throws Exception {
        String activityTypeId = search.getActivityTypeId();
        String activityId = search.getActivityId();
        String searchInfo = search.getSearchInfo();
        String commodityTypeId = search.getCommodityTypeId();
        List<TSportCommodity> tSportCommodities=null;
        if (StringUtils.isEmpty(activityTypeId)){
            MLog.error("活动类型为空");
            return CommonResult.failed("活动类型为空");
        }
        if (StringUtils.isEmpty(activityId)){
            MLog.error("活动id为空");
            return CommonResult.failed("活动id为空");
        }
        try{
            tSportCommodities=tSportCommodityMapper.selectCommodityByActivityId(activityTypeId,activityId,searchInfo,commodityTypeId);
            //遍历添加商品实际价格
            for (TSportCommodity tSportCommodity:tSportCommodities){
                String commodityId = tSportCommodity.getCommodityId();
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String s = dateFormat.format(date);
                TSportCommodityPrice tSportCommodityPrice = tSportCommodityPriceMapper.selectPriceByCommodityId(commodityId, s);
                tSportCommodity.setPayPrice(tSportCommodityPrice.getParce().toString());
            }
        }catch (Exception e){
            MLog.error("查询商品失败，"+e.getMessage());
            e.printStackTrace();
        }
        return CommonResult.success(tSportCommodities);
    }
//查询没参与此活动的商品
    public CommonResult selectNoActivityCommodity(CommoditySearchVO search) throws Exception {
        String activityTypeId = search.getActivityTypeId();
        String activityId = search.getActivityId();
        String searchInfo = search.getSearchInfo();
        String commodityTypeId = search.getCommodityTypeId();
        String searchType = search.getSearchType();
        List<TSportCommodity> tSportCommodities=null;
        List<CommodityCountByTypeVO> countByTypes=null;
        if (StringUtils.isEmpty(searchType)){
            searchType="01";//默认查询商品
        }
        if (StringUtils.isEmpty(activityTypeId)){
            MLog.error("活动类型为空");
            return CommonResult.failed("活动类型为空");
        }
        if (StringUtils.isEmpty(activityId)){
            MLog.error("活动id为空");
            return CommonResult.failed("活动id为空");
        }
        try {
            if ("01".equals(searchType)){
                tSportCommodities=tSportCommodityMapper.selectNoActivityCommodity(activityTypeId,activityId,searchInfo,commodityTypeId);
                //遍历添加商品实际价格
                for (TSportCommodity tSportCommodity:tSportCommodities){
                    String commodityId = tSportCommodity.getCommodityId();
                    Date date = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String s = dateFormat.format(date);
                    TSportCommodityPrice tSportCommodityPrice = tSportCommodityPriceMapper.selectPriceByCommodityId(commodityId, s);

                    tSportCommodity.setPayPrice(tSportCommodityPrice.getParce().toString());

                }
                return CommonResult.success(tSportCommodities);
            }
            if ("02".equals(searchType)){
                countByTypes=tSportCommodityMapper.selectNoActivityCommodityType(activityTypeId,activityId,searchInfo,commodityTypeId);
                return CommonResult.success(countByTypes);
            }
        }catch (Exception e){
            MLog.error("查询商品失败，"+e.getMessage());
            e.printStackTrace();
        }
        return CommonResult.failed("查询失败");
    }
//添加商品

    public CommonResult addCommodity(AddCommodityToActivityVO commodityToActivity) throws Exception {
        String activityId = commodityToActivity.getActivityId();//获取活动id
        List<String> commodityIds = commodityToActivity.getCommodityIds();//获取商品id
        String timeSlotId = commodityToActivity.getTimeSlotId();//获取时间段id
        String activityTypeId = commodityToActivity.getActivityTypeId();//获取活动类型id
        List<String> commodityTypeIds = commodityToActivity.getCommodityTypeIds();//获取商品类型id
        TSportCommodityActivity tSportCommodityActivity=new TSportCommodityActivity();
        List<TSportCommodity> commodityList;

        if (commodityToActivity!=null){

            if (StringUtils.isEmpty(activityTypeId)){
                MLog.error("活动类型id为空");
                return CommonResult.failed("活动类型id为空");
            }
            if (StringUtils.isEmpty(activityId)){
                MLog.error("活动id为空");
                return CommonResult.failed("活动id为空");
            }
            if (StringUtils.isEmpty(timeSlotId)){
                MLog.error("活动时间段id为空");
                return CommonResult.failed("活动时间段id为空");
            }
            if (StringUtils.isEmpty(activityTypeId)){
                MLog.error("活动类型id为空");
                return CommonResult.failed("活动类型id为空");
            }
            }
        try {
            //判断类型不为空，按类型添加
            if (commodityTypeIds!=null){
                for (String commodityTypeId:commodityTypeIds){
                    commodityList = tSportCommodityMapper.selectNoActivityCommodity(activityTypeId, activityId, null, commodityTypeId);
                    for (TSportCommodity commodity:commodityList){
                        String stock = commodity.getCommodityStock().toString();
                        tSportCommodityActivity.setCommodityId(commodity.getCommodityId());
                        tSportCommodityActivity.setActivityStock(stock);
                        tSportCommodityActivity.setCommodityActivityState("00");
                        tSportCommodityActivity.setActivityId(activityId);
                        if (!StringUtils.isEmpty(timeSlotId)){
                            tSportCommodityActivity.setTimeSlotId(timeSlotId);
                        }
                        tSportCommodityActivityMapper.insert(tSportCommodityActivity);
                        return CommonResult.success("添加商品成功");
                    }
                }

            } else if (commodityIds.size()>0){
                for (String commodityId:commodityIds){
                    TSportCommodity tSportCommodity = tSportCommodityMapper.selectByPrimaryKey(commodityId);
                    String stock = tSportCommodity.getCommodityStock().toString();
                    tSportCommodityActivity.setCommodityId(commodityId);
                    tSportCommodityActivity.setActivityStock(stock);
                    tSportCommodityActivity.setCommodityActivityState("00");
                    tSportCommodityActivity.setActivityId(activityId);
                    //判断是秒杀活动
                    if ("02".equals(activityTypeId) || !StringUtils.isEmpty(timeSlotId)){
                        tSportCommodityActivity.setTimeSlotId(timeSlotId);
                    }
                    tSportCommodityActivityMapper.insert(tSportCommodityActivity);
                }
            }else {
                MLog.error("无商品信息");
                throw new Exception("无商品信息");
            }
        }catch (Exception e){
            e.printStackTrace();
            MLog.error("添加商品失败");
            throw new Exception("添加失败");
        }
        return CommonResult.success("添加商品成功");

    }

//添加商品按商品类型
    public CommonResult addCommodityByType(AddCommodityToActivityVO commodityToActivity) throws Exception {
        String activityTypeId = commodityToActivity.getActivityTypeId();//获取活动类型id
        String activityId = commodityToActivity.getActivityId();//获取活动id
        List<String> commodityTypeIds = commodityToActivity.getCommodityTypeIds();//获取商品类型
        String timeSlotId = commodityToActivity.getTimeSlotId();
        List<TSportCommodity> commodityList;
        TSportCommodityActivity tSportCommodityActivity=new TSportCommodityActivity();
        try {
            if (commodityTypeIds.size()>0){
                for (String commodityTypeId:commodityTypeIds){
                    commodityList = tSportCommodityMapper.selectNoActivityCommodity(activityTypeId, activityId, null, commodityTypeId);
                    for (TSportCommodity commodity:commodityList){
                        String stock = commodity.getCommodityStock().toString();
                        tSportCommodityActivity.setCommodityId(commodity.getCommodityId());
                        tSportCommodityActivity.setActivityStock(stock);
                        tSportCommodityActivity.setCommodityActivityState("00");
                        tSportCommodityActivity.setActivityId(activityId);
                        if (!StringUtils.isEmpty(timeSlotId)){
                            tSportCommodityActivity.setTimeSlotId(timeSlotId);
                        }
                        tSportCommodityActivityMapper.insert(tSportCommodityActivity);
                        return CommonResult.success("添加商品成功");
                    }
                }

            }
        }catch (Exception e){
            e.printStackTrace();
            MLog.error("添加商品失败");
        }
        return null;
    }

//查询秒杀活动某时间段的商品

    public  CommonResult selectCommodityByTimeSlotId(CommoditySearchVO commoditySearch)throws Exception{
        String activityTypeId = commoditySearch.getActivityTypeId();
        String activityId = commoditySearch.getActivityId();
        String searchInfo = commoditySearch.getSearchInfo();
        String searchType = commoditySearch.getSearchType();
        String timeSlotId = commoditySearch.getTimeSlotId();
        List<TSportCommodity> tSportCommodities=null;
        if (StringUtils.isEmpty(activityTypeId)){
            MLog.error("活动类型为空");
            return CommonResult.failed("活动类型为空");
        }
        if (StringUtils.isEmpty(activityId)){
            MLog.error("活动id为空");
            return CommonResult.failed("活动id为空");
        }
        if (StringUtils.isEmpty(commoditySearch.getTimeSlotId())){
            MLog.error("时间段为空");
            return CommonResult.failed("时间段为空");
        }

        try {
            tSportCommodities =  tSportCommodityMapper.selectCommodityByTimeSlotId(activityTypeId, activityId, searchInfo, searchType, timeSlotId);
            //遍历添加商品实际价格
            for (TSportCommodity tSportCommodity:tSportCommodities){
                String commodityId = tSportCommodity.getCommodityId();
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String s = dateFormat.format(date);
                TSportCommodityPrice tSportCommodityPrice = tSportCommodityPriceMapper.selectPriceByCommodityId(commodityId, s);
                tSportCommodity.setPayPrice(tSportCommodityPrice.getParce().toString());
            }
        }catch (Exception e) {
            MLog.error("查询失败");
            e.printStackTrace();
        }
        return CommonResult.success(tSportCommodities);
    }

    /*查询不在此时间段参与秒杀的商品*/
    public CommonResult selectNoTimeSlotCommodity(TSportTimeSlot timeSlot)throws Exception{
            List<TSportCommodity> tSportCommodities = null;
            String activityId = timeSlot.getActivityId();
            String timeSlotId = timeSlot.getTimeSlotId();
            String startTime = timeSlot.getStartTime();
            String endTime = timeSlot.getEndTime();
            if (StringUtils.isEmpty(activityId)){
                MLog.error("活动id为空");
               return CommonResult.failed("活动id为空");
            }
            if (StringUtils.isEmpty(timeSlotId)){
                MLog.error("时间段id为空");
                return CommonResult.failed("时间段id为空");
            }
            if (StringUtils.isEmpty(startTime)){
                MLog.error("开始时间为空");
                return CommonResult.failed("开始时间为空");
            }
            if (StringUtils.isEmpty(endTime)){
                MLog.error("结束时间为空");
                return CommonResult.failed("结束时间为空");
            }
            try {
                tSportCommodities = tSportCommodityMapper.selectNoTimeSlotCommodity(startTime, endTime);
                if (tSportCommodities.size()<0){
                    return CommonResult.failed("没有查询到相关商品");
                }
                //遍历添加商品实际价格
                for (TSportCommodity tSportCommodity:tSportCommodities){
                    String commodityId = tSportCommodity.getCommodityId();
                    Date date = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String s = dateFormat.format(date);
                    TSportCommodityPrice tSportCommodityPrice = tSportCommodityPriceMapper.selectPriceByCommodityId(commodityId, s);
                    tSportCommodity.setPayPrice(tSportCommodityPrice.getParce().toString());
                }
            }catch (Exception e){
                e.printStackTrace();
                MLog.error("查询商品失败");
            }
        return CommonResult.success(tSportCommodities);
    }
}
