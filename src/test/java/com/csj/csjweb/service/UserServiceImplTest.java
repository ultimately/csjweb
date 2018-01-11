package com.csj.csjweb.service;

import com.csj.csjweb.mapper.UserMapper;
import com.csj.csjweb.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest {

    @Autowired
    private UserMapper userDao;

    @Test
    public void getById() {
        User user = userDao.getByUserName("admin");
    }
}