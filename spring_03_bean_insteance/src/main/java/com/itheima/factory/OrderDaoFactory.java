package com.itheima.factory;

import com.itheima.OrderDao;
import com.itheima.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("factory setup...");
        return new OrderDaoImpl();
    }
}
