package com.archi.domain.spi.port;

import com.archi.domain.entity.Book;

import java.util.List;

public interface BookRepo {

    void save(Book book);

    List<Book> getBooks();

    Book getBook(int id);

    Book getBookByTitle(String title);
}
