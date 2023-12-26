package service;

import dao.entities.Book;
import dao.repositories.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import service.dtos.BookDTO;
import service.mappers.BookMapper;

public class BookManagerAction {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Autowired
    public BookManagerAction(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Transactional
    public BookDTO addNewBook(BookDTO bookDTO) {
        boolean bookExists = bookRepository.existsByTitleAndPublisher(
                bookDTO.getTitre(), bookDTO.getPublisher()
        );

        if (bookExists) {
            throw new IllegalStateException("A book already exists.");
        } else {
            Book bookEntity = bookMapper.dtoToEntity(bookDTO);

            Book savedBook = bookRepository.save(bookEntity);
            return bookMapper.entityToDto(savedBook);
        }
    }

}
