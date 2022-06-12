package com.johnny.mapper;

import com.johnny.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author johnny
 * @Classname EmpMapper
 * @Description
 * @Date 2022/6/12 13:45
 */
public interface EmpMapper {

    Emp selectByEid(@Param("eid") Integer eid);

    Emp selectById1(@Param("id") Integer id);

    Emp selectById2(@Param("id") Integer id);

    Emp selectById3(@Param("id") Integer id);


}
