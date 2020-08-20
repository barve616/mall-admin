package com.macro.mall.cms.controller;

import com.macro.mall.cms.bean.*;
import com.macro.mall.cms.service.CmsConfigService;
import com.macro.mall.cms.service.CmsModelConfigService;
import com.macro.mall.cms.service.CmsModelService;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.DCmdPageType;
import com.macro.mall.model.DCmsParams;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "CmsController", description = "cms首页配置")
@RequestMapping("/cms")
public class CmsController {
    @Resource
    private CmsConfigService cmsConfigService;

    @Autowired
    private CmsModelService cmsModelService;
    @Autowired
    private CmsModelConfigService cmsModelConfigService;


    @ApiOperation("查询首页配置")
    @RequestMapping(value = "/CMS000001", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000001(@RequestBody CMS000001 bean){

        return (CommonResult) cmsConfigService.CMS000001(bean);
    }


    @ApiOperation("查询功能列表配置")
    @RequestMapping(value = "/CMS000011", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000011(@RequestBody CMS000011 bean){
        return (CommonResult) cmsConfigService.CMS000011(bean);
    }


    /**
     * 复制模板并预览
     * @param bean
     * @return
     */
    @ApiOperation("复制模板并预览")
    @RequestMapping(value = "/CMS000002", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000002(CMS000002 bean){
        return (CommonResult) cmsConfigService.CMS000002(bean);
    }


    /**
     * 模板类别列表
     * @param bean
     * @return
     */
    @ApiOperation("模板类别列表")
    @RequestMapping(value = "/CMS000003", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000003(DCmdPageType dCmdPageType){
        return (CommonResult) cmsConfigService.CMS000003(dCmdPageType);
    }


    /**
     * 页面web端预览
     * @param bean
     * @return
     */
    @ApiOperation("页面web端预览")
    @RequestMapping(value = "/CMS000014", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000014(@RequestBody CMS000014 bean){
        return (CommonResult) cmsConfigService.CMS000014(bean);
    }


    /**
     * 页面客户端查询|二维码预览
     * @param bean
     * @return
     */
   /* @ApiOperation("页面客户端查询|二维码预览")
    @RequestMapping(value = "/CMS000003", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000003(@RequestBody CMS000003 bean){
        return (CommonResult) cmsConfigService.CMS000003(bean);
    }
*/

    /**
     * 新增|保存页面名称
     * @param bean
     * @return
     */
    @ApiOperation("新增|保存页面名称")
    @RequestMapping(value = "/CMS000012", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000012(CMS000012 bean){
        return (CommonResult) cmsConfigService.CMS000012(bean);
    }


    /**
     * CMS模板下架|重命名
     * @param bean
     * @return
     */
    @ApiOperation("CMS模板下架|重命名")
    @RequestMapping(value = "/CMS000004", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000004(@RequestBody CMS000004 bean){
        return (CommonResult) cmsConfigService.CMS000004(bean);
    }



    /**
     * CMS模板保存|更新|发布|定时发布
     * @param bean
     * @return
     */
    @ApiOperation("CMS模板保存|更新|发布|定时发布")
    @RequestMapping(value = "/CMS000005", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000004(@RequestBody CMS000005 bean){
        return (CommonResult) cmsConfigService.CMS000005(bean);
    }


    /**
     * 页面web端预览保存
     * @param bean
     * @return
     */
    @ApiOperation("CMS预览模板保存")
    @RequestMapping(value = "/CMS000015", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000015(@RequestBody CMS000015 bean){
        return (CommonResult) cmsConfigService.CMS000015(bean);
    }


    /**
     * 页面web端预览保存
     * @param bean
     * @return
     */
    @ApiOperation("CMS模块数据批量上架|批量新增")
    @RequestMapping(value = "/CMS000013", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000013(@RequestBody CMS000013 bean){
        return (CommonResult) cmsConfigService.CMS000013(bean);
    }



    /**
     * CMS查询城市列表
     * @return
     */
    @ApiOperation("CMS查询城市列表")
    @RequestMapping(value = "/CMS000016", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000016(){
        return (CommonResult) cmsConfigService.CMS000016();
    }



    /**
     * CMS白名单列表查询
     * @return
     */
    @ApiOperation("CMS白名单列表查询")
    @RequestMapping(value = "/CMS000017", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000017(){
        return (CommonResult) cmsConfigService.CMS000017();
    }

    @ApiOperation("获取本地功能列表")
    @ResponseBody
    @RequestMapping(value="/CMS000018",method = RequestMethod.POST)
    public CommonResult CMS000018(CMS000018 cms000018) throws Exception{
        return (CommonResult) cmsConfigService.CMS000018(cms000018);
    }


    @ApiOperation("大模块新增|编辑")
    @RequestMapping(value = "/CMS000006", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000006(DCmsParams dCmsParams){
        return (CommonResult) cmsModelService.CMS000006(dCmsParams);
    }

    @ApiOperation("子模块列表查询")
    @RequestMapping(value = "/CMS000007", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000007(@RequestBody CMS000007 bean){
        return cmsModelService.CMS000007(bean);
    }
    @ApiOperation("信息查询子模块")
    @RequestMapping(value = "/CMS000008", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000006(@RequestParam(value = "dataId")String dataId){
        return  cmsModelService.CMS000008(dataId);
    }
    @ApiOperation("子模块新增/更新")
    @RequestMapping(value = "/CMS000009", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000006(@RequestBody List<CMS000009> beans){
        return  cmsModelConfigService.CMS000009(beans);
    }

    @ApiOperation("模块删除、模块行删除")
    @RequestMapping(value = "/CMS000010", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000010(@RequestBody CMS000010 bean){
        return  cmsModelConfigService.CMS000010(bean);
    }

    @ApiOperation("模块列表排序")
    @RequestMapping(value = "/CMS000019", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult CMS000019(@RequestBody CMS000019 bean){
        return cmsModelService.CMS0000019(bean);
    }

}
