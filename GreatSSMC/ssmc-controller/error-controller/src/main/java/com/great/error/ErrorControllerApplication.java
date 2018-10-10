package com.great.error;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author ZhPJ
 * @Date 2018/10/10 00109:05
 * @Version 1.0
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ErrorControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ErrorControllerApplication.class, args);
    }
}
