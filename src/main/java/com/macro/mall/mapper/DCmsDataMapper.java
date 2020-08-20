package com.macro.mall.mapper;

import com.macro.mall.cms.bean.CMS000007;
import com.macro.mall.cms.bean.Cms000007Result;
import com.macro.mall.cms.bean.CmsReturnData;
import com.macro.mall.model.DCmsData;
import com.macro.mall.model.DCmsRegion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DCmsDataMapper {

    List<DCmsData> find(DCmsData dCmsData);


    List<DCmsData> selectDataList(DCmsData example);

    int updateData(String dataId);

    int inserDate(DCmsData example);

    DCmsData findDate(String dataId);


    String selectSeqDataId();

    void insertIntoData(DCmsData data);

    void updateDataById(DCmsData data);

    void delDataById(String dataId);

    void delDataByDatasId(String datasId);

    DCmsData selectDataById(String dataId);

    List<DCmsData> searchDataList(DCmsData data);

    List<Cms000007Result> CMS000007(CMS000007 cms000007);
}