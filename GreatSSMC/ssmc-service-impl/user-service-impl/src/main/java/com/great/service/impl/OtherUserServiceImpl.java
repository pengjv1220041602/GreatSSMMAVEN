package com.great.service.impl;

import com.great.api.service.IOtherUserService;
import com.great.entry.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZhPJ
 * @Date 2018/9/29 002917:07
 * @Version 1.0
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class OtherUserServiceImpl implements IOtherUserService {
    @RequestMapping(path={"/user/{id}/{name}"})
    @Override
    public User getUser(@PathVariable("id") String id, @PathVariable("name") String name) {
        return new User(id, name);
    }
}
