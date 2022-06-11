package com.jiaolin.param;

import com.jiaolin.param.mapper.UserMapper;
import com.jiaolin.param.pojo.User;
import com.jiaolin.param.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author johnny
 * @Classname ParamTest
 * @Description
 * @Date 2022/6/11 13:35
 */
public class ParamTest {

    @Test
    public void testSelect(){
        SqlSession session = SqlSessionUtils.getSessionManager();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectByIdAndAge(5, 23);
        System.out.println(user);
    }
}
