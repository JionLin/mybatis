package com.jiaolin.param.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author johnny
 * @Classname SqlSessionUtils
 * @Description
 * @Date 2022/6/11 13:35
 */
public class SqlSessionUtils {

    public  static SqlSession getSessionManager() {
        SqlSession sqlSession = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sessionFactoryBuilder.build(inputStream);
            sqlSession = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
}
