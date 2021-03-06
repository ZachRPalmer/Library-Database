package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.BorrowerDAO;
import com.example.demo.domain.Borrower;


@Component
public class BorrowerService {
	
	@Autowired
	BorrowerDAO borDAO;
	
	public BorrowerService() {
		
	}

	public List<Borrower> getBorList() {
		List<Borrower> borList = new ArrayList<Borrower>();
		borList = borDAO.getBorList();
		return borList;
	}
	
	public void insertBorrower(Borrower borrower) {
		//BorrowerDAO borDAO = new BorrowerDAO();
		borDAO.insertBorrower(borrower);

	}

	public Borrower getBorrower(Borrower borrower) {
		return borDAO.getBorrower(borrower);
		
	}
	
	public Borrower getBorLogin(Borrower borrower) {
		return borDAO.getBorLogin(borrower);
	}

	public void updateBorrower(Borrower borrower) {
		borDAO.updateBorrower(borrower);
		
	}
	
}
