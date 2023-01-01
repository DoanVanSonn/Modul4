package service;

import model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    Book findById(Long id);

    void updateAmount_bookService(Long id);

    void updateAmount_book_up(Long prIDBook);
}
