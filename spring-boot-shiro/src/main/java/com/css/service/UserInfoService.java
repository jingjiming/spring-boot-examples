package com.css.service;

import com.css.entity.UserInfo;

/**
 * Created by JIMING on 2018/9/16.
 */
public interface UserInfoService {

    /**
     * 通过username查找用户信息;
     */
    public UserInfo findByUsername(String username);
}
