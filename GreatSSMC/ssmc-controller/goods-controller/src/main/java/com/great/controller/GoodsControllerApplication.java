package com.great.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author ZhPJ
 * @Date 2018/10/10 001015:11
 * @Version 1.0
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class GoodsControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsControllerApplication.class, args);
    }
}
