package com.qatraining.library.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.doReturn;




import java.util.Optional;

import com.qatraining.library.entities.Book;
import com.qatraining.library.mapper.BookConverter;
import com.qatraining.library.repository.BookRepository;
import com.qatraining.library.services.BookServices;
import com.qatraining.library.services.impl.BookServicesImpl;


@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
class BookServiceTest {
	
	@Mock
	BookRepository bookRepository;
	
//	@Mock
//	BookConverter bookConverter;
	
	@InjectMocks
	BookServicesImpl bookServices;
	
//    @BeforeAll 
//    public void initMocks() {
//        MockitoAnnotations.initMocks(this);
//        //reader = new BookReader(mockedBook);
//
//    }

	@Test
	void testService() {
		
		Book book = new Book();
		book.setBookName("aaa");
		book.setBookId("aaa");
		book.setBookAuthor("aaa");
		
		Optional<Book> bookQuery = Optional.of(book);
		
		//bookConverter.
		
		doReturn(bookQuery).when(bookRepository).findByBookName("aaa");
		
		assertNotNull(bookServices.findByName("aaa"));
		
		///when(bookRepository.findByBookName("")).thenReturn(new List<Book>);
		
		//when(bookRepository.findByBookName("")).thenReturn(new List<Book>);
	}

}
