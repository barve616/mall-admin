package com.macro.mall.discount.service;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.discount.model.*;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.util.MLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.UUID;

@Service
public class DiscountActivityService  {
    @Autowired
    public TSportDiscountActivityMapper tSportDiscountActivityMapper;
 /*   @Autowired
    public TSportCommodityMapper tSportCommodityMapper;*/
    @Autowired
    public TSportCommodityTypeMapper tSportCommodityTypeMapper;
    @Autowired
    public TSportCommodityActivityMapper tSportCommodityActivityMapper;
    @Autowired
    public TSportTimeSlotMapper tSportTimeSlotMapper;
    /*根据类型id查询所有活动*/
    public List <TSportDiscountActivity> queryByType(ActivitySearchVO activityListSearch){
        String type = activityListSearch.getTypeId();
        if (StringUtils.isEmpty(type)){
            MLog.error("活动类型不能为空");
        }
        TSportDiscountActivityExample  example=new TSportDiscountActivityExample();
        TSportDiscountActivityExample.Criteria criteria = example.createCriteria();
        criteria.andActivityIdEqualTo(type);
        List<TSportDiscountActivity> activities = tSportDiscountActivityMapper.selectByExample(example);
        return activities;
    }

    /*根据查询条件查询活动*/
    public List<TSportDiscountActivity> queryByCondition(ActivitySearchVO search) throws Exception {
        if (search.getTypeId()==null){
            MLog.error("活动类型不能为"+search.getTypeId());
        }
        List<TSportDiscountActivity> activities=null;
        try {
            activities = tSportDiscountActivityMapper.selectByCondition(search.getTypeId(),search.getSearchInfo(),search.getStarTime(),search.getEndTime(),search.getPlayType());
        }catch (Exception e){
            MLog.error("查询失败");
            e.printStackTrace();
        }
        if(activities==null){
            MLog.info("没有查到相关活动信息");
        }
        return activities;
    }

    /*创建优惠活动*/
    public CommonResult addActivity(TSportDiscountActivity activity) throws Exception{
        String activityId = activity.getActivityId();//活动id
        String activityTypeId = activity.getActivityTypeId();//活动类型
        String activityName = activity.getActivityName();//活动名称
        String activityStartTime = activity.getActivityStartTime();//开始时间
        String activityEndTime = activity.getActivityEndTime();//结束时间
        String playType = activity.getPlayType();//玩法类型
        String state = activity.getState();//活动状态
        String activityStatus = activity.getActivityStatus();//活动上下架状态
        String limitRule = activity.getLimitRule();//是否有限制规则
        if (StringUtils.isEmpty(activityId)){
            String s = UUID.randomUUID().toString().replace("-", "");
            activity.setActivityId(s);
        }
        if (StringUtils.isEmpty(activityTypeId)){
            MLog.error("活动类型为空");
            return CommonResult.failed("活动类型不能为空");
        }
        if (StringUtils.isEmpty(activityTypeId)){
            MLog.error("活动类型为空");
            return CommonResult.failed("活动类型不能为空");
        }
        if (StringUtils.isEmpty(activityName)){
            MLog.error("活动名称为空");
            return CommonResult.failed("活动名称不能为空");
        }
        if (StringUtils.isEmpty(activityStartTime)){
            MLog.error("活动开始时间为空");
            return CommonResult.failed("活动开始时间不能为空");
        }
        if (StringUtils.isEmpty(activityEndTime)){
            MLog.error("活动结束时间为空");
            return CommonResult.failed("活动结束时间不能为空");
        }
        if (StringUtils.isEmpty(playType)){
            MLog.error("活动玩法类型为空");
            return CommonResult.failed("活动玩法类型不能为空");
        }
        if (StringUtils.isEmpty(state)){
          activity.setState("02");
        }
        if (StringUtils.isEmpty(activityStatus)){
            activity.setActivityStatus("00");
        }
        if (StringUtils.isEmpty(limitRule)){
          activity.setLimitRule("02");
        }

        try{
            tSportDiscountActivityMapper.insert(activity);
            return CommonResult.success(activity,"创建活动成功");
        }catch (Exception e){
            MLog.error("创建活动失败");
            e.printStackTrace();
        }
        return null;
    }

    /*优惠活动上下架*/
    public CommonResult updateState(ActivityUpAndLowVO activityUpAndLow) throws Exception {
        List<String> activityIds = activityUpAndLow.getActivityId();
        String state = activityUpAndLow.getState();
        if (activityIds.size() < 1){
            MLog.error("活动id不能为空");
            return CommonResult.failed("活动id不能为空");
        }
       for (String activityId:activityIds){

           if (state==null&&state==""){
               MLog.error("状态码不能为空");
               return CommonResult.failed("状态码不能为空");
           }
           try{
               TSportDiscountActivityExample  example=new TSportDiscountActivityExample();
               TSportDiscountActivityExample.Criteria criteria = example.createCriteria();
               criteria.andActivityIdEqualTo(activityId);
               List<TSportDiscountActivity> activities = tSportDiscountActivityMapper.selectByExample(example);
               //TSportDiscountActivity activity = tSportDiscountActivityMapper.selectByPrimaryKey(activityUpAndLow.getActivityId());
               for (TSportDiscountActivity activity:activities){
                   if (activity==null){
                       MLog.error("未查到活动信息，活动id为"+activityUpAndLow.getActivityId());
                   }
                   activity.setActivityStatus(activityUpAndLow.getState());
                   tSportDiscountActivityMapper.updateByExampleSelective(activity,example);
               }

           }catch (Exception e){
               MLog.error("修改状态失败");
               e.printStackTrace();
           }
       }
        return CommonResult.success("操作成功");
    }

    /*编辑活动*/
    public CommonResult updateActivity(TSportDiscountActivity activity) throws Exception {
        String activityId = activity.getActivityId();//活动id
        String activityTypeId = activity.getActivityTypeId();//活动类型
        String activityName = activity.getActivityName();//活动名称
        String activityStartTime = activity.getActivityStartTime();//开始时间
        String activityEndTime = activity.getActivityEndTime();//结束时间
        String playType = activity.getPlayType();//玩法类型
        String state = activity.getState();//活动状态
        String activityStatus = activity.getActivityStatus();//活动上下架状态
        String limitRule = activity.getLimitRule();//是否有限制规则
        if (StringUtils.isEmpty(activityId)){
           MLog.error("活动为空");
           return CommonResult.failed("活动id不能为空");
        }
        if (StringUtils.isEmpty(activityTypeId)){
            MLog.error("活动类型为空");
            return CommonResult.failed("活动类型不能为空");
        }
        if (StringUtils.isEmpty(activityTypeId)){
            MLog.error("活动类型为空");
            return CommonResult.failed("活动类型不能为空");
        }
        if (StringUtils.isEmpty(activityName)){
            MLog.error("活动名称为空");
            return CommonResult.failed("活动名称不能为空");
        }
        if (StringUtils.isEmpty(activityStartTime)){
            MLog.error("活动开始时间为空");
            return CommonResult.failed("活动开始时间不能为空");
        }
        if (StringUtils.isEmpty(activityEndTime)){
            MLog.error("活动结束时间为空");
            return CommonResult.failed("活动结束时间不能为空");
        }
        if (StringUtils.isEmpty(playType)){
            MLog.error("活动玩法类型为空");
            return CommonResult.failed("活动玩法类型不能为空");
        }
        if (StringUtils.isEmpty(state)){
            MLog.error("活动状态为空");
            return CommonResult.failed("活动状态不能为空");
        }
        if (StringUtils.isEmpty(activityStatus)){
            MLog.error("活动上下架状态为空");
            return CommonResult.failed("活动上下架状态不能为空");
        }
        if (StringUtils.isEmpty(limitRule)){
            MLog.error("活动限制为空");
            return CommonResult.failed("活动限制不能为空");
        }
        try{
            TSportDiscountActivityExample  example=new TSportDiscountActivityExample();
            TSportDiscountActivityExample.Criteria criteria = example.createCriteria();
            criteria.andActivityIdEqualTo(activityId);
            tSportDiscountActivityMapper.updateByExample(activity,example);
            return CommonResult.success("编辑成功");
        }catch (Exception e){
            MLog.error("编辑失败");
            e.printStackTrace();
            throw e;
        }
    }

    /*添加秒杀活动时间段*/
    public CommonResult addTimeSlot(TSportTimeSlot tSportTimeSlot) throws Exception {
        if (tSportTimeSlot!=null){
            String timeSlotId = tSportTimeSlot.getTimeSlotId();
            String activityId = tSportTimeSlot.getActivityId();//获取活动id
            String cycle = tSportTimeSlot.getCycle();//获取周期时间
            String startTime = tSportTimeSlot.getStartTime();//开始时间
            String endtime = tSportTimeSlot.getEndTime();//结束时间
            String state = tSportTimeSlot.getState();//状态
            String cycleType = tSportTimeSlot.getCycleType();//获取周期类型
            if (StringUtils.isEmpty(timeSlotId)){
                String s = UUID.randomUUID().toString().replace("-", "");
                tSportTimeSlot.setTimeSlotId(s);
            }
            if (StringUtils.isEmpty(activityId)){
                MLog.error("活动id不能为空");
                return CommonResult.failed("活动id不能为空");
            }
            if (StringUtils.isEmpty(cycle)){
                MLog.error("周期时间不能为空");
                return CommonResult.failed("周期时间不能为空");
            }
            if (StringUtils.isEmpty(startTime)){
                MLog.error("开始时间不能为空");
                return CommonResult.failed("开始时间不能为空");
            }
            if (StringUtils.isEmpty(endtime)){
                MLog.error("结束时间不能为空");
                return CommonResult.failed("结束时间不能为空");
            }
            if (StringUtils.isEmpty(cycleType)){
                MLog.error("周期不能为空");
                return CommonResult.failed("周期不能为空");
            }
            if(StringUtils.isEmpty(state)){
                tSportTimeSlot.setState("00");
            }

            try {
                tSportTimeSlotMapper.insert(tSportTimeSlot);
                return CommonResult.success("添加成功");
            }catch (Exception e){
                MLog.error("添加失败");
                e.printStackTrace();
            }

        }
        return null;
    }

    /*查询某活动下的所有时间段*/
    public  CommonResult selectTimeSlotByActivityId(String activityId) throws Exception{
        List<TSportTimeSlot> tSportTimeSlots = null;
        if (StringUtils.isEmpty(activityId)){
            MLog.error("活动id为："+activityId);
        }
        try {
            tSportTimeSlots = tSportTimeSlotMapper.selectTimeSlotByActivityId(activityId);
        }catch (Exception e){
            MLog.error("查询失败");
            e.printStackTrace();
        }
        return CommonResult.success(tSportTimeSlots,"查询成功");
    }
    /*编辑时间信息*/
  public CommonResult updateTimeSlot(TSportTimeSlot tSportTimeSlot) throws Exception {
      if (tSportTimeSlot==null){
          String timeSlotId = tSportTimeSlot.getTimeSlotId();
          String activityId = tSportTimeSlot.getActivityId();
          if (StringUtils.isEmpty(activityId)){
              MLog.error("活动id不能为空");
              return CommonResult.failed("活动id不能为空");
          }
          if (StringUtils.isEmpty(timeSlotId)){
              MLog.error("时间段id不能为空");
              return CommonResult.failed("时间段id不能为空");
          }
          TSportTimeSlot timeSlot=null;
          try {
              timeSlot = tSportTimeSlotMapper.selectByPrimaryKey(timeSlotId);
          }catch (Exception e){
              MLog.error("查询失败");
              e.printStackTrace();
          }
          if (timeSlot==null){
              MLog.error("此时间段不存在，时间段id为："+timeSlotId);
          }
            tSportTimeSlotMapper.updateByPrimaryKey(tSportTimeSlot);
      }
      return CommonResult.success("编辑成功");
  }
}
