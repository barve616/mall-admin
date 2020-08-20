package com.macro.mall.communicate.match.controller;

import com.github.pagehelper.util.StringUtil;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.communicate.match.bean.DMatchTypeDetailInfoBean;
import com.macro.mall.communicate.match.bean.UpPicBean;
import com.macro.mall.communicate.match.bean.UpdateBean;
import com.macro.mall.communicate.match.service.*;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.util.MLog;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;


/**
 * 赛事队伍信息管理Controller
 *  2020/06/15
 *  蔡威
 */
@Controller
@Api(tags = "MatController", description = "赛事队伍信息管理")
@RequestMapping("/mat")
public class MatController {


    @Resource
    private MatTeamService matTeamService;

    @Resource
    private MatInfoService matInfoService;

    @Resource
    private MatReportDownloadService matReportDownloadService;

    @Resource
    private SmsService smsService;

    @Resource
    private MatchTypeService matchTypeService;
    @Autowired
    private DMatchTypeInfoMapper dMatchTypeInfoMapper;
    @Autowired
    private DMatchTypeDetailInfoMapper dMatchTypeDetailInfoMapper;

    @Autowired
    private DMatchParam1InfoMapper dMatchParam1InfoMapper;

    @Autowired
    private DMatchMaxtypeMapper dMatchMaxtypeMapper;
    @Autowired
    private DMatchMaxtermMapper dMatchMaxtermMapper;
    @Autowired
    private DMatchMinTermDao dMatchMinTermMapper;
    @Autowired
    private DMatchRotationChartInfoMapper dMatchRotationChartInfoMapper;



    @ApiOperation("获取所有队伍信息")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DMatchTeamInfo>> list(
            DMatchTeamInfo dMatchTeamInfo,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum
    ) {

        List<DMatchTeamInfo> dMatchTeamInfoList = matTeamService.list(dMatchTeamInfo, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(dMatchTeamInfoList));
    }

    @ApiOperation("审核团队状态")
    @RequestMapping(value = "/updateStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateStatus(@RequestBody DMatchTeamInfo dMatchTeamInfo) {
        int count = matTeamService.updateStatus(dMatchTeamInfo);
        if (count > 0) {
            //当返回的count的值为10000时，提示客户该团队赛事的队伍满员了
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }

    }

    @ApiOperation("赛事大小项")
    @RequestMapping(value = "/finAll", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult finAll() {
        List<DMatchMinTerm> list = matTeamService.findAll();
        return CommonResult.success(list);
    }


    @ApiOperation("批量更新团队状态")
    @RequestMapping(value = "/updateTeamAll", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateTeamAll(@RequestBody UpdateBean updateBean) {
        String teamId = updateBean.getTeamId();
        String flag = updateBean.getFlag();
        String loginName = updateBean.getLoginName();
        String teamCheckDes=updateBean.getTeamCheckDes();
        try {
        int num=    matTeamService.updateTeamAll(teamId, flag, loginName,teamCheckDes);
            return CommonResult.success(num);
        } catch (Exception e) {
            return CommonResult.failed();
        }
    }


    @ApiOperation("获取赛事报名报表信息")
    @RequestMapping(value = "/queryMatchReportList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DMatchInfo>> queryMatchReportList(
            DMatchInfo dMatchInfo,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum
    ) {

        List<DMatchInfo> dMatchInfoList = matTeamService.queryMatchReportList(dMatchInfo, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(dMatchInfoList));
    }


    @ApiOperation("查询个人赛某一项赛事报名列表")
    @RequestMapping(value = "/queryMatchApplyByKey", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DMatchApplyInfo>> queryMatchApplyByKey(
            DMatchApplyInfo dMatchApplyInfo,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

        List<DMatchApplyInfo> list = matTeamService.queryMatchApplyByKey(dMatchApplyInfo, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));

    }


    @ApiOperation("查询团队具体报名信息")
    @RequestMapping(value = "/queryTeamList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DMatchApplyInfo>> queryTeamList(
            DMatchApplyInfo dMatchApplyInfo,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

        List<DMatchApplyInfo> list = matTeamService.queryTeamList(dMatchApplyInfo, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));

    }


    @ApiOperation("查询赛事大项信息")
    @RequestMapping(value = "/queryMatchMaxList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<DMatchMinTerm>> queryMatchMaxList(
            @RequestBody DMatchMinTerm dMatchMinTerm
    ) {
        List<DMatchMinTerm> list = matTeamService.queryMatchMaxList(dMatchMinTerm);
        return CommonResult.success(CommonPage.restPage(list));

    }


    /**
     * 赛事列表导出
     *
     * @throws Exception
     */
    @RequestMapping(value = "/matchReportDownloadList", method = RequestMethod.GET)
    @ApiOperation("赛事列表导出")
    public void matchReportDownloadList(HttpServletResponse response, DMatchInfo dMatchInfo) {

        matReportDownloadService.matchReportDownloadList(response, dMatchInfo);
    }


    @ApiOperation("个人赛报表全量导出")
    @RequestMapping(value = "/matchPersonReportAll", method = RequestMethod.GET)
    @ResponseBody
    public void matchPersonReportAll(HttpServletResponse response, DMatchApplyInfo dMatchApplyInfo) {
        matReportDownloadService.matchPersonReportAll(response, dMatchApplyInfo);
    }


    @ApiOperation("团体赛报表全量导出")
    @RequestMapping(value = "/matchTeamReportAll", method = RequestMethod.GET)
    @ResponseBody
    public void matchTeamReportAll(HttpServletResponse response, DMatchApplyInfo dMatchApplyInfo) {
        matReportDownloadService.matchTeamReportAll(response, dMatchApplyInfo);
    }


    @ApiOperation("下载报表获取key值")
    @RequestMapping(value = "/getKey", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getKey() {
        return CommonResult.success(matReportDownloadService.getKey());
    }


    @ApiOperation("优质客户报名")
    @RequestMapping(value = "/matchRegister", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult matchRegister(HttpServletRequest request)  {
        MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
        MultiValueMap<String, MultipartFile> multiFileMap = mr.getMultiFileMap();
        for (Map.Entry<String, List<MultipartFile>> m : multiFileMap.entrySet()) {
            MLog.info("getMultiFileMap===" + m.getKey());
            List<MultipartFile> excelFile = mr.getMultiFileMap().get(m.getKey());
            for (MultipartFile f : excelFile) {
                MLog.info("fileName==" + f.getOriginalFilename());
                try {
                    matReportDownloadService.userExcel(f);
                } catch (Exception e) {
                    return CommonResult.failed();
                }
            }
        }
        return CommonResult.success("文件上传成功！");
    }


    @ApiOperation("赛事Excel下载")
    @RequestMapping(value = "/downloadExcel", method = RequestMethod.GET)
    @ResponseBody
    public void downloadExcel(HttpServletResponse response) {
        smsService.downloadExcel(response);
    }


    @ApiOperation("优质客户报名列表查询")
    @RequestMapping(value = "/customerReportList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DMatchRegister>> customerReportList(DMatchRegister dMatchRegister,
                                                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DMatchRegister> list = matReportDownloadService.customerReportList(dMatchRegister, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }


    @ApiOperation("批量发短信")
    @RequestMapping(value = "/sendMessage", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult sendMessage() {
        try {
            matReportDownloadService.sendMessage();
        } catch (Exception e) {
            return CommonResult.failed();
        }
        return CommonResult.success("批量发短信成功！");
    }

    @ApiOperation("查询资讯类型")
    @RequestMapping(value = "/queryMatchType", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchTypeInfo>> queryMatchType(DMatchTypeInfo dMatchTypeInfo,
         @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

        List<DMatchTypeInfo>  list=   matchTypeService.queryMatchType(dMatchTypeInfo,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }


    @ApiOperation("查询资讯类型不分页")
    @RequestMapping(value = "/queryMatchType1", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchTypeInfo>> queryMatchType1(DMatchTypeInfo dMatchTypeInfo) {

        List<DMatchTypeInfo>  list=   matchTypeService.queryMatchType1(dMatchTypeInfo);
        return CommonResult.success(CommonPage.restPage(list));
    }



    @ApiOperation("创建赛事资讯类型")
    @RequestMapping(value = "/insertMatchType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertMatchType(  @RequestBody DMatchTypeInfo dMatchTypeInfo) {
        if (StringUtils.isEmpty(dMatchTypeInfo.getMatchTypeName())){
            return CommonResult.failed(66,"资讯类型名称不能为空！");
        }
        DMatchTypeInfo dm=new DMatchTypeInfo();
        dm.setMatchTypeName(dMatchTypeInfo.getMatchTypeName());
        List<DMatchTypeInfo> list =dMatchTypeInfoMapper.queryMatchType(dm);
        if (list.size()>0){
            return CommonResult.failed(66,"matchTypeName");
        }
        int i=  matchTypeService.insertMatchType(dMatchTypeInfo);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("创建赛事资讯类型成功！");
        }
    }

    @ApiOperation("删除赛事资讯类型")
    @RequestMapping(value = "/deleteMatchType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMatchType(@RequestBody DMatchTypeDetailInfo dMatchTypeDetailInfo) {
        DMatchTypeDetailInfo dm=new DMatchTypeDetailInfo();
        dm.setMatchTypeId(dMatchTypeDetailInfo.getMatchTypeId());
        List<DMatchTypeDetailInfo> dMatchList =dMatchTypeDetailInfoMapper.queryMatchDetailType(dm);
        if (dMatchList.size()>0){
            return   CommonResult.failed(66,"当前类型下存在资讯类型，不能删除。");
        }
        int i=  matchTypeService.deleteMatchType(dMatchTypeDetailInfo.getMatchTypeId());
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("删除赛事资讯类型成功！");
        }
    }



    @ApiOperation("更新赛事资讯类型")
    @RequestMapping(value = "/updateMatchType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateMatchType(@RequestBody DMatchTypeInfo dMatchTypeInfo) {
        if (!StringUtils.isEmpty(dMatchTypeInfo.getMatchTypeName())){
        DMatchTypeInfo dm=new DMatchTypeInfo();
        dm.setMatchTypeName(dMatchTypeInfo.getMatchTypeName());
        DMatchTypeInfo bean =dMatchTypeInfoMapper.queryMatchType1(dm);
        if (bean != null && (!bean.getMatchTypeId().equals(dMatchTypeInfo.getMatchTypeId()))){
            return CommonResult.failed(66,"matchTypeName");
        }}
        int i=  matchTypeService.updateMatchType(dMatchTypeInfo);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("更新赛事资讯类型成功！");
        }


    }






    @ApiOperation("查询资讯内容")
    @RequestMapping(value = "/queryMatchDetailType", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchTypeDetailInfo>> queryMatchDetailType(DMatchTypeDetailInfo dMatchTypeDetailInfo,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DMatchTypeDetailInfo>  list=   matchTypeService.queryMatchDetailType(dMatchTypeDetailInfo,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("查询资讯内容不分页")
    @RequestMapping(value = "/queryMatchDetailType1", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchTypeDetailInfo>> queryMatchDetailType1(DMatchTypeDetailInfo dMatchTypeDetailInfo) {
        List<DMatchTypeDetailInfo>  list=   matchTypeService.queryMatchDetailType1(dMatchTypeDetailInfo);
        return CommonResult.success(CommonPage.restPage(list));
    }


    @ApiOperation("创建赛事资讯内容")
    @RequestMapping(value = "/insertMatchDetailType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertMatchDetailType(@RequestBody DMatchTypeDetailInfoBean dMatchTypeDetailInfo) {
        String matchDes=dMatchTypeDetailInfo.getMatchDetails();
        DMatchTypeDetailInfo dMatchTypeDetailInfo1=new DMatchTypeDetailInfo();
        dMatchTypeDetailInfo1.setMatchTitle(dMatchTypeDetailInfo.getMatchTitle());
        dMatchTypeDetailInfo1.setMatchState(dMatchTypeDetailInfo.getMatchState());
        dMatchTypeDetailInfo1.setMatchStickFlag(dMatchTypeDetailInfo.getMatchStickFlag());
        dMatchTypeDetailInfo1.setMatchTypeId(dMatchTypeDetailInfo.getMatchTypeId());
        dMatchTypeDetailInfo1.setMatchSubtitle(dMatchTypeDetailInfo.getMatchSubtitle());
        try {
            dMatchTypeDetailInfo1.setMatchDetails(matchDes.getBytes("GBK"));
        } catch (UnsupportedEncodingException e) {
            MLog.error(e.getMessage());
        }
        DMatchTypeDetailInfo dm=new DMatchTypeDetailInfo();
        dm.setMatchTitle(dMatchTypeDetailInfo.getMatchTitle());
        List<DMatchTypeDetailInfo> list =dMatchTypeDetailInfoMapper.queryMatchDetailType(dm);
        if (list.size()>0){
            return CommonResult.failed(66,"matchTitle");
        }
//        DMatchTypeDetailInfo dma=new DMatchTypeDetailInfo();
//        List<DMatchTypeDetailInfo> list1=null;
//        if ("1".equals(dMatchTypeDetailInfo.getMatchTypeId()) ) {
//            dma.setMatchTypeId("1");
//             list1 =dMatchTypeDetailInfoMapper.queryMatchDetailType(dma);
//            if (list1.size()>0){
//                return CommonResult.failed(66,"type");
//            }
//        }
//        if ( "3".equals(dMatchTypeDetailInfo.getMatchTypeId()) ) {
//            dma.setMatchTypeId("3");
//            list1 =dMatchTypeDetailInfoMapper.queryMatchDetailType(dma);
//            if (list1.size()>0){
//                return CommonResult.failed(66,"type");
//            }
//        }
//        if ( "4".equals(dMatchTypeDetailInfo.getMatchTypeId()) ) {
//            dma.setMatchTypeId("4");
//            list1 =dMatchTypeDetailInfoMapper.queryMatchDetailType(dma);
//            if (list1.size()>0){
//                return CommonResult.failed(66,"type");
//            }
//        }
//        if (  "5".equals(dMatchTypeDetailInfo.getMatchTypeId())) {
//            dma.setMatchTypeId("5");
//            list1 =dMatchTypeDetailInfoMapper.queryMatchDetailType(dma);
//            if (list1.size()>0){
//                return CommonResult.failed(66,"type");
//            }
//        }
        int i=  matchTypeService.insertMatchDetailType(dMatchTypeDetailInfo1);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("创建赛事资讯内容成功！");
        }
    }

    @ApiOperation("删除赛事资讯内容")
    @RequestMapping(value = "/deleteMatchDetailType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMatchDetailType( @RequestBody DMatchTypeDetailInfo dMatchTypeDetailInfo) {

        int i=  matchTypeService.deleteMatchDetailType(dMatchTypeDetailInfo.getMatchTypeDetailId());
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("删除赛事资讯类型成功！");
        }
    }



    @ApiOperation("更新赛事资讯内容")
    @RequestMapping(value = "/updateMatchDetailType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateMatchDetailType(@RequestBody DMatchTypeDetailInfoBean dMatchTypeDetailInfo) {
        if (!StringUtils.isEmpty(dMatchTypeDetailInfo.getMatchTitle())){
        DMatchTypeDetailInfo dm=new DMatchTypeDetailInfo();
        dm.setMatchTitle(dMatchTypeDetailInfo.getMatchTitle());
        DMatchTypeDetailInfo bean =dMatchTypeDetailInfoMapper.queryMatchDetailType1(dm);
        if (bean != null && (!bean.getMatchTypeDetailId().equals(dMatchTypeDetailInfo.getMatchTypeDetailId()))){
            return CommonResult.failed(66,"matchTitle");
        }}
        String matchDes=dMatchTypeDetailInfo.getMatchDetails();
        DMatchTypeDetailInfo dMatchTypeDetailInfo1=new DMatchTypeDetailInfo();
        dMatchTypeDetailInfo1.setMatchTitle(dMatchTypeDetailInfo.getMatchTitle());
        dMatchTypeDetailInfo1.setMatchState(dMatchTypeDetailInfo.getMatchState());
        dMatchTypeDetailInfo1.setMatchStickFlag(dMatchTypeDetailInfo.getMatchStickFlag());
        dMatchTypeDetailInfo1.setMatchTypeId(dMatchTypeDetailInfo.getMatchTypeId());
        dMatchTypeDetailInfo1.setMatchTypeDetailId(dMatchTypeDetailInfo.getMatchTypeDetailId());
        dMatchTypeDetailInfo1.setMatchCreateTime(dMatchTypeDetailInfo.getMatchCreateTime());
        dMatchTypeDetailInfo1.setMatchSubtitle(dMatchTypeDetailInfo.getMatchSubtitle());
        if (!StringUtils.isEmpty(matchDes)){
        try {
            dMatchTypeDetailInfo1.setMatchDetails(matchDes.getBytes("GBK"));
        } catch (UnsupportedEncodingException e) {
            MLog.error(e.getMessage());
        }}
        int i=  matchTypeService.updateMatchDetailType(dMatchTypeDetailInfo1);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("更新赛事资讯内容成功！");
        }
    }



    @ApiOperation("上传图片")
    @RequestMapping(value = "/uploadPic", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult uploadPic(HttpServletRequest request) {
        UpPicBean upPicBean=null;
        MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
        MultiValueMap<String, MultipartFile> multiFileMap = mr.getMultiFileMap();
        for (Map.Entry<String, List<MultipartFile>> m : multiFileMap.entrySet()) {
            MLog.info("getMultiFileMap===" + m.getKey());
            List<MultipartFile> excelFile = mr.getMultiFileMap().get(m.getKey());
            for (MultipartFile f : excelFile) {
                MLog.info("fileName==" + f.getOriginalFilename());
                try {
                     upPicBean=    matchTypeService.uploadPic(f);
                } catch (Exception e) {
                    return CommonResult.failed();
                }
            }
        }
        return CommonResult.success(upPicBean);
    }

    @ApiOperation("查询赛事项目类型")
    @RequestMapping(value = "/matchMaxTypeList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchMaxtype>> matchMaxTypeList(DMatchMaxtype dMatchMaxtype,
                                                                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DMatchMaxtype>  list=   matchTypeService.matchMaxTypeList(dMatchMaxtype,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("创建赛事项目类型")
    @RequestMapping(value = "/insertMatchMaxType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertMatchMaxType(@RequestBody DMatchMaxtype dMatchMaxtype) {
        DMatchMaxtype dm =new DMatchMaxtype();
        dm.setMatchMaxTypeId(dMatchMaxtype.getMatchMaxTypeId());
        List<DMatchMaxtype> dMatchMaxtypeList1 =dMatchMaxtypeMapper.queryList(dm);
        if (dMatchMaxtypeList1.size()>0){
            return CommonResult.failed(66,"matchMaxTypeId");
        }
        dm.setMatchMaxTypeId("");
        dm.setMatchMaxTypeName(dMatchMaxtype.getMatchMaxTypeName());
        List<DMatchMaxtype> dMatchMaxtypeList =dMatchMaxtypeMapper.queryList(dm);
        if (dMatchMaxtypeList.size()>0){
            return CommonResult.failed(66,"matchMaxTypeName");
        }
        int i=  matchTypeService.insertMatchMaxType(dMatchMaxtype);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("创建赛事项目类型成功！");
        }
    }


    @ApiOperation("更新赛事项目类型")
    @RequestMapping(value = "/editMatchMaxType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult editMatchMaxType(@RequestBody DMatchMaxtype dMatchMaxtype) {
        if (!StringUtils.isEmpty(dMatchMaxtype.getMatchMaxTypeName())){
            DMatchMaxtype dm=new DMatchMaxtype();
            dm.setMatchMaxTypeName(dMatchMaxtype.getMatchMaxTypeName());
            DMatchMaxtype bean =dMatchMaxtypeMapper.queryList1(dm);
            if (bean !=null &&(!bean.getMatchMaxTypeId().equals(dMatchMaxtype.getMatchMaxTypeId()))){
                return CommonResult.failed(66,"matchMaxTypeName");
            }}
        int i=  matchTypeService.editMatchMaxType(dMatchMaxtype);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("更新赛事项目类型成功！");
        }
    }


    @ApiOperation("删除赛事项目类型")
    @RequestMapping(value = "/deleteMatchMaxType", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMatchMaxType(@RequestBody DMatchMaxtype dMatchMaxtype) {
        DMatchMaxterm dms=new DMatchMaxterm();
        dms.setMatchMaxTypeId(dMatchMaxtype.getMatchMaxTypeId());
         List<DMatchMaxterm> list= dMatchMaxtermMapper.queryList(dms);
         if (list.size()>0){
             return CommonResult.failed(66,"赛事类型下存在大项，不能删除！");
         }
        int i=  matchTypeService.deleteMatchMaxType(dMatchMaxtype.getMatchMaxTypeId());
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("删除赛事项目类型成功！");
        }
    }

    @ApiOperation("查询赛事大项")
    @RequestMapping(value = "/matchMaxList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchMaxterm>> matchMaxList(DMatchMaxterm dMatchMaxterm,
                                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) throws UnsupportedEncodingException {
        List<DMatchMaxterm>  list=   matchTypeService.matchMaxList(dMatchMaxterm,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }


    @ApiOperation("查询赛事大项不分页")
    @RequestMapping(value = "/matchMaxList1", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchMaxterm>> matchMaxList1(DMatchMaxterm dMatchMaxterm) throws UnsupportedEncodingException {
        List<DMatchMaxterm>  list=   matchTypeService.matchMaxList1(dMatchMaxterm);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("创建赛事大项")
    @RequestMapping(value = "/insertMatchMax", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertMatchMax(@RequestBody DMatchMaxterm dMatchMaxterm) {
        DMatchMaxterm dm =new DMatchMaxterm();
        dm.setMatchMaxId(dMatchMaxterm.getMatchMaxId());
        List<DMatchMaxterm> list1 =dMatchMaxtermMapper.queryList(dm);
        if (list1.size()>0){
            return CommonResult.failed(66,"matchMaxId");
        }
        dm.setMatchMaxId("");
        dm.setMatchMaxName(dMatchMaxterm.getMatchMaxName());
       List<DMatchMaxterm> list =dMatchMaxtermMapper.queryList(dm);
        if (list.size()>0){
            return CommonResult.failed(66,"matchMaxName");
        }
        int i=  matchTypeService.insertMatchMax(dMatchMaxterm);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("创建创建赛事大项成功！");
        }
    }


    @ApiOperation("更新赛事大项")
    @RequestMapping(value = "/editMatchMax", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult editMatchMax(@RequestBody DMatchMaxterm dMatchMaxterm) {
        if (!StringUtils.isEmpty(dMatchMaxterm.getMatchMaxName())){
            DMatchMaxterm dm=new DMatchMaxterm();
            dm.setMatchMaxName(dMatchMaxterm.getMatchMaxName());
            DMatchMaxterm bean =dMatchMaxtermMapper.queryList1(dm);
            if (bean !=null &&(!bean.getMatchMaxId().equals(dMatchMaxterm.getMatchMaxId()))){
                return CommonResult.failed(66,"matchMaxName");
            }}
        int i=  matchTypeService.editMatchMax(dMatchMaxterm);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("更新赛事大项成功！");
        }
    }


    @ApiOperation("删除赛事大项")
    @RequestMapping(value = "/deleteMatchMax", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMatchMax(@RequestBody DMatchMaxterm dMatchMaxterm) {
        DMatchMinTerm dm=new DMatchMinTerm();
        dm.setMatchMaxId(dMatchMaxterm.getMatchMaxId());
       List<DMatchMinTerm> list= dMatchMinTermMapper.queryList(dm);
       if (list.size()>0){
           return CommonResult.failed(66,"赛事大项下面存在小项，不能删除！");
       }
        int i=  matchTypeService.deleteMatchMax(dMatchMaxterm.getMatchMaxId());
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("删除赛事项目类型成功！");
        }
    }

    @ApiOperation("查询赛事小项")
    @RequestMapping(value = "/matchMinList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchMinTerm>> matchMinList(DMatchMinTerm dMatchMinTerm,
                                                                 @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

        List<DMatchMinTerm>  list=   matchTypeService.matchMinList(dMatchMinTerm,pageNum,pageSize);

        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("查询赛事小项不分页")
    @RequestMapping(value = "/matchMinList1", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchMinTerm>> matchMinList1(DMatchMinTerm dMatchMinTerm
                                                                 ) {

        List<DMatchMinTerm>  list=   matchTypeService.matchMinList1(dMatchMinTerm);

        return CommonResult.success(CommonPage.restPage(list));
    }


    @ApiOperation("创建赛事小项")
    @RequestMapping(value = "/insertMatchMin", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertMatchMin(@RequestBody DMatchMinTerm dMatchMinTerm) {
        DMatchMinTerm dm =new DMatchMinTerm();
        dm.setMatchMinDetail(dMatchMinTerm.getMatchMinDetail());
        List<DMatchMinTerm> list =dMatchMinTermMapper.queryList(dm);
        if (list.size()>0){
            return CommonResult.failed(66,"matchMinDetail");
        }
        dm.setMatchMinDetail("");
        dm.setMatchMinId(dMatchMinTerm.getMatchMinId());
        List<DMatchMinTerm> list1 =dMatchMinTermMapper.queryList(dm);
        if (list1.size()>0){
            return CommonResult.failed(66,"matchMinId");
        }
        int i=  matchTypeService.insertMatchMin(dMatchMinTerm);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("创建赛事小项成功！");
        }
    }


    @ApiOperation("更新赛事小项")
    @RequestMapping(value = "/editMatchMin", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult editMatchMin(@RequestBody DMatchMinTerm dMatchMinTerm) {
        if (!StringUtils.isEmpty(dMatchMinTerm.getMatchMinDetail())){
            DMatchMinTerm dm=new DMatchMinTerm();
            dm.setMatchMinDetail(dMatchMinTerm.getMatchMinDetail());
            DMatchMinTerm bean =dMatchMinTermMapper.queryList1(dm);
            if (bean !=null &&(!bean.getMatchMinId().equals(dMatchMinTerm.getMatchMinId()))){
                return CommonResult.failed(66,"matchMinDetail");
            }}
        int i=  matchTypeService.editMatchMin(dMatchMinTerm);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("更新赛事大项成功！");
        }
    }

    @ApiOperation("删除赛事小项")
    @RequestMapping(value = "/deleteMatchMin", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMatchMin(@RequestBody  DMatchMinTerm dMatchMinTerm) {
        int i=  matchTypeService.deleteMatchMin(dMatchMinTerm.getMatchMinId());
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("删除赛事小项成功！");
        }
    }

    @ApiOperation("个性化参数查询")
    @RequestMapping(value = "/matchParamList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchParam1Info>> matchParamList(DMatchParam1Info dMatchParam1Info,
                                                                 @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

        List<DMatchParam1Info>  list=   matchTypeService.matchParamList(dMatchParam1Info,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }


    @ApiOperation("个性化参数查询不分页")
    @RequestMapping(value = "/matchParamList1", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchParam1Info>> matchParamList1(DMatchParam1Info dMatchParam1Info) {

        List<DMatchParam1Info>  list=   matchTypeService.matchParamList1(dMatchParam1Info);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("创建个性化参数")
    @RequestMapping(value = "/insertMatchParam", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertMatchParam(@RequestBody DMatchParam1Info dMatchParam1Info) {
        DMatchParam1Info dm =new DMatchParam1Info();
        List<DMatchParam1Info> list;
        dm.setParam(dMatchParam1Info.getParam());
        list =dMatchParam1InfoMapper.queryList(dm);
        if (list.size()>0){
            return CommonResult.failed(66,"param");
        }
        dm.setParam("");
        dm.setParamName(dMatchParam1Info.getParamName());
        list =dMatchParam1InfoMapper.queryList(dm);
        if (list.size()>0){
            return CommonResult.failed(66,"paramName");
        }
        int i=  matchTypeService.insertMatchParam(dMatchParam1Info);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("创建个性化参数成功！");
        }
    }

    @ApiOperation("更新个性化参数")
    @RequestMapping(value = "/editMatchParam", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult editMatchParam(@RequestBody DMatchParam1Info dMatchParam1Info) {
        DMatchParam1Info dm =new DMatchParam1Info();
        dm.setParamName(dMatchParam1Info.getParamName());
        DMatchParam1Info bean =dMatchParam1InfoMapper.queryList1(dm);
        if (bean!=null && (!bean.getId().equals(dMatchParam1Info.getId()))){
            return CommonResult.failed(66,"paramName");
        }
        int i=  matchTypeService.editMatchParam(dMatchParam1Info);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("更新个性化参数成功！");
        }}

    @ApiOperation("删除个性化参数")
    @RequestMapping(value = "/deleteMatchParam", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMatchParam(@RequestBody DMatchParam1Info dMatchParam1Info) {
        int i=  matchTypeService.deleteMatchParam(dMatchParam1Info.getId());
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("删除个性化参数");
        }
    }

    @ApiOperation("赛事轮播图查询")
    @RequestMapping(value = "/queryMatchRotationChart", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchRotationChartInfo>> queryMatchRotationChart(DMatchRotationChartInfo dMatchRotationChartInfo,
                                                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DMatchRotationChartInfo>  list=   matchTypeService.queryMatchRotationChart(dMatchRotationChartInfo,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("创建轮播图")
    @RequestMapping(value = "/insertMatchRotationChart", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertMatchRotationChart(@RequestBody DMatchRotationChartInfo dMatchRotationChartInfo) {
        int i=  matchTypeService.insertMatchRotationChart(dMatchRotationChartInfo);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("创建轮播图成功！");
        }
    }

    @ApiOperation("更新赛事轮播图")
    @RequestMapping(value = "/updateMatchRotationChart", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateMatchRotationChart(@RequestBody DMatchRotationChartInfo dMatchRotationChartInfo) {
        int i=  matchTypeService.updateMatchRotationChart(dMatchRotationChartInfo);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("更新赛事轮播图成功！");
        }}

    @ApiOperation("删除赛事轮播图")
    @RequestMapping(value = "/deleteMatchRotationChart", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMatchRotationChart(@RequestBody DMatchRotationChartInfo dMatchRotationChartInfo) {
        DMatchRotationChartInfo dma=new DMatchRotationChartInfo();
        dma.setMatchId(dMatchRotationChartInfo.getMatchId());
        DMatchRotationChartInfo bean=   dMatchRotationChartInfoMapper.queryList1(dma);
        if (bean!=null && "0".equals(bean.getMatchState())){
            return  CommonResult.failed(66,"启用状态下不能删除！");
        }
        int i=  matchTypeService.deleteMatchRotationChart(dMatchRotationChartInfo.getMatchId());
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("删除赛事轮播图");
        }
    }

    @ApiOperation("赛事管理查询")
    @RequestMapping(value = "/queryMatchInfo", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchInfo>> queryMatchInfo(DMatchInfo dMatchInfo,
                                                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) throws UnsupportedEncodingException {
        List<DMatchInfo>  list=   matInfoService.queryMatchInfo(dMatchInfo,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("创建赛事")
    @RequestMapping(value = "/insertMatchInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertMatchInfo(@RequestBody DMatchInfo dMatchInfo)   {
//        int i=  matInfoService.insertMatchInfo(dMatchInfo);
//        if (i<1){
//            return CommonResult.failed();
//        }else {
//            return  CommonResult.success("创建赛事成功！");
//        }
        return matInfoService.insertMatchInfo(dMatchInfo);
    }


    @ApiOperation("更新赛事")
    @RequestMapping(value = "/editMatchInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult editMatchInfo(@RequestBody DMatchInfo dMatchInfo)   {
//        int i=  matInfoService.editMatchInfo(dMatchInfo);
//        if (i<1){
//            return CommonResult.failed();
//        }else {
//            return  CommonResult.success("更新赛事成功！");
//        }
        return matInfoService.editMatchInfo(dMatchInfo);
    }


    @ApiOperation("删除赛事")
    @RequestMapping(value = "/deleteMatchInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMatchInfo(@RequestBody DMatchInfo dMatchInfo) {
        int i=  matInfoService.deleteMatchInfo(dMatchInfo.getMatchId());
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("删除赛事");
        }
    }

    @ApiOperation("查询赛事通用设置列表")
    @RequestMapping(value = "/matchCommonList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <CommonPage<DMatchCommonInfo>> matchCommonList(DMatchCommonInfo dMatchCommonInfo,
                                                                 @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DMatchCommonInfo>  list=   matchTypeService.matchCommonList(dMatchCommonInfo,pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("更新赛事通用设置")
    @RequestMapping(value = "/updateMatchCommon", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateMatchCommon(@RequestBody DMatchCommonInfo dMatchCommonInfo) {
        int i=  matchTypeService.updateMatchCommon(dMatchCommonInfo);
        if (i<1){
            return CommonResult.failed();
        }else {
            return  CommonResult.success("更新赛事通用设置成功！");
        }}
        //==============================================add by liubo X09 赛事二期

    @ApiOperation("查询预赛信息")
    @RequestMapping(value = "/getPreMatchInfo", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<DMatchInfo> queryPreMatch(
            @RequestParam String matchPreId
    ) {
        DMatchInfo dMatchInfos = matInfoService.getPreMatchInfo(matchPreId);
        if (dMatchInfos==null){
            return CommonResult.failed(66,"没有对应的预赛信息");
        }
        if (StringUtil.isNotEmpty(dMatchInfos.getMatchApplyParam())){
            String matchApplyParam= matInfoService.changeType(dMatchInfos);
            dMatchInfos.setMatchApplyParam(matchApplyParam);
        }
        return CommonResult.success(dMatchInfos);
    }

}
