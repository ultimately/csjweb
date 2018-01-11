package com.csj.csjweb.service.Impl;

import com.csj.csjweb.model.Role;
import com.csj.csjweb.model.User;
import com.csj.csjweb.service.UserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {


    private Logger logger = LoggerFactory.getLogger(UserRoleServiceImpl.class);

    @Override
    public List<Role> getRoleByUser(User user){
        return null;
    }
}
