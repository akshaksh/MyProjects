package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

//Here we are using complete java code for spring config so we used @Component

@Component
public class AccountDAO {

	public void addAccount(){
		System.out.println(getClass()+": DOING MY DB WORK");
	}
	
}
