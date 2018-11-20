package com.spring.cloud.controller;

import com.spring.cloud.mapper.test2.TeacherMapper;
import com.spring.cloud.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.controller
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  8:50 2018/9/8
 * @Modifiled By
 * @Note：
 **/
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherMapper teacherMapper;

    @ResponseBody
    @RequestMapping("/getTeachers")
    public List<Teacher> selectTeacherByAll(){
        System.out.println("已查询");
       return  teacherMapper.sellectByAll();
    }


}
