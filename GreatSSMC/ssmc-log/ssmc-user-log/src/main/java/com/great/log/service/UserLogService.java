package com.great.log.service;

import com.great.entry.User;

import java.lang.annotation.Documented;

/**
 * @Author ZhPJ
 * @Date 2018/10/12 001213:56
 * @Version 1.0
 * @Description:
 */
public interface UserLogService {
    // 查询
    User findById(String id);
    // 保存用户
    boolean saveUser (User user);
}
