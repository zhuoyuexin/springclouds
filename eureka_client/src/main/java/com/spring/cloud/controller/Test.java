package com.spring.cloud.controller;
import com.spring.cloud.utils.IStatusConstant;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.controller
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  14:23 2018/9/5
 * @Modifiled By
 * @Note：
 **/
public class Test {


 public static void main(String[] args){
     int state = 1;
     if(state == IStatusConstant.UNDISPOSED.getStatus()){
         System.out.println(IStatusConstant.UNDISPOSED.getStatusName());
     }
     state = 4;
     if(state == IStatusConstant.RECYCLE.getStatus()){
         System.out.println(IStatusConstant.RECYCLE.getStatusName());
     }
     System.out.println("123");
 }
}
