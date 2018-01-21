package com.infy.demo_sb_rest;

public class Customer {
	
	String fname;
	String lname;
	String aadhaarNumber;
	String city;
	
	public Customer(String fname, String lname, String aadhaarNumber, String city) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.aadhaarNumber = aadhaarNumber;
		this.city = city;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", aadhaarNumber=" + aadhaarNumber + ", city=" + city
				+ "]";
	}
	
	
}
