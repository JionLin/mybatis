package com.johnny.mapper;

import com.johnny.pojo.Emp;
import com.johnny.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author johnny
 * @Classname EmpMapperTest
 * @Description
 * @Date 2022/6/12 14:02
 */
public class EmpMapperTest {

    @Test
    public void selectByEid() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectByEid(1);
        System.out.println(emp);
    }

    // 3种方式来测试1对多。
    @Test
    public void selectByid1() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectById1(1);
        System.out.println(emp);
    }

// 3种方式来测试1对多。
    @Test
    public void selectByid2() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectById2(1);
        System.out.println(emp.getAge());
    }


}