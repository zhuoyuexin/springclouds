package com.spring.cloud.mapper.test1;
import com.spring.cloud.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud.mapper
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  17:31 2018/9/7
 * @Modifiled By
 * @Note：
 **/

public interface User1Mapper {


    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "username", column = "username"),
            @Result(property = "pwd", column = "pwd")
    })
    List<User> getAll();
}
