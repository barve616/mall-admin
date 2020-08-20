package com.macro.mall.base.service.impl;

import com.google.gson.Gson;
import com.macro.mall.base.dto.UpPicBean;
import com.macro.mall.common.base.MValues;
import com.macro.mall.util.MLog;
import com.macro.mall.util.SFTPUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.BigDecimal;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 *
 * @author  刘博
 *  2019年8月22日
 */
@Service
public class ImgUtilsService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ImgUtilsService.class);


	/**
     *
     * 根据图片类型校验图片大小

     */
    @RequestMapping(value = "/chenckImgsize.do")
	public Object chenckImgsize(String  imgString, String  imgType) {

		int indexOf = imgString.indexOf("=");
		if (indexOf>0) {
			imgString=imgString.substring(0,indexOf);
		}
		double length = imgString.length();
		double n =1024;
        length=(length-(length/8)*2)/n;
		if ("jpg".equals(imgType)) {
			if (length / 1024 > 100) {
				return "98||文件验证失败  文件大小为 : " + length / 1024 + "(KB)";
			}
		}else if ("png".equals(imgType)) {
			if (length / 1024 > 100) {
				return "98||文件验证失败  文件大小为 : " + length / 1024 + "(KB)";
			}
		}else if ("gif".equals(imgType)) {
			if (length / 1024 > 100) {
				return "98||文件验证失败  文件大小为 : " + length / 1024 + "(KB)";
			}
		}else if ("mp4".equals(imgType)) {
			if (length / 1024 > 100) {
				return "98||文件验证失败  文件大小为 : " + length / 1024 + "(KB)";
			}
		}else {
			return "99||非法imgType类型"+imgType;
		}
		return null;
	}

	/**
	 * 2017
	 * 新版图片上传
	 *

	 * @return
	 * @throws Exception
	 */
	public String uploadImg(String imgInfo, String filePath) throws Exception {


	/*	MultipartFile fileForShareImg = multipartHttpServletRequest.getFile("shareFile");
		if (fileForShareImg != null && fileForShareImg.getSize() > 0) {
			// 上传图片
			// String picInfo = CommFunction.buildPreUpload(fileForShareImg,
			// src);
			String picInfo = uploadImg(fileForShareImg, null, null).get("fileUrl");
			picPathForShareImg = picInfo;
		}*/
		/*if (StringUtils.checkEmpty(filePath)) {
			filePath = "file";
		}
		if (StringUtils.checkEmpty(fileName)) {
			fileName = "file_upload";
		}*/
		//fileName = image.getOriginalFilename();
		//int index = fileName.lastIndexOf(".");
		//String postfix = fileName.substring(index);
		String fileName = new Date().getTime() + ".jpg";
		System.out.println(fileName);
		String fileUrl = "/mobilelife/uploadfile/" + filePath + "/" + fileName;
		InputStream input = new ByteArrayInputStream(Base64.getDecoder().decode(imgInfo));
		SFTPUtils f = new SFTPUtils(MValues.get("DMZ.FTPIP.33"), 22, MValues.get("DMZ.FTPUSER.33"), MValues.get("DMZ.FTPPASS.33"));
		boolean downloadOK = false;
		try {
			f.connect();
			downloadOK = f.uploadInputStream(input, fileUrl, MValues.get("DMZ.Path"), MValues.get("DMZ.TARGETPath"));
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.info(MValues.get("DMZ.FTPIP.33") + "上传图片出错：" + fileUrl, e);
		} finally {
			f.disconnect();
		}
		input = new ByteArrayInputStream(Base64.getDecoder().decode(imgInfo));
		if (downloadOK) {
			f = new SFTPUtils(MValues.get("DMZ.FTPIP.34"), 22, MValues.get("DMZ.FTPUSER.34"), MValues.get("DMZ.FTPPASS.34"));
			try {
				f.connect();
				downloadOK = f.uploadInputStream(input, fileUrl, MValues.get("DMZ.Path"), MValues.get("DMZ.TARGETPath"));
			} catch (Exception e) {
				e.printStackTrace();
				LOGGER.info(MValues.get("DMZ.FTPIP.34") + "上传图片出错：" + fileUrl, e);
			} finally {
				f.disconnect();
			}
		}
		return fileUrl;
	}
//	public static void main(String[] args) throws Exception {
//		String file = "file";
//        String img = "dsdsd";
//        System.out.println(uploadImg(img, file));
//	}

	/**
	 * 2017
	 * CMS图片上传
	 *
	 * @return
	 * @throws Exception
	 */
	public   String uploadImgCMS(String imgInfo ,String filePath) throws Exception {
		String format = null;
		String base64 = imgInfo.split(",")[1];
		try {
			format = imgInfo.split(";")[0].split("/")[1];
			switch (format.toLowerCase()){
				case "jpg":
				case "jpeg":
				case "png":
				case "gif":
					if(base64ToKB(imgInfo) > 500){
						throw new Exception("图片过大！");
					}
					break;
				case "avi":
				case "rmvb":
				case "mov":
					if(base64ToKB(imgInfo) > 1024){
						throw new Exception("视频过大！");
					}
					break;
				default:
					throw new Exception("文件格式不支持！");
			}
		}catch (Exception e){
			throw new Exception("base64格式不正确！");
		}

		String fileName = new Date().getTime() + "." + format;
		String fileUrl = "/mobilelife/uploadfile/" + filePath + "/" + fileName;
		InputStream input = new ByteArrayInputStream(Base64.getDecoder().decode(base64));
		SFTPUtils f = new SFTPUtils(MValues.get("DMZ.FTPIP.33"), 22, MValues.get("DMZ.FTPUSER.33"), MValues.get("DMZ.FTPPASS.33"));
		boolean downloadOK = false;
		try {
			f.connect();
			downloadOK = f.uploadInputStream(input, fileUrl, MValues.get("DMZ.Path"), MValues.get("DMZ.TARGETPath"));
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.info(MValues.get("DMZ.FTPIP.33") + "上传图片出错：" + fileUrl, e);
		} finally {
			f.disconnect();
		}
		input = new ByteArrayInputStream(Base64.getDecoder().decode(base64));
		if (downloadOK) {
			f = new SFTPUtils(MValues.get("DMZ.FTPIP.34"), 22, MValues.get("DMZ.FTPUSER.34"), MValues.get("DMZ.FTPPASS.34"));
			try {
				f.connect();
				downloadOK = f.uploadInputStream(input, fileUrl, MValues.get("DMZ.Path"), MValues.get("DMZ.TARGETPath"));
			} catch (Exception e) {
				e.printStackTrace();
				LOGGER.info(MValues.get("DMZ.FTPIP.34") + "上传图片出错：" + fileUrl, e);
			} finally {
				f.disconnect();
			}
		}
		return fileUrl;
	}

	private static float base64ToKB(String base64){
		int i = base64.indexOf("=");
		if( i > 0 ){
			base64 = base64.substring(0, i);
		}
		int length = base64.length();
		Integer size = length-(length/8)*2;
		BigDecimal filesize = new BigDecimal(size);
		BigDecimal megabyte = new BigDecimal(1024);
		float v = filesize.divide(megabyte, 1, BigDecimal.ROUND_DOWN).floatValue();
		return v;
	}


	/**
	 * 图片上传(二进制)
	 * @param excelFile
	 * @return
	 */
	public UpPicBean uploadPicToDMZ (MultipartFile excelFile) throws IOException {
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
		upPicBean.setPicUrl(MValues.get("visitPath2")+fileUrl);
		return upPicBean;

	}


	private String base64 = "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";


	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] data = null;
		InputStream in = null;
		try {
			in = new FileInputStream("D:\\Users\\Pictures\\222.PNG");
			data = new byte[in.available()];
			in.read(data);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		BASE64Encoder encoder = new BASE64Encoder();
		String base64Str = encoder.encode(data);
	}

}
