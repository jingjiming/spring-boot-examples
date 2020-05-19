package com.css.web;

import com.css.entity.User;
import com.css.mapper.master.UserMasterMapper;
import com.css.mapper.slave.UserSlaveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jiming.jing on 2018/8/13.
 */
@RestController
public class UserController {

    @Autowired
    private UserMasterMapper userMasterMapper;

    @Autowired
    private UserSlaveMapper userSlaveMapper;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = userMasterMapper.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public User getUser(Long id) {
        User user = userSlaveMapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(User user) {
        userSlaveMapper.insert(user);
    }

    @RequestMapping(value = "update")
    public void update(User user) {
        userSlaveMapper.update(user);
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMasterMapper.delete(id);
    }
}
