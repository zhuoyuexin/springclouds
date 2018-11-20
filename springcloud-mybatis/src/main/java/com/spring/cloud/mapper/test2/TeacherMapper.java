package com.spring.cloud.mapper.test2;
import com.spring.cloud.model.Teacher;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.mapper.test2
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  8:48 2018/9/8
 * @Modifiled By
 * @Note：
 **/
public interface TeacherMapper {

    @Select("SELECT * FROM teacher")
    @Results({
            @Result(property = "userNum", column = "user_num"),
            @Result(property = "username", column = "username"),
            @Result(property = "pwd", column = "pwd"),
            @Result(property = "age", column = "age")
    })
    List<Teacher> sellectByAll();
}
