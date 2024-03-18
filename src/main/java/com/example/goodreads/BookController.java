package com.example.goodreads;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.goodreads.BookService;
import com.example.goodreads.Book;
import java.util.ArrayList;

@RestController
public class BookController {
    BookService bookService = new BookService();

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return bookService.getBooks();
    }
}