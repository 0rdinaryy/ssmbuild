import com.kqt.pojo.Books;
import com.kqt.service.BooksService;
import com.kqt.service.BooksServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksService = context.getBean("BooksServiceImpl",BooksServiceImpl.class);
        List<Books> books = booksService.queryAllBooks();
        for (Books book : books) {
            System.out.println(book);
        }

        System.out.println("==========================");
        List<Books> j = booksService.searchBooksByLike("L");
        System.out.println(j.size());
        for (Books books1 : j) {
            System.out.println(books1);
        }
        System.out.println("==========================");
        System.out.println(booksService.test("YOU"));
        System.out.println(booksService.test("ME"));
    }
}
