package com.itheima.factory;

import com.itheima.UserDao;
import com.itheima.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
