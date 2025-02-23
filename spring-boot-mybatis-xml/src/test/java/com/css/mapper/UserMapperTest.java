package com.css.mapper;

import com.css.entity.User;
import com.css.enums.EnumGenderType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by jiming.jing on 2018/8/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper UserMapper;

    @Test
    public void testInsert() throws Exception {
        UserMapper.insert(new User("aa", "a123456", EnumGenderType.MAN));
        UserMapper.insert(new User("bb", "b123456", EnumGenderType.WOMAN));
        UserMapper.insert(new User("cc", "b123456", EnumGenderType.WOMAN));

        Assert.assertEquals(3, UserMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<User> users = UserMapper.getAll();
        if (users == null || users.size() == 0) {
            System.out.println("is null");
        } else {
            System.out.println(users.toString());
        }
    }


    @Test
    public void testUpdate() throws Exception {
        User user = UserMapper.getOne(1L);
        System.out.println(user.toString());
        user.setNickName("Tom");
        UserMapper.update(user);
        Assert.assertTrue(("neo".equals(UserMapper.getOne(1L).getNickName())));
    }
}
