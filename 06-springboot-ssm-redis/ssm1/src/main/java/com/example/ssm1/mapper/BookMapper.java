package com.example.ssm1.mapper;

import com.example.ssm1.domain.BookInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookMapper {

    @Select("select book_id as bookId, book_name as bookName, book_author as bookAuthor, book_price as bookPrice, book_date as bookDate from t_book where book_id = #{id}")
    BookInfo getBookById(@Param("id") Integer bookId);

    @Insert("insert into t_book(book_name, book_author, book_price, book_date) " +
            "values(#{bookName}, #{bookAuthor}, #{bookPrice}, #{bookDate}) ")
    int saveBook(BookInfo bookInfo);
}
