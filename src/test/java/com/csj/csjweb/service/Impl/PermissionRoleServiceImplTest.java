package com.csj.csjweb.service.Impl;

import com.csj.csjweb.service.PermissionRoleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class PermissionRoleServiceImplTest {

    @Autowired
    private PermissionRoleService permissionRoleService;

    @Test
    public void getUser() {
        permissionRoleService.getUser();
    }
}