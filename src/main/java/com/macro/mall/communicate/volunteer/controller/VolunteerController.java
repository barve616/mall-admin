package com.macro.mall.communicate.volunteer.controller;


import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.volunteer.service.VolunteerService;
import com.macro.mall.model.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 * 志愿者活动报名Controller
 *  2020/08/12
 *  蔡威
 */
@Controller
@Api(tags = "VolunteerController", description = "志愿者活动报名")
@RequestMapping("/vlt")
public class VolunteerController {


    @Resource
    private VolunteerService volunteerService;

    @ApiOperation("志愿者活动报名列表")
    @RequestMapping(value = "/queryVltList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DMatchApplyInfo>> queryVltList(
            DMatchApplyInfo dMatchApplyInfo,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum
    ) {
        List<DMatchApplyInfo> dMatchApplyInfoList = volunteerService.queryVltList(dMatchApplyInfo, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(dMatchApplyInfoList));
    }


    /**
     * 志愿者活动报名列表导出
     *
     * @throws Exception
     */
    @RequestMapping(value = "/vltReportDownloadList", method = RequestMethod.GET)
    @ApiOperation("志愿者活动报名列表导出")
    public void vltReportDownloadList(HttpServletResponse response, DMatchApplyInfo dMatchApplyInfo) {
        volunteerService.vltReportDownloadList(response, dMatchApplyInfo);
    }





    /**
     * 88活动打卡时间
     *
     * @throws Exception
     */
    @ApiOperation("88活动打卡时间查询")
    @RequestMapping(value = "/queryStepActivity", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<DStepActivity> queryStepActivity(
    ) {
        return CommonResult.success(volunteerService.queryStepActivity());
    }




    @ApiOperation("88活动打卡时间编辑")
    @RequestMapping(value = "/editStepActivity", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult editStepActivity(@RequestBody DStepActivity dStepActivity)   {

        return volunteerService.editStepActivity(dStepActivity);
    }

    @ApiOperation("88活动数据清除")
    @RequestMapping(value = "/detailStepActivity", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult detailStepActivity()   {
        return volunteerService.detailStepActivity();
    }
}



