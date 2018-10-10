package com.great.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.great.api.service.IOtherUserService;
import com.great.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZhPJ
 * @Date 2018/9/29 002917:07
 * @Version 1.0
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class OtherUserServiceImpl extends AbstractErrorController implements IOtherUserService {
    /**
     * JSON解析器
     */
    @Autowired
    private ObjectMapper jsonMapper;

    public OtherUserServiceImpl() {
        super(new DefaultErrorAttributes());
    }

    @RequestMapping(path={"/user/{id}/{name}"})
    @Override
    public User getUser(@PathVariable("id") String id, @PathVariable("name") String name) {
        return new User(id, name);
    }
    @RequestMapping("/error")
    @ResponseBody
    @Override
    public String getErrorPath() {
        return "/error-page";
    }
}
