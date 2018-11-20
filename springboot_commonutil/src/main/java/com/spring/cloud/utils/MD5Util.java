package com.spring.cloud.utils;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.utils
 * @Description： MD5加密工具类
 * @Author：zhuoyuexin
 * @Create in  11:04 2018/9/8
 * @Version：v1.0
 * @Modifiled By
 * @Note：
 **/
public class MD5Util {

    /**利用MD5进行加密
     * @param str  待加密的字符串
     * @return  加密后的字符串
     * @throws NoSuchAlgorithmException  没有这种产生消息摘要的算法
     * @throws UnsupportedEncodingException
     */
    public static String getMD5(String str){
        String newstr = "";
        //确定计算方法
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
        }catch (NoSuchAlgorithmException nse){
            nse.printStackTrace();
        }catch (UnsupportedEncodingException uee){
            uee.printStackTrace();
        }
        return newstr;
    }


//    public  static void main(String[] args){
//
//        String pwd = getMD5("123");
//        System.out.println("加密后： "+pwd);
//    }

}
