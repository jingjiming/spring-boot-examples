package com.css.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jiming.jing on 2018/6/14.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String userName, String email);
}
