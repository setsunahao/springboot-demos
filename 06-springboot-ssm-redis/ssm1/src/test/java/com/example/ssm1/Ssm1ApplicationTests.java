package com.example.ssm1;

import com.example.ssm1.domain.BookInfo;
import com.example.ssm1.mapper.BookMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Ssm1ApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void save(){
        BookInfo bookInfo = BookInfo.builder()
                .bookName("语文")
                .bookAuthor("张三")
                .bookDate(new Date())
                .bookPrice(new BigDecimal(100.99))
                .build();
        bookMapper.saveBook(bookInfo);
    }

    @Test
    public void selectOne(){
        BookInfo bookInfo = bookMapper.getBookById(1);
        System.out.println(bookInfo);
    }

}

