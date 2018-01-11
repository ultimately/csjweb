package com.csj.csjweb.service;

import com.csj.csjweb.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {

    User getById(Integer id);

    User getUsername(String username);
}
