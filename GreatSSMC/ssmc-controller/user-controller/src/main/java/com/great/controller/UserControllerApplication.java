package com.great.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author ZhPJ
 * @Date 2018/10/10 00108:49
 * @Version 1.0
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserControllerApplication.class, args);
    }
}
