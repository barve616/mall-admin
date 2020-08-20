package com.macro.mall.util;

import java.util.regex.Pattern;

public abstract class StringUtils {

	/**
	 * 正则校验手机号
	 * @param phone
	 * @return
	 */
	public static  boolean validateMobilePhone(String phone){
//	    	Pattern pattern =Pattern.compile("^[1]\\d{10}$");
		Pattern pattern = Pattern.compile("^1[3456789]\\d{9}$");
		return  pattern.matcher(phone).matches();
	}

    /**
	 * 正则校验身份证号
	 * @param certId
	 * @return
	 */
	public static  boolean validateCertId(String certId){
		Pattern pattern =Pattern.compile("\\d{17}[\\d|X]|\\d{15}");
		return  pattern.matcher(certId).matches();
	}
}
