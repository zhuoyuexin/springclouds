package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.controller
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  14:11 2018/8/30
 * @Modifiled By
 * @Note：
 **/
@RestController
public class ApiController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/")
    public String home() {
        return "hello world from port " + port;
    }
}
