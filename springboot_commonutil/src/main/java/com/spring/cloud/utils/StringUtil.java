package com.spring.cloud.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.utils
 * @Description： 字符串工具类
 * @Author：zhuoyuexin
 * @Create in  11:04 2018/9/8
 * @Version v1.0
 * @Modifiled By
 * @Note：
 **/

public class StringUtil {
	public static String getGuid() {
		return UUID.randomUUID().toString().trim().replaceAll("-", "").toLowerCase();
	}

	public static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

	public static boolean isEmpty(String str) {
		if (str == null || str.length() == 0 || str.equals("")) {
			return true;
		}
		return false;
	}
	
	public static String getSign(String ticket, String nonceStr, long timeStamp, String url) throws Exception {
		String plain = "jsapi_ticket=" + ticket + "&noncestr=" + nonceStr + "&timestamp=" + String.valueOf(timeStamp) + "&url=" + url;
		try {
			MessageDigest sha1 = MessageDigest.getInstance("SHA-1"); 
			sha1.reset();
			sha1.update(plain.getBytes("UTF-8")); 
			return bytesToHex(sha1.digest());
		} catch (NoSuchAlgorithmException e) {
			throw new Exception(e.getMessage());
		} catch (UnsupportedEncodingException e) {
			throw new Exception(e.getMessage());
		}
	}

	private static String bytesToHex(byte[] hash) { 
		Formatter formatter = new Formatter();
		for (byte b : hash) {
			formatter.format("%02x", b);
		}
		String result = formatter.toString();
		formatter.close();
		return result;
	}
	
}
