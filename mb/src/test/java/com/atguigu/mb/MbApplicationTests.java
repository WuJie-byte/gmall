package com.atguigu.mb;

import com.atguigu.mb.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MbApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {



    }

}
