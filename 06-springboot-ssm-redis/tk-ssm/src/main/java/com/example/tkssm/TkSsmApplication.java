package com.example.tkssm;

import com.example.tkssm.domain.BookInfo;
import com.example.tkssm.mapper.BookInfoMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

@SpringBootApplication
@MapperScan("com.example.tkssm.mapper")
public class TkSsmApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TkSsmApplication.class, args);

        BookInfoMapper mapper = context.getBean(BookInfoMapper.class);

        List<BookInfo> bookInfos = mapper.selectAll();

        //mapper.insertSelective(bookInfo1);

    }

}

