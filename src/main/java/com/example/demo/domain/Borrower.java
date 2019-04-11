package com.example.demo.domain;

public class Borrower {
	private String cardNo;
	private String name;
	private String address;
	private String phone;
	private String password;
	/**
	 * @param cardNo
	 * @param name
	 * @param address
	 * @param phone
	 * @param password
	 */
	public Borrower(String cardNo, String name, String address, String phone, String password) {
		super();
		this.cardNo = cardNo;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.password = password;
	}
	public Borrower() {
		// TODO Auto-generated constructor stub
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Borrower [cardNo=" + cardNo + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", password=" + password + "]";
	}	
}
