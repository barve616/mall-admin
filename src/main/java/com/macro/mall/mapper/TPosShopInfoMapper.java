package com.macro.mall.mapper;

import com.macro.mall.communicate.resourcecenter.bean.TPosShopInfoDTO;
import com.macro.mall.model.TPosShopInfo;
import com.macro.mall.model.TPosShopInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPosShopInfoMapper {
    long countByExample(TPosShopInfoExample example);

    int deleteByExample(TPosShopInfoExample example);

    int deleteByPrimaryKey(String shopId);

    int insert(TPosShopInfo record);

    int insertSelective(TPosShopInfo record);

    List<TPosShopInfo> selectByExampleWithBLOBs(TPosShopInfoExample example);

    List<TPosShopInfo> selectByExample(TPosShopInfoExample example);

    TPosShopInfo selectByPrimaryKey(String shopId);

    int updateByExampleSelective(@Param("record") TPosShopInfo record, @Param("example") TPosShopInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TPosShopInfo record, @Param("example") TPosShopInfoExample example);

    int updateByExample(@Param("record") TPosShopInfo record, @Param("example") TPosShopInfoExample example);

    int updateByPrimaryKeySelective(TPosShopInfo record);

    int updateByPrimaryKeyWithBLOBs(TPosShopInfo record);

    int updateByPrimaryKey(TPosShopInfo record);


    /**
     * 根据商户id查询店铺信息
     * @param posId
     * @return
     */
    TPosShopInfoDTO selectPosShopInfoByPosId(String posId);


}