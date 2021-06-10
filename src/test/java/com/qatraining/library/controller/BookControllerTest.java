package com.qatraining.library.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.qatraining.library.controller.dto.BookDTO;

import com.qatraining.library.mapper.BookConverter;
import com.qatraining.library.services.impl.BookServicesImpl;

@ExtendWith(MockitoExtension.class)
public class BookControllerTest {
	@Mock
	BookServicesImpl bookServicesImpl;
	
	@Mock
	BookConverter bookConverter;
	
	@InjectMocks
	BookController bookController;
	

	@Test
	void AddBook() {
		       
        Mockito.doNothing().when(bookServicesImpl).addBook(Mockito.any());
		assertEquals(new ResponseEntity<>(HttpStatus.CREATED), bookController.addBook(new BookDTO()));
	}
	
	@Test
	void UpdateBook() throws Exception {
		assertEquals(new ResponseEntity<>(HttpStatus.NO_CONTENT), bookController.modBook("", new BookDTO()));
	}

}
