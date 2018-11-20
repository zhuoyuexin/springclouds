package com.spring.cloud.model;

import java.io.Serializable;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.model
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  17:27 2018/9/7
 * @Modifiled By
 * @Note：
 **/
public class User implements Serializable {

    private int id;

    private String username;

    private String pwd;

   public  User(){
        super();
     }

     public User(int id,String username,String pwd){
       super();
       this.id = id;
       this.username = username;
       this.pwd = pwd;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
