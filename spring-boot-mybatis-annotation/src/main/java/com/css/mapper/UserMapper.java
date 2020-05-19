package com.css.mapper;

import com.css.entity.User;
import com.css.enums.EnumGenderType;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by jiming.jing on 2018/8/13.
 */
public interface UserMapper {

    @Select("SELECT * FROM users")
            @Results({
                    @Result(property = "gender", column = "gender", javaType = EnumGenderType.class),
                    @Result(property = "nickName", column = "nick_name")
            })
    List<User> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
            @Results({
                    @Result(property = "gender", column = "gender", javaType = EnumGenderType.class),
                    @Result(property = "nickName", column = "nick_name")
            })
    User getOne(Long id);

    @Insert("INSERT INTO users(userName, password, gender) VALUES (#{userName}, #{password}, #{gender})")
    void insert(User user);

    @Update("UPDATE users SET userName = #{userName}, nick_name = #{nickName} WHERE id = #{id}")
    void update(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void delete(Long id);
}
