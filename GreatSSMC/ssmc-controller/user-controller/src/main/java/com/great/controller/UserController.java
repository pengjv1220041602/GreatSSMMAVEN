package com.great.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ZhPJ
 * @Date 2018/10/10 00108:48
 * @Version 1.0
 * @Description:
 */
@Controller
public class UserController {
    @RequestMapping("/a")
    public String getUser() {
        int a = 1/0;
        return "/a3333";
    }
}
