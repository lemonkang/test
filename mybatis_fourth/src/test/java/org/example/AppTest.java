package org.example;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.EmployeeDao;
import org.example.dao.OrderDao;
import org.example.domain.Employee;
import org.example.domain.Order;
import org.example.utils.MybatisSqlSessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    /*获取所有员工*/
    @Test
    public void getAllEmployee(){
        SqlSession session= MybatisSqlSessionFactory.getSqlSession();
        EmployeeDao mapper = session.getMapper(EmployeeDao.class);
        List<Employee> allEmployee = mapper.findAllEmployee();
        allEmployee.forEach(item-> System.out.println(item.toString()));
    }
    /*获取所有订单信息及其关联产品*/
    @Test
    public void getAllOrdersAssoPro(){
        SqlSession session= MybatisSqlSessionFactory.getSqlSession();
        OrderDao mapper = session.getMapper(OrderDao.class);
        List<Order> allOrdersAssoPro = mapper.getAllOrdersAssoPro();
        allOrdersAssoPro.forEach(item-> System.out.println(item.toString()));

    }
}
