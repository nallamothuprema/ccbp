package com.example.goodreads;

import com.example.goodreads.Book;
import java.util.ArrayList;

public interface BookRepository {
    ArrayList<Book> getBooks();
}