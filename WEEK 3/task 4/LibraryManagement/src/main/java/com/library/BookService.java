package com.library;

public class BookService {
    private BookRepository bookRepository;

    // Constructor injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor Injection used.");
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection used.");
    }

    public void listBooks() {
        bookRepository.displayBooks();
    }
}
