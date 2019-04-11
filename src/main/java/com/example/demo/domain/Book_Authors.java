package com.example.demo.domain;

public class Book_Authors {
	private int BookId;
	private String AuthorName;
	/**
	 * @param bookId
	 * @param authorName
	 */
	public Book_Authors(int bookId, String authorName) {
		super();
		BookId = bookId;
		AuthorName = authorName;
	}
	public Book_Authors() {
		
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	@Override
	public String toString() {
		return "Book_Authors [BookId=" + BookId + ", AuthorName=" + AuthorName + "]";
	}
	
}
