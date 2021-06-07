package com.qatraining.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qatraining.library.controller.dto.BookDTO;
import com.qatraining.library.services.BookServices;

@RestController
public class BookController {
	
	@Autowired
	BookServices bookServices;
	
	@RequestMapping(method = RequestMethod.GET, value = "/books")
	public List<BookDTO> getBooks() {		
		return bookServices.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/books/{bookName}")
	public BookDTO getBook(@RequestParam(required = true) String bookName) {		
		return bookServices.findByName(bookName);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/books")
	public ResponseEntity<Void> addBook(@RequestBody BookDTO bookDTO) {		
		bookServices.addBook(bookDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PATCH, value = "/books/{bookName}")
	public ResponseEntity<Void> modBook(@RequestParam(required = true) String bookName, @RequestBody BookDTO bookDTO) throws Exception {		
		bookServices.updateBook(bookName, bookDTO);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}

