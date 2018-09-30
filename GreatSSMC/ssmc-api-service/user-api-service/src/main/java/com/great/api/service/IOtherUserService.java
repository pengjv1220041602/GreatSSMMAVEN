package com.great.api.service;

import com.great.entry.User;

/**
 * @Author ZhPJ
 * @Date 2018/9/29 002917:07
 * @Version 1.0
 * @Description:
 */
public interface IOtherUserService {
    User getUser(String id, String name);
}
