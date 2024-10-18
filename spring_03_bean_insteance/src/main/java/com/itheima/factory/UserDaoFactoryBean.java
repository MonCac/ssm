package com.itheima.factory;

import com.itheima.UserDao;
import com.itheima.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {

    // 代替原始实例中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    // 得到bean类型
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    // 决定该bean是否是单例的
    @Override
    public boolean isSingleton() {
        return true;
    }
}
