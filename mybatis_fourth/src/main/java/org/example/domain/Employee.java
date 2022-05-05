package org.example.domain;


import lombok.Data;

@Data
public class Employee {
    private Integer empno;
    private String ename;
    private Integer sal;
    private Integer deptno;
    private Integer mgr;
    private Dept dept;
}
