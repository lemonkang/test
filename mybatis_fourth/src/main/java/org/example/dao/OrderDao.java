package org.example.dao;

import org.example.domain.Order;

import java.util.List;

public interface OrderDao {
//   查询所有订单信息及其关联的所有产品
    List<Order> getAllOrdersAssoPro();
}
