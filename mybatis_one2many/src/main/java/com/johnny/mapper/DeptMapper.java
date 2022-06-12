package com.johnny.mapper;

import com.johnny.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author johnny
 * @Classname DeptMapper
 * @Description
 * @Date 2022/6/12 13:45
 */
public interface DeptMapper {

    Dept selectByDid(@Param("did") Integer did);

    Dept selectByDid2(@Param("did") Integer did);
}
