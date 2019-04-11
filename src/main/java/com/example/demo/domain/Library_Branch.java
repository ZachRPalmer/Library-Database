package com.example.demo.domain;

public class Library_Branch {
	private int branchId;
	private String branchName;
	private String address;
	/**
	 * @param branchId
	 * @param branchName
	 * @param address
	 */
	public Library_Branch(int branchId, String branchName, String address) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.address = address;
	}
	public Library_Branch() {
		
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Library_Branch [branchId=" + branchId + ", branchName=" + branchName + ", address=" + address + "]";
	}
	
}
