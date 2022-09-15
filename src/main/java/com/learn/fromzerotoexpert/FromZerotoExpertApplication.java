package com.learn.fromzerotoexpert;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
@MapperScan(basePackages = "com.learn.fromzerotoexpert.model.dao")


public class FromZerotoExpertApplication {

    public static void main(String[] args) {
        SpringApplication.run(FromZerotoExpertApplication.class, args);
    }

}
