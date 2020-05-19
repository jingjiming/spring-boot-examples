package com.css.domain;

import com.css.domain.User;
import com.css.domain.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;

/**
 * Created by jiming.jing on 2018/6/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        userRepository.save(new User("aa1", "aa", "aa@126.com", "aa123456", new Date()));
        userRepository.save(new User("bb2", "bb", "bb@126.com", "bb123456", new Date()));
        userRepository.save(new User("cc3", "cc", "cc@126.com", "cc123456", new Date()));

        //Assert.assertEquals(9, userRepository.findAll().size());
        //Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
        //userRepository.delete(userRepository.findByUserName("aa1"));
    }
}
