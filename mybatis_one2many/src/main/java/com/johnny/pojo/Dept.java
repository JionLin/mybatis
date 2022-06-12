package com.johnny.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author johnny
 * @Classname Dept
 * @Description
 * @Date 2022/6/12 13:48
 */
@Data
public class Dept {

    private Integer did;

    private String deptName;

    private List<Emp> emps;
}
