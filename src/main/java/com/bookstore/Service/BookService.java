package com.bookstore.Service;

import com.bookstore.Entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAllBook();
}
