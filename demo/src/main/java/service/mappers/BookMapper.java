package service.mappers;

import dao.entities.Book;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import service.dtos.BookDTO;



    @Component
    public class BookMapper {

        private ModelMapper modelMapper = new ModelMapper();

        public BookDTO fromPersonToPersonDto(Book book) {
            return this.modelMapper.map(book, BookDTO.class);
        }

        public Book fromPersonDtoToPerson(BookDTO personDto) {
            return this.modelMapper.map(personDto, Book.class);
        }

        public Book dtoToEntity(BookDTO bookDTO) {
            return null;
        }

        public BookDTO entityToDto(Book savedBook) {
            return null;

        }
    }

