package com.macro.mall.mapper;


import com.macro.mall.model.DMatchMinTerm;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface DMatchMinTermDao {

  List<DMatchMinTerm> FindAll();

  List<DMatchMinTerm> FindAllByOne(DMatchMinTerm dMatchMinTerm);

  int insert(DMatchMinTerm record);

  int update(DMatchMinTerm record);
  int update1(@Param("matchTp") String matchTp,@Param("matchTpName") String matchTpName);
  int update2(@Param("matchMaxId") String matchMaxId,@Param("matchMaxName") String matchMaxName);


  List<DMatchMinTerm> queryList (DMatchMinTerm dMatchMinTerm);
  DMatchMinTerm queryList1 (DMatchMinTerm dMatchMinTerm);
  DMatchMinTerm getMaxInfo (@Param("matchMaxId") String matchMaxId);
  int delete(@Param("matchMinId") String matchMinId);
}