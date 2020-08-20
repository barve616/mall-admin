package com.macro.mall.mapper;

import com.macro.mall.model.DMatchParam1Info;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DMatchParam1InfoMapper {
    int insert(DMatchParam1Info record);

    int update(DMatchParam1Info record);

    List<DMatchParam1Info> queryList (DMatchParam1Info dMatchMaxtype);
    DMatchParam1Info queryList1 (DMatchParam1Info dMatchMaxtype);


    int delete(@Param("id") String id);
}