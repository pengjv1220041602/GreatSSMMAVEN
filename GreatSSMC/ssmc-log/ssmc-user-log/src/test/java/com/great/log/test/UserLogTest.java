package com.great.log.test;

import com.great.entry.User;
import com.great.log.service.UserLogService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author ZhPJ
 * @Date 2018/10/12 001213:53
 * @Version 1.0
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserLogTest {

    @Autowired
    private UserLogService userLogService;

    @Test
    public void testFindById() {
        Assert.assertEquals(new User("1", "小明"),
                userLogService.findById("1"));
    }

    @Test
    public void testSaveUser () {
        Assert.assertTrue("添加失败！",
                userLogService.saveUser(new User("1", "小明")));
    }

}
