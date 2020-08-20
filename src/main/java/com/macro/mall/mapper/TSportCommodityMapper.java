package com.macro.mall.mapper;

import com.macro.mall.communicate.resourcecenter.bean.TSportCommodityVO;
import com.macro.mall.discount.model.CommodityCountByTypeVO;
import com.macro.mall.model.TPosShopType;
import com.macro.mall.model.TSportCommodity;
import com.macro.mall.model.TSportCommodityExample;
import java.util.List;

import com.macro.mall.model.TSportCommodityType;
import org.apache.ibatis.annotations.Param;

public interface TSportCommodityMapper {
    long countByExample(TSportCommodityExample example);

    int deleteByExample(TSportCommodityExample example);

    int deleteByPrimaryKey(String commodityId);

    int insert(TSportCommodity record);

    int insertSelective(TSportCommodity record);

    List<TSportCommodity> selectByExample(TSportCommodityExample example);

    TSportCommodity selectByPrimaryKey(@Param("commodityId") String commodityId);

    int updateByExampleSelective(@Param("record") TSportCommodity record, @Param("example") TSportCommodityExample example);

    int updateByExample(@Param("record") TSportCommodity record, @Param("example") TSportCommodityExample example);

    int updateByPrimaryKeySelective(TSportCommodity record);

    int updateByPrimaryKey(TSportCommodity record);
    /*根据商品类型id修改商品状态*/
    int updateCommodityByTypeId(@Param("commodityTypeId") String commodityTypeId,
                                @Param("examineStatus") String examineStatus);


    /**
     * 查询商品列表
     * @param sportCommodityVO
     * @return
     */
    List<TSportCommodity> selectSportCommodityList(TSportCommodityVO sportCommodityVO);

    /**
     * 获取某个店铺商品分类祖级
     * @param CommodityTypeId
     * @return
     */
    List<TSportCommodityType> getShopCommodityType(String CommodityTypeId);


    //根据商品id修改渠道或者店铺商品类型
    int updateCommodityTypeAndChannelById(TSportCommodity record);
    //查询该活动下的所有商品
    List<TSportCommodity> selectCommodityByActivityId(@Param("activityTypeId") String activityTypeId,
                                                      @Param("activityId") String activityId,
                                                      @Param("searchInfo") String searchInfo,
                                                      @Param("commodityTypeId") String commodityTypeId
    );
    //查询没参与该活动的商品
    List<TSportCommodity> selectNoActivityCommodity(@Param("activityTypeId") String activityTypeId,
                                                    @Param("activityId") String activityId,
                                                    @Param("searchInfo") String searchInfo,
                                                    @Param("commodityTypeId") String commodityTypeId
    );
    //<!--查询没参与某类型活动的某个商品类型的商品数量-->
    List<CommodityCountByTypeVO> selectNoActivityCommodityType(@Param("activityTypeId") String activityTypeId,
                                                               @Param("activityId") String activityId,
                                                               @Param("searchInfo") String searchInfo,
                                                               @Param("commodityTypeId") String commodityTypeId
    );
    //查询秒杀活动某时间段下的所有商品
    List<TSportCommodity> selectCommodityByTimeSlotId(@Param("activityTypeId") String activityTypeId,
                                                      @Param("activityId") String activityId,
                                                      @Param("searchInfo") String searchInfo,
                                                      @Param("commodityTypeId") String commodityTypeId,
                                                      @Param("timeSlotId") String timeSlotId);
    //查询某时间段下没参与秒杀的商品
    List<TSportCommodity> selectNoTimeSlotCommodity(@Param("startTime")String startTime,
                                                      @Param("endTime")String endTime);
}