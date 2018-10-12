package com.great.api.service;

import com.great.entry.User;

/**
 * @Author ZhPJ
 * @Date 2018/9/29 002917:18
 * @Version 1.0
 * @Description:
 */
public interface IUserService extends IOtherUserService {
    User getUser();
}
