package com.macro.mall.mapper;

import com.macro.mall.model.DMatchInfo;
import com.macro.mall.model.DMatchTypeDetailInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DMatchTypeDetailInfoMapper {


    List<DMatchTypeDetailInfo> queryMatchDetailType (DMatchTypeDetailInfo dMatchTypeDetailInfo);
    List<DMatchTypeDetailInfo> queryMatchDetailType2 (DMatchTypeDetailInfo dMatchTypeDetailInfo);

    DMatchTypeDetailInfo queryMatchDetailTypeInfo (@Param("matchTitle")String matchTitle );


    DMatchTypeDetailInfo queryMatchDetailType1 (DMatchTypeDetailInfo dMatchTypeDetailInfo);


    int insertMatchDetailType(DMatchTypeDetailInfo dMatchTypeDetailInfo);

    int deleteMatchDetailType(@Param("matchTypeDetailId") String matchTypeDetailId);

    int updateMatchDetailType(DMatchTypeDetailInfo dMatchTypeDetailInfo);



}