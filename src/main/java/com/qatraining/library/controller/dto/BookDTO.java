package com.qatraining.library.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

@Builder
@ApiModel(value = "BookDTO")
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class BookDTO {
	
	@ApiModelProperty(value="bookId", required = true)
	@JsonProperty(value = "bookId")
	private String bookId;
	
	@ApiModelProperty(value="bookName", required = true)
	@JsonProperty(value = "bookName")
	private String bookName;
	
	@JsonProperty(value = "bookDescription")
	private String bookDescription;
	
	@JsonProperty(value = "bookAuthor")
	private String bookAuthor;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	
	
}
