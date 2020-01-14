package com.fengchen.service;

import com.fengchen.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
