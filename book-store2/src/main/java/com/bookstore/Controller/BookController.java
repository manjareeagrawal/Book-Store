package com.bookstore.Controller;

import com.bookstore.Entity.Book;
import com.bookstore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController
{
    @Autowired
    private BookService bookService;
    @GetMapping("/allBook")
    public String allBook(Model model)
    {
        List<Book> books=new ArrayList<>();
        books=bookService.getAllBook();
        System.out.println("lp"+books.size());
        model.addAttribute("Books",books);
        return "index";
    }

}
