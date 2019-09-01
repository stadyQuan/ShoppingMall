package com.myzy.small.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.myzy.small.user.mapper")
public class SmallUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmallUserApplication.class, args);
    }

}
