package com.qatraining.library.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qatraining.library.controller.dto.BookDTO;
import com.qatraining.library.entities.Book;
import com.qatraining.library.mapper.BookConverter;
import com.qatraining.library.repository.BookRepository;
import com.qatraining.library.services.BookServices;

@Service
public class BookServicesImpl implements BookServices {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookConverter mapper;

	@Override
	public List<BookDTO> findAll() {	
		return mapper.entitysToBooksDto(bookRepository.findAll());		
	}

	@Override
	public BookDTO findByName(String bookName) {
		return mapper.entityToBookDto(bookRepository.findByBookName(bookName).get());
	}

	@Override
	public void addBook(BookDTO bookDTO) {
		bookRepository.save(mapper.bookDtoToInsertEntity(bookDTO));		
	}

	@Override
	public void updateBook(String bookName, BookDTO bookDTO) throws Exception {
		
		Optional<Book> book = bookRepository.findByBookName(bookName);
		
		if (book.isPresent()) {
			bookDTO.setBookId(book.get().getBookId());
			bookRepository.save(mapper.bookDtoToEntity(bookDTO, book.get()));
		}else {
			throw new Exception();
		}
	}

}
