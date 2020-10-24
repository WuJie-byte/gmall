package com.atguigu.mb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.mb.mapper")
public class MbApplication {



    public static void main(String[] args) {
        SpringApplication.run(MbApplication.class, args);
    }

    public static void aa(){}
}
