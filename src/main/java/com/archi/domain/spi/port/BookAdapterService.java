package com.archi.domain.spi.port;

import com.archi.domain.entity.Book;

import java.util.List;

public interface BookAdapterService {

    void save(Book book);

    Book getBookById(Book book);

    List<Book> getBooks();
}
