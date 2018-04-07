package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

//Here we are using complete java code for spring config so we used @Component

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public void addAccount(boolean result){
		System.out.println(getClass()+": DOING MY DB WORK");
	}
	
	public void addSillyMember(){
		System.out.println(getClass()+": Silly Member");
	}
	
	public void goToSleep(){
		System.out.println(getClass()+": Sleep Now");
	}
	public List<Account> findAccounts(){
		List<Account> al=new ArrayList<>();
		Account acc1=new Account();
		acc1.setAccountNumber(1);
		acc1.setFirstName("Ajay");
		acc1.setLastName("Kushwaha");
		Account acc2=new Account();
		acc2.setAccountNumber(2);
		acc2.setFirstName("Rajesh");
		acc2.setLastName("Kumar");
		al.add(acc1);
		al.add(acc2);
		return al;
	}
	public void checkException(){
		throw new RuntimeException("After Throw Exception");
	}
}
