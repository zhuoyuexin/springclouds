package com.spring.cloud.model;

import java.time.LocalDate;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ryan Miao at 2018-06-14 15:07
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private LocalDate birth;


}
