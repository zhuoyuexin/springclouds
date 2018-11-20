package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringcloudMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudMybatisApplication.class, args);
    }
}
