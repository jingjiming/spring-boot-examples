package com.css.dao;

import com.css.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by JIMING on 2018/9/16.
 */
public interface UserInfoDao extends CrudRepository<UserInfo, Long> {

    /**
     * 通过username查找用户信息
     * @param username
     * @return
     */
    public UserInfo findByUsername(String username);

}
