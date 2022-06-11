package com.jiaolin.param.mapper;

import com.jiaolin.param.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author johnny
 * @Classname UserMapper
 * @Description
 * @Date 2022/6/11 13:23
 */
public interface UserMapper {

    User selectByIdAndAge(@Param("id") Integer id, @Param("xxx") Integer age);
}
