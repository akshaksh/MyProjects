package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

//Here we are using complete java code for spring config so we used @Component

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public String getName() {
		System.out.println("Getter Name");
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter Name");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println("Getter serviceCode");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println("Setter serviceCode");
		this.serviceCode = serviceCode;
	}

	public void addAccount(){
		System.out.println(getClass()+": DOING MY DB WORK");
	}
	
	public void addSillyMember(){
		System.out.println(getClass()+": Silly Member");
	}
	
	public void goToSleep(){
		System.out.println(getClass()+": Sleep Now");
	}
	
}
