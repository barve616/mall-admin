package com.macro.mall.cms.service;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.macro.mall.cms.bean.*;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.util.MLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CmsModelService {
    @Autowired
    private DCmsDataMapper dCmsDataMapper;
    @Autowired
    private DCmsParamsMapper dCmsParamsMapper;
    @Autowired
    private DCmsRegionMapper dCmsRegionMapper;
    @Autowired
    private DCmsPeopleMapper dCmsPeopleMapper;
    @Autowired
    private DCmsPageMapper dCmsPageMapper;

    /**
     * 模块列表查询
     * @param bean
     * @return
     */
    public CommonResult CMS000007(CMS000007 bean) {
        String	pageSize=bean.getPageSize();
        String	pageNum=bean.getPageNum();
        if(com.mysql.cj.util.StringUtils.isNullOrEmpty(bean.getFunId())){
            return CommonResult.failed("功能id不能为空");
        }
        //默认页面条数5条
        if (com.mysql.cj.util.StringUtils.isNullOrEmpty(pageSize)) {
            pageSize="5";
        }

        //默认页码1
        if (com.mysql.cj.util.StringUtils.isNullOrEmpty(pageNum)) {
            pageNum="1";
        }
        List<Cms000007Result> list = null;
        try{
            PageHelper.startPage(Integer.valueOf(pageNum), Integer.valueOf(pageSize));
            list = dCmsDataMapper.CMS000007(bean);
        }catch (Exception e){
            e.printStackTrace();
            MLog.info("模块列表查询失败---->"+e.getMessage());
            return CommonResult.failed("查询失败");
        }
        if(list.size() == 0){
            return CommonResult.failed("暂无数据");
        }
        for(Cms000007Result dCmsData : list){

            String sb = "";
            if(!StringUtils.isEmpty(dCmsData.getdMlifeFlag())){
                sb="01";
            }
            if(!StringUtils.isEmpty(dCmsData.getdPhoneFlag())){
                sb=sb+",02";
            }
            if(!StringUtils.isEmpty(dCmsData.getdWxFlag())){
                sb=sb+",03";
            }
            if(!StringUtils.isEmpty(dCmsData.getdXcxFlag())){
                sb=sb+",04";
            }

            if(sb.indexOf(",",0)==0){
                sb=sb.replaceFirst(",","");
            }

            dCmsData.setChannel(sb.toString());
        }

        CommonPage<Cms000007Result> result = CommonPage.restPage(list);
        return CommonResult.success(result);
    }


    /**
     * 大模块新增|更新
     * @param bean
     * @return
     */
    @Transactional
    public CommonResult CMS000006(DCmsParams bean) {
        String fucId = bean.getFucId();
        String pageId = bean.getPageId();
        String datasId = bean.getDatasId();
        DCmsPage dCmsPage1 = dCmsPageMapper.selectPage(pageId);
        if(dCmsPage1 == null){
            if(com.mysql.cj.util.StringUtils.isNullOrEmpty(fucId)){
                return CommonResult.failed("上送页面ID不存在");
            }
        }
        if(com.mysql.cj.util.StringUtils.isNullOrEmpty(datasId)){
            if(com.mysql.cj.util.StringUtils.isNullOrEmpty(fucId)){
                return CommonResult.failed("上送功能模块ID不能为空");
            }
            if(com.mysql.cj.util.StringUtils.isNullOrEmpty(pageId)){
                return CommonResult.failed("所属页面ID不能为空");
            }
            int i = dCmsParamsMapper.insert(bean);
            if(i != 1){
                return CommonResult.failed("大模块保存失败");
            }
            String s = dCmsPage1.getpSaveSort();
            if(com.mysql.cj.util.StringUtils.isNullOrEmpty(s)){
                s = bean.getDatasId();
            }else{
                s = s + "," + bean.getDatasId();
            }
            dCmsPage1.setpSaveSort(s);
            dCmsPageMapper.updatePage(dCmsPage1);
            return CommonResult.success(bean.getDatasId());
        }else{
            bean.setFucId(null);
            bean.setPageId(null);
            dCmsParamsMapper.updateByPrimaryKeySelective(bean);
            return CommonResult.success("大模块更新成功");
        }
    }

    /**
     * 模块信息查询
     * @param dataId
     * @return
     */
    public CommonResult     CMS000008(String dataId) {
        if (StringUtils.isEmpty(dataId)) {
            return CommonResult.failed("dataId字段为空！");
        }
        DCmsData cmsData = dCmsDataMapper.selectDataById(dataId);
        if(null == cmsData){
            return CommonResult.success("暂无数据");
        }
        CmsReturnData data = new CmsReturnData();
        data.setDataId(cmsData.getDataId());
        String sb = "";
        if(cmsData.getdMlifeFlag().equals("01")){
           sb="01";
        }
        if(cmsData.getdPhoneFlag().equals("01")){
            sb=sb+",02";
        }
        if(cmsData.getdWxFlag().equals("01")){
            sb=sb+",03";
        }
        if(cmsData.getdXcxFlag().equals("01")){
            sb=sb+",04";
        }

        if(sb.indexOf(",",0)==0){
            sb=sb.replaceFirst(",","");
        }

        data.setChannel(sb.toString());
        data.setPageId(cmsData.getPageId());
        data.setFuncId(cmsData.getFuncId());
        data.setDatasId(cmsData.getDatasId());
        data.setDatasGroup(cmsData.getDatasGroup());
        data.setdStartTime(cmsData.getdStartTime());
        data.setdEndTime(cmsData.getdEndTime());
        data.setdState(cmsData.getdState());
        data.setdMlifeFlag(cmsData.getdMlifeFlag());
        data.setmLink(cmsData.getmLink());
        data.setmJumpId(cmsData.getmJumpId());
        data.setmJumpValue(cmsData.getmJumpValue());
        data.setdPhoneFlag(cmsData.getdPhoneFlag());
        data.setpLink(cmsData.getpLink());
        data.setpJumpId(cmsData.getpJumpId());
        data.setpJumpValue(cmsData.getpJumpValue());
        data.setdWxFlag(cmsData.getdWxFlag());
        data.setwLink(cmsData.getwLink());
        data.setwJumpId(cmsData.getwJumpId());
        data.setwJumpValue(cmsData.getwJumpValue());
        data.setdXcxFlag(cmsData.getdXcxFlag());
        data.setxLink(cmsData.getxLink());
        data.setxJumpId(cmsData.getxJumpId());
        data.setxJumpValue(cmsData.getxJumpValue());
        data.setDataName(cmsData.getDataName());
        data.setDataImage1(cmsData.getDataImage1());
        data.setDataImage2(cmsData.getDataImage2());
        data.setDataImage3(cmsData.getDataImage3());
        data.setDataImage4(cmsData.getDataImage4());
        data.setDataType(cmsData.getDataType());
        data.setDataSort(cmsData.getDataSort());
        List<DCmsRegion> cityList = dCmsRegionMapper.selectListById(dataId);
        data.setCityList(cityList);
        List<DCmsPeople> peopleList = dCmsPeopleMapper.selectPeoList(dataId);
        data.setPeopleType(peopleList);
        return CommonResult.success(data);
    }

    /**
     * 模块列表排序
     * @param bean
     * @return
     */
    public CommonResult CMS0000019(CMS000019 bean){
        String[] dataIds = bean.getDataIds();
        for(int i = 0 ; i < dataIds.length ; i++){
            DCmsData dCmsData = new DCmsData();
            dCmsData.setDataId(dataIds[i]);
            dCmsData.setDataSort((i+1) + "");
            dCmsDataMapper.updateDataById(dCmsData);
        }
        return CommonResult.success("操作成功！");
    }
}
