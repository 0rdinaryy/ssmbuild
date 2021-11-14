package com.kqt.controller;

import com.kqt.pojo.Books;
import com.kqt.service.BooksServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {

    @Autowired
    @Qualifier("BooksServiceImpl")
    private BooksServiceImpl booksService;

    //跳转到增加书籍页面
    @RequestMapping("/addBookPage")
    public String toAddPage() {
        return "addBookPage";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("addBook=>" + books);
        booksService.addBook(books);
        return "redirect:/books/Books";
    }

    //跳转到修改书籍页面
    @RequestMapping("/updateBookPage/{id}")
    public String toUpdatePage(@PathVariable int id, Model model) {
        Books books = booksService.queryBookById(id);
        model.addAttribute("QBook", books);
        return "updateBookPage";
    }

    //修改书籍的请求
    @RequestMapping("/upDateBook")
    public String upDateBook(Books books) throws Exception {
        System.out.println(books);
        int i = booksService.updateBook(books);
        if (i > 0) {
            System.out.println("修改成功！！！");
        }
        return "redirect:/books/Books";
    }

    //删除一本书的请求
    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable int id) {
        int i = booksService.deleteBookById(id);
        if (i > 0) {
            System.out.println("删除成功！！！");
        }
        return "redirect:/books/Books";
    }

//    @RequestMapping("/allBooks")
//    public String allBooks(Model model){
//        return this.searchBooks("",model);
//    }

    public String allBooks(Model model) {
//        booksService = new BooksServiceImpl();
        List<Books> books = booksService.queryAllBooks();
        model.addAttribute("lists", books);
        return "books";
    }

    //搜索书籍的请求
    @RequestMapping(value = "/Books")
    public String searchBooks(@RequestParam(value = "queryName", defaultValue = "") String name, Model model) {
        System.out.println("name:" + name);
        if (name.equals("")) {
            return this.allBooks(model);
        }
        List<Books> books = booksService.searchBooksByLike(name);
        model.addAttribute("lists", books);
        model.addAttribute("name", name);
        return "books";
    }
}
