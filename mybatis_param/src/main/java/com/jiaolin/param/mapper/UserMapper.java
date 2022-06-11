package com.jiaolin.param.mapper;

import com.jiaolin.param.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author johnny
 * @Classname UserMapper
 * @Description
 * @Date 2022/6/11 13:23
 */
public interface UserMapper {

    User selectByIdAndAge(@Param("id") Integer id, @Param("xxx") Integer age);

    Integer insertUser(User user);

    User selectUser(Map<String, Object> map);

    User selectByName(String lastName);

    // 查询多条数据使用list进行
    List<User> selectAll();

    // 使用map来进行接收单条数据
    Map<String, Object> selectByIdToMap(@Param("id") Integer id);

    // 使用map来接收多条数据的方式 1 list<Map<String, Object>map>> 2 使用注解 @mapKey的方式


    // 使用map来进行接收单条数据
    @MapKey(value = "id")
    Map<String, Object> selectAllToMap();

    List<Map<String, Object>> selectAllToMap2();
}
