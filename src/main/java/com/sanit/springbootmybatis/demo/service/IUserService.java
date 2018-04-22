package com.sanit.springbootmybatis.demo.service;

import com.sanit.springbootmybatis.demo.model.User;

import java.util.List;

public interface IUserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
