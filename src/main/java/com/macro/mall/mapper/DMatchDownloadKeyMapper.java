package com.macro.mall.mapper;

import com.macro.mall.model.DMatchDownloadKey;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DMatchDownloadKeyMapper {


    int insert(String matchKey);

   String query();

   int delete();

   int update(String matchKey);

   int selectCount();


}