package com.css.mapper.slave;

import com.css.entity.User;

import java.util.List;

/**
 * Created by jiming.jing on 2018/8/13.
 */
public interface UserSlaveMapper {


    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
