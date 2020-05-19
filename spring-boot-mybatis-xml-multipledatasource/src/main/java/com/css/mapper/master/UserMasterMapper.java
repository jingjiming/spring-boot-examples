package com.css.mapper.master;

import com.css.entity.User;

import java.util.List;

/**
 * Created by jiming.jing on 2018/8/13.
 */
public interface UserMasterMapper {


    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
