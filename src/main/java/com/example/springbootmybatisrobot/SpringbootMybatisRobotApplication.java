package com.example.springbootmybatisrobot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.springbootmybatisrobot.Mapper")
@SpringBootApplication
public class SpringbootMybatisRobotApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisRobotApplication.class, args);
    }

}
