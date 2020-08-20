package com.macro.mall.communicate.matchResult.controller;


import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.matchResult.service.VoteService;
import com.macro.mall.model.DMatchInfo;
import com.macro.mall.model.DMatchResultInfo;
import com.macro.mall.model.DMatchVoteInfo;
import com.macro.mall.util.MLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 赛事成绩投票Controller
 *  2020/06/15
 *  蔡威
 */
@Controller
@Api(tags = "MatController", description = "赛事队伍信息管理")
@RequestMapping("/mat")
public class MatchResultController {


    @Resource
    private VoteService voteService;

    @ApiOperation("获取赛事投票榜单信息")
    @RequestMapping(value = "/queryVoteList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DMatchVoteInfo>> queryVoteList(
            DMatchVoteInfo dMatchVoteInfo,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum
    ) {
        List<DMatchVoteInfo> dMatchVoteInfoList = voteService.queryVoteList(dMatchVoteInfo, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(dMatchVoteInfoList));
    }


    /**
     * 赛事投票信息导出
     *
     * @throws Exception
     */
    @RequestMapping(value = "/voteReportDownloadList", method = RequestMethod.GET)
    @ApiOperation("赛事投票信息导出")
    public void voteReportDownloadList(HttpServletResponse response, DMatchVoteInfo dMatchVoteInfo) {
        voteService.voteReportDownloadList(response, dMatchVoteInfo);
    }


    @ApiOperation("获取赛事成绩信息")
    @RequestMapping(value = "/queryResultList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DMatchResultInfo>> queryResultList(
            DMatchResultInfo dMatchResultInfo,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum
    ) {
        List<DMatchResultInfo> dMatchVoteInfoList = voteService.queryResultList(dMatchResultInfo, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(dMatchVoteInfoList));
    }


    @ApiOperation("赛事成绩模版下载")
    @RequestMapping(value = "/downloadResultExcel", method = RequestMethod.GET)
    @ResponseBody
    public void downloadExcel(HttpServletResponse response) {
        voteService.downloadResultExcel(response);
    }

    @ApiOperation("赛事成绩报表导入")
    @RequestMapping(value = "/uploadResultReport", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult uploadResultReport(HttpServletRequest request)  {
        MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
        MultiValueMap<String, MultipartFile> multiFileMap = mr.getMultiFileMap();
        for (Map.Entry<String, List<MultipartFile>> m : multiFileMap.entrySet()) {
            MLog.info("getMultiFileMap===" + m.getKey());
            List<MultipartFile> excelFile = mr.getMultiFileMap().get(m.getKey());
            for (MultipartFile f : excelFile) {
                MLog.info("fileName==" + f.getOriginalFilename());
                try {
                    voteService.userExcel1(f);
                } catch (Exception e) {
                    return CommonResult.failed();
                }
            }
        }
        return CommonResult.success("文件上传成功！");
    }


    /**
     * 赛事成绩信息导出
     *
     * @throws Exception
     */
    @RequestMapping(value = "/resultReportDownloadList", method = RequestMethod.GET)
    @ApiOperation("赛事成绩信息导出")
    public void resultReportDownloadList(HttpServletResponse response, DMatchResultInfo dMatchResultInfo) {
        voteService.resultReportDownloadList(response, dMatchResultInfo);
    }


    @ApiOperation("删除赛事成绩")
    @RequestMapping(value = "/deleteMatchResult", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult editMatchInfo(@RequestBody DMatchResultInfo dMatchResultInfo)   {

        return voteService.deleteMatchResult(dMatchResultInfo);
    }
}
