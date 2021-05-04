package com.gchsj.sbh2.book.service;

import com.gchsj.sbh2.book.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void listTest() {
        List<Book> bookList = bookService.list();
        bookList.forEach(book -> System.out.println(book.toString()));
        assertEquals(bookList.size(), 3);
    }
}
