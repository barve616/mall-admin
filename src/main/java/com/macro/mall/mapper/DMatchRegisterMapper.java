package com.macro.mall.mapper;

import com.macro.mall.model.DMatchRegister;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DMatchRegisterMapper {

    int insertList(@Param("list") List<DMatchRegister> list);

    List<DMatchRegister> query(DMatchRegister dMatchRegister);

    List<DMatchRegister> querySendMessage();

    int updateState(@Param("userPhone") String userPhone);

    }