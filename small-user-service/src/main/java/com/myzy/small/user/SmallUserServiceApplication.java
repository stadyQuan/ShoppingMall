package com.myzy.small.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 用户服务
 * @author quanhx
 */
@SpringBootApplication
@MapperScan("com.myzy.small.user.mapper")
public class SmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallUserServiceApplication.class, args);
    }

}
