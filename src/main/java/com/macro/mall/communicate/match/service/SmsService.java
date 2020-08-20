package com.macro.mall.communicate.match.service;

import com.macro.mall.mapper.DMatchRegisterMapper;
import com.macro.mall.mapper.DRegistRecMapper;
import com.macro.mall.mapper.DSmsConfigMapper;
import com.macro.mall.mapper.DTcodepossParaMapper;
import com.macro.mall.model.DMatchRegister;
import com.macro.mall.model.DRegistRec;
import com.macro.mall.model.DSmsConfig;
import com.macro.mall.util.MLog;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SmsService {

    @Autowired
    private DRegistRecMapper dRegistRecMapper;

    @Autowired
    private DSmsConfigMapper dSmsConfigMapper;

    @Autowired
    private DTcodepossParaMapper dTcodepossParaMapper;

    @Autowired
    private DMatchRegisterMapper dMatchRegisterMapper;

    public final static String SMS_HEADER="<?xml version=\"1.0\" encoding=\"UTF-8\"?><forms><head><txnNo>001BNS999999</txnNo>";//---短信扩容---

    public final static String SYS_ID="MLIFE";

    public final static String TEMPId="MLIFE001";

    public final static String SMS_END="<filer1></filer1><filer2></filer2></body></forms>";


    /**
     * 循环发送短信
     * @param id
     * @param list
     * @throws Exception
     */
    public void sendMessage(String id, List<DMatchRegister> list) throws Exception {
        String url=  dTcodepossParaMapper.getParaValByParaType("smsUrl");
        String content;
        content = getSmsContent(id);
        if (null == content) {
            throw new Exception("短信生成失败");
        }
        for(DMatchRegister st: list) {
            if (!checkSmsTime(st.getUserPhone(), id)) {
                throw new Exception("短信发送过快，请稍后重试！");
            }
            String retXml = sendToBas(prepareSendData(content, st.getUserPhone()), url);
            String retCode = decodeOtherRpt(retXml);
            if (retCode != null && retCode.equals("0")) {
                MLog.info("已发送短信验证码至" + st.getUserPhone().substring(0, 3) + "****" + st.getUserPhone().substring(st.getUserPhone().length() - 4, st.getUserPhone().length()) + "的手机");
                dMatchRegisterMapper.updateState(st.getUserPhone());
            } else {
                throw new Exception("短信发送失败");
            }
        }
    }


    /**
     * 发送短信
     *
     * @param id
     * @param userPhone
     * @throws Exception
     */
    public void sendMessage(String id, String userPhone, String param) throws Exception {
        String url = dTcodepossParaMapper.getParaValByParaType("smsUrl");
        String content;
        content = getSmsContent(id);
        if (null == content) {
            throw new Exception("短信生成失败");
        }
        if (!checkSmsTime(userPhone, id)) {
            throw new Exception("短信发送过快，请稍后重试！");
        }
        //替换短信内容
        if (param!=null){
            content=content.replace("${teamName}",param);
        }
        String retXml = sendToBas(prepareSendData(content, userPhone), url);
        String retCode = decodeOtherRpt(retXml);
        if (retCode != null && retCode.equals("0")) {
            MLog.info("已发送短信验证码至" + userPhone.substring(0, 3) + "****" + userPhone.substring(userPhone.length() - 4, userPhone.length()) + "的手机");
        } else {
            throw new Exception("短信发送失败");
        }

    }

    /**
     * 前置验证码返回报文的解析
     *
     * @param xmlRpt
     * @return
     * @throws Exception
     */
    private static String decodeOtherRpt(String xmlRpt) throws Exception {
        String retCode = "";
        try {
            SAXReader sr = new SAXReader();
            Document doc = sr.read(new StringReader(xmlRpt));
            Element rootNode = doc.getRootElement();
            retCode = rootNode.elementText("retCode").trim(); // 获取返回码
        } catch (Exception e) {
            throw e;
        }
        return retCode;
    }

    /**
     * 判断上次发短信时间间隔是否超过60s
     *
     * @param mobilePhone
     * @param smsId
     * @return
     */
    public boolean checkSmsTime(String mobilePhone, String smsId) {
        String id = mobilePhone + smsId;
        DRegistRec last = dRegistRecMapper.selectRegistById(id);
        if (last == null) {
            return true;
        }
        try {
            Date lastDate = new SimpleDateFormat("yyyyMMddHHmmss").parse(last.getCreateTm());
            return new Date().getTime() - lastDate.getTime() >= 60000;
        } catch (ParseException e) {
            MLog.info("对比短信发送时间是出错", e);
           MLog.error(e.getMessage());
        }

        return true;
    }



    /**
     * 根据短信模板获取短信内容
     *
     * @param id
     * @return
     */
    private String getSmsContent(String id) {
        String content = null;
        try {
            DSmsConfig dSmsConfig = dSmsConfigMapper.selectSmsId(id);
            if (null != dSmsConfig && !"".equals(dSmsConfig.getContent().trim())) {
                content = dSmsConfig.getContent();
            }
        } catch (Exception e) {
           MLog.error(e.getMessage());
        }
        return content;
    }

    /**
     * 发送短信组包
     *
     * @param content
     * @param phoneNo
     * @return
     */
    private static String prepareSendData(String content, String phoneNo) {
        StringBuffer sb = new StringBuffer();
        sb.append(SMS_HEADER);
        sb.append("<seqNo>").append("000000").append("</seqNo>");
        sb.append("<sysID>").append(SYS_ID).append("</sysID>");
        sb.append("</head><body><telNum>").append(phoneNo).append("</telNum><tempId>" + TEMPId + "</tempId>");
        sb.append("<content>").append(content).append("</content>");
        sb.append(SMS_END);
	    MLog.info("[发送到前置平台的验证码报文]" + sb.toString());
        return sb.toString();
    }

    public static String sendToBas(String sendMessage,String url) {
        SmsClient client = new SmsClient();
        String xml = "";
        try {
            xml = client.sendToBas(sendMessage,url);
        } catch (Exception e) {
            MLog.error(e.getMessage());
        }
        return xml;
    }

    /**
     * 赛事报名Excel下载
     */
    public void downloadExcel(HttpServletResponse response){
        //设置文件名字
        String fileName = "赛事优质客户.xls";
        OutputStream os = null;
        try {
        /* 创建excel对象 */
        HSSFWorkbook excel = new HSSFWorkbook();
        HSSFSheet sheet = excel.createSheet("count");
        HSSFRow firstRow = sheet.createRow(0);
        /*设置头消息*/
        String[] titles = {"姓名","手机号"};
        /*创建标题单元格*/
        HSSFCell cells[] = new HSSFCell[titles.length];
        /*单元格*/
        for (int i = 0; i < titles.length; i++) {
            cells[i] = firstRow.createCell(i);
            cells[i].setCellValue(titles[i]);
        }
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
     * 决赛白名单模板下载
     */
    public void downloadFinalExcel(HttpServletResponse response){
        //设置文件名字
        String fileName = "决赛白名单模板.xls";
        OutputStream os = null;
        try {
            /* 创建excel对象 */
            HSSFWorkbook excel = new HSSFWorkbook();
            HSSFSheet sheet = excel.createSheet("count");
            HSSFRow firstRow = sheet.createRow(0);
            /*设置头消息*/
            String[] titles = {"姓名","手机号","证件号码"};
            /*创建标题单元格*/
            HSSFCell cells[] = new HSSFCell[titles.length];
            /*单元格*/
            for (int i = 0; i < titles.length; i++) {
                cells[i] = firstRow.createCell(i);
                cells[i].setCellValue(titles[i]);
            }
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
}
