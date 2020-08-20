package com.macro.mall.communicate.match.service;


import com.github.pagehelper.PageHelper;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.mapper.DMatchApplyInfoMapper;
import com.macro.mall.mapper.DMatchFinalsInfoMapper;
import com.macro.mall.mapper.DMatchInfoDao;
import com.macro.mall.model.DMatchApplyInfo;
import com.macro.mall.model.DMatchFinalsInfo;
import com.macro.mall.model.DMatchInfo;
import com.macro.mall.util.DateUtil;
import com.macro.mall.util.MLog;
import com.macro.mall.util.StringUtils;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FinalMatTeamService {

    @Autowired
    private DMatchInfoDao dMatchInfoDao;
    @Autowired
    private DMatchFinalsInfoMapper matchFinalsInfoMapper;
    @Autowired
    private DMatchApplyInfoMapper matchApplyInfoMapper;

    public List <DMatchInfo> queryPreMatchInfo(String matchGroupId) {
        List<DMatchInfo> dMatchInfoList =dMatchInfoDao.queryPreMatchList(matchGroupId);
        return   dMatchInfoList;
    }

    public List <DMatchFinalsInfo> queryWhiteUser(String matchId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchFinalsInfo> dMatchInfoList =matchFinalsInfoMapper.queryPreMatchList(matchId);
        return   dMatchInfoList;
    }


    public CommonResult<Map<String,String>> selectWhiteUser (String userNm, String matchId) {
        //校验上送的手机号是否符合要求
        Map<String,String> retMap=new HashMap <>();
        boolean b = StringUtils.validateMobilePhone(userNm);
        if(!b){
            return CommonResult.failed(66,"请输入正确格式的手机号");
        }
        DMatchApplyInfo applyInfo =matchApplyInfoMapper.selectApplyUserInfo(userNm,matchId);
        String certId;
        String userName;
        if(applyInfo!=null){
            certId = applyInfo.getCertId();//证件号
            userName = applyInfo.getRealName();//真实姓名
        }else{
            return CommonResult.failed(66,"您未报名，请先报名预赛");
        }
        retMap.put("certId",certId);
        retMap.put("userName",userName);
        return CommonResult.success(retMap);
    }
    /**
     * 插入白名单数据
     * @param
     * @return
     */
    public CommonResult insertWhiteUser (String userNm, String matchId) {
            String state="1";//默认正常数据
            String details="";
            //校验上送的手机号是否符合要求
            boolean b = StringUtils.validateMobilePhone(userNm);
            if(!b){
                state="0";
                details="异常数据";
            }
            DMatchApplyInfo applyInfo =matchApplyInfoMapper.selectApplyUserInfo(userNm,matchId);
            DMatchFinalsInfo finalInfo=new DMatchFinalsInfo();
            String certId;
            String userName;
            if(applyInfo!=null){
                certId = applyInfo.getCertId();//证件号
                userName = applyInfo.getRealName();//真实姓名
                finalInfo.setCertNo(certId);
                finalInfo.setUserName(userName);
                finalInfo.setMatchType(applyInfo.getMatchType());
                finalInfo.setHeadFlag("0".equals(applyInfo.getMatchType())? "1" : applyInfo.getHeadFlag());
            }else{
                state="0";
                details="此用户在报名表中未查询到信息";
            }
            finalInfo.setId(UUID.randomUUID().toString());
            finalInfo.setUserNm(userNm);
            finalInfo.setMatchId(matchId);
            finalInfo.setCreatTime(DateUtil.getDate(new Date()));
            finalInfo.setState(state);
            finalInfo.setDetails(details);
            int num=matchFinalsInfoMapper.insertFinalMatch(finalInfo);
            if (num < 1) {
                return CommonResult.failed();
            } else {
                return CommonResult.success("添加白名单数据成功！");
            }
    }
}
