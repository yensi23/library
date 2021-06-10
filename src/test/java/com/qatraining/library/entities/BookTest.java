package com.qatraining.library.entities;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BookTest {
	
	  @Test
	  public void bookEntityTest() {
	    assertNotNull(new Book());
	    
	    Book book = new Book();
	    book.setBookId("aa");
	    book.setBookName("aa");
	    book.setBookDescription("aa");
	    book.setBookAuthor("aa");
   
	    assertNotNull(book.getBookId());
	    assertNotNull(book.getBookName());
	    assertNotNull(book.getBookDescription());
	    assertNotNull(book.getBookAuthor());
	    assertTrue(book.equals(book));
	  }

}
