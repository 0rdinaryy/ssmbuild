package com.kqt.service;

import com.kqt.mapper.BooksMapper;
import com.kqt.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BooksServiceImpl implements BooksService {

    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {this.booksMapper = booksMapper;
    }

    public BooksMapper getBooksMapper() {
        return this.booksMapper;
    }

    public int addBook(Books book) {
        return booksMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    public int updateBook(Books book) {
        return booksMapper.updateBook(book);
    }

    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return booksMapper.queryAllBooks();
    }

    public List<Books> searchBooksByLike(String str){return booksMapper.searchBooksByLike(str);}

    public Map<String,String> test(String s){return booksMapper.test(s);};
}
