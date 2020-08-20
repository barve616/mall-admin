package com.macro.mall.base.dao;

import com.macro.mall.common.base.CodeParam;
import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsResource;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 后台用户角色自定义Dao
 * Created by macro on 2020/2/2.
 */
public interface UmsMValueDao {

    @Select("select PARAM_TYPE as paramType ,PARAM_VALUE as paramValue from d_tcodeposs_para")
    List<CodeParam> getAll();
}
