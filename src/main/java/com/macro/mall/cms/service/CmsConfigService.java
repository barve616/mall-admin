package com.macro.mall.cms.service;

import com.github.pagehelper.PageHelper;
import com.google.common.base.Joiner;
import com.macro.mall.base.dto.FunInfo;
import com.macro.mall.cms.bean.*;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.util.DateUtil;
import com.mysql.cj.util.StringUtils;
import org.apache.poi.ss.formula.functions.T;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class CmsConfigService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CmsConfigService.class);

    @Resource
    private DCmsPageMapper DCmsPageMapper;

    @Resource
    private DCmsFuncitonMapper dCmsFuncitonMapper;

    @Resource
    private DCmsDataMapper dCmsDataMapper;

    @Resource
    private DCityInformationMapper dCityInformationMapper;
    @Resource
    private DNewUserActivityWhiteListMapper whiteListMapper;

    @Resource
    private DFunInfoMapper dFunInfoMapper;

    @Resource
    private DCmsParamsMapper dCmsParamsMapper;

    @Resource
    private DCmsRegionMapper dCmsRegionMapper;

    @Resource
    private DCmsPeopleMapper dCmsPeopleMapper;

    @Resource
    private DCmdPageTypeMapper dCmdPageTypeMapper;


    /**
     * 查询首页配置
     *
     * @param bean
     * @return
     */
    public CommonResult CMS000001(CMS000001 bean) {

         String	pageSize=bean.getPageSize();
         String	pageNum=bean.getPageNum();

         //默认页面条数5条
        if (StringUtils.isNullOrEmpty(pageSize)) {
            pageSize="5";
        }

        //默认页码1
        if (StringUtils.isNullOrEmpty(pageNum)) {
            pageNum="1";
        }
        DCmsPage cmsPage = new DCmsPage();
        cmsPage.setPageName(bean.getPageName());
        cmsPage.setpStartTime(bean.getPutStartTime());
        cmsPage.setpEndTime(bean.getPutEndTime());
        cmsPage.setPageState(bean.getPageState());
        cmsPage.setpSortId(bean.getpSortId());

        //分页函数
        PageHelper.startPage(Integer.valueOf(pageNum), Integer.valueOf(pageSize));
        List<CmsPage> pageList = DCmsPageMapper.selectPagelist(cmsPage);
        CommonPage<CmsPage> result=CommonPage.restPage(pageList);

        return CommonResult.success(result);

    }


    /**
     * 查询功能列表配置
     *
     * @param bean
     * @return
     */
    public CommonResult CMS000011(CMS000011 bean) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        List<DCmsFunciton> funList = dCmsFuncitonMapper.selectFunlist();
        returnMap.put("funList", funList);
        return CommonResult.success(returnMap);

    }

    /**
     * 首页管理页面信息查询
     *
     * @param bean
     * @return
     */
    public CommonResult CMS000002(CMS000002 bean) {
        String pageId = bean.getPageId();

        if (StringUtils.isNullOrEmpty(pageId)) {
            return CommonResult.failed("上送参数pageId为空！");
        }


        DCmsPage page = DCmsPageMapper.selectPage(bean.getPageId());
        if (page == null) {
            return CommonResult.failed("页面信息为空！");
        }

        //复制模板
        DCmsPage dCmsPage = copyPage(page);
        return CommonResult.success(dCmsPage.getPageId());

    }

    /**
     * 复制模板
     * @param page
     */
    @Transactional
    DCmsPage copyPage(DCmsPage page){
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyMMddHHmmss");
        //复制出来的模板默认下架 模板名称后面加时间戳
        page.setPageName(page.getPageName() + "_" + sf.format(date));
        page.setPageState("02");
        List<String> updateDatasIds = new ArrayList<>();
        DCmsPageMapper.insertPage(page);
        String sorts = page.getpSaveSort();
        String[] datasIds = null;
        if (sorts != null) {
            datasIds = sorts.split(",");
        }
        for (String datasId : datasIds) {
            DCmsParams copyDCmsParams = dCmsParamsMapper.selectParamsById(datasId);
            if(copyDCmsParams != null){
                DCmsData dCmsData = new DCmsData();
                dCmsData.setDatasId(copyDCmsParams.getDatasId());
                List<DCmsData> copyDCmsData = dCmsDataMapper.find(dCmsData);

                copyDCmsParams.setPageId(page.getPageId());
                dCmsParamsMapper.insert(copyDCmsParams);
                updateDatasIds.add(copyDCmsParams.getDatasId());
                for (DCmsData cmsData : copyDCmsData) {
                    List<DCmsRegion> dCmsRegions = dCmsRegionMapper.selectListById(cmsData.getDataId());
                    List<DCmsPeople> peopleList = dCmsPeopleMapper.selectPeoList(cmsData.getDataId());

                    cmsData.setDatasId(copyDCmsParams.getDatasId());
                    cmsData.setPageId(page.getPageId());
                    dCmsDataMapper.inserDate(cmsData);

                    //投放城市复制
                    if(dCmsRegions.size() > 0){
                        for (DCmsRegion dCmsRegion : dCmsRegions) {
                            dCmsRegion.setRegionId(cmsData.getDataId());
                        }
                        dCmsRegionMapper.insertCityList(dCmsRegions);
                    }


                    //投放人群复制
                    if(peopleList.size() > 0){
                        for (DCmsPeople dCmsPeople : peopleList) {
                            dCmsPeople.setPeopleId(cmsData.getDataId());
                        }
                        dCmsPeopleMapper.insertPeopleList(peopleList);
                    }

                }
            }
        }
        page.setpSaveSort(Joiner.on(",").join(updateDatasIds));
        DCmsPageMapper.updatePage(page);
        return page;
    }


    /**
     * 页面web端预览
     *
     * @param bean
     * @return
     */
    public CommonResult CMS000014(CMS000014 bean) {

        //投放渠道
        String userPlt = bean.getUserPlt();
        //投放城市
        String cityId = bean.getCityId();
        //投放人群
        String peopleType = bean.getPeopleType();
        //上架状态
        String state = bean.getState();
        //生效开始时间
        String startTime = bean.getStartTime();
        //生效结束时间
        String endTime = bean.getEndTime();
        //模板id
        String pageId = bean.getPageId();


        //状态判断
        String[] dStatus = null;
        //state  00：待审核
        if ("00".equals(state)) {
            dStatus = new String[]{"00"}; // 00:待审核
        }

        // state 01: 待审核+已上架
        if ("01".equals(state)) {
            dStatus = new String[]{"00", "01"}; //00:待审核  01:已上架
        }

        //渠道查询
        String mlifeFlag = null;
        String phoneFlag = null;
        String wxFlag = null;
        String xcxFlag = null;
        // 01:缤纷生活  02:手机银行  03：微信公众号 04 微信小程序
        if ("01".equals(userPlt)) {
            mlifeFlag = "01";
        }
        if ("02".equals(userPlt)) {
            phoneFlag = "01";
        }
        if ("03".equals(userPlt)) {
            wxFlag = "01";
        }
        if ("04".equals(userPlt)) {
            xcxFlag = "01";
        }


        DCmsPage page = DCmsPageMapper.selectPage(pageId);
        if (page == null) {
            return CommonResult.failed("页面信息为空！");
        }
        //获取预览保存顺序
        String sorts = page.getpSaveSort();
        String[] datasId = new String[0];
        if (!(sorts == null)) {
            datasId = sorts.split(",");
        }

        List<CMS000002Result> preview = DCmsPageMapper.preview(new Preview(pageId, datasId, dStatus, startTime, endTime, mlifeFlag, phoneFlag, wxFlag, xcxFlag, cityId, peopleType));



        return CommonResult.success(preview);

    }


    /**
     * 01二维码预览 /02客户端查询
     *
     * @param bean
     * @return
     */
    public CommonResult CMS000003(DCmdPageType dCmdPageType) {
        return CommonResult.success(dCmdPageTypeMapper.lists(dCmdPageType));
    }


    /**
     * 新增|保存页面名称
     *
     * @param bean
     * @return
     */
    public CommonResult CMS000012(CMS000012 bean) {


        String pageName = bean.getPageName();
        String pSortId = bean.getpSortId();
        String titleName = bean.getTitleName();

        if (StringUtils.isNullOrEmpty(pageName)) {
            return CommonResult.failed("上送参数pageName为空！");
        }

        if(StringUtils.isNullOrEmpty(pSortId)){
            return CommonResult.failed("上送参数pSortId为空！");
        }

        if (StringUtils.isNullOrEmpty(titleName)) {
            return CommonResult.failed("上送参数titleName为空！");
        }


        DCmsPage dCmsPageOld = DCmsPageMapper.selectByName(pageName);
        if (!(dCmsPageOld == null)) {
            return CommonResult.failed("页面名称已存在！");
        }

        dCmsPageOld = new DCmsPage();
        dCmsPageOld.setpSortId(pSortId);
        dCmsPageOld.setPageFlag("01");
//        List<DCmsPage> pageList = DCmsPageMapper.selectPhonePage(dCmsPageOld);
//        if (pageList.size() > 0) {
//            return CommonResult.failed("默认类型已存在！");
//        }


        DCmsPage dCmsPage = new DCmsPage();
        dCmsPage.setPageName(pageName);
        dCmsPage.setpSortId(pSortId);
        dCmsPage.setPageFlag("01");
        dCmsPage.setTitleName(bean.getTitleName());


        int i = DCmsPageMapper.insertPage(dCmsPage);
        if (i < 0) {
            return CommonResult.failed("页面保存失败！");
        }

        return CommonResult.success(dCmsPage.getPageId());

    }


    /**
     * CMS模板下架|重命名
     *
     * @param bean
     * @return
     */
    public CommonResult CMS000004(CMS000004 bean) {

        String pageId = bean.getPageId();
        String type = bean.getType();
        String cmsState = bean.getCmsState();
        String pageName = bean.getPageName();
        String pSortId = bean.getpSortId();
        String titleName = bean.getTitleName();

        DCmsPage pageOld = DCmsPageMapper.selectPage(pageId);
        if (pageOld == null) {
            return CommonResult.failed("页面信息为空！");
        }


        DCmsPage dCmsPage = new DCmsPage();
        dCmsPage.setPageId(pageId);

        //01:模板下架   02:模板重命名
        if ("01".equals(type)) {

            if (StringUtils.isNullOrEmpty(cmsState)) {
                return CommonResult.failed("上送参数cmsState为空！");
            }

            dCmsPage.setPageState(cmsState);
        } else if ("02".equals(type)) {
            if (StringUtils.isNullOrEmpty(pageName)) {
                return CommonResult.failed("上送参数pageName为空！");
            }
            if(StringUtils.isNullOrEmpty(titleName)){
                return CommonResult.failed("上送参数titleName为空！");
            }
            if(StringUtils.isNullOrEmpty(pSortId)){
                return CommonResult.failed("上送参数pSortId为空！");
            }

//            DCmsPage dCmsPageOld = DCmsPageMapper.selectByName(pageName);
//            if (!(dCmsPageOld == null)) {
//                return CommonResult.failed("页面名称已存在！");
//            }
            dCmsPage.setpSortId(pSortId);
            dCmsPage.setTitleName(titleName);
            dCmsPage.setPageName(pageName);
        } else {
            return CommonResult.failed("操作类型上送错误！");
        }


        int i = DCmsPageMapper.updatePage(dCmsPage);
        if (i < 0) {
            return CommonResult.failed("模板更新失败！");
        }


        return CommonResult.success("操作成功！");

    }


    /**
     * CMS模板保存/更新/发布/定时发布
     *
     * @param bean
     * @return
     */
    public CommonResult CMS000005(CMS000005 bean) {
        String type = bean.getType();
        String pageId = bean.getPageId();
        String sortNum = bean.getSortNum();
        String putStartTime = bean.getPutStartTime();
        String putEndTime = bean.getPutEndTime();
        String pageState = bean.getPageState();

        if (StringUtils.isNullOrEmpty(pageId)) {
            return CommonResult.failed("上送参数pageId为空！");
        }
        if (StringUtils.isNullOrEmpty(sortNum)) {
            return CommonResult.failed("上送参数sortNum为空！");
        }

        DCmsPage pageOld = DCmsPageMapper.selectPage(pageId);
        if (pageOld == null) {
            return CommonResult.failed("页面信息为空！");
        }


        DCmsPage dCmsPage = new DCmsPage();
        dCmsPage.setPageId(pageId);
        dCmsPage.setpSaveSort(sortNum);
        //01:CMS模板保存  02:更新  03:发布  04:定时发布
        if ("01".equals(type)) {

            if (StringUtils.isNullOrEmpty(pageState)) {
                return CommonResult.failed("上送参数pageState为空！");
            }
            dCmsPage.setPageState(pageState);

        } else if ("02".equals(type)) {

        } else if ("03".equals(type)) {
            if (StringUtils.isNullOrEmpty(pageState)) {
                return CommonResult.failed("上送参数pageState为空！");
            }

            dCmsPage.setPageState(pageState);

        } else if ("04".equals(type)) {

            if (StringUtils.isNullOrEmpty(putStartTime)) {
                return CommonResult.failed("上送参数putStartTime为空！");
            }
            if (StringUtils.isNullOrEmpty(putEndTime)) {
                return CommonResult.failed("上送参数putEndTime为空！");
            }
            if (StringUtils.isNullOrEmpty(pageState)) {
                return CommonResult.failed("上送参数pageState为空！");
            }

            dCmsPage.setpStartTime(putStartTime);
            dCmsPage.setpEndTime(putEndTime);
            dCmsPage.setPageState(pageState);

        } else {
            return CommonResult.failed("操作类型上送错误！");

        }


        int i = DCmsPageMapper.updatePage(dCmsPage);
        if (i < 0) {
            return CommonResult.failed("模板更新失败！");
        }

        return CommonResult.success("操作成功！");

    }


    /**
     * 页面web端预览保存
     *
     * @param bean
     * @return
     */
    public CommonResult CMS000015(CMS000015 bean) {

        String pageId = bean.getPageId();
        String sortNum = bean.getSortNum();
        if (StringUtils.isNullOrEmpty(pageId)) {
            return CommonResult.failed("pageId字段为空！");
        }
        if (StringUtils.isNullOrEmpty(sortNum)) {
            return CommonResult.failed("sortNum字段为空！");
        }
        DCmsPage dCmsPage = new DCmsPage();
        dCmsPage.setPageId(pageId);
        dCmsPage.setpTemSort(sortNum);

        int i = DCmsPageMapper.updatePage(dCmsPage);
        if (i < 0) {
            return CommonResult.failed("模板更新失败！");
        }

        return CommonResult.success("模板更新成功！");

    }

    /**
     * CMS模块数据批量上架|批量新增
     *
     * @param bean
     * @return
     */
    public CommonResult CMS000013(CMS000013 bean) {

        String type = bean.getType();
        String pageId = bean.getPageId();
        String funId = bean.getFunId();
        String funSId = bean.getFunSId();
        String dataSId = bean.getDataSId();
        String dataId = bean.getDataId();
        //01:CMS模块数据批量上架 02:批量新增
        if ("01".equals(type)) {
            if (StringUtils.isNullOrEmpty(dataId)) {
                return CommonResult.failed("dataId为空！");
            }
            String[] sp = dataId.split(",");
            for (int j = 0; j < sp.length; j++) {
                dCmsDataMapper.updateData(sp[j]);
            }
            return CommonResult.success("批量上架成功！");
        }

        if ("02".equals(type)) {
            if (StringUtils.isNullOrEmpty(pageId)) {
                return CommonResult.failed("pageId为空！");
            }
            if (StringUtils.isNullOrEmpty(funId)) {
                return CommonResult.failed("funId为空！");
            }
            if (StringUtils.isNullOrEmpty(funSId)) {
                return CommonResult.failed("funSId为空！");
            }
            if (StringUtils.isNullOrEmpty(dataSId) ) {
                return CommonResult.failed("dataSId为空！");
            }
            String[] sp = dataId.split(",");
            for (int j = 0; j < sp.length; j++) {
                DCmsData data = dCmsDataMapper.findDate(sp[j]);
                data.setPageId(data.getPageId());
                data.setFuncId(data.getFuncId());
                data.setFuncsId(data.getFuncsId());
                data.setDatasId(data.getDatasId());
                dCmsDataMapper.inserDate(data);
            }
            return CommonResult.success("批量新增成功！");
        }

        return CommonResult.failed("操作类型异常！");
    }

    /**
     * 查询城市列表
     *
     * @return
     */
    public CommonResult CMS000016() {

        Map<String, Object> returnMap = new HashMap<String, Object>();
        List<CmsCity> tempList = new ArrayList<CmsCity>();
        List<Object> returnList = new ArrayList<Object>();
        List<DCityInformation> list = null;
        list = dCityInformationMapper.getCityMapInfo();
        if (list == null || list.size() == 0) {
            return CommonResult.failed("获取数据异常！");
        } else {
            for (DCityInformation cityInfo : list) {
                if (StringUtils.isNullOrEmpty(cityInfo.getProvinceId())) {
                    String cityId = cityInfo.getCityId();
                    for (DCityInformation temp : list) {
                        if (!StringUtils.isNullOrEmpty(temp.getProvinceId()) && temp.getProvinceId().equals(cityId)) {
                            CmsCity cmsCity = new CmsCity();
                            cmsCity.setName(temp.getName());
                            cmsCity.setCityId(temp.getCityId());
                            cmsCity.setProvinceId(temp.getProvinceId());
                            tempList.add(cmsCity);
                        }
                    }
                    returnMap.put("provinceId", cityInfo.getCityId());// 省份id
                    returnMap.put("provinceName", cityInfo.getName());// 省份名称
                    if (tempList.size() > 0) {
                        returnList.add(returnMap);
                        returnMap.put("cityList", tempList);// 城市列表
                    } else {

                        cityInfo.setProvinceId(cityId);

                        CmsCity cmsCity = new CmsCity();
                        cmsCity.setName(cityInfo.getName());
                        cmsCity.setCityId(cityInfo.getCityId());
                        cmsCity.setProvinceId(cityInfo.getProvinceId());
                        tempList.add(cmsCity);
                        returnMap.put("cityList", tempList);// 城市列表
                    }
                    tempList = new ArrayList<CmsCity>();
                    returnMap = new HashMap<String, Object>();
                }
            }
        }

        returnMap.put("list", list);

        return CommonResult.success(returnList);

    }


    /**
     * CMS白名单列表查询
     * @return
     */
    public CommonResult CMS000017() {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        List<DNewUserActivityWhiteList> whiteList = whiteListMapper.getWhiteList();
        List<CmsUser> list = new ArrayList<>();
        for (int j = 0; j < whiteList.size(); j++) {
            CmsUser cmsUser = new CmsUser();
            cmsUser.setId(whiteList.get(j).getListId());
            cmsUser.setName(whiteList.get(j).getListName());
            list.add(cmsUser);
        }
        returnMap.put("list", list);
        return CommonResult.success(returnMap);

    }


    /**
     * 获取功能列表
     * @return
     */
    public CommonResult CMS000018(CMS000018 cms000018) {

        List<DFunInfoSp> findAll = dFunInfoMapper.findAll(cms000018);
        String funId = "";
        List<DFunInfoSp> tempList = new ArrayList<DFunInfoSp>();
        List<Object> returnList = new ArrayList<Object>();
        for (DFunInfoSp funInfo : findAll) {
            // 判断是否是一级列表
            if (StringUtils.isNullOrEmpty(funInfo.getFunPid())) {
                funId = funInfo.getFunId();
                for (DFunInfoSp temp : findAll) {
                    if (!StringUtils.isNullOrEmpty(temp.getFunPid()) && funId.equals(temp.getFunPid())) {
                        tempList.add(temp);
                    }
                }
                if (tempList.size() > 0) {
                    funInfo.setFunInfo(tempList);
                }
                returnList.add(funInfo);
                tempList = new ArrayList<DFunInfoSp>();
            }

        }
        return CommonResult.success(returnList);
    }


}
