package com.example.aop;

import com.example.aop.dao.BookDao;
import com.example.aop.dao.BookDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AopApplication.class, args);

        /*BookDaoImpl bookDao = context.getBean(BookDaoImpl.class);
        System.out.println(bookDao.getClass());
        bookDao.addBook("三国演义", "罗贯中");*/
        BookDao bookDao = context.getBean("bookDaoImpl1",BookDao.class);
        System.out.println(bookDao.getClass());
        bookDao.addBook("三国演义", "罗贯中");
        context.close();
    }
}
