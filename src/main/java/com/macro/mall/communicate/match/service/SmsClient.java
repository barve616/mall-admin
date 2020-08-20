package com.macro.mall.communicate.match.service;

import com.macro.mall.util.MLog;
import com.pre.WSServer.PreEntranceProxy;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * 向前置发送数据（客户端Client）
 *  * @author EaglePan
 *
 */
public class SmsClient
{

	public String sendToBas(String xmlRpt,String url) throws Exception
	{ 
        try { 
        	String str = new PreEntranceProxy(url).msgInteractive(xmlRpt); 
        	SAXReader sr = new SAXReader();
    		Document doc = sr.read(new StringReader(str));
    		Element rootNode = doc.getRootElement().element("head");
    		String retCode = rootNode.elementText("stat").trim();  //获取返回码
    		String retMsg = rootNode.elementText("result").trim();  //获取返回信息
    		Document docx = DocumentHelper.createDocument();
    	    Element sms = docx.addElement("sms");
    	    if("0000".equals(retCode)||"0002".equals(retCode)){//0002表示繁忙 假设成功返回   0000表示成功
    	    	retCode = "0";
    	    }
    	    sms.addElement("retCode").setText(retCode);
    	    sms.addElement("retMsg").setText(retMsg);
    	    OutputFormat format = OutputFormat.createCompactFormat(); //createPrettyPrint() 层次格式化
            StringWriter writer = new StringWriter();
            XMLWriter output = new XMLWriter(writer, format);
            try {
                output.write(docx);
                writer.close();
                output.close();
            } catch (IOException e) {
                MLog.error(e.getMessage());
            }
            return writer.toString();
		} 
         catch (Exception e) 
        {
			MLog.error("从客户端向前置发送报文异常"+e.getMessage());
			throw e;
		} 
	} 
}
