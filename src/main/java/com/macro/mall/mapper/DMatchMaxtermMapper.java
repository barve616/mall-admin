package com.macro.mall.mapper;

import com.macro.mall.model.DMatchMaxterm;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface DMatchMaxtermMapper {

    int insert(DMatchMaxterm dMatchMaxterm);

    int update(DMatchMaxterm dMatchMaxterm);

    List<DMatchMaxterm> queryList (DMatchMaxterm dMatchMaxterm);
    DMatchMaxterm queryList1 (DMatchMaxterm dMatchMaxterm);


    int delete(@Param("matchMaxId") String matchMaxId);
}