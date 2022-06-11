package com.jiaolin.param.pojo;

import lombok.Data;

/**
 * @author johnny
 * @Classname User
 * @Description
 * @Date 2022/6/11 13:24
 */
@Data
public class User {

    private Integer id;
    private String lastName;
    private Integer age;
    private String email;
    private String gender;

    public User() {
    }

    public User(Integer id, String lastName, Integer age, String email, String gender) {
        this.id = id;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }
}