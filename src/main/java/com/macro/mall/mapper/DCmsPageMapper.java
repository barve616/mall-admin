package com.macro.mall.mapper;

import com.macro.mall.cms.bean.CMS000002Result;
import com.macro.mall.cms.bean.CmsPage;
import com.macro.mall.cms.bean.Preview;
import com.macro.mall.model.DCmsPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DCmsPageMapper {


    //查询首页列表
    List<CmsPage> selectPagelist(DCmsPage example);

    //二维码预览
    DCmsPage selectPage(String pageId);

    //客户端查询
    List<DCmsPage> selectPhonePage(DCmsPage example);

    DCmsPage selectByName(String pageName);

    int insertPage(DCmsPage dCmsPage);

    int updatePage(DCmsPage dCmsPage);

    List<CMS000002Result> preview(Preview preview);
}

