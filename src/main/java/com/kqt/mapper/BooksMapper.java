package com.kqt.mapper;

import com.kqt.pojo.Books;

import java.util.List;
import java.util.Map;

public interface BooksMapper {

    //增加一本书
    int addBook(Books book);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books book);

    //查询一本书
    Books queryBookById(int id);

    //查询所有书
    List<Books> queryAllBooks();

    //搜索书籍（模糊查询）
    List<Books> searchBooksByLike(String str);

    Map<String,String> test(String s);
}
