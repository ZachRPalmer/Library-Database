package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.BookDAO;
import com.example.demo.domain.Book;
import com.example.demo.domain.Book_Loans;


@Component
public class BookService {
	
	@Autowired
	BookDAO bookDAO;
	
	public BookService() {
		
	}

	public List<Book> getBookList() {
		List<Book> bookList = new ArrayList<Book>();
		bookList = bookDAO.getBookList();
		return bookList;
	}
	
	public Book getBook() {
		Book book = new Book();
		book = bookDAO.getBook();
		return book;
	}
	
	public int getBranchId() {
		int branchId = bookDAO.getBranchId();
		return branchId;
	}
	
	public List<Book_Loans> getBookLoans() {
		List<Book_Loans> bookList = new ArrayList<Book_Loans>();
		bookList = bookDAO.getBookLoans();
		return bookList;
	}
	
}
