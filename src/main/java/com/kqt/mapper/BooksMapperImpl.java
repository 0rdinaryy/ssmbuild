package com.kqt.mapper;

import com.kqt.pojo.Books;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class BooksMapperImpl implements BooksMapper {

    private  SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public int addBook(Books book) {
        return sqlSession.getMapper(BooksMapper.class).addBook(book);
    }

    public int deleteBookById(int id) {
        return sqlSession.getMapper(BooksMapper.class).deleteBookById(id);
    }

    public int updateBook(Books book) {
        return sqlSession.getMapper(BooksMapper.class).updateBook(book);
    }

    public Books queryBookById(int id) {
        return sqlSession.getMapper(BooksMapper.class).queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return sqlSession.getMapper(BooksMapper.class).queryAllBooks();
    }

    public List<Books> searchBooksByLike(String str){return sqlSession.getMapper(BooksMapper.class).searchBooksByLike(str);}

    public Map<String,String> test(String s){return sqlSession.getMapper(BooksMapper.class).test(s);};
}
