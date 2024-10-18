package com.itheima.factory;

import com.itheima.BookDao;
import com.itheima.impl.BookDaoImpl;

public class BookDaoFactory {
    public static BookDao getBookDao() {
        return new BookDaoImpl();
    }
}
