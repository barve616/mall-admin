package com.macro.mall.cms.service;

import com.macro.mall.base.service.impl.ImgUtilsService;
import com.macro.mall.cms.bean.CMS000009;
import com.macro.mall.cms.bean.CMS000010;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.mapper.DCmsDataMapper;
import com.macro.mall.mapper.DCmsParamsMapper;
import com.macro.mall.mapper.DCmsPeopleMapper;
import com.macro.mall.mapper.DCmsRegionMapper;
import com.macro.mall.model.DCmsData;
import com.macro.mall.model.DCmsPeople;
import com.macro.mall.model.DCmsRegion;
import com.macro.mall.util.DateUtil;
import com.macro.mall.util.MLog;
import com.mysql.cj.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class CmsModelConfigService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CmsModelConfigService.class);

    @Autowired
    private DCmsDataMapper dCmsDataMapper;
    @Autowired
    private DCmsRegionMapper dCmsRegionMapper;
    @Autowired
    private ImgUtilsService imgUtilsService;

    @Autowired
    private DCmsPeopleMapper dCmsPeopleMapper;

    @Autowired
    private DCmsParamsMapper dCmsParamsMapper;
    /**
     * 新增更新
     * @param bean
     * @return
     */
    @Transactional
    public CommonResult CMS000009(List<CMS000009> beans) {
        for (CMS000009 bean : beans) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtil.pattern_ymd_hms);
            if(bean.getStartTime() != null && bean.getEndTime() != null){
                try {
                    Date startTime = simpleDateFormat.parse(bean.getStartTime());
                    Date endTime = simpleDateFormat.parse(bean.getEndTime());
                    if(startTime.after(endTime)){
                        return CommonResult.failed("开始时间不可晚于结束时间！");
                    }
                } catch (Exception e) {
                    return CommonResult.failed("时间字符串格式不正确！");
                }
            }
            //新增
            if("01".equals(bean.getType())){
                DCmsData data = new DCmsData();
                String datdId = dCmsDataMapper.selectSeqDataId();
                data.setDataId(datdId);
                data.setPageId(bean.getPageId());//页面id
                data.setFuncId(bean.getFunId());//功能id
                data.setDatasId(bean.getDataSId());//数据组id
                data.setDatasGroup(bean.getDataGId());//数据所在行数

                if(!StringUtils.isNullOrEmpty(bean.getChannel())){
                    String[] channels = bean.getChannel().split(",");
                    if(Arrays.asList(channels).contains("01")){
                        data.setdMlifeFlag("01");
                        data.setmJumpId(bean.getMlifeFunID());
                        data.setmJumpValue(bean.getMlifeFunVae());
                        data.setmLink(bean.getMlifelink());
                    }
                    if(Arrays.asList(channels).contains("02")){
                        data.setdPhoneFlag("01");
                        data.setpJumpId(bean.getPhoneFunID());
                        data.setpJumpValue(bean.getPhoneFunVae());
                        data.setpLink(bean.getPhoneLink());
                    }
                    if(Arrays.asList(channels).contains("03")){
                        data.setdWxFlag("01");
                        data.setwJumpId(bean.getWxFunID());
                        data.setwJumpValue(bean.getWxFunVae());
                        data.setwLink(bean.getWxLink());
                    }
                    if(Arrays.asList(channels).contains("04")){
                        data.setdXcxFlag("01");
                        data.setxJumpId(bean.getXcxFunID());
                        data.setxJumpValue(bean.getXcxFunVae());
                        data.setxLink(bean.getXcxLink());
                    }
                }

                data.setDataName(bean.getFunTitle());
                data.setDataType(bean.getDataType());
                data.setdState(bean.getFunState());
                data.setdStartTime(bean.getStartTime());
                data.setdEndTime(bean.getEndTime());
                //处理本地图片
                try {
                    if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(bean.getFunImage01())){
                        String uploadImgUrl1 = imgUtilsService.uploadImgCMS(bean.getFunImage01(), "file");
                        data.setDataImage1(uploadImgUrl1);
                    }
                    if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(bean.getFunImage02())){
                        String uploadImgUrl2 = imgUtilsService.uploadImgCMS(bean.getFunImage02(), "file");
                        data.setDataImage2(uploadImgUrl2);
                    }
                    if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(bean.getFunImage03())){
                        String uploadImgUrl3 = imgUtilsService.uploadImgCMS(bean.getFunImage03(), "file");
                        data.setDataImage3(uploadImgUrl3);
                    }
                    if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(bean.getFunImage04())){
                        String uploadImgUrl4 = imgUtilsService.uploadImgCMS(bean.getFunImage04(), "file");
                        data.setDataImage4(uploadImgUrl4);
                    }
                } catch (Exception e) {
                    LOGGER.error("图片上传失败"+"==========="+e.getMessage());
                    return CommonResult.failed(e.getMessage());
                }
                //保存城市
                List<DCmsRegion> cityList = new ArrayList();
                String cityId = bean.getCityId();
                if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(cityId)){
                    String[] cityIds = cityId.split(",");
                    for(String str : cityIds){
                        String[] split2 = str.split("-");
                        if(split2.length == 2){
                            DCmsRegion dCmsRegion = new DCmsRegion();
//                        dCmsRegion.setId("top"+ StringDeal.getID());
                            dCmsRegion.setRegionId(datdId);
                            dCmsRegion.setProvinceId(split2[0]);
                            dCmsRegion.setCityId(split2[1]);
                            cityList.add(dCmsRegion);
                        }else{
                            LOGGER.error("城市id数据格式有误" + cityId);
                            return CommonResult.failed("系统异常");
                        }
                    }
                    dCmsRegionMapper.insertCityList(cityList);
                }
                //保存适用人群
                if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(bean.getPeopleType())){
                    String[] peopleTypes = bean.getPeopleType().split(",");
                    List peopleList = new ArrayList();
                    for(int i=0;i<peopleTypes.length;i++){
                        DCmsPeople cmsPeople = new DCmsPeople();
                        cmsPeople.setPeopleId(datdId);
                        cmsPeople.setUserId(peopleTypes[i]);
                        peopleList.add(cmsPeople);
                    }
                    dCmsPeopleMapper.insertPeopleList(peopleList);
                }
                //保存数据信息
                dCmsDataMapper.insertIntoData(data);

                return CommonResult.success("操作成功");
            }else if("02".equals(bean.getType())){
                DCmsData data = new DCmsData();
                data.setDataId(bean.getDataId());

                if(!StringUtils.isNullOrEmpty(bean.getChannel())) {
                    String[] channels = bean.getChannel().split(",");
                    if (Arrays.asList(channels).contains("01")) {
                        data.setdMlifeFlag("01");
                        data.setmJumpId(bean.getMlifeFunID());
                        data.setmJumpValue(bean.getMlifeFunVae());
                        data.setmLink(bean.getMlifelink());
                    }
                    if (Arrays.asList(channels).contains("02")) {
                        data.setdPhoneFlag("01");
                        data.setpJumpId(bean.getPhoneFunID());
                        data.setpJumpValue(bean.getPhoneFunVae());
                        data.setpLink(bean.getPhoneLink());
                    }
                    if (Arrays.asList(channels).contains("03")) {
                        data.setdWxFlag("01");
                        data.setwJumpId(bean.getWxFunID());
                        data.setwJumpValue(bean.getWxFunVae());
                        data.setwLink(bean.getWxLink());
                    }
                    if (Arrays.asList(channels).contains("04")) {
                        data.setdXcxFlag("01");
                        data.setxJumpId(bean.getXcxFunID());
                        data.setxJumpValue(bean.getXcxFunVae());
                        data.setxLink(bean.getXcxLink());
                    }
                }
                data.setDataName(bean.getFunTitle());
                data.setDataType(bean.getDataType());
                data.setdState(bean.getFunState());
                data.setdStartTime(bean.getStartTime());
                data.setdEndTime(bean.getEndTime());
                //处理本地图片
                try {
                    if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(bean.getFunImage01())){
                        String uploadImgUrl1 = imgUtilsService.uploadImg(bean.getFunImage01(), "file");
                        data.setDataImage1(uploadImgUrl1);
                    }
                    if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(bean.getFunImage02())){
                        String uploadImgUrl2 = imgUtilsService.uploadImg(bean.getFunImage02(), "file");
                        data.setDataImage2(uploadImgUrl2);
                    }
                    if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(bean.getFunImage03())){
                        String uploadImgUrl3 = imgUtilsService.uploadImg(bean.getFunImage03(), "file");
                        data.setDataImage3(uploadImgUrl3);
                    }
                    if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(bean.getFunImage04())){
                        String uploadImgUrl4 = imgUtilsService.uploadImg(bean.getFunImage04(), "file");
                        data.setDataImage4(uploadImgUrl4);
                    }
                } catch (Exception e) {
                    LOGGER.error("图片上传失败"+"==========="+e.getMessage());
                    return CommonResult.failed("上传图片失败========" + e.getMessage());
                }
                //先删
                dCmsRegionMapper.delCityListById(bean.getDataId());
                //保存城市
                List<DCmsRegion> cityList = new ArrayList();
                String cityId = bean.getCityId();
                if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(cityId)){
                    String[] cityIds = cityId.split(",");
                    for(String str : cityIds){
                        String[] split2 = str.split("-");
                        if(split2.length == 2){
                            DCmsRegion dCmsRegion = new DCmsRegion();
//                        dCmsRegion.setId("top"+ StringDeal.getID());
                            dCmsRegion.setRegionId(bean.getDataId());
                            dCmsRegion.setProvinceId(split2[0]);
                            dCmsRegion.setCityId(split2[1]);
                            cityList.add(dCmsRegion);
                        }else{
                            LOGGER.error("城市id数据格式有误" + cityId);
                            return CommonResult.failed("系统异常");
                        }
                    }

                    dCmsRegionMapper.insertCityList(cityList);
                }
                //删除
                dCmsPeopleMapper.delpeopelById(bean.getDataId());
                //保存适用人群
                if(!com.mysql.cj.util.StringUtils.isNullOrEmpty(bean.getPeopleType())){
                    String[] peopleTypes = bean.getPeopleType().split(",");
                    List peopleList = new ArrayList();
                    for(int i=0;i<peopleTypes.length;i++){
                        DCmsPeople cmsPeople = new DCmsPeople();
                        cmsPeople.setPeopleId(bean.getDataId());
                        cmsPeople.setUserId(peopleTypes[i]);
                        peopleList.add(cmsPeople);
                    }
                    dCmsPeopleMapper.insertPeopleList(peopleList);
                }

                dCmsDataMapper.updateDataById(data);
            }else{
                return CommonResult.failed("上送操作类型不合法");
            }
        }
        return CommonResult.success("操作成功");
    }


    /**
     * 删除
     * @param bean
     * @return
     */
    public CommonResult CMS000010(CMS000010 bean) {
        if("01".equals(bean.getType())){
            try {
                dCmsDataMapper.delDataById(bean.getDataId());
                return CommonResult.success("操作成功");
            } catch (Exception e) {
                e.printStackTrace();
                MLog.error("删除模块失败--》"+e.getMessage());
                return CommonResult.failed("删除失败");
            }
        }else if("02".equals(bean.getType())){
            try {
                dCmsParamsMapper.delParamsById(bean.getDatasId());
                dCmsDataMapper.delDataByDatasId(bean.getDatasId());
                return CommonResult.success("操作成功");
            } catch (Exception e) {
                e.printStackTrace();
                MLog.error("删除模块行失败----》"+e.getMessage());
                return CommonResult.failed("删除失败");
            }
        }else{
            return CommonResult.failed("操作类型不合法！");
        }
    }
}
