package com.great.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.great.entry.extended.UserExtended;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @Author ZhPJ
 * @Date 2018/10/9 000916:46
 * @Version 1.0
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OtherUserServiceImplTest {
    @Autowired
    private ObjectMapper mapper;

    private MockMvc mockMvc;
    @Test
    public void getUser() {

    }
}