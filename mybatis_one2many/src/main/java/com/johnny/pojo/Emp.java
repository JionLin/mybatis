package com.johnny.pojo;

import lombok.Data;

/**
 * @author johnny
 * @Classname Emp
 * @Description
 * @Date 2022/6/12 13:47
 */
@Data
public class Emp {

    private Integer eid;

    private String empName;

    private Integer age;

    private Dept dept;

}
