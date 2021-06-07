package com.qatraining.library.controller.dto.response;

import java.util.List;

import com.qatraining.library.controller.dto.BookDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookResponseDTO {

	private List<BookDTO> bookList;
}
