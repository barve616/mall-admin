package com.macro.mall.communicate.matchResult.service;


import cn.hutool.core.lang.UUID;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.mapper.DMatchDownloadKeyMapper;
import com.macro.mall.mapper.DMatchResultInfoMapper;
import com.macro.mall.mapper.DMatchVoteInfoMapper;
import com.macro.mall.model.DMatchResultInfo;
import com.macro.mall.model.DMatchVoteInfo;
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
public class VoteService {

    @Autowired
    private DMatchVoteInfoMapper dMatchVoteInfoMapper;

    @Autowired
    private DMatchDownloadKeyMapper dMatchDownloadKeyMapper;

    @Autowired
    private DMatchResultInfoMapper dMatchResultInfoMapper;

    public static final String APPLICATION="application/octet-stream";
    public static final String CONTENT="Content-Disposition";
    public static final String ATTACHMENT="attachment;filename=";
    public static final String UTF="utf-8";
    public static final String COUNT="count";

    /**
     * 赛事投票列表查询
     * @param dMatchVoteInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchVoteInfo> queryVoteList(DMatchVoteInfo dMatchVoteInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchVoteInfo> dMatchTypeList =dMatchVoteInfoMapper.queryList(dMatchVoteInfo);
        return    dMatchTypeList;
    }




    /**
     * 赛事投票信息导出
     *
     * @param dMatchVoteInfo
     * @return
     */
    public void voteReportDownloadList(HttpServletResponse response, DMatchVoteInfo dMatchVoteInfo) {
        String matchKey = dMatchDownloadKeyMapper.query();
        if (!dMatchVoteInfo.getMatchKey().equals(matchKey)) {
            MLog.error("报表key值错误+" + matchKey);
            return;
        }
        dMatchDownloadKeyMapper.delete();
        List<DMatchVoteInfo> list = null;
        try {
            list  =dMatchVoteInfoMapper.queryList(dMatchVoteInfo);
        } catch (Exception e) {
            MLog.error("赛事投票信息导出数据下载异常：" + e.getMessage());
        }

        //设置文件名字
        String fileName = "赛事投票信息列表.xls";
        OutputStream os = null;
        /* 创建excel对象 */
        HSSFWorkbook excel = new HSSFWorkbook();
        HSSFSheet sheet = excel.createSheet(COUNT);
        HSSFRow firstRow = sheet.createRow(0);
        /*设置头消息*/
        String[] titles = {"序号", "赛事名称", "项目类型", "团队名称", "领队名称", "总票数"};
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
                    DMatchVoteInfo info = list.get(i);
                    HSSFCell cell = row.createCell(0);
                    cell.setCellValue(i + 1);
                    cell = row.createCell(1);
                    cell.setCellValue(info.getMatchName());
                    cell = row.createCell(2);
                    cell.setCellValue(info.getMatchTpName());
                    cell = row.createCell(3);
                    cell.setCellValue(info.getTeamName());
                    cell = row.createCell(4);
                    cell.setCellValue(info.getTeamHeaderName());
                    cell = row.createCell(5);
                    cell.setCellValue(info.getVoteNum());
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
     * 赛事成绩列表查询
     * @param dMatchResultInfo
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<DMatchResultInfo> queryResultList(DMatchResultInfo dMatchResultInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DMatchResultInfo> dMatchTypeList =dMatchResultInfoMapper.queryList(dMatchResultInfo);
        return    dMatchTypeList;
    }


    /**
     * 赛事成绩模版下载
     */
    public void downloadResultExcel(HttpServletResponse response){
        //设置文件名字
        String fileName = "赛事成绩模版.xls";
        OutputStream os = null;
        try {
            /* 创建excel对象 */
            HSSFWorkbook excel = new HSSFWorkbook();
            HSSFSheet sheet = excel.createSheet("count");
            HSSFRow firstRow = sheet.createRow(0);
            /*设置头消息*/
            String[] titles = {"赛事报名ID","手机号","赛事成绩","总成绩","奖项信息","成绩排名"};
            /*创建标题单元格*/
            HSSFCell cells[] = new HSSFCell[titles.length];
            /*单元格*/
            for (int i = 0; i < titles.length; i++) {
                cells[i] = firstRow.createCell(i);
                cells[i].setCellValue(titles[i]);
            }
            HSSFRow row = sheet.createRow(1);
            HSSFCell cell = row.createCell(0);
            cell.setCellValue( "ABA82C873FDF006AE05316BC18F94D5C");
            cell = row.createCell(1);
            cell.setCellValue("18888888888");
            cell = row.createCell(2);
            cell.setCellValue("80分");
            cell = row.createCell(3);
            cell.setCellValue("100分");
            cell = row.createCell(4);
            cell.setCellValue("一等奖");
            cell = row.createCell(5);
            cell.setCellValue("1");
            cell = row.createCell(6);
            cell.setCellValue("样本数据无需删除");
//            cell = row.createCell(7);
//            cell.setCellValue("样本");
            // 写文件
            os = response.getOutputStream();
            excel.write(os);
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode(fileName, "utf-8"));
        } catch (IOException e) {
            MLog.error(e.getMessage());
        }finally {
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
     *赛事成功报表导入
     * @param excelFile
     * @throws Exception
     */
    @Async
    public void userExcel1(MultipartFile excelFile) throws Exception {
        InputStream input = excelFile.getInputStream();
        Workbook workbook = Workbook.getWorkbook(input);
        readExcel1(workbook);
    }

    /**
     * 读取Excel数据，存储到数据库中
     * @param workbook
     * @throws Exception
     */
    public void readExcel1(Workbook workbook) {
        List<DMatchResultInfo> list = new ArrayList<>();
        Sheet sheet = workbook.getSheet(0);
        String cell0;
        String cell1;
        String cell3;
        String cell4;
        String cell5;
        String cell6;
        for (int k = 1; k < sheet.getRows(); k++) {
            DMatchResultInfo dMatchResultInfo = new DMatchResultInfo();
            //"赛事报名ID","手机号","票数","赛事成绩","总成绩","奖项信息"
            cell0 = sheet.getCell(0, k).getContents().trim();//得到1列数据   赛事报名ID
            cell1 = sheet.getCell(1, k).getContents().trim();//得到2列数据   手机号
            cell3 = sheet.getCell(2, k).getContents().trim();//得到4列数据   赛事成绩
            cell4 = sheet.getCell(3, k).getContents().trim();//得到5列数据   总成绩
            cell5 = sheet.getCell(4, k).getContents().trim();//得到6列数据   奖项信息
            cell6 = sheet.getCell(5, k).getContents().trim();//得到7列数据   成绩排名

            dMatchResultInfo.setApplyId(cell0);
            dMatchResultInfo.setUserNm(cell1);
            dMatchResultInfo.setResult(cell3);
            dMatchResultInfo.setTotalSecond(cell4);
            dMatchResultInfo.setPrize(cell5);
            dMatchResultInfo.setRankSecond(cell6);
            dMatchResultInfo.setResultId(UUID.randomUUID().toString());
            if (k!=1){
                list.add(dMatchResultInfo);
            }
            if (list.size()>100 || k==(sheet.getRows()-1)){
                dMatchResultInfoMapper.insertList(list);
                list.clear();
            }
        }

    }


    /**
     * 赛事投票信息导出
     *
     * @param dMatchResultInfo
     * @return
     */
    public void resultReportDownloadList(HttpServletResponse response, DMatchResultInfo dMatchResultInfo) {
        String matchKey = dMatchDownloadKeyMapper.query();
        if (!dMatchResultInfo.getMatchKey().equals(matchKey)) {
            MLog.error("报表key值错误+" + matchKey);
            return;
        }
        dMatchDownloadKeyMapper.delete();
        List<DMatchResultInfo> list = null;
        try {
            list  =dMatchResultInfoMapper.queryList(dMatchResultInfo);
        } catch (Exception e) {
            MLog.error("赛事投票信息导出数据下载异常：" + e.getMessage());
        }

        //设置文件名字
        String fileName = "赛事投票信息导出列表.xls";
        OutputStream os = null;
        /* 创建excel对象 */
        HSSFWorkbook excel = new HSSFWorkbook();
        HSSFSheet sheet = excel.createSheet(COUNT);
        HSSFRow firstRow = sheet.createRow(0);
        /*设置头消息*/
        String[] titles = {"排名", "项目类型","赛事名称", "姓名/团队名称", "票数", "赛事成绩", "总成绩", "奖项信息"};
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
                    DMatchResultInfo info = list.get(i);
                    HSSFCell cell = row.createCell(0);
                    cell.setCellValue(i + 1);
                    cell = row.createCell(1);
                    cell.setCellValue(info.getMatchTpName());
                    cell = row.createCell(2);
                    cell.setCellValue(info.getMatchName());
                    cell = row.createCell(3);
                    cell.setCellValue(info.getTeamName());
                    cell = row.createCell(4);
                    cell.setCellValue(info.getVoteNum());
                    cell = row.createCell(5);
                    cell.setCellValue(info.getResult());
                    cell = row.createCell(6);
                    cell.setCellValue(info.getTotalSecond());
                    cell = row.createCell(7);
                    cell.setCellValue(info.getPrize());
                }
            }
            // 写文件
            os = response.getOutputStream();
            excel.write(os);
            response.setContentType(APPLICATION);
            response.setHeader(CONTENT, ATTACHMENT+ URLEncoder.encode(fileName, UTF));

        } catch (Exception e) {
            MLog.error("赛事投票信息列表读写Excel失败！" + e.getMessage());
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
     * 删除赛事成绩
     * @param dMatchResultInfo
     * @return
     */
    public CommonResult deleteMatchResult(DMatchResultInfo dMatchResultInfo) {
        if (StringUtils.isEmpty(dMatchResultInfo.getResultId())){
            return CommonResult.failed("赛事成绩id为空");
        }
        int num=dMatchResultInfoMapper.delete(dMatchResultInfo.getResultId());
        if (num<1){
            return  CommonResult.failed("删除赛事成绩失败！");
        }
        return CommonResult.success(num);
//        return    num;
    }
}
