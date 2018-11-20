package com.spring.cloud.controller;

import com.spring.cloud.mapper.test1.User1Mapper;
import com.spring.cloud.mapper.test2.User2Mapper;
import com.spring.cloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.controller
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  17:37 2018/9/7
 * @Modifiled By
 * @Note：
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users=user1Mapper.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public User getUser(Long id) {
        User user=user2Mapper.getOne(2);
        return user;
    }
}
