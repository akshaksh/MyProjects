package com.luv2code.aopdemo.dao;

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
	
}
