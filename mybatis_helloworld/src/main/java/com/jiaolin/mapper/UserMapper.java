package com.jiaolin.mapper;


import com.jiaolin.pojo.User;

/**
 * @author johnny
 * @Classname com.jiaolin.mapper.UserMapper
 * @Description
 * @Date 2022/6/11 07:32
 */
public interface UserMapper {

    int insertUser();

    User selectById(int id);

}
