package com.great.service.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author ZhPJ
 * @Date 2018/9/29 002910:47
 * @Version 1.0
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceImplApplication.class,args);
    }
}
