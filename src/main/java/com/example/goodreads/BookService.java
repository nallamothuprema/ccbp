package com.example.goodreads;

import com.example.goodreads.Book;
import java.util.*;
import com.example.goodreads.BookRepository;

public class BookService implements BookRepository {
    private HashMap<Integer, Book> hmap = new HashMap<>();

    public BookService(){
        Book r1 = new Book(1, "War and Peace", "war.jpg");
        Book r2 = new Book(2, "The Golden Threshold", "sarj.jpg");
        Book r3 = new Book(3, "The Indian Stuggle", "bose.jpg"); 

        hmap.put(r1.getId(), r1);
        hmap.put(r2.getId(), r2);
        hmap.put(r3.getId(), r3);

        @Override
        public ArrayList<Book> getBooks(){
            Collection<Book> booksCollection = hmap.values();
            ArrayList<Book> books = new ArrayList<>(booksCollection);
            return books;
        }
    }
}