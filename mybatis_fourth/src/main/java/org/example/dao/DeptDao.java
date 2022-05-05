package org.example.dao;

import org.example.domain.Dept;

import java.util.List;

public interface DeptDao {
//    查询所有部门
   List<Dept> findAllDept();
}
