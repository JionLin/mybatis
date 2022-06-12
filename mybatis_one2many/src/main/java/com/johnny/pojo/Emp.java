package com.johnny.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author johnny
 * @Classname Emp
 * @Description
 * @Date 2022/6/12 13:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

    private Integer eid;

    private String empName;

    private Integer age;

    private Dept dept;

}
