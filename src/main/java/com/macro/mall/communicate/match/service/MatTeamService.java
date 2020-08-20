package com.macro.mall.communicate.match.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.macro.mall.mapper.DMatchApplyInfoMapper;
import com.macro.mall.mapper.DMatchInfoDao;
import com.macro.mall.mapper.DMatchMinTermDao;
import com.macro.mall.mapper.DMatchTeamInfoDao;
import com.macro.mall.model.DMatchApplyInfo;
import com.macro.mall.model.DMatchInfo;
import com.macro.mall.model.DMatchMinTerm;
import com.macro.mall.model.DMatchTeamInfo;
import com.macro.mall.util.MLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class MatTeamService {
    @Autowired
    private DMatchTeamInfoDao dMatchTeamInfoMapper;

    @Autowired
    private DMatchMinTermDao dMatchMinTermDao;

    @Autowired
    private DMatchInfoDao dMatchInfoDao;

    @Autowired
    private DMatchApplyInfoMapper dMatchApplyInfoMapper;

    @Autowired
    SmsService smsService;
    /**
     * 查询赛事报名团队信息
     * @param dMatchTeamInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchTeamInfo> list(DMatchTeamInfo dMatchTeamInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        String startTime=dMatchTeamInfo.getStartTime();
        String endTime=dMatchTeamInfo.getEndTime();
        if( StringUtil.isNotEmpty(startTime) && StringUtil.isNotEmpty(endTime) && (startTime.compareTo(endTime)>0)){
           String temp=endTime;
            endTime=startTime;
            startTime=temp;
            dMatchTeamInfo.setStartTime(startTime);
            dMatchTeamInfo.setEndTime(endTime);
        }
        List<DMatchTeamInfo> dMatchTeamInfolist =dMatchTeamInfoMapper.findTeamInfo(dMatchTeamInfo);
        return    dMatchTeamInfolist;
    }

    /**
     * 分行团队信息审核
     * @param dMatchTeamInfo
     * @return
     */
    public int updateStatus(DMatchTeamInfo dMatchTeamInfo) {
        int num=0;
        String teamId=dMatchTeamInfo.getTeamId();
        DMatchTeamInfo teamBean=dMatchTeamInfoMapper.queryTeamInfo1(teamId);
        //当审核通过的时候，需要判断团队赛事是否还有队伍名额  1审核通过  4审核不通过
        if ("1".equals(dMatchTeamInfo.getTeamState())){
            //根据团队id查询赛事id
            if (teamBean!=null && StringUtil.isNotEmpty(teamBean.getMatchId())){
                //判断是否还有队伍名额
                int matchStockNum=  dMatchInfoDao.queryMatchStockNum(teamBean.getMatchId());
                if (matchStockNum>0){
                    num=dMatchTeamInfoMapper.updateTeamInfo(dMatchTeamInfo);
                    dMatchInfoDao.updateStockNum(teamBean.getMatchId());
                    try {
                        smsService.sendMessage("MAT013",teamBean.getTeamHeaderPhone(),null);
                    } catch (Exception e) {
                       MLog.error("手机号："+teamBean.getTeamHeaderPhone()+"发送短信失败！------"+e.getMessage());
                    }
                }else {
                    num=10000;
                }
            }
        }else {
            num=dMatchTeamInfoMapper.updateTeamInfo(dMatchTeamInfo);
            try {
                smsService.sendMessage("MAT014",teamBean.getTeamHeaderPhone(),teamBean.getTeamName());
            } catch (Exception e) {
                MLog.error("手机号："+teamBean.getTeamHeaderPhone()+"发送短信失败！------"+e.getMessage());
            }

        }

        return num;
    }

    /**
     * 赛事大小项查询
     * @return
     */
    public List<DMatchMinTerm> findAll() {
        List<DMatchMinTerm> dMatchMinTermList =dMatchMinTermDao.FindAll();
        return    dMatchMinTermList;
    }

    /**
     * 批量审核团队信息
     * @param teamId
     * @param flag
     */
    @Transactional(rollbackFor = Exception.class)
    public int updateTeamAll(String teamId,String flag,String loginName,String teamCheckDes) {
        int num=0;
        String[] st=teamId.split(",");
        MLog.info("0  批量通过   1    批量拒绝-------------------flag："+flag);
            for (int i=0;i<st.length;i++){
                String id=st[i];
                DMatchTeamInfo bean=dMatchTeamInfoMapper.queryTeamInfo1(id);
                //批量通过
                if("0".equals(flag)){
                    //根据团队id查询赛事id
                    if (bean!=null&&StringUtil.isNotEmpty(bean.getMatchId())){
                        //判断是否还有队伍名额
                        int matchStockNum=  dMatchInfoDao.queryMatchStockNum(bean.getMatchId());
                        if (matchStockNum>0){
                            num =    dMatchTeamInfoMapper.updateAllTeamInfo(loginName,id,teamCheckDes);
                            dMatchInfoDao.updateStockNum(bean.getMatchId());
                            try {
                                smsService.sendMessage("MAT013",bean.getTeamHeaderPhone(),null);
                            } catch (Exception e) {
                                MLog.error("手机号："+bean.getTeamHeaderPhone()+"发送短信失败！------"+e.getMessage());
                            }
                        }else {
                            num=10000;
                            return num;
                        }
                    }
                }else {//批量拒绝
                    num =    dMatchTeamInfoMapper.updateAllTeamInfo1(loginName,id,teamCheckDes);
                    try {
                        smsService.sendMessage("MAT014",bean.getTeamHeaderPhone(),bean.getTeamName());
                    } catch (Exception e) {
                        MLog.error("手机号："+bean.getTeamHeaderPhone()+"发送短信失败！------"+e.getMessage());
                    }
                }
            }
            return num;
    }

    /**
     * 赛事报名报表查询
     * @param dMatchInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchInfo> queryMatchReportList(DMatchInfo dMatchInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        //当前端上送的时间反了的时候，后台将开始时间和结束时间互换一下
        String startTime=dMatchInfo.getStartTime();
        String endTime=dMatchInfo.getEndTime();
        if( ( StringUtil.isNotEmpty(startTime)) && (StringUtil.isNotEmpty(endTime)) && (startTime.compareTo(endTime)>0)){
            String temp=endTime;
            endTime=startTime;
            startTime=temp;
            dMatchInfo.setStartTime(startTime);
            dMatchInfo.setEndTime(endTime);
        }
        List<DMatchInfo> dMatchInfoList =dMatchInfoDao.queryMatchReportList(dMatchInfo);
        return    dMatchInfoList;
    }

    /**
     * 查询个人赛某一项赛事报名列表
     * @param dMatchApplyInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchApplyInfo> queryMatchApplyByKey(DMatchApplyInfo dMatchApplyInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchApplyInfo> applyInfoList =dMatchApplyInfoMapper.selectByPrimaryKey1(dMatchApplyInfo);
        return    applyInfoList;
    }


    /**
     * 查询团队报名信息
     * @param dMatchTeamInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchTeamInfo> queryMatchTeamApplyByKey(DMatchTeamInfo dMatchTeamInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchTeamInfo> list =dMatchTeamInfoMapper.queryMatchTeamApplyByKey(dMatchTeamInfo);
        return    list;
    }


    /**
     * 查询具体团队报名信息
     * @param dMatchApplyInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchApplyInfo> queryTeamList(DMatchApplyInfo dMatchApplyInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchApplyInfo> list =dMatchApplyInfoMapper.selectTeamsByone(dMatchApplyInfo);
        return    list;
    }


    /**
     * 查询赛事大项信息
     * @param dMatchMinTerm
     * @param
     * @param
     * @return
     */
    public List<DMatchMinTerm> queryMatchMaxList(DMatchMinTerm dMatchMinTerm) {

        List<DMatchMinTerm> list =dMatchMinTermDao.FindAllByOne(dMatchMinTerm);
        return    list;
    }

}
