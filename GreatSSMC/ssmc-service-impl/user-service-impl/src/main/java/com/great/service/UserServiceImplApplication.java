package com.great.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author ZhPJ
 * @Date 2018/9/29 002910:47
 * @Version 1.0
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserServiceImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceImplApplication.class,args);
    }
}
