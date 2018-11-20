package com.spring.cloud.utils;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.utils
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  14:23 2018/9/5
 * @Modifiled By
 * @Note：
 **/
public enum IStatusConstant {
    //记录状态
    NoDisplay(0,"不显示"),
    UNDISPOSED(1,"未处理"),
    UNISSUED(2,"未下发"),
    ISSUED(3,"已下发"),
    RECYCLE(4,"已回收"),
    HAND_IN(5,"已上交"),
    ISSUED_SUCCESS(6,"下发完成");


    private final int status;

    private final String statusName;

    IStatusConstant(int status, String statusName){
        this.status = status;
        this.statusName = statusName;
    }

    public int getStatus() {
        return status;
    }


    public String getStatusName(){
        return statusName;
    }
}
