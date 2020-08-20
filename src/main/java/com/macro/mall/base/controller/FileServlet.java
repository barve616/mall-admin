package com.macro.mall.base.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.macro.mall.common.base.MValues;
import com.macro.mall.common.util.Tool;
import com.macro.mall.util.SFTPUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileServlet extends HttpServlet {
	private static final Logger LOGGER = LoggerFactory.getLogger(FileServlet.class);

	public static String DMZFTPIP33;
	public static String DMZFTPUSER33;
	public static String DMZFTPPASS33;
	public static String DMZFTPIP34;
	public static String DMZFTPUSER34;
	public static String DMZFTPPASS34;
	public static String DMZPath;// 相对本地同步文件夹
	public static String DMZTARGETPath;// 目标同步文件夹地址

	static {
		DMZFTPIP33 = MValues.get("DMZ.FTPIP.33");
		DMZFTPUSER33 = MValues.get("DMZ.FTPUSER.33");// mlife
		DMZFTPPASS33 = MValues.get("DMZ.FTPPASS.33");// "Aa-11111";

		DMZFTPIP34 = MValues.get("DMZ.FTPIP.34");
		DMZFTPUSER34 = MValues.get("DMZ.FTPUSER.34");// mlife
		DMZFTPPASS34 = MValues.get("DMZ.FTPPASS.34");// "Aa-11111";

		DMZPath = MValues.get("DMZ.Path");// "/mobilelife";// 相对本地同步文件夹
		DMZTARGETPath = MValues.get("DMZ.TARGETPath");// "/mlife/share/Pic";//
	}

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String localPath = null;
		LOGGER.info("查询图片＝＝>" + request.getRequestURI());
		String localUrl = request.getRequestURI();
		String path = SFTPUtils.FtpFilePathEnd(localUrl);

		SFTPUtils f = new SFTPUtils(DMZFTPIP33, 22, DMZFTPUSER33, DMZFTPPASS33);
		boolean downloadOK = false;
		try {
			f.connect();
			downloadOK = f.downloadFile(path);
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.info(DMZFTPIP33 + "下载图片出错：" + path, e);
		} finally {
			f.disconnect();
		}

		if (downloadOK) {
			f = new SFTPUtils(DMZFTPIP34, 22, DMZFTPUSER34, DMZFTPPASS34);
			try {
				f.connect();
				downloadOK = f.downloadFileTemp(path);
			} catch (Exception e) {
				e.printStackTrace();
				LOGGER.info(DMZFTPIP34 + "下载图片出错：" + path, e);
			} finally {
				f.disconnect();
			}
		}
		response.setContentType("image/jpeg;charset=GBK");
		ServletOutputStream out = response.getOutputStream();
		int i = 0;
		int i2 = 1;
		if (downloadOK) {
			try {
				FileInputStream in = new FileInputStream(Tool.getRealPath() + path);
				FileInputStream in2 = new FileInputStream(Tool.getRealPath() + path + "_temp");
				i = in.available();
				i2= in2.available();
				if (i == i2) {
					byte[] buffer = new byte[i];
					while (in.read(buffer) != -1) {
						out.write(buffer);
					}
					in2.close();
					in.close();
					out.flush();
					out.close();
					return;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		LOGGER.info("图片大小对比：" + i + "--->" + i2);
		createDefultPic(out);
	}

	private void createDefultPic(ServletOutputStream out) throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream(Tool.getRealPath() + "/commons/building.jpg");
		int i = in.available();
		byte[] buffer = new byte[i];
		while (in.read(buffer) != -1) {
			out.write(buffer);
		}
		in.close();
		out.flush();
		out.close();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}

