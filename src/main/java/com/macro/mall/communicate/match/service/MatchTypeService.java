package com.macro.mall.communicate.match.service;

import com.github.pagehelper.PageHelper;
import com.macro.mall.base.service.impl.ImgUtilsService;
import com.macro.mall.common.base.MValues;
import com.macro.mall.communicate.match.bean.UpPicBean;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.util.MLog;
import com.macro.mall.util.SFTPUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

@Service
public class MatchTypeService {

    @Autowired
    private DMatchTypeInfoMapper dMatchTypeInfoMapper;

    @Autowired
    private DMatchTypeDetailInfoMapper dMatchTypeDetailInfoMapper;
    @Autowired
    private DMatchMaxtypeMapper dMatchMaxtypeMapper;
    @Autowired
    private DMatchMaxtermMapper dMatchMaxtermMapper;
    @Autowired
    private DMatchMinTermDao dMatchMinTermMapper;
    @Autowired
    private DMatchParam1InfoMapper dMatchParam1InfoMapper;
    @Autowired
    private DMatchRotationChartInfoMapper dMatchRotationChartInfoMapper;
    @Autowired
    private DMatchCommonInfoMapper dMatchCommonInfoMapper;



    @Autowired
    ImgUtilsService imgUtilsService;


    /**
     * 赛事资讯类型查询
     * @param dMatchTypeInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchTypeInfo> queryMatchType(DMatchTypeInfo dMatchTypeInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchTypeInfo> dMatchTypeList =dMatchTypeInfoMapper.queryMatchType(dMatchTypeInfo);
        return    dMatchTypeList;
    }


    /**
     * 赛事资讯类型查询不分页
     * @param dMatchTypeInfo
     * @return
     */
    public List<DMatchTypeInfo> queryMatchType1(DMatchTypeInfo dMatchTypeInfo) {
        List<DMatchTypeInfo> dMatchTypeList =dMatchTypeInfoMapper.queryMatchType2(dMatchTypeInfo);
        return    dMatchTypeList;
    }

    /**
     * 创建赛事资讯类型
     * @param dMatchTypeInfo
     * @return
     */
    public int  insertMatchType(DMatchTypeInfo dMatchTypeInfo) {
        int num=dMatchTypeInfoMapper.insertMatchType(dMatchTypeInfo);
        return    num;
    }

    /**
     * 删除赛事资讯类型
     * @param matchTypeId
     * @return
     */
    public int  deleteMatchType(String matchTypeId) {
        int num=dMatchTypeInfoMapper.deleteMatchType(matchTypeId);
        return    num;
    }

    /**
     * 更新赛事资讯类型
     * @param dMatchTypeInfo
     * @return
     */
    public int  updateMatchType(DMatchTypeInfo dMatchTypeInfo) {
        int num=dMatchTypeInfoMapper.updateMatchType(dMatchTypeInfo);
        return   num;
    }


    /**
     * 赛事资讯详情查询
     * @param dMatchTypeDetailInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchTypeDetailInfo> queryMatchDetailType(DMatchTypeDetailInfo dMatchTypeDetailInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchTypeDetailInfo> dMatchList =dMatchTypeDetailInfoMapper.queryMatchDetailType(dMatchTypeDetailInfo);
        for (DMatchTypeDetailInfo dma:dMatchList){
            try {
                dma.setMatchDetailsString(new String(dma.getMatchDetails(),"GBK"));
            } catch (UnsupportedEncodingException e) {
               MLog.error(e.getMessage());
            }
        }
        return    dMatchList;
    }


    /**
     * 赛事资讯详情查询不分页
     * @param dMatchTypeDetailInfo
     * @return
     */
    public List<DMatchTypeDetailInfo> queryMatchDetailType1(DMatchTypeDetailInfo dMatchTypeDetailInfo) {
        List<DMatchTypeDetailInfo> dMatchList =dMatchTypeDetailInfoMapper.queryMatchDetailType2(dMatchTypeDetailInfo);
        for (DMatchTypeDetailInfo dma:dMatchList){
            try {
                dma.setMatchDetailsString(new String(dma.getMatchDetails(),"GBK"));
            } catch (UnsupportedEncodingException e) {
                MLog.error(e.getMessage());
            }
        }
        return    dMatchList;
    }

    /**
     * 创建赛事资讯详情
     * @param dMatchTypeDetailInfo
     * @return
     */
    public int  insertMatchDetailType(DMatchTypeDetailInfo dMatchTypeDetailInfo) {
//        //				处理本地图片
//        String uploadImgUrl = null;
//        try {
//            uploadImgUrl = imgUtilsService.uploadImg(dMatchTypeDetailInfo.getMatchPicture(), "file");
//        } catch (Exception e) {
//            MLog.error("图片上传失败"+"==========="+e.getMessage());
//        }
//        dMatchTypeDetailInfo.setMatchPicture(uploadImgUrl);
        int num=dMatchTypeDetailInfoMapper.insertMatchDetailType(dMatchTypeDetailInfo);
        return    num;
    }

    /**
     * 删除赛事资讯内容
     * @param matchTypeDetailId
     * @return
     */
    public int  deleteMatchDetailType(String matchTypeDetailId) {
        int num=dMatchTypeDetailInfoMapper.deleteMatchDetailType(matchTypeDetailId);
        return    num;
    }

    /**
     * 更新赛事资讯内容
     * @param dMatchTypeDetailInfo
     * @return
     */
    public int  updateMatchDetailType(DMatchTypeDetailInfo dMatchTypeDetailInfo) {
        int num=dMatchTypeDetailInfoMapper.updateMatchDetailType(dMatchTypeDetailInfo);
        return    num;
    }


    /**
     * 赛事资讯内容图片上传
     * @param excelFile
     * @return
     */
    public UpPicBean uploadPic (MultipartFile excelFile) throws IOException {
        InputStream input = excelFile.getInputStream();
        String fileUrl = "/mobilelife/uploadfile/file" + "/" + excelFile.getOriginalFilename();
        SFTPUtils f = new SFTPUtils(MValues.get("DMZ.FTPIP.33"), 22, MValues.get("DMZ.FTPUSER.33"), MValues.get("DMZ.FTPPASS.33"));
        boolean downloadOK = false;
        try {
            f.connect();
            downloadOK = f.uploadInputStream(input, fileUrl, MValues.get("DMZ.Path"), MValues.get("DMZ.TARGETPath"));
        } catch (Exception e) {
            MLog.error(e.getMessage());
            MLog.info(MValues.get("DMZ.FTPIP.33") + "上传图片出错：" + fileUrl, e);
        } finally {
            f.disconnect();
        }
        input = excelFile.getInputStream();
        if (downloadOK) {
            f = new SFTPUtils(MValues.get("DMZ.FTPIP.34"), 22, MValues.get("DMZ.FTPUSER.34"), MValues.get("DMZ.FTPPASS.34"));
            try {
                f.connect();
                downloadOK = f.uploadInputStream(input, fileUrl, MValues.get("DMZ.Path"), MValues.get("DMZ.TARGETPath"));
            } catch (Exception e) {
                MLog.error(e.getMessage());
                MLog.info(MValues.get("DMZ.FTPIP.34") + "上传图片出错：" + fileUrl, e);
            } finally {
                f.disconnect();
            }
        }
        UpPicBean upPicBean =new UpPicBean();
        upPicBean.setFileName(UUID.randomUUID().toString());
//        upPicBean.setPicUrl("/mlife"+fileUrl);
//        upPicBean.setPicUrl(MValues.get("visitPath2")+fileUrl);
        upPicBean.setPicUrl( "../../../uploadfile/file/"  + excelFile.getOriginalFilename());
        return upPicBean;

    }
    /**
     * 赛事类型大项查询
     * @param dMatchMaxtype
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchMaxtype> matchMaxTypeList(DMatchMaxtype dMatchMaxtype, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchMaxtype> dMatchMaxtypeList =dMatchMaxtypeMapper.queryList(dMatchMaxtype);
        return    dMatchMaxtypeList;
    }

    /**
     * 创建赛事类型大项
     * @param dMatchMaxtype
     * @return
     */
    public int  insertMatchMaxType(DMatchMaxtype dMatchMaxtype) {
        int num=dMatchMaxtypeMapper.insert(dMatchMaxtype);
        return    num;
    }

    /**
     * 更新赛事类型大项
     * @param dMatchMaxtype
     * @return
     */
    public int  editMatchMaxType(DMatchMaxtype dMatchMaxtype) {
        String matchTp=dMatchMaxtype.getMatchMaxTypeId();
        String matchTpName=dMatchMaxtype.getMatchMaxTypeName();
        //同步赛事类型名称修改
        if (dMatchMinTermMapper.update1(matchTp,matchTpName)<1){
            MLog.error("同步赛事类型名称修改");
        }
        int num=dMatchMaxtypeMapper.update(dMatchMaxtype);
        return    num;
    }

    /**
     * 删除赛事资讯内容
     * @param matchTypeDetailId
     * @return
     */
    public int  deleteMatchMaxType(String matchTypeDetailId) {
        int num=dMatchMaxtypeMapper.delete(matchTypeDetailId);
        return    num;
    }

    /**
     * 赛事大项查询
     * @param dMatchMaxterm
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchMaxterm> matchMaxList(DMatchMaxterm dMatchMaxterm, Integer pageNum, Integer pageSize) throws UnsupportedEncodingException {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchMaxterm> dMatchMaxtermList =dMatchMaxtermMapper.queryList(dMatchMaxterm);
        for (DMatchMaxterm bean:dMatchMaxtermList){
            bean.setMatchDetailString(new String(bean.getMatchDetail(),"GBK"));
        }
        return    dMatchMaxtermList;
    }


    /**
     * 赛事大项查询不分页
     * @param dMatchMaxterm
     * @return
     */
    public List<DMatchMaxterm> matchMaxList1(DMatchMaxterm dMatchMaxterm) throws UnsupportedEncodingException {
        List<DMatchMaxterm> dMatchMaxtermList =dMatchMaxtermMapper.queryList(dMatchMaxterm);
        for (DMatchMaxterm bean:dMatchMaxtermList){
            bean.setMatchDetailString(new String(bean.getMatchDetail(),"GBK"));
        }
        return    dMatchMaxtermList;
    }

    /**
     * 赛事小项查询
     * @param dMatchMinTerm
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchMinTerm> matchMinList(DMatchMinTerm dMatchMinTerm, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchMinTerm> DMatchMinTermList =dMatchMinTermMapper.queryList(dMatchMinTerm);
        return    DMatchMinTermList;
    }

    /**
     * 赛事小项查询不分页
     * @param dMatchMinTerm
     * @return
     */
    public List<DMatchMinTerm> matchMinList1(DMatchMinTerm dMatchMinTerm) {
        List<DMatchMinTerm> DMatchMinTermList =dMatchMinTermMapper.queryList(dMatchMinTerm);
        return    DMatchMinTermList;
    }

    /**
     * 个性化参数查询
     * @param dMatchParam1Info
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchParam1Info> matchParamList(DMatchParam1Info dMatchParam1Info, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchParam1Info> DMatchParam1InfoList =dMatchParam1InfoMapper.queryList(dMatchParam1Info);
        return    DMatchParam1InfoList;
    }


    /**
     * 个性化参数查询不分页
     * @param dMatchParam1Info
     * @return
     */
    public List<DMatchParam1Info> matchParamList1(DMatchParam1Info dMatchParam1Info) {
        List<DMatchParam1Info> DMatchParam1InfoList =dMatchParam1InfoMapper.queryList(dMatchParam1Info);
        return    DMatchParam1InfoList;
    }

    /**
     * 创建个性化参数
     * @param dMatchParam1Info
     * @return
     */
    public int  insertMatchParam(DMatchParam1Info dMatchParam1Info) {
        int num=dMatchParam1InfoMapper.insert(dMatchParam1Info);
        return    num;
    }

    /**
     * 更新赛事资讯内容
     * @param dMatchParam1Info
     * @return
     */
    public int  editMatchParam(DMatchParam1Info dMatchParam1Info) {
        int num=dMatchParam1InfoMapper.update(dMatchParam1Info);
        return    num;
    }

    /**
     * 删除赛事资讯内容
     * @param id
     * @return
     */
    public int  deleteMatchParam(String id) {
        int num=dMatchParam1InfoMapper.delete(id);
        return    num;
    }

    /**
     * 赛事轮播图查询
     * @param dMatchRotationChartInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchRotationChartInfo> queryMatchRotationChart(DMatchRotationChartInfo dMatchRotationChartInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchRotationChartInfo> DMatchMinTermList =dMatchRotationChartInfoMapper.queryList(dMatchRotationChartInfo);
        return    DMatchMinTermList;
    }

    /**
     * 创建轮播图
     * @param dMatchRotationChartInfo
     * @return
     */
    public int  insertMatchRotationChart(DMatchRotationChartInfo dMatchRotationChartInfo) {
        //	处理本地图片
        String uploadImgUrl = null;
        try {
            uploadImgUrl = imgUtilsService.uploadImg(dMatchRotationChartInfo.getMatchPicture(), "file");
        } catch (Exception e) {
            MLog.error("图片上传失败"+"==========="+e.getMessage());
        }
        dMatchRotationChartInfo.setMatchPicture(uploadImgUrl);
        int num=dMatchRotationChartInfoMapper.insert(dMatchRotationChartInfo);
        return    num;
    }

    /**
     * 更新赛事赛事轮播图
     * @param dMatchRotationChartInfo
     * @return
     */
    public int  updateMatchRotationChart(DMatchRotationChartInfo dMatchRotationChartInfo) {
        //当编辑的时候将图片的头子去掉
        if (!StringUtils.isEmpty(dMatchRotationChartInfo.getMatchPicture()) ){
            //	处理本地图片
            String uploadImgUrl = null;
            try {
                uploadImgUrl = imgUtilsService.uploadImg(dMatchRotationChartInfo.getMatchPicture(), "file");
            } catch (Exception e) {
                MLog.error("图片上传失败"+"==========="+e.getMessage());
            }
            dMatchRotationChartInfo.setMatchPicture(uploadImgUrl);
        }
        int num=dMatchRotationChartInfoMapper.update(dMatchRotationChartInfo);
        return    num;
    }

    /**
     * 删除赛事轮播图
     * @param matchId
     * @return
     */
    public int  deleteMatchRotationChart(String matchId) {

        int num=dMatchRotationChartInfoMapper.delete(matchId);
        return    num;
    }


    /**
     * 赛事通用设置列表查询
     * @param dMatchCommonInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchCommonInfo> matchCommonList(DMatchCommonInfo dMatchCommonInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchCommonInfo> dMatchMaxtypeList =dMatchCommonInfoMapper.queryList(dMatchCommonInfo);
        return    dMatchMaxtypeList;
    }

    /**
     * 更新赛事通用设置
     * @param dMatchCommonInfo
     * @return
     */
    public int  updateMatchCommon(DMatchCommonInfo dMatchCommonInfo) {
        int num=dMatchCommonInfoMapper.update(dMatchCommonInfo);
        return    num;
    }

    /**
     * 创建赛事大项
     * @param dMatchMaxterm
     * @return
     */
    public int  insertMatchMax(DMatchMaxterm dMatchMaxterm) {

       if (!StringUtils.isEmpty(dMatchMaxterm.getMatchDetailString())){
           try {
               dMatchMaxterm.setMatchDetail(dMatchMaxterm.getMatchDetailString().getBytes("GBK"));
           } catch (UnsupportedEncodingException e) {
              MLog.error(e.getMessage());
           }
       }
        int num=dMatchMaxtermMapper.insert(dMatchMaxterm);
        return    num;
    }

    /**
     * 更新赛事大项
     * @param dMatchMaxterm
     * @return
     */
    public int  editMatchMax(DMatchMaxterm dMatchMaxterm) {
        if (dMatchMinTermMapper.update2(dMatchMaxterm.getMatchMaxId(),dMatchMaxterm.getMatchMaxName())<1){
            MLog.error("更新赛事大项名称失败");
        }
        if (!StringUtils.isEmpty(dMatchMaxterm.getMatchDetailString())){
            try {
                dMatchMaxterm.setMatchDetail(dMatchMaxterm.getMatchDetailString().getBytes("GBK"));
            } catch (UnsupportedEncodingException e) {
                MLog.error(e.getMessage());
            }
        }
        int num=dMatchMaxtermMapper.update(dMatchMaxterm);
        return    num;
    }


    /**
     * 删除赛事大项
     * @param matchMaxId
     * @return
     */
    public int  deleteMatchMax(String matchMaxId) {
        int num=dMatchMaxtermMapper.delete(matchMaxId);
        return    num;
    }

    /**
     * 创建赛事小项
     * @param dMatchMinTerm
     * @return
     */
    public int  insertMatchMin(DMatchMinTerm dMatchMinTerm) {
        DMatchMinTerm dma =  dMatchMinTermMapper.getMaxInfo(dMatchMinTerm.getMatchMaxId());
        if (dma!=null){
            dMatchMinTerm.setMatchTp(dma.getMatchTp());
            dMatchMinTerm.setMatchTpName(dma.getMatchTpName());
            dMatchMinTerm.setMatchMaxName(dma.getMatchMaxName());
        }
        int num=dMatchMinTermMapper.insert(dMatchMinTerm);
        return    num;
    }

    /**
     * 更新赛事大项
     * @param dMatchMinTerm
     * @return
     */
    public int  editMatchMin(DMatchMinTerm dMatchMinTerm) {
        int num=dMatchMinTermMapper.update(dMatchMinTerm);
        return    num;
    }

    /**
     * 删除赛事小项
     * @param matchMinId
     * @return
     */
    public int  deleteMatchMin(String matchMinId) {
        int num=dMatchMinTermMapper.delete(matchMinId);
        return    num;
    }
}
