package com.myzy.small.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 后台管理系统的service服务、
 *
 * @author quanhx
 */
@SpringBootApplication
@MapperScan("com.myzy.small.manage.mapper")
public class SmallManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallManageServiceApplication.class, args);
    }

}
