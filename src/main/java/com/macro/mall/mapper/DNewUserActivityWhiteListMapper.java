package com.macro.mall.mapper;

import com.macro.mall.model.DNewUserActivityWhiteList;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DNewUserActivityWhiteListMapper {


    List<DNewUserActivityWhiteList> getWhiteList();


}