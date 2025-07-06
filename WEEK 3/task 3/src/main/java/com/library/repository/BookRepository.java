package com.library.repository;

import java.util.ArrayList;
import java.util.List;
import com.library.model.Book;

public class BookRepository {
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        return books;
    }
}
