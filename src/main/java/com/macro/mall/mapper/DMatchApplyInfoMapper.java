package com.macro.mall.mapper;

import com.macro.mall.model.DMatchApplyInfo;
import com.macro.mall.model.DMatchApplyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DMatchApplyInfoMapper {
//    long countByExample(DMatchApplyInfoExample example);
//
//    int deleteByExample(DMatchApplyInfoExample example);
//
//    int deleteByPrimaryKey(String id);

    int insert(DMatchApplyInfo record);

//    int insertSelective(DMatchApplyInfo record);
//
//    List<DMatchApplyInfo> selectByExample(DMatchApplyInfoExample example);
//
//    DMatchApplyInfo selectByPrimaryKey(String id);

    List<DMatchApplyInfo> selectByPrimaryKey1(DMatchApplyInfo dMatchApplyInfo);

    List<DMatchApplyInfo>   selectByPrimaryKey2 (DMatchApplyInfo dMatchApplyInfo);

    List<DMatchApplyInfo>   selectByPrimaryKey3 (DMatchApplyInfo dMatchApplyInfo);

//    int updateByExampleSelective(@Param("record") DMatchApplyInfo record, @Param("example") DMatchApplyInfoExample example);
//
//    int updateByExample(@Param("record") DMatchApplyInfo record, @Param("example") DMatchApplyInfoExample example);
//
//    int updateByPrimaryKeySelective(DMatchApplyInfo record);
//
//    int updateByPrimaryKey(DMatchApplyInfo record);

    List<DMatchApplyInfo> selectTeamsByone(DMatchApplyInfo dMatchApplyInfo);
    DMatchApplyInfo selectApplyUserInfo(String userPhone,String matchId);

    List<DMatchApplyInfo> queryVltList(DMatchApplyInfo dMatchApplyInfo);

    int detailStepActivity();
}