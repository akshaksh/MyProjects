package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class JavaAnnotaionConfigDemoApp {
	public static void main(String strs[]){
		//read spring Config Java Class
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach=context.getBean("tennisCoach",TennisCoach.class);//we can access the bean via id also but we need here default constructor of the class of which we need bean
		SwimCoach swimCoach=context.getBean("getSwimCoach",SwimCoach.class); //We can access the bean by function name also
		System.out.println(coach.getDailyFortune());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyWorkOut());
		System.out.println(swimCoach.getName());
		System.out.println(swimCoach.getEmail());
		context.close();
	}

}
