package com.qatraining.library.service;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.doReturn;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.qatraining.library.controller.dto.BookDTO;
import com.qatraining.library.entities.Book;
import com.qatraining.library.mapper.BookConverter;
import com.qatraining.library.repository.BookRepository;
import com.qatraining.library.services.impl.BookServicesImpl;



@ExtendWith(MockitoExtension.class)
class BookServiceTest {
	
	@Mock
	BookRepository bookRepository;
	
	@Mock
	BookConverter bookConverter;
	
	@InjectMocks
	BookServicesImpl bookServices;
	

	@Test
	void getBooks() {
		
		BookDTO bookDTO = new BookDTO();
		bookDTO.setBookName("aaa");
		bookDTO.setBookId("aaa");
		bookDTO.setBookAuthor("aaa");
		
		BookDTO bookDTO1 = new BookDTO();
		bookDTO1.setBookName("bb");
		bookDTO1.setBookId("bb");
		bookDTO1.setBookAuthor("bb");
		List<BookDTO> bookDTOList = Arrays.asList(bookDTO, bookDTO1);
		Mockito.when(bookServices.findAll()).thenReturn(bookDTOList);
		
		
		assertNotNull(bookServices.findAll());
		assertEquals(bookDTOList,bookServices.findAll());

	}
	
	@Test
	void getBookByName() {
		
		Book book = new Book();
		book.setBookName("aaa");
		book.setBookId("aaa");
		book.setBookAuthor("aaa");
		
		BookDTO bookDTO = new BookDTO();

		Optional<Book> bookQuery = Optional.of(book);
		
		doReturn(bookQuery).when(bookRepository).findByBookName("aaa");		
		doReturn(bookDTO).when(bookConverter).entityToBookDto(book);
		
		assertNotNull(bookServices.findByName("aaa"));
		assertEquals(bookDTO,bookServices.findByName("aaa"));

	}
	
	@Test
	void addBook() {
		
		bookServices.addBook(new BookDTO());

	}	
	
	@Test
	void updateBook() throws Exception {
		Book book = new Book();
		book.setBookName("aaa");
		book.setBookId("aaa");
		book.setBookAuthor("aaa");

		Optional<Book> bookQuery = Optional.of(book);
		
		BookDTO bookDTO = new BookDTO();
		bookDTO.setBookName("aaa");
		bookDTO.setBookId("aaa");
		bookDTO.setBookAuthor("bbb");
		
		doReturn(bookQuery).when(bookRepository).findByBookName("aaa");	
		bookServices.updateBook("aaa", bookDTO);

	}	

}
