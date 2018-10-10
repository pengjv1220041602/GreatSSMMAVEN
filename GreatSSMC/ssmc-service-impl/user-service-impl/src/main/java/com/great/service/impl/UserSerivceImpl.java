package com.great.service.impl;

import com.great.api.service.IUserServuce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ZhPJ
 * @Date 2018/9/29 002917:21
 * @Version 1.0
 * @Description:
 */
@RequestMapping("/user1")
@Controller
public class UserSerivceImpl extends OtherUserServiceImpl implements IUserServuce {

    @RequestMapping("/list")
    @ResponseBody
    public String getUserByList() {
        return "/error-page.html";
    }
    @RequestMapping("error1")
    public String error1() {
        return "error-page";
    }
}
