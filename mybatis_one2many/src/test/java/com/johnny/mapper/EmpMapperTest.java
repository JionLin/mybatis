package com.johnny.mapper;

import com.johnny.pojo.Dept;
import com.johnny.pojo.Emp;
import com.johnny.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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


    // 3种方式来测试1对多。
    @Test
    public void selectByid3() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectById3(1);
        System.out.println(emp.getAge());
        System.out.println("========");
        System.out.println(emp.getDept().getDeptName());
    }


    @Test
    public void selectByDid1() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.selectByDid2(1);
        System.out.println(dept);

    }

    @Test
    public void insertBatch() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp1 = new Emp(null, "小青1", 18, null);
        Emp emp2 = new Emp(null, "小青2", 18, null);
        Emp emp3 = new Emp(null, "小青3", 18, null);
        Emp emp4 = new Emp(null, "小青4", 18, null);
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3, emp4);
        Integer value = mapper.insertBatch(emps);
        System.out.println(value);
    }
    @Test
    public void deleteBatch() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Integer value = mapper.deleteBatch(new Integer[]{8,9,1,2,11});
        System.out.println(value);
    }


}