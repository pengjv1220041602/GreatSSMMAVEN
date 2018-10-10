package com.great.api.service;

import com.great.entry.User;
import org.springframework.web.bind.annotation.RequestPart;

/**
 * @Author ZhPJ
 * @Date 2018/9/29 002917:07
 * @Version 1.0
 * @Description:
 */
public interface IOtherUserService {
    /**
     * @deprecated: 获取对应的id和名称
     *
     * @param: 用户的id和用户的名称
     * @return:
     */
    User getUser(String id, String name);


}
