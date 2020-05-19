package com.css.service;

import com.css.entity.User;

import java.util.List;

/**
 * Created by jiming.jing on 2018/8/9.
 */
public interface UserService {

    public List<User> getUserList();

    public User findUserById(String id);

    public void save(User user);

    public void edit(User user);

    public void delete(String id);
}
