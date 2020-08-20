package com.macro.mall.communicate.resourcecenter.service;


import com.github.pagehelper.PageHelper;
import com.macro.mall.base.service.impl.ImgUtilsService;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.bean.CoachTeamInfoVO;
import com.macro.mall.mapper.TSportCoachTeamMapper;
import com.macro.mall.model.TSportCoachTeam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.UUID;

@Service
public class CoachTeamService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CoachTeamService.class);
    @Autowired
    private TSportCoachTeamMapper coachTeamMapper;

    @Autowired
    private ImgUtilsService imgUtilsService;

    /**
     * 根据店铺id查询有效的教练信息
     * workState 00 查询 在职的教练  01 查询 不在职 空 查询所有
     * @return
     */
    public CommonResult<CommonPage<TSportCoachTeam>> getCoachTeamList(String shopId,Integer pageSize, Integer pageNum){
        if(StringUtils.isEmpty(shopId)){
            LOGGER.error("店铺id不能是空shopId");
            return CommonResult.failed("店铺id不能是空");
        }
        try {
            PageHelper.startPage(pageNum,pageSize);
            List<TSportCoachTeam> coachTeamList = coachTeamMapper.getCoachTeamByShopId(shopId,null);
            return CommonResult.success(CommonPage.restPage(coachTeamList),"查询教练信息成功");
        }catch (Exception e){
            LOGGER.error("根据店铺id查询有效的教练信息查询报错 shopId="+shopId+"======="+e.getMessage());
            return CommonResult.failed("查询教练信息失败");
        }
    }
    /**
     * 根据店铺id查询有效的教练信息
     * workState 00 查询 在职的教练  01 查询 不在职 空 查询所有
     * @return
     */
    public CommonResult getValidCoachTeamList(String shopId){
        if(StringUtils.isEmpty(shopId)){
            LOGGER.error("店铺id不能是空shopId");
            return CommonResult.failed("店铺id不能是空");
        }
        try {
            List<TSportCoachTeam> coachTeamList = coachTeamMapper.getCoachTeamByShopId(shopId,"00");
            return CommonResult.success(coachTeamList,"查询教练信息成功");
        }catch (Exception e){
            LOGGER.error("根据店铺id查询有效的教练信息查询报错 shopId="+shopId +"======="+e.getMessage());
            return CommonResult.failed("查询教练信息失败");
        }
    }

    /**
     *
     * @param coachTeamInfoVO
     * @return
     */
    public CommonResult addOrUpdateCoachTeam(CoachTeamInfoVO coachTeamInfoVO){
        if(coachTeamInfoVO == null){
            return CommonResult.failed("教练信息不能是空");
        }
        String coachId = coachTeamInfoVO.getCoachId();
        TSportCoachTeam sportCoachTeam=new TSportCoachTeam();
        sportCoachTeam.setCoachName(coachTeamInfoVO.getCoachName());
        sportCoachTeam.setCoachGender(coachTeamInfoVO.getCoachGender());
        sportCoachTeam.setSpecialty(coachTeamInfoVO.getSpecialty());
        sportCoachTeam.setTeachingAge(coachTeamInfoVO.getTeachingAge());
        sportCoachTeam.setShopId(coachTeamInfoVO.getShopId());
        sportCoachTeam.setWorkState("00");//默认在职状态
        String coachHeadUrlPic = coachTeamInfoVO.getCoachHeadUrl();
        try {
            if(coachHeadUrlPic.indexOf("/mlife")==-1){
                String coachHeadUrl = imgUtilsService.uploadImg(coachHeadUrlPic, "file");
                sportCoachTeam.setCoachHeadUrl(coachHeadUrl);//店铺logo
            }else{
                sportCoachTeam.setCoachHeadUrl(coachTeamInfoVO.getCoachHeadUrl());//头像url
            }
        }catch (Exception e){
            LOGGER.error("图片上传失败"+"==========="+e.getMessage());
            return CommonResult.failed("上传图片失败");
        }
        try {
            if(StringUtils.isEmpty(coachId)){  //增加
                String id = String.valueOf(UUID.randomUUID()).replaceAll("-", "");
                sportCoachTeam.setCoachId(id);
                int i = coachTeamMapper.insertSelective(sportCoachTeam);
                if(i>0){
                    return CommonResult.success(null,"增加教练团队成功");
                }else{
                    return CommonResult.failed("增加教练团队失败");
                }
            }
            sportCoachTeam.setCoachId(coachTeamInfoVO.getCoachId());
            int u = coachTeamMapper.updateByPrimaryKeySelective(sportCoachTeam);
            if(u>0){
                return CommonResult.success(null,"修改教练团队成功");
            }else{
                return CommonResult.failed("修改教练团队失败");
            }
        }catch (Exception e){
            LOGGER.error("增加或者修改教练团队报错 coachTeamInfoVO="+coachTeamInfoVO.toString() +"========="+e.getMessage());
            return CommonResult.failed("增加或者修改教练团队失败");
        }

    };

    /**
     * 根据id查询教练信息
     * @param coachId
     * @return
     */
    public CommonResult getCoachTeamDetail(String coachId){
        if(StringUtils.isEmpty(coachId)){
            return  CommonResult.failed("教练id不能是null");
        }
        try {
            TSportCoachTeam sportCoachTeam = coachTeamMapper.selectByPrimaryKey(coachId);
            return CommonResult.success(sportCoachTeam,"查询教练信息成功");
        }catch (Exception e){
            LOGGER.error("查询教练信息失败 coachId="+coachId+" ===================="+e.getMessage()) ;
            return CommonResult.failed("查询教练信息失败");
        }

    }


    /**
     * 根据id修改教练状态
     * @param coachId
     * @return
     */
    public CommonResult updateCoachTeamStatus(String coachId,String workState){
        if(StringUtils.isEmpty(coachId)){
            return  CommonResult.failed("教练id不能是null");
        }
        if(StringUtils.isEmpty(workState)){
            return  CommonResult.failed("修改的状态不能是空");
        }
        TSportCoachTeam sportCoachTeam =new TSportCoachTeam();
        sportCoachTeam.setCoachId(coachId);
        sportCoachTeam.setWorkState(workState);
        try {
            int u = coachTeamMapper.updateByPrimaryKeySelective(sportCoachTeam);
            if(u>0){
                return CommonResult.success(null,"修改教练状态成功");
            }else{
                return CommonResult.failed("修改教练状态失败");
            }
        }catch (Exception e){
            LOGGER.error("修改教练状态失败 coachId="+coachId +" workState="+workState);
            e.printStackTrace();
            return CommonResult.failed("修改教练状态失败");
        }


    }

}
