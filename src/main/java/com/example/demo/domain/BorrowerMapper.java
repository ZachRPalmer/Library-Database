package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BorrowerMapper {
	@Select("SELECT cardNo, name, address, phone, password FROM Borrower")
	List<Borrower> getBorrowerList();

	@Select("SELECT cardNo, name, address, phone, password FROM Borrower where cardNo = #{cardNo}")
	Borrower getBorrower(Borrower borrower);
	
	@Select("SELECT cardNo, name, address, phone, password FROM Borrower where cardNo = #{cardNo} and password = #{password}")
	Borrower getBorLogin(Borrower borrower);
	
	@Update("update borrower set name = #{name}, address = #{address}, phone = #{phone}, password = #{password} where cardNo = #{cardNo}")
	void updateBorrower(Borrower borrower);
	
	@Insert("insert into borrower(cardNo, name, address, phone, password) values (#{cardNo}, #{name}, #{address}, #{phone}, #{password})")
	void insertBorrower(Borrower borrower);
	
}
