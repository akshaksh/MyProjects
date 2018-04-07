package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TennisCoachDemoApp {

	public static void main(String s[]){
		//read spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach=context.getBean("tennisCoach",TennisCoach.class);
		Coach coachnew=context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(coach == coachnew);
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		context.close();
	}
	
}
