package com.spring.cloud.controller;
import com.spring.cloud.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.controller
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  15:00 2018/9/6
 * @Modifiled By
 * @Note：
 **/
@RestController
public class ConsumerController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
