package com.gchsj.sbh2.book.service;

import com.gchsj.sbh2.book.model.Book;
import com.gchsj.sbh2.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return bookRepository.findAll();
    }

}
