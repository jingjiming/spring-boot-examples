package com.css.master;

import java.util.List;

import com.css.entity.User;
import com.css.enums.EnumGenderType;
import com.css.mapper.master.UserMasterMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMasterMapperTest {

	@Autowired
	private UserMasterMapper userMapper;

	@Test
	public void testInsert() throws Exception {
		userMapper.insert(new User("aa", "a123456", EnumGenderType.MAN));
		userMapper.insert(new User("bb", "b123456", EnumGenderType.WOMAN));
		userMapper.insert(new User("cc", "b123456", EnumGenderType.WOMAN));

		Assert.assertEquals(3, userMapper.getAll().size());
	}

	@Test
	public void testQuery() throws Exception {
		List<User> users = userMapper.getAll();
		if(users==null || users.size()==0){
			System.out.println("is null");
		}else{
			System.out.println(users.size());
		}
	}
	
	
	@Test
	public void testUpdate() throws Exception {
		User user = userMapper.getOne(6l);
		System.out.println(user.toString());
		user.setNickName("neo");
		userMapper.update(user);
		Assert.assertTrue(("neo".equals(userMapper.getOne(6l).getNickName())));
	}

}