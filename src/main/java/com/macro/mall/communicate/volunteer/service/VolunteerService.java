package com.macro.mall.communicate.volunteer.service;


import com.github.pagehelper.PageHelper;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.util.MLog;
import jxl.Sheet;
import jxl.Workbook;
import org.apache.cxf.common.util.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;


@Service
public class VolunteerService {

    @Autowired
    private DStepActivityMapper dStepActivityMapper;

    @Autowired
    private DMatchDownloadKeyMapper dMatchDownloadKeyMapper;

    @Autowired
    private DStepInfoMapper dStepInfoMapper;

    @Autowired
    private DMatchApplyInfoMapper dMatchApplyInfoMapper;

    public static final String APPLICATION="application/octet-stream";
    public static final String CONTENT="Content-Disposition";
    public static final String ATTACHMENT="attachment;filename=";
    public static final String UTF="utf-8";
    public static final String COUNT="count";

    /**
     * 志愿者报名信息查询
     * @param dMatchApplyInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchApplyInfo> queryVltList(DMatchApplyInfo dMatchApplyInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchApplyInfo> dMatchApplyInfoList =dMatchApplyInfoMapper.queryVltList(dMatchApplyInfo);
        return    dMatchApplyInfoList;
    }




    /**
     * 志愿者报名信息导出
     *
     * @param dMatchApplyInfo
     * @return
     */
    public void vltReportDownloadList(HttpServletResponse response, DMatchApplyInfo dMatchApplyInfo) {
        String matchKey = dMatchDownloadKeyMapper.query();
        if (!dMatchApplyInfo.getMatchKey().equals(matchKey)) {
            MLog.error("报表key值错误+" + matchKey);
            return;
        }
        dMatchDownloadKeyMapper.delete();
        List<DMatchApplyInfo> list = null;
        try {
            list  =dMatchApplyInfoMapper.queryVltList(dMatchApplyInfo);
        } catch (Exception e) {
            MLog.error("志愿者报名信息导出数据下载异常：" + e.getMessage());
        }

        //设置文件名字
        String fileName = "志愿者报名信息列表.xls";
        OutputStream os = null;
        /* 创建excel对象 */
        HSSFWorkbook excel = new HSSFWorkbook();
        HSSFSheet sheet = excel.createSheet(COUNT);
        HSSFRow firstRow = sheet.createRow(0);
        /*设置头消息*/
        String[] titles = {"序号", "活动名称", "姓名", "身份证号", "手机号", "身份证地址", "报名时间", "报名渠道"};
        try {
            /*创建标题单元格*/
            HSSFCell cells[] = new HSSFCell[titles.length];
            /*单元格*/
            for (int i = 0; i < titles.length; i++) {
                cells[i] = firstRow.createCell(i);
                cells[i].setCellValue(titles[i]);
            }
            if (!list.isEmpty()) {
                /*写入excel*/
                for (int i = 0; i < list.size(); i++) {
                    HSSFRow row = sheet.createRow(i + 1);
                    DMatchApplyInfo info = list.get(i);
                    HSSFCell cell = row.createCell(0);
                    cell.setCellValue(i + 1);
                    cell = row.createCell(1);
                    cell.setCellValue(info.getMatchName());
                    cell = row.createCell(2);
                    cell.setCellValue(info.getRealName());
                    cell = row.createCell(3);
                    cell.setCellValue(info.getCertId());
                    cell = row.createCell(4);
                    cell.setCellValue(info.getUserPhone());
                    cell = row.createCell(5);
                    cell.setCellValue(info.getDetailAddress());
                    cell = row.createCell(6);
                    cell.setCellValue(info.getApplyCreateDate().replace("-","/"));
                    cell = row.createCell(7);
                    cell.setCellValue("BOC".equals(info.getApplyChannel()) ? "手机银行" : "缤纷生活");
                }
            }
            // 写文件
            os = response.getOutputStream();
            excel.write(os);
            response.setContentType(APPLICATION);
            response.setHeader(CONTENT, ATTACHMENT+ URLEncoder.encode(fileName, UTF));

        } catch (Exception e) {
            MLog.error("志愿者报名信息列表读写Excel失败！" + e.getMessage());
        } finally {
            try {
                response.flushBuffer();
                // 关闭输出流
                if (os != null) {
                    os.flush();
                    os.close();
                }
            } catch (IOException e) {
                MLog.error(e.getMessage());
            }
        }
    }



    /**
     * 88查询打卡时间查询
     * @return
     */
    public DStepActivity queryStepActivity() {
        DStepActivity bean =dStepActivityMapper.queryStepActivity();
        return    bean;
    }


    public  CommonResult editStepActivity(DStepActivity dStepActivity){
        DStepActivityExample example =new DStepActivityExample();
        example.createCriteria().andActivityIdEqualTo(dStepActivity.getActivityId());
        DStepActivity ds=new DStepActivity();
        ds.setActivityEndDt(dStepActivity.getActivityEndDt());
        ds.setActivityStartDt(dStepActivity.getActivityStartDt());
       if (dStepActivityMapper.updateByExampleSelective(ds,example)<1){
           return CommonResult.failed();
       }else {
           return CommonResult.success("编辑88打卡时间成功！");
       }
    }

    /**
     * 删除报名数据
     * @return
     */
    public CommonResult detailStepActivity() {
            if (dMatchApplyInfoMapper.detailStepActivity()<1){
                MLog.info("删除志愿者赛事报名数据失败！");
            }
            DStepInfoExample example =new DStepInfoExample();
            example.createCriteria().andUserTypeEqualTo("00");
            if (dStepInfoMapper.deleteByExample(example)<1){
                MLog.info("删除88打卡报名数据失败！");
            }
        return CommonResult.success("数据删除成功！");
    }
}
