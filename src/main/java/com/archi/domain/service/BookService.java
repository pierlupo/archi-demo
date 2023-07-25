package com.archi.domain.service;

import com.archi.domain.entity.Book;
import com.archi.domain.spi.port.BookRepo;

public class BookService {

    private BookRepo bookRepo;

    public BookService(BookRepo bookRepo){

        this.bookRepo = bookRepo;

    }

    public void save(String title, String author) {
        Book bookExist = bookRepo.getBookByTitle(title);
        if(bookExist == null || !bookExist.getAuthor().equals(author)){
            Book book = new Book(title, author);
                    this.bookRepo.save(book);
        }
        throw new RuntimeException("Book exist");
    }
}
