package com.qatraining.library.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import com.qatraining.library.controller.dto.BookDTO;
import com.qatraining.library.entities.Book;

@Mapper(componentModel = "spring")
public interface BookConverter {

	BookConverter instance = Mappers.getMapper( BookConverter.class );

    @Mapping(target = "bookId", source = "bookId")
    @Mapping(target = "bookName", source = "bookName")
    @Mapping(target = "bookDescription", source = "bookDescription")
    @Mapping(target = "bookAuthor", source = "bookAuthor")
    BookDTO entityToBookDto(Book book);
    
    Book bookDtoToInsertEntity(BookDTO bookDTO);
    
    @Mapping(target = "bookId", source = "bookId", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "bookName", source = "bookName", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "bookDescription", source = "bookDescription", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "bookAuthor", source = "bookAuthor", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Book bookDtoToEntity(BookDTO bookDTO, @MappingTarget Book book);
    
    
    List<BookDTO> entitysToBooksDto(List<Book> source);
}
