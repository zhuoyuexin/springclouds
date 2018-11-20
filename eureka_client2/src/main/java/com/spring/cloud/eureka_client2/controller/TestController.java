package com.spring.cloud.eureka_client2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.eureka_client2.controller
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  14:25 2018/8/30
 * @Modifiled By
 * @Note：
 **/
@RestController
public class TestController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/")
    public String home(String username) {
        return "hello world from port " + port+",usernmae: "+username;
    }
}
