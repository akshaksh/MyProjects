package com.luv2code.aopdemo.dao;

public class Account {

	private String firstName;
	private String lastName;
	private int accountNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String toString(){
		return "Account [accountNumber="+accountNumber+", firstName="+firstName+", lastName="+lastName+"]";
	}
}
