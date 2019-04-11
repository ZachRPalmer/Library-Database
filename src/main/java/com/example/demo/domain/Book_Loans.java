package com.example.demo.domain;

import java.sql.Date;

import oracle.sql.DATE;

public class Book_Loans {
	private int bookId;
	private int branchId;
	private String cardNo;
	private DATE dateOut;
	private DATE dueDate;
	/**
	 * @param bookId
	 * @param branchId
	 * @param cardNo
	 * @param dateOut
	 * @param dueDate
	 */
	public Book_Loans(int bookId, int branchId, String cardNo, DATE dateOut, DATE dueDate) {
		super();
		this.bookId = bookId;
		this.branchId = branchId;
		this.cardNo = cardNo;
		this.dateOut = dateOut;
		this.dueDate = dueDate;
	}
	public Book_Loans() {
		
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
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public DATE getDateOut() {
		return dateOut;
	}
	public void setDateOut(DATE dateOut) {
		this.dateOut = dateOut;
	}
	public DATE getDueDate() {
		return dueDate;
	}
	public void setDueDate(DATE dueDate) {
		this.dueDate = dueDate;
	}
	@Override
	public String toString() {
		return "Book_Loans [bookId=" + bookId + ", branchId=" + branchId + ", cardNo=" + cardNo + ", dateOut=" + dateOut
				+ ", dueDate=" + dueDate + "]";
	}
	
}
