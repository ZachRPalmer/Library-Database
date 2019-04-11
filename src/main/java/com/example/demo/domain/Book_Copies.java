package com.example.demo.domain;

public class Book_Copies {
	private int bookId;
	private int branchId;
	private int no_of_copies;
	/**
	 * @param bookId
	 * @param branchId
	 * @param no_of_copies
	 */
	public Book_Copies(int bookId, int branchId, int no_of_copies) {
		super();
		this.bookId = bookId;
		this.branchId = branchId;
		this.no_of_copies = no_of_copies;
	}
	public Book_Copies() {
		
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public int getNo_of_copies() {
		return no_of_copies;
	}
	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}
	@Override
	public String toString() {
		return "Book_Copies [bookId=" + bookId + ", branchId=" + branchId + ", no_of_copies=" + no_of_copies + "]";
	}
	
}
