package com.qatraining.library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.qatraining.library.entities.Book;

public interface BookRepository extends JpaRepository<Book, String>, QueryByExampleExecutor<Book>, CrudRepository<Book, String> {
	
	Optional<Book> findByBookName(String bookName);
	
	

}
