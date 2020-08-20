package com.macro.mall.mapper;

import com.macro.mall.model.TPosShopInfo;
import com.macro.mall.model.TPosShopType;
import com.macro.mall.model.TPosShopTypeExample;
import java.util.List;

import com.macro.mall.model.TSportCommodityType;
import org.apache.ibatis.annotations.Param;

public interface TPosShopTypeMapper {
    long countByExample(TPosShopTypeExample example);

    int deleteByExample(TPosShopTypeExample example);

    int insert(TPosShopType record);

    int insertSelective(TPosShopType record);

    List<TPosShopType> selectByExample(TPosShopTypeExample example);

    int updateByExampleSelective(@Param("record") TPosShopType record, @Param("example") TPosShopTypeExample example);

    int updateByExample(@Param("record") TPosShopType record, @Param("example") TPosShopTypeExample example);

    //根据父级id商户id查询商户商品分类
    List<TPosShopType> posShopTypeByPidList(TPosShopType posShopType);

    /*根据店铺分类id查询店铺类型信息*/
    TPosShopType selectByPrimaryKey(String commodityTypeId);


    //根据父级id获取最大id
    String nextShopCommodityTypeId(@Param("commodityTypePid") String commodityTypePid);

    /**
     * 根据名称查询列表 不是like
     * @return
     */
    List<TPosShopType> posShopTypeListByName(String shopTypeName);

}