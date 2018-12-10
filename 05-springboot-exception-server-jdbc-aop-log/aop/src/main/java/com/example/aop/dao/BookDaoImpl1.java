package com.example.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl1 implements BookDao {
    @Override
    public void addBook(String name, String author) {
    }
}
