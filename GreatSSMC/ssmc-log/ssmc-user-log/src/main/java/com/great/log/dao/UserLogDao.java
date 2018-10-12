package com.great.log.dao;

import com.great.entry.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author ZhPJ
 * @Date 2018/10/12 001213:58
 * @Version 1.0
 * @Description:
 */
public interface UserLogDao extends MongoRepository<User, String> {

}
