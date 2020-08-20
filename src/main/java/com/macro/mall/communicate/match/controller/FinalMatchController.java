package com.macro.mall.communicate.match.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.match.service.*;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.util.MLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;


/**
 * 决赛白名单Controller
 *  2020/08/13
 *  裴玉婷
 */
@Controller
@Api(tags = "FinalMatchController", description = "决赛白名单创建")
@RequestMapping("/final")
public class FinalMatchController {
    @Resource
    private FinalMatTeamService finalMatTeamService;
    @Resource
    private SmsService smsService;
    @Resource
    private MatReportDownloadService matReportDownloadService;
    @Autowired
    private DMatchFinalsInfoMapper matchFinalsInfoMapper;
    @Autowired
    private DMatchApplyInfoMapper matchApplyInfoMapper;

    @ApiOperation("查询预赛")
    @RequestMapping(value = "/queryPreMatch", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DMatchInfo>> queryPreMatch(
            @RequestParam String matchGroupId
    ) {
        List <DMatchInfo> dMatchInfos = finalMatTeamService.queryPreMatchInfo(matchGroupId);
        return CommonResult.success(CommonPage.restPage(dMatchInfos));
    }

//    @ApiOperation("查询赛事小项不分页")
//    @RequestMapping(value = "/matchMinList1", method = RequestMethod.GET)
//    @ResponseBody
//    public CommonResult <CommonPage<DMatchMinTerm>> matchMinList1(DMatchMinTerm dMatchMinTerm
//    ) {
//
//        List<DMatchMinTerm>  list=   matchTypeService.matchMinList1(dMatchMinTerm);
//
//        return CommonResult.success(CommonPage.restPage(list));
//    }
//

    @ApiOperation("查询赛事白名单")
    @RequestMapping(value = "/queryWhiteUser", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DMatchFinalsInfo>> queryWhiteUser(
            @RequestParam String matchId,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

        List<DMatchFinalsInfo> list = finalMatTeamService.queryWhiteUser(matchId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("添加决赛白名单")
    @RequestMapping(value = "/insertWhiteUser", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertWhiteUser(
            @RequestParam String matchId,
            @RequestParam String userNm ){
        return finalMatTeamService.insertWhiteUser(userNm,matchId);
    }
    @ApiOperation("反显添加白名单数据")
    @RequestMapping(value = "/selectWhiteUser", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Map<String,String>> selectWhiteUser(
            @RequestParam String matchId,
            @RequestParam String userNm ){
        return finalMatTeamService.selectWhiteUser(userNm, matchId);
    }


    @ApiOperation("赛事Excel下载")
    @RequestMapping(value = "/downloadFinalExcel", method = RequestMethod.GET)
    @ResponseBody
    public void downloadExcel(HttpServletResponse response) {
        smsService.downloadFinalExcel(response);
    }



    @ApiOperation("批量导入白名单")
    @RequestMapping(value = "/whiteSumInsert/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult matchRegister(@PathVariable("id") String id,HttpServletRequest request)  {
        MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
        MultiValueMap<String, MultipartFile> multiFileMap = mr.getMultiFileMap();
        for (Map.Entry<String, List<MultipartFile>> m : multiFileMap.entrySet()) {
            MLog.info("getMultiFileMap===" + m.getKey());
            List<MultipartFile> excelFile = mr.getMultiFileMap().get(m.getKey());
            for (MultipartFile f : excelFile) {
                MLog.info("fileName==" + f.getOriginalFilename());
                try {
                    matReportDownloadService.userFinalMatchExcel(f,id);
                } catch (Exception e) {
                    return CommonResult.failed();
                }
            }
        }
        return CommonResult.success("文件上传成功！");
    }

    @ApiOperation("批量更新删除的数据")
    @RequestMapping(value = "/whiteSumDel", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMatchType(@RequestParam String id) {
        String data[] = null;
        if (!(id == null)) {
            data = id.split(",");
        }
        int i = matchFinalsInfoMapper.updateRemoveById(data);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("更新删除数据成功！");
        }
    }
}
