package com.css.entity;

import com.css.enums.EnumGenderType;

import java.io.Serializable;

/**
 * Created by jiming.jing on 2018/8/13.
 */
public class User implements Serializable {

    private Long id;

    private String userName;

    private String passWord;

    private EnumGenderType gender;

    private String nickName;

    public User() {
    }

    public User(String userName, String passWord, EnumGenderType gender) {
        this.userName = userName;
        this.passWord = passWord;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassword(String passWord) {
        this.passWord = passWord;
    }

    public EnumGenderType getGender() {
        return gender;
    }

    public void setGender(EnumGenderType gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", gender=" + gender.name() +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
