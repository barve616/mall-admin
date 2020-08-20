package com.macro.mall.mapper;

import com.macro.mall.model.DMatchMaxtype;

import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface DMatchMaxtypeMapper {


    int insert(DMatchMaxtype record);

    int update(DMatchMaxtype record);

    List<DMatchMaxtype> queryList (DMatchMaxtype dMatchMaxtype);
    DMatchMaxtype queryList1 (DMatchMaxtype dMatchMaxtype);

    int delete(@Param("matchMaxTypeId") String matchMaxTypeId);
}