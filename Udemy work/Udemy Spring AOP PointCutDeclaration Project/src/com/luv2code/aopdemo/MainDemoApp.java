package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		//read the config java class
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DemoConfig.class);
		//get the bean from spring container
		AccountDAO bean = context.getBean("accountDAO",AccountDAO.class);
		//call the business method
		bean.setName("Ajay Kushwaha");
		bean.setServiceCode("sdfdsf");
		bean.addAccount();
		bean.addSillyMember();
		bean.goToSleep();
		System.out.println(bean.getName());
		System.out.println(bean.getServiceCode());
		//close the contex
		context.close();
	}

}
