package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.Account;
import com.luv2code.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		//read the config java class
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DemoConfig.class);
		//get the bean from spring container
		AccountDAO bean = context.getBean("accountDAO",AccountDAO.class);
		//call theusiness method
		bean.findAccounts();
		try{
		bean.checkException();
		}
		catch(Exception e){
			System.out.println("Finally exception");
		}
		
		//close the contex
		context.close();
	}

}
