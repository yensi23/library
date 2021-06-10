package com.qatraining.library.integration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.web.client.RestTemplate;

import com.qatraining.library.controller.dto.BookDTO;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BooksControllerSpringTest {
	
//    @LocalServerPort
//    private int port;
//
//    private String baseUrl = "http://localhost";
//
//
//    private static RestTemplate restTemplate = null;
//
//    @BeforeAll
//    public static void init() {
//        restTemplate = new RestTemplate();
//    }
//    
//
//    @BeforeEach
//    public void setUp() {
//        baseUrl = baseUrl.concat(":").concat(port+ "").concat("/books");
//    }
//    
//    @Test
//	@Sql(statements = "INSERT INTO book (book_id, book_name, book_description, book_author) VALUES ('1', 'Don Quijote de la Mancha', '', 'Miguel de Cervantes')",
//	  executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
//	@Sql(statements = "DELETE FROM book",
//	  executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
//    public void getBooks() {
//
//        BookDTO bookDTOResponse = restTemplate.getForObject(baseUrl.concat("/{bookName}"), BookDTO.class, "Don Quijote de la Mancha");
//        assertAll(
//                () -> assertNotNull(bookDTOResponse),
//                () -> assertEquals("1", bookDTOResponse.getBookId())
//        );
//    }

    
//    @Sql(statements = "INSERT INTO user (id, name, surname, address) VALUES (1, 'Vincenzo', 'Racca', 'via Roma')",
//            executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
//    @Sql(statements = "DELETE FROM user",
//            executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
//    public void returnAPersonWithIdOne() {
//
//        UserDTO userDTOResponse = restTemplate.getForObject(baseUrl.concat("/{id}"), UserDTO.class, 1);
//        assertAll(
//                () -> assertNotNull(userDTOResponse),
//                () -> assertEquals("Racca Vincenzo", userDTOResponse.getName())
//        );
//    }
}
