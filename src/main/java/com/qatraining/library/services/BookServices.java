package com.qatraining.library.services;

import java.util.List;

import com.qatraining.library.controller.dto.BookDTO;

public interface BookServices {
	public List<BookDTO> findAll();
	public BookDTO findByName(String bookName);
	public void addBook(BookDTO bookDTO);
	public void updateBook(String bookName, BookDTO bookDTO) throws Exception ;

}
