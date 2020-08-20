package com.macro.mall.communicate.resourcecenter.controller;


import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.resourcecenter.bean.CoachTeamInfoVO;
import com.macro.mall.communicate.resourcecenter.service.CoachTeamService;
import com.macro.mall.communicate.resourcecenter.service.PosShopInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@Api(tags = "CoachTeamController", description = "教练团队维护")
@RequestMapping("/coachTeam")
public class CoachTeamController {

    @Autowired
    private CoachTeamService coachTeamService;

    /**
     * 根据店铺id查询所有教练信息
     * workState 00 查询 在职的教练  01 查询 不在职 空 查询所有
     */
    @ApiOperation("查询店铺id所有教练列表")
    @RequestMapping(value = "/getCoachTeamList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getCoachTeamList(String shopId, String workState,
                                         @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        return coachTeamService.getCoachTeamList(shopId,pageSize,pageNum);
    }

    /**
     * 根据店铺id查询有效的教练信息
     * workState 00 查询 在职的教练  01 查询 不在职 空 查询所有
     */
    @ApiOperation("查询店铺id所有在职教练列表")
    @RequestMapping(value = "/getValidCoachTeamList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getValidCoachTeamList(String shopId){
        return coachTeamService.getValidCoachTeamList(shopId);
    }


    @ApiOperation("新增或者教练信息")
    @RequestMapping(value = "/addOrUpdateCoachTeam", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addOrUpdateCoachTeam(@Valid @RequestBody CoachTeamInfoVO coachTeamInfoVO){
        return coachTeamService.addOrUpdateCoachTeam(coachTeamInfoVO);
    }

    @ApiOperation("查询教练信息")
    @RequestMapping(value = "/getCoachTeamDetail", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getCoachTeamDetail(String coachId){
        return coachTeamService.getCoachTeamDetail(coachId);
    }

    @ApiOperation("根据id修改教练状态")
    @RequestMapping(value = "/updateCoachTeamStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateCoachTeamStatus(String coachId,String workState){
        return coachTeamService.updateCoachTeamStatus(coachId,workState);
    }

}
