package com.macro.mall.mapper;

import com.macro.mall.communicate.resourcecenter.bean.AroundPosDTO;
import com.macro.mall.communicate.resourcecenter.bean.AroundPosListVO;
import com.macro.mall.model.TSportAroundPos;
import com.macro.mall.model.TSportAroundPosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSportAroundPosMapper {
    long countByExample(TSportAroundPosExample example);

    int deleteByExample(TSportAroundPosExample example);

    int insert(TSportAroundPos record);

    int insertSelective(TSportAroundPos record);

    List<TSportAroundPos> selectByExample(TSportAroundPosExample example);

    int updateByExampleSelective(@Param("record") TSportAroundPos record, @Param("example") TSportAroundPosExample example);

    int updateByExample(@Param("record") TSportAroundPos record, @Param("example") TSportAroundPosExample example);

    /**
     * 查询周边推荐商户列表
     * @return
     */
    List<AroundPosDTO> getAroundPosList();


    /**
     * 根据商户id查蓄奴周边商户详情信息
     * @param aroundPosId
     * @return
     */
    TSportAroundPos getAroundPosDetail(String aroundPosId);


    /**
     * 根据店铺id查询周边推荐的商户
     * @param shopId
     * @return
     */
    List<TSportAroundPos> getRecommendAroundPosList(String shopId);


    /**
     * 根据店铺id查询周边推荐的商户
     * @param aroundPosListVO
     * @return
     */
    List<TSportAroundPos> getNoRecommendAroundPosList(AroundPosListVO aroundPosListVO);


    /**
     * 根据店铺id查询周边推荐的商户
     * @param aroundPosListVO
     * @return
     */
    List<TSportAroundPos> getAroundPosAllList(AroundPosListVO aroundPosListVO);
}