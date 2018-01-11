package com.csj.csjweb.service;

import com.csj.csjweb.model.Role;
import com.csj.csjweb.model.User;

import java.util.List;

public interface UserRoleService {

    List<Role> getRoleByUser(User user);
}
