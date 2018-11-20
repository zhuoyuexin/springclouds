package com.spring.cloud;

import com.alibaba.fastjson.JSON;
import com.spring.cloud.utils.HttpRequest;
import com.spring.cloud.utils.MD5Util;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringbootCommonutilApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCommonutilApplication.class, args);

        String pwd = MD5Util.getMD5("123");
        System.out.println("加密后："+pwd);

        Map<String,String> map = new HashMap<>();
        map.put("name","严露萍");
        map.put("password","123456");
        String json = JSON.toJSONString(map);
        System.out.println("Json字符串： "+json);
        String result = HttpRequest.sendGet("http://localhost:8080/FileApp/UserController/login.do","name=严露萍&password=123456");
        System.out.println("响应结果： "+result);
    }
}
