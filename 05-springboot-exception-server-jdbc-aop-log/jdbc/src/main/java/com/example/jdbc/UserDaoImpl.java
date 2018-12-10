package com.example.jdbc;

import com.example.jdbc.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Repository
public class UserDaoImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    class BookRowMapper implements RowMapper<Book> {
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            Book book = new Book();
            book.setBookAuthor(rs.getString("book_author"));
            book.setBookDate(new Date(rs.getDate("book_date").getTime()));
            book.setBookId(rs.getInt("book_id"));
            book.setBookName(rs.getString("book_name"));
            book.setBookPrice(rs.getBigDecimal("book_price"));
            return book;
        }
    }


    public void add() {
        String sql = "INSERT INTO `testdb`.`t_book`(`book_name`, `book_author`, `book_price`, `book_date`) VALUES ('222', '333', 444, '2018-07-11');\n";
        jdbcTemplate.execute(sql);
    }

    public Book selectOne() {
        String sql = "select * from t_book where book_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BookRowMapper(), 2);

        return book;
    }

    public List<Book> selectList() {
        String sql = "select * from t_book";
        return jdbcTemplate.query(sql,new BookRowMapper());
    }

    public void update() {
        String sql = "UPDATE `testdb`.`t_book` SET `book_name` = '333', `book_author` = '555', `book_price` = 444, `book_date` = '2018-07-11' WHERE `book_id` = 2;\n";
        jdbcTemplate.update(sql);
    }

    public void delete() {
        String sql = "delete from t_book where book_id=?";
        jdbcTemplate.update(sql,3);
    }


}
