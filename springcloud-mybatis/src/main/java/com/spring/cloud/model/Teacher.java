package com.spring.cloud.model;

import java.io.Serializable;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.model
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  8:42 2018/9/8
 * @Modifiled By
 * @Note：
 **/
public class Teacher implements Serializable {
    private int fdId;

    private String userNum;

    private String username;

    private String pwd;

    private int age;

    public Teacher() {
        super();
    }

    public Teacher(int fdId, String userNum, String username, String pwd, int age) {
         super();
         this.fdId = fdId;
         this.userNum = userNum;
         this.username = username;
         this.pwd = pwd;
         this.age = age;

    }

    public int getFdId() {
        return fdId;
    }

    public void setFdId(int fdId) {
        this.fdId = fdId;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TeacherMapper{" +
                "fdId=" + fdId +
                ", userNum='" + userNum + '\'' +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                '}';
    }
}
