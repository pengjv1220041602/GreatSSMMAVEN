package com.great.controller;

import com.great.entry.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author ZhPJ
 * @Date 2018/10/10 001015:14
 * @Version 1.0
 * @Description:
 */
@FeignClient("user-service")
public interface UserClient {
    @RequestMapping(path = "/user/1/222", method = RequestMethod.GET)
    User getUser();
}
