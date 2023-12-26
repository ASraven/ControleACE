package service;

import service.dtos.BookDTO;

import java.util.List;

public interface BookManager {

    BookDTO createBook(BookDTO bookDTO);

    BookDTO updateBook(BookDTO bookDTO);

    BookDTO getBookById(Long id);

    List<BookDTO> getAllBooks();

    BookDTO getBookByTitle(String title);

    List<BookDTO> getBooksByPublisherAndPrice(String publisher, Float price);

    void deleteBookById(Long id);
}