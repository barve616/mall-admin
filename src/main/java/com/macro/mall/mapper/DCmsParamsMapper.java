package com.macro.mall.mapper;

import com.macro.mall.model.DCmsParams;
import org.apache.ibatis.annotations.Param;

public interface DCmsParamsMapper {

    DCmsParams selectParamsById(String id);

    DCmsParams selectParamsByIds(DCmsParams dCmsParam);

    int insert(DCmsParams dCmsParams);

    int updateByPrimaryKeySelective(DCmsParams dCmsParams);

    int delParamsById(@Param("id") String id);
}