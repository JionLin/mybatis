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
}