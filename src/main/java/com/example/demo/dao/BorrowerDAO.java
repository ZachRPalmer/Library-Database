package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Borrower;
import com.example.demo.domain.BorrowerMapper;


@Component
public class BorrowerDAO {
	
	@Autowired
	BorrowerMapper borrowerMapper;
	
	public BorrowerDAO() {
		
	}

	public List<Borrower> getBorList() {
		List<Borrower> borList = new ArrayList<Borrower>();	
		borList = borrowerMapper.getBorrowerList();
		return borList;
	}
	

	public void insertBorrower(Borrower borrower) {
		borrowerMapper.insertBorrower(borrower);
	}

	public Borrower getBorrower(Borrower borrower) {
		// TODO Auto-generated method stub
		return borrowerMapper.getBorrower(borrower);
	}
	
	public Borrower getBorLogin(Borrower borrower) {
		return borrowerMapper.getBorLogin(borrower);
	}

	public void updateBorrower(Borrower borrower) {
		
		borrowerMapper.updateBorrower(borrower);
		
	}
	
	

}
