package com.great.log.service.impl;

import com.great.entry.User;
import com.great.log.dao.UserLogDao;
import com.great.log.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author ZhPJ
 * @Date 2018/10/12 001213:56
 * @Version 1.0
 * @Description:
 */
@Service
public class UserLogServiceImpl implements UserLogService {
    @Autowired
    private UserLogDao userLogDao;

    @Override
    public User findById(String id) {
        Optional<User> user = userLogDao.findById(id);
        return user.isPresent() ? user.get() : null;
    }

    @Override
    public boolean saveUser(User user) {
        return  userLogDao.save(user) != null;
    }
}
