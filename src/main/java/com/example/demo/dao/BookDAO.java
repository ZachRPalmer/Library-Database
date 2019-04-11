package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Book;
import com.example.demo.domain.Book_Loans;
import com.example.demo.domain.BookMapper;


@Component
public class BookDAO {
	
	@Autowired
	BookMapper bookMapper;
	
	public BookDAO() {
		
	}

	public List<Book> getBookList() {
		List<Book> bookList = new ArrayList<Book>();	
		bookList = bookMapper.getBookList();
		return bookList;
	}
	
	public Book getBook() {
		Book book = new Book();	
		book = bookMapper.getBook();
		return book;
	}
	
	public List<Book_Loans> getBookLoans() {
		List<Book_Loans> bookList = new ArrayList<Book_Loans>();	
		bookList = bookMapper.getBookLoans();
		return bookList;
	}
	
	public int getBranchId() {
		int branchId = bookMapper.getBranchId();
		return branchId;
	}
}
