package com.macro.mall.communicate.match.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.google.gson.Gson;
import com.macro.mall.base.service.impl.ImgUtilsService;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.common.base.MValues;
import com.macro.mall.communicate.match.bean.MatchParam;
import com.macro.mall.mapper.DMatchInfoDao;
import com.macro.mall.mapper.DMatchTypeDetailInfoMapper;
import com.macro.mall.model.*;
import com.macro.mall.util.MLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

@Service
public class MatInfoService<getPreMatchInfo> {
    @Autowired
    private DMatchInfoDao dMatchInfoMapper;

    @Autowired
    private DMatchTypeDetailInfoMapper dMatchDetailTypeInfoMapper;


    @Autowired
    ImgUtilsService imgUtilsService;


    /**
     * 赛事管理查询
     * @param dMatchInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchInfo> queryMatchInfo(DMatchInfo dMatchInfo, Integer pageNum, Integer pageSize) throws UnsupportedEncodingException {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchInfo> DMatchInfoList =dMatchInfoMapper.queryList(dMatchInfo);
        for (DMatchInfo dMatchInfo1:DMatchInfoList){
            dMatchInfo1.setMatchRulesString(dMatchInfo1.getMatchRulesTitle());
            dMatchInfo1.setMatchDesString(dMatchInfo1.getMatchDesTitle());
            dMatchInfo1.setMatchAttentionString(dMatchInfo1.getMatchAttentionTitle());
            dMatchInfo1.setMatchNoticeString(dMatchInfo1.getMatchNoticeTitle());
            if (StringUtil.isNotEmpty(dMatchInfo1.getMatchApplyParam())){
            String matchApplyParam=    changeType(dMatchInfo1);
            dMatchInfo1.setMatchApplyParam(matchApplyParam);
            }
        }
        return    DMatchInfoList;
    }

    /**
     *json转String
     * @param dMatchInfo
     * @return
     */
        public String  changeType(DMatchInfo dMatchInfo){

            Gson gson =new Gson();
            MLog.info("个性化参数："+dMatchInfo.getMatchApplyParam());
            MatchParam bean= gson.fromJson( dMatchInfo.getMatchApplyParam(), MatchParam.class);
            Field[] field =bean.getClass().getDeclaredFields();
            StringBuffer sb=new StringBuffer();
            for (int i = 0; i < field.length; i++) {
                String name =field[i].getName();
                name=name.substring(0,1).toUpperCase()+name.substring(1);
                Method m= null;
                try {
                    m = bean.getClass().getMethod("get"+name);
                } catch (NoSuchMethodException e) {
                   MLog.error(e.getMessage());
                }
                String value= null;
                try {
                    value = (String)m.invoke(bean);
                } catch (IllegalAccessException e) {
                    MLog.error(e.getMessage());
                } catch (InvocationTargetException e) {
                    MLog.error(e.getMessage());
                }
                if (value!=null){
                    sb.append(field[i].getName().trim()+",");
//                    if (i!=field.length-1){
//                        sb.append(",");
//                    }
                }

            }
                MLog.info(sb);
            return  sb.substring(0,sb.length()-1);

        }

    /**
     * 创建赛事
     * @param dMatchInfo
     * @return
     */
    public CommonResult  insertMatchInfo(DMatchInfo dMatchInfo)  {
        //当新建赛事时，判断项目名称不能重复
        DMatchInfo dm =new DMatchInfo();
        List<DMatchInfo> list;
        dm.setMatchName(dMatchInfo.getMatchName());
        list =dMatchInfoMapper.queryList(dm);
        if (list.size()>0){
            return CommonResult.failed(66,"matchName");
        }
        createOrEditMatchInfo(dMatchInfo);
        dMatchInfo.setMatchId(dMatchInfo.getMatchTypeId()+dMatchInfo.getMatchGroupId());
        if (StringUtil.isNotEmpty(dMatchInfo.getMatchType()) && "0".equals(dMatchInfo.getMatchType())){ //个人
            dMatchInfo.setMatchStockNum(dMatchInfo.getMatchNumLimit());
        }else {
            dMatchInfo.setMatchStockNum(dMatchInfo.getMatchGroupLimit());
        }
//        dMatchInfo.setMatchStockNum(dMatchInfo.getMatchNumLimit());
        if (!StringUtils.isEmpty(dMatchInfo.getMatchApplyParam())){
            String[] str=dMatchInfo.getMatchApplyParam().split(",");
            StringBuffer sbu=new StringBuffer();
            sbu.append("{");
            for (int i = 0; i <str.length ; i++) {
//                {"emgergencyName":"","emgergencyPhone":"","emgergencyAddress":""}
                sbu.append("\""+str[i].trim()+"\":\"\"");
                if (i!=str.length-1){
                    sbu.append(",");
                }
            }
            sbu.append("}");
            dMatchInfo.setMatchApplyParam(sbu.toString());
        }
        dMatchInfo.setMatchCode("1");
        //X09添加 如果创建的是决赛，则决赛的报名开始时间一定大于预赛的报名结束时间
        DMatchInfo matchPreInfo = dMatchInfoMapper.selectPreMatchById(dMatchInfo.getMatchPreId());
        String preMatchApplyEndTime = matchPreInfo.getMatchApplyEndTime();//预赛的结束时间
        String finalMatchApplyStartTime = dMatchInfo.getMatchApplyStartTime();//决赛的开始时间
        if(( StringUtil.isNotEmpty(finalMatchApplyStartTime)) && (StringUtil.isNotEmpty(finalMatchApplyStartTime)) && (preMatchApplyEndTime.compareTo(finalMatchApplyStartTime)>0)){
            return CommonResult.failed(10,"决赛的报名开始时间一定大于预赛的报名结束时间");
        }

        int num=dMatchInfoMapper.insert(dMatchInfo);
        if (num < 1) {
            return CommonResult.failed();
        } else {
            return CommonResult.success("创建赛事成功！");
        }
    }


    /**预处理H5上送的赛事信息
     *
     * @param dMatchInfo
     */
    public CommonResult createOrEditMatchInfo(DMatchInfo dMatchInfo){
//        //当新建赛事时，判断项目名称不能重复
//        if ("1".equals(flag)){
//            DMatchInfo dm =new DMatchInfo();
//            List<DMatchInfo> list;
//            dm.setMatchName(dMatchInfo.getMatchName());
//            list =dMatchInfoMapper.queryList(dm);
//            if (list.size()>0){
//                return CommonResult.failed(66,"matchName");
//            }
//        }
//        //当编辑赛事时，判断项目名称不能重复
//        if ("2".equals(flag) && (!StringUtils.isEmpty(dMatchInfo.getMatchName()))){
//            DMatchInfo dm =new DMatchInfo();
//            DMatchInfo bean;
//            dm.setMatchName(dMatchInfo.getMatchName());
//            bean =dMatchInfoMapper.queryList1(dm);
//            if (bean!=null &&(!bean.getMatchId().equals(dMatchInfo.getMatchId()))){
//                return CommonResult.failed(66,"matchName");
//            }
//        }
        String uploadImgUrl = null;
        String uploadImgUrl1 = null;
        if (!StringUtils.isEmpty(dMatchInfo.getMatchPhoto())){
            //	处理本地图片
            try {
                uploadImgUrl = imgUtilsService.uploadImg(dMatchInfo.getMatchPhoto(), "file");
            } catch (Exception e) {
                MLog.error("图片上传失败"+"==========="+e.getMessage());
            }
            dMatchInfo.setMatchPhoto(uploadImgUrl);
        }
        if (!StringUtils.isEmpty(dMatchInfo.getMatchPhotoDetail())){
            try {
                uploadImgUrl1 = imgUtilsService.uploadImg(dMatchInfo.getMatchPhotoDetail(), "file");
            } catch (Exception e) {
                MLog.error("图片上传失败"+"==========="+e.getMessage());
            }
            dMatchInfo.setMatchPhotoDetail(uploadImgUrl1);
        }
        String matchTitle="";
        DMatchTypeDetailInfo  bean=null;
        if (!StringUtils.isEmpty(dMatchInfo.getMatchAttentionString())){//根据H5上送的资讯标题查出对应的资讯内容
            matchTitle=dMatchInfo.getMatchAttentionString();
            bean=dMatchDetailTypeInfoMapper.queryMatchDetailTypeInfo(matchTitle);
            if (bean!=null){
                dMatchInfo.setMatchAttention(bean.getMatchDetails());
            }
            dMatchInfo.setMatchAttentionTitle(dMatchInfo.getMatchAttentionString());
        }
        if (!StringUtils.isEmpty(dMatchInfo.getMatchDesString())){
            matchTitle = dMatchInfo.getMatchDesString();
            bean = dMatchDetailTypeInfoMapper.queryMatchDetailTypeInfo(matchTitle);
            if (bean != null) {
                dMatchInfo.setMatchDes(bean.getMatchDetails());
            }
            dMatchInfo.setMatchDesTitle(dMatchInfo.getMatchDesString());
        }
        if (!StringUtils.isEmpty(dMatchInfo.getMatchNoticeString())) {
            matchTitle = dMatchInfo.getMatchNoticeString();
            bean = dMatchDetailTypeInfoMapper.queryMatchDetailTypeInfo(matchTitle);
            if (bean != null) {
                dMatchInfo.setMatchNotice(bean.getMatchDetails());
            }
            dMatchInfo.setMatchNoticeTitle(dMatchInfo.getMatchNoticeString());
        }
        if (!StringUtils.isEmpty(dMatchInfo.getMatchRulesString())) {
            matchTitle = dMatchInfo.getMatchRulesString();
            bean = dMatchDetailTypeInfoMapper.queryMatchDetailTypeInfo(matchTitle);
            if (bean != null) {
                dMatchInfo.setMatchRules(bean.getMatchDetails());
            }
            dMatchInfo.setMatchRulesTitle(dMatchInfo.getMatchRulesString());
        }
        return  null;
    }

    /**
     * 更新赛事
     * @param dMatchInfo
     * @return
     */
    public CommonResult  editMatchInfo(DMatchInfo dMatchInfo)   {
        //当编辑赛事时，判断项目名称不能重复
        if ( !StringUtils.isEmpty(dMatchInfo.getMatchName())){
            DMatchInfo dm =new DMatchInfo();
            DMatchInfo bean;
            dm.setMatchName(dMatchInfo.getMatchName());
            bean =dMatchInfoMapper.queryList1(dm);
            if (bean!=null &&(!bean.getMatchId().equals(dMatchInfo.getMatchId()))){
                return CommonResult.failed(66,"matchName");
            }
        }
        createOrEditMatchInfo(dMatchInfo);
        if (StringUtils.isEmpty(dMatchInfo.getFlag())){
            dMatchInfo.setMatchCheckState("0");
        }
        if (!StringUtils.isEmpty(dMatchInfo.getMatchApplyParam())){
            String[] str=dMatchInfo.getMatchApplyParam().split(",");
            StringBuffer sbu=new StringBuffer();
            sbu.append("{");
            for (int i = 0; i <str.length ; i++) {
//                {"emgergencyName":"","emgergencyPhone":"","emgergencyAddress":""}
                sbu.append("\""+str[i].trim()+"\":\"\"");
                if (i!=str.length-1){
                    sbu.append(",");
                }
            }
            sbu.append("}");
            dMatchInfo.setMatchApplyParam(sbu.toString());
        }
        int num=dMatchInfoMapper.update(dMatchInfo);
        if (num<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("更新赛事成功！");
        }
//        return    num;
    }

    /**
     * 删除赛事
     * @param matchId
     * @return
     */
    public int  deleteMatchInfo(String matchId) {
        int num=dMatchInfoMapper.delete(matchId);
        return    num;
    }

    //======================================
    public DMatchInfo getPreMatchInfo(String matchId){
        DMatchInfo preMatchInfo = dMatchInfoMapper.selectPreMatchById(matchId);
        return preMatchInfo;
    }

}
