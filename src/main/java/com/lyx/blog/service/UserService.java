package com.lyx.blog.service;

import com.lyx.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
