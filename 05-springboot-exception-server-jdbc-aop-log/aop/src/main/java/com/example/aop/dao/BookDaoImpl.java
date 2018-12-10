package com.example.aop.dao;

import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void addBook(String name, String author) {
        System.out.println("bookName:"+name+", bookAuthor:"+author);
    }
}
