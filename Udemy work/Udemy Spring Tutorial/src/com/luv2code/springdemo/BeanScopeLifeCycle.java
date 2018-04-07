package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeLifeCycle {
	
	public static void main(String strs[]){
		// load the spring configuration file
				ClassPathXmlApplicationContext context =
						new ClassPathXmlApplicationContext("applicationContext.xml");
						
				// retrieve bean from spring container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				theCoach.getDailyWorkout();
				context.close();
	}

}
