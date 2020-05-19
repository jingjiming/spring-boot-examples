package com.css.dao;

import com.css.entity.User;

/**
 * Created by JIMING on 2018/9/7.
 */
public interface UserDao {

    public void saveUser(User user);

    public User findUserByUserName(String userName);

    public int updateUser(User user);

    public void deleteUserById(Long id);
}
