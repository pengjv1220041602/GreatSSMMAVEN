package com.great.controller;

import com.great.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ZhPJ
 * @Date 2018/10/10 001015:09
 * @Version 1.0
 * @Description:
 */
@Controller
public class GoodsController {
    @Autowired
    private UserClient userClient;

    @RequestMapping("/user")
    @ResponseBody
    public User getUser () {
        return userClient.getUser();
    }
}
