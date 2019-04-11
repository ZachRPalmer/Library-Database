package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BookMapper {
	@Select("SELECT title, publisher From Book")
	List<Book> getBookList();
	
	@Select("SELECT title, publisher From Book where bookId = #{bookId}")
	Book getBook();
	
	@Select("SELECT bookId, branchId, cardNo, dateOut, dueDate From Book_Loans")
	List<Book_Loans> getBookLoans();
	
	@Select("SELECT branchId from Book_Copies where cardNo = #{cardNo}")
	int getBranchId();
	
	@Insert("insert into Book_Loans(bookId, branchId, cardNo, dateOut, dueDate) values (#{bookId}, #{branchId}, #{cardNo}, #{dateOut}, #{dueDate})")
	void insertBookLoan();
}
