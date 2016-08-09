package com.lixiang.cglib;

/**
 * Created by lixiang on 2016/8/2.
 */
public class testCglib {
    public static void main(String[] args) {
        BookFacadeProxy cglib = new BookFacadeProxy();
        BookFacadeImpl1 bookCglib = (BookFacadeImpl1)cglib.getInstance(new BookFacadeImpl1());
        bookCglib.addBook();
    }
}
