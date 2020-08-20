package com.macro.mall.communicate.match.service;

import com.github.pagehelper.PageHelper;
import com.macro.mall.mapper.*;
import com.macro.mall.model.DMatchApplyInfo;
import com.macro.mall.model.DMatchFinalsInfo;
import com.macro.mall.model.DMatchInfo;
import com.macro.mall.model.DMatchRegister;
import com.macro.mall.util.DateUtil;
import com.macro.mall.util.MLog;
import com.macro.mall.util.StringUtils;
import jxl.Sheet;
import jxl.Workbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class MatReportDownloadService {


    @Autowired
    private DMatchInfoDao dMatchInfoDao;

    @Autowired
    private DMatchApplyInfoMapper dMatchApplyInfoMapper;

    @Autowired
    private DMatchDownloadKeyMapper dMatchDownloadKeyMapper;

    @Autowired
    SmsService smsService;

    @Autowired
    private DMatchRegisterMapper dMatchRegisterMapper;

    @Autowired
    private DMatchApplyInfoMapper matchApplyInfoMapper;

    @Autowired
    private DMatchFinalsInfoMapper matchFinalsInfoMapper;


    public static final String APPLICATION="application/octet-stream";
    public static final String CONTENT="Content-Disposition";
    public static final String ATTACHMENT="attachment;filename=";
    public static final String UTF="utf-8";
    public static final String COUNT="count";





    /**
     * 赛事报名报表下载
     *
     * @param dMatchInfo
     * @return
     */
    public void matchReportDownloadList(HttpServletResponse response, DMatchInfo dMatchInfo) {
        String matchKey = dMatchDownloadKeyMapper.query();
        if (!dMatchInfo.getMatchKey().equals(matchKey)) {
            MLog.error("报表key值错误+" + matchKey);
            return;
        }
        dMatchDownloadKeyMapper.delete();
        List<DMatchInfo> list = null;
        try {
            list = dMatchInfoDao.queryMatchReportList(dMatchInfo);
        } catch (Exception e) {
            MLog.error("赛事报名报表数据下载异常：" + e.getMessage());
        }

        //设置文件名字
        String fileName = "赛事报名列表.xls";
        OutputStream os = null;
        /* 创建excel对象 */
        HSSFWorkbook excel = new HSSFWorkbook();
        HSSFSheet sheet = excel.createSheet(COUNT);
        HSSFRow firstRow = sheet.createRow(0);
        /*设置头消息*/
        String[] titles = {"序号", "赛事名称", "项目类型", "参与状态", "报名时间", "报名总人数", "报名成功人数", "退赛人数","报名费带支付","报名取消","报名总队伍数","组队成功","组队中","审核未通过","创建时间","赛事状态"};
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
                    DMatchInfo info = list.get(i);
                    HSSFCell cell = row.createCell(0);
                    cell.setCellValue(i + 1);
                    cell = row.createCell(1);
                    cell.setCellValue(info.getMatchMinDetail());
                    cell = row.createCell(2);
                    cell.setCellValue(info.getMatch());
                    cell = row.createCell(3);
                    cell.setCellValue(info.getMatchType().equals("0") ? "个人" : "团队");
                    cell = row.createCell(4);
                    cell.setCellValue(info.getMatchApplyStartTime() + "-" + info.getMatchApplyEndTime());
                    cell = row.createCell(5);
                    cell.setCellValue(info.getTotalNum());
                    cell = row.createCell(6);
                    cell.setCellValue(info.getNum());
                    cell = row.createCell(7);
                    cell.setCellValue(info.getRemoveMatchNum());
                    cell = row.createCell(8);
                    cell.setCellValue(info.getStayPayNum());
                    cell = row.createCell(9);
                    cell.setCellValue(info.getRemoveSignNum());
                    cell = row.createCell(10);
                    cell.setCellValue(info.getTeamNum());
                    cell = row.createCell(11);
                    cell.setCellValue(info.getSuccessTeamNum());
                    cell = row.createCell(12);
                    cell.setCellValue(info.getTeamingNum());
                    cell = row.createCell(13);
                    cell.setCellValue(info.getAuditingErrNum());
                    cell = row.createCell(14);
                    cell.setCellValue(info.getMatchCreateTime());
                    cell = row.createCell(15);
                    cell.setCellValue(info.getMatchState().equals("0") ? "禁用" : "启用");
                }
            }
            // 写文件
            os = response.getOutputStream();
            excel.write(os);
            response.setContentType(APPLICATION);
            response.setHeader(CONTENT, ATTACHMENT+ URLEncoder.encode(fileName, UTF));

        } catch (Exception e) {
            MLog.error("赛事报名列表读写Excel失败！" + e.getMessage());
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
     * 赛事报名个人赛全量报表下载
     *
     * @param dMatchApplyInfo
     * @return
     */
    public void matchPersonReportAll(HttpServletResponse response, DMatchApplyInfo dMatchApplyInfo) {
        String matchKey = dMatchDownloadKeyMapper.query();
        if (!dMatchApplyInfo.getMatchKey().equals(matchKey)) {
            MLog.error("报表key值错误----" + matchKey);
            return;
        }
        dMatchDownloadKeyMapper.delete();
        List<DMatchApplyInfo> list = null;
        try {
            list = dMatchApplyInfoMapper.selectByPrimaryKey2(dMatchApplyInfo);
        } catch (Exception e) {
            MLog.error("赛事报名个人赛全量报表下载异常：" + e.getMessage());
        }

        //设置文件名字
        String fileName = "赛事个人赛全量报名数据列表.xls";
        OutputStream os = null;
        /* 创建excel对象 */
        HSSFWorkbook excel = new HSSFWorkbook();
        HSSFSheet sheet = excel.createSheet(COUNT);
        HSSFRow firstRow = sheet.createRow(0);
        /*设置头消息*/
        String[] titles = {"序号", "赛事名称", "项目类型", "姓名", "证件类型", "证件号码", "手机号", "性别", "年龄", "客户地址", "紧急联系人", "联系方式", "卡号", "报名时间", "状态"};
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
                    cell.setCellValue(info.getMatchMinDetail());
                    cell = row.createCell(2);
                    cell.setCellValue(info.getMatchTpName() + info.getMatchMaxName());
                    cell = row.createCell(3);
                    cell.setCellValue(info.getRealName());
                    cell = row.createCell(4);
                    cell.setCellValue(info.getCertType().equals("IDCD") ? "身份证" : "其他");
                    cell = row.createCell(5);
                    cell.setCellValue(info.getCertId());
                    cell = row.createCell(6);
                    cell.setCellValue(info.getUserPhone());
                    cell = row.createCell(7);
                    cell.setCellValue(info.getGender().equals("0") ? "男" : "女");
                    cell = row.createCell(8);
                    cell.setCellValue(info.getAge());
                    cell = row.createCell(9);
                    cell.setCellValue(info.getEmergencyAddress());
                    cell = row.createCell(10);
                    cell.setCellValue(info.getEmergencyName());
                    cell = row.createCell(11);
                    cell.setCellValue(info.getEmergencyPhone());
                    cell = row.createCell(12);
                    cell.setCellValue(info.getBankCard());
                    cell = row.createCell(13);
                    cell.setCellValue(info.getApplyCreateDate() + " " + info.getApplyCreateTime());
                    cell = row.createCell(14);
                    cell.setCellValue(changeState(info.getApplyState()));
                }
            }
            // 写文件
            os = response.getOutputStream();
            excel.write(os);
            response.setContentType(APPLICATION);
            response.setHeader(CONTENT, ATTACHMENT+ URLEncoder.encode(fileName, UTF));

        } catch (Exception e) {
            MLog.error("赛事报名个人赛全量报表读写Excel失败！" + e.getMessage());
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
     * 赛事报名个人赛某一项赛事报表下载
     *
     * @param dMatchApplyInfo
     * @return
     */
    public void matchPersonReportByOne(HttpServletResponse response, DMatchApplyInfo dMatchApplyInfo) {
        List<DMatchApplyInfo> list = null;
        try {
            list = dMatchApplyInfoMapper.selectByPrimaryKey1(dMatchApplyInfo);
        } catch (Exception e) {
            MLog.error("赛事报名个人赛全量报表下载异常：" + e.getMessage());
        }

        //设置文件名字
        String fileName = "赛事个人赛全量报名数据列表.xls";
        OutputStream os = null;
        /* 创建excel对象 */
        HSSFWorkbook excel = new HSSFWorkbook();
        HSSFSheet sheet = excel.createSheet(COUNT);
        HSSFRow firstRow = sheet.createRow(0);
        /*设置头消息*/
        String[] titles = {"序号", "赛事名称", "项目类型", "姓名", "证件类型", "证件号码", "手机号", "性别", "年龄", "客户地址", "紧急联系人", "联系方式", "卡号", "报名时间", "状态"};
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
                    cell.setCellValue(info.getMatchMinDetail());
                    cell = row.createCell(2);
                    cell.setCellValue(info.getMatchTpName() + info.getMatchMaxName());
                    cell = row.createCell(3);
                    cell.setCellValue(info.getRealName());
                    cell = row.createCell(4);
                    cell.setCellValue(info.getCertType().equals("IDCD") ? "身份证" : "其他");
                    cell = row.createCell(5);
                    cell.setCellValue(info.getCertId());
                    cell = row.createCell(6);
                    cell.setCellValue(info.getUserPhone());
                    cell = row.createCell(7);
                    cell.setCellValue(info.getGender().equals("0") ? "男" : "女");
                    cell = row.createCell(8);
                    cell.setCellValue(info.getAge());
                    cell = row.createCell(9);
                    cell.setCellValue(info.getEmergencyAddress());
                    cell = row.createCell(10);
                    cell.setCellValue(info.getEmergencyName());
                    cell = row.createCell(11);
                    cell.setCellValue(info.getEmergencyPhone());
                    cell = row.createCell(12);
                    cell.setCellValue(info.getBankCard());
                    cell = row.createCell(13);
                    cell.setCellValue(info.getApplyCreateDate() + " " + info.getApplyCreateTime());
                    cell = row.createCell(14);
                    cell.setCellValue(changeState(info.getApplyState()));
                }
            }
            // 写文件
            os = response.getOutputStream();
            excel.write(os);
            response.setContentType(APPLICATION);
            response.setHeader(CONTENT, ATTACHMENT+ URLEncoder.encode(fileName, UTF));

        } catch (Exception e) {
            MLog.error("读写Excel失败！" + e.getMessage());
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
     * 赛事报名团体赛全量报表下载
     *
     * @param dMatchApplyInfo
     * @return
     */
    public void matchTeamReportAll(HttpServletResponse response, DMatchApplyInfo dMatchApplyInfo) {
        String matchKey = dMatchDownloadKeyMapper.query();
        if (!dMatchApplyInfo.getMatchKey().equals(matchKey)) {
            MLog.error("报表key值错误----" + matchKey);
            return;
        }
        dMatchDownloadKeyMapper.delete();
        List<DMatchApplyInfo> list = null;
        try {
            list = dMatchApplyInfoMapper.selectByPrimaryKey3(dMatchApplyInfo);
        } catch (Exception e) {
            MLog.error("赛事报名团队赛全量报表下载异常：" + e.getMessage());
        }

        //设置文件名字
        String fileName = "赛事团队赛全量报名数据列表.xls";
        OutputStream os = null;
        /* 创建excel对象 */
        HSSFWorkbook excel = new HSSFWorkbook();
        HSSFSheet sheet = excel.createSheet(COUNT);
        HSSFRow firstRow = sheet.createRow(0);
        /*设置头消息*/
        String[] titles = {"序号", "赛事名称", "项目类型", "团队名称", "身份", "姓名", "证件类型", "证件号码", "手机号", "性别", "年龄", "客户地址", "紧急联系人", "联系方式", "卡号", "提交审核时间", "状态"};
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
                    cell.setCellValue(info.getMatchMinDetail());
                    cell = row.createCell(2);
                    cell.setCellValue(info.getMatchTpName() + info.getMatchMaxName());
                    cell = row.createCell(3);
                    cell.setCellValue(info.getTeamName());
                    cell = row.createCell(4);
                    cell.setCellValue("1".equals(info.getHeadFlag()) ? "领队" : "队员");
                    cell = row.createCell(5);
                    cell.setCellValue(info.getRealName());
                    cell = row.createCell(6);
                    cell.setCellValue("IDCD".equals(info.getCertType()) ? "身份证" : "其他");
                    cell = row.createCell(7);
                    cell.setCellValue(info.getCertId());
                    cell = row.createCell(8);
                    cell.setCellValue(info.getUserPhone());
                    cell = row.createCell(9);
                    cell.setCellValue("0".equals(info.getGender()) ? "男" : "女");
                    cell = row.createCell(10);
                    cell.setCellValue(info.getAge());
                    cell = row.createCell(11);
                    cell.setCellValue(info.getEmergencyAddress());
                    cell = row.createCell(12);
                    cell.setCellValue(info.getEmergencyName());
                    cell = row.createCell(13);
                    cell.setCellValue(info.getEmergencyPhone());
                    cell = row.createCell(14);
                    cell.setCellValue(info.getBankCard());
                    cell = row.createCell(15);
                    cell.setCellValue(info.getTeamCreateTime());
                    cell = row.createCell(16);
                    cell.setCellValue(changeState(info.getApplyState()));
                }
            }
            // 写文件
            os = response.getOutputStream();
            excel.write(os);
            response.setContentType(APPLICATION);
            response.setHeader(CONTENT, ATTACHMENT + URLEncoder.encode(fileName, UTF));

        } catch (Exception e) {
            MLog.error("读写Excel失败！" + e.getMessage());
        } finally {
            try {
                response.flushBuffer();
                // 关闭输出流
                if (os != null) {
                    os.flush();
                    os.close();
                }
            } catch (IOException e) {
               MLog.info(e.getMessage());
            }
        }


    }


    /**
     * 下载报表前key值获取
     *
     * @return
     */
    public String getKey() {
        String matchKey = UUID.randomUUID().toString();
        int y = dMatchDownloadKeyMapper.selectCount();
        if (y > 0) {
            dMatchDownloadKeyMapper.delete();
        }
        int i = dMatchDownloadKeyMapper.insert(matchKey);
        if (i < 0) {
            MLog.error("获取下载key值失败！");
        }
        return matchKey;
    }


    /**
     * 翻译赛事报名状态
     *
     * @param certType
     * @return
     */
    public String changeState(String certType) {
        String returnMsg = null;
        if (certType != null && !"".equals(certType)) {
            if ("00".equals(certType)) {
                returnMsg = "报名成功";
            } else if ("01".equals(certType)) {
                returnMsg = "待支付报名费";
            } else if ("02".equals(certType)) {
                returnMsg = "待支付保险费";
            } else if ("03".equals(certType)) {
                returnMsg = "创建队伍申请中";
            } else if ("04".equals(certType)) {
                returnMsg = "组队审核中";
            } else if ("05".equals(certType)) {
                returnMsg = "组队申请失败";
            } else if ("06".equals(certType)) {
                returnMsg = "被队长移除队伍";
            } else if ("07".equals(certType)) {
                returnMsg = "被队长拒绝";
            } else if ("08".equals(certType)) {
                returnMsg = "组队失败";
            } else if ("09".equals(certType)) {
                returnMsg = "退赛成功";
            } else if ("10".equals(certType)) {
                returnMsg = "报名取消";
            }
        }
        return returnMsg;
    }


    /**
     * 优质客户报名 Excel上传
     *
     * @param
     * @throws Exception
     */
    @Async
    public void userExcel(MultipartFile excelFile) throws Exception {
        InputStream input = excelFile.getInputStream();
        Workbook workbook = Workbook.getWorkbook(input);
        readExcel(workbook);
    }
    @Async
    public void userFinalMatchExcel(MultipartFile excelFile,String matchId) throws Exception {
        InputStream input = excelFile.getInputStream();
        Workbook workbook = Workbook.getWorkbook(input);
        readFinalMatchExcel(workbook,matchId);
    }


    /**
     * 读取Excel数据，存储到数据库中
     * @param workbook
     * @throws Exception
     */
    public void readExcel(Workbook workbook) {
        List<DMatchRegister> list = new ArrayList<>();
        Sheet sheet = workbook.getSheet(0);
        MLog.info(sheet.getRows() + "------");
        String cell0;
        String cell1;
        for (int k = 1; k < sheet.getRows(); k++) {
            DMatchRegister dMatchRegister = new DMatchRegister();
            cell0 = sheet.getCell(0, k).getContents().trim();//得到1列数据   姓名
            cell1 = sheet.getCell(1, k).getContents().trim();//得到2列数据   手机号
            if (cell0 == null || "".equals(cell0)) {
                MLog.error("上传数据异常");
            }
            dMatchRegister.setUserPhone(cell1);
            dMatchRegister.setName(cell0);
            dMatchRegister.setState("01");
            list.add(dMatchRegister);
            if (list.size()>100 || k==(sheet.getRows()-1)){
                dMatchRegisterMapper.insertList(list);
                list.clear();
            }
        }
    }

    /**
     * 读取Excel中决赛白名单数据，存储到数据库中
     * @param workbook
     * @throws Exception
     */
    public void readFinalMatchExcel(Workbook workbook,String matchId) {
        List<DMatchFinalsInfo> list = new ArrayList<>();
        Sheet sheet = workbook.getSheet(0);
        MLog.info(sheet.getRows() + "------");
        String cell0;
        String cell1;
        String cell2;
        String state="1";//状态
        String details="";//异常描述
        for (int k = 1; k < sheet.getRows(); k++) {
            DMatchFinalsInfo finalsInfo = new DMatchFinalsInfo();
            cell0 = sheet.getCell(0, k).getContents().trim();//得到1列数据   姓名
            cell1 = sheet.getCell(1, k).getContents().trim();//得到2列数据   手机号
            cell2 = sheet.getCell(2, k).getContents().trim();//得到3列数据   证件号
            if ((cell0 == null || "".equals(cell0)) && (cell1 == null || "".equals(cell1)) && (cell2 == null || "".equals(cell2))) {
               continue;
            }
            if(!StringUtils.validateMobilePhone(cell1) || !StringUtils.validateCertId(cell2)){
                state="0";
                details="证件号或手机号数据不正确";
            }
            //根据手机号查询报名表获取姓名和证件号，如果匹配不成功则为异常数据
            DMatchApplyInfo applyInfo =matchApplyInfoMapper.selectApplyUserInfo(cell1,matchId);
            if(applyInfo==null){
                state="0";
                details="此用户在报名表中未查询到信息";
            }
            finalsInfo.setId(UUID.randomUUID().toString());
            finalsInfo.setMatchId(matchId);
            finalsInfo.setCertNo(cell2);
            finalsInfo.setUserNm(cell1);
            finalsInfo.setUserName(cell0);
            finalsInfo.setState(state);
            finalsInfo.setDetails(details);
            finalsInfo.setCreatTime(DateUtil.getDate(new Date()));
            finalsInfo.setMatchType(applyInfo.getMatchType());
            finalsInfo.setHeadFlag("0".equals(applyInfo.getMatchType())? "1" : applyInfo.getHeadFlag());
            list.add(finalsInfo);
        }
        if (list.size()/100==0 || list.size()<100) {
                matchFinalsInfoMapper.insertFinalMatchList(list);
                list.clear();
        }
    }




    /**
     * 优质客户报名
     *
     * @param dMatchRegister
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchRegister> customerReportList(DMatchRegister dMatchRegister, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchRegister> registerList = dMatchRegisterMapper.query(dMatchRegister);
        return registerList;
    }


    /**
     * 批量发送短信
     */
    @Async
    public void sendMessage() {
        List<DMatchRegister> list = dMatchRegisterMapper.querySendMessage();
        if (list.isEmpty()) {
            return;
        }
        try {
            smsService.sendMessage("MAT004", list);
        } catch (Exception e) {
           MLog.error("发送短信失败！"+e.getMessage());
        }

    }

}
