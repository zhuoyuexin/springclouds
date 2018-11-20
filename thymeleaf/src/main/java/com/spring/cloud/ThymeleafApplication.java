package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThymeleafApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        builder.headless(false).web(false).run();
        return builder.sources(ThymeleafApplication.class) ;
    }
    public static void main(String[] args) {
        //SpringApplicationBuilder builder = new SpringApplicationBuilder(ThymeleafApplication.class);
     //   builder.headless(false).web(false).run(args);
        SpringApplication.run(ThymeleafApplication.class, args);
    }
}
