package org.example.dao;

import org.example.domain.Dept;
import org.example.domain.Employee;

import java.util.List;

public interface EmployeeDao {
    //    查询所有部门
    List<Employee> findAllEmployee();
}
