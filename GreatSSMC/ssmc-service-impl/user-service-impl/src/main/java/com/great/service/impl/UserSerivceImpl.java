package com.great.service.impl;

import com.great.api.service.IUserService;
import com.great.entry.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ZhPJ
 * @Date 2018/9/29 002917:21
 * @Version 1.0
 * @Description:
 */
@Service
public class UserSerivceImpl implements IUserService {

    @RequestMapping("/user/{id}/{name}")
    @ResponseBody
    @Override
    public User getUser() {
        return new User("1", "222");
    }
}
