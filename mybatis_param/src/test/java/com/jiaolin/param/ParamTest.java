package com.jiaolin.param;

import com.jiaolin.param.mapper.UserMapper;
import com.jiaolin.param.pojo.User;
import com.jiaolin.param.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author johnny
 * @Classname ParamTest
 * @Description
 * @Date 2022/6/11 13:35
 */
public class ParamTest {

    @Test
    public void testSelect() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectByIdAndAge(5, 23);
        System.out.println(user);
    }


    @Test
    public void testInsert() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Integer result = mapper.insertUser(new User(null, "zs", 18, "250@qq.com", "男"));
        System.out.println(result);
    }


    @Test
    public void testMap() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("id", 35);
        map.put("age", 18);
        User user = mapper.selectUser(map);
        System.out.println(user);
    }

    @Test
    public void testById() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectByName("张三");
        System.out.println(user);
    }

    @Test
    public void testAllUsers() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void testByIdToMap() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> map = mapper.selectByIdToMap(35);
        System.out.println(map);
    }

    @Test
    public void testAllToMap() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> map = mapper.selectAllToMap();
        System.out.println(map);
    }

    @Test
    public void testAllToMap2() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<Map<String, Object>> maps = mapper.selectAllToMap2();
//        maps.forEach(user -> System.out.println(user));
        System.out.println(maps);
    }


    @Test
    public void testByLikeName() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectByLikeName("zs");
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void testDeleteByIds() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Integer value = mapper.deleteByIds("33,34,1");
        System.out.println(value);
    }


    @Test
    public void testSelectTableName() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectByTableName("user");
        users.forEach(user -> System.out.println(user));
    }


    @Test
    public void testInsertUserGetId() {
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User(null, "xq", 18, "sjd@163.com", "男");
        mapper.insertUserInfo(user);
        System.out.println(user);
    }


}
