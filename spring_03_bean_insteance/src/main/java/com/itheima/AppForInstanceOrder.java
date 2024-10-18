package com.itheima;

import com.itheima.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        // 通过静态工厂管理对象
        OrderDao orderDao = OrderDaoFactory.getOrderDao();
        orderDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao2 = (OrderDao) ctx.getBean("orderDao");
    }
}
