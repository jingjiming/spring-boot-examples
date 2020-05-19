package com.css.repository;

import com.css.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jiming.jing on 2018/8/9.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findById(String id);

    String deleteById(String id);
}
