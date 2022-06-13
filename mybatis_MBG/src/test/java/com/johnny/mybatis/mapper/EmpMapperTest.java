package com.johnny.mybatis.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.johnny.mybatis.pojo.Emp;
import com.johnny.mybatis.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author johnny
 * @Classname EmpMapperTest
 * @Description
 * @Date 2022/6/13 08:31
 */
public class EmpMapperTest {

    // 进行测试qbc query by  criteria 基本查询
    @Test
    public void selectByExample() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
           /*
           查询所有
           List<Emp> emps = mapper.selectByExample(null);*/
            EmpExample example=new EmpExample();
            example.createCriteria().andAgeIn(Arrays.asList(18,19,20,28)).andEmpNameLike("%小青%");
            List<Emp> emps = mapper.selectByExample(example);
            emps.forEach(emp -> System.out.println(emp));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPageInfo() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            Page<Object> page = PageHelper.startPage(1, 4);
            List<Emp> emps = mapper.selectByExample(null);
//            emps.forEach(emp -> System.out.println(emp));
            System.out.println(page);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}