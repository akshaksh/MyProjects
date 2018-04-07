package com.luv2code.springdemo;

import java.util.jar.Attributes.Name;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired  //Field Injection
	FortuneService fortuneServiceImpl;
	//This is a new feature in Spring 4.3 if you have only one constructor in your class then 
	//its not mandatory to mention @Autowired ...it will automatically take care of this 
	//That is the reason if you remove below @Autowired then also it will work
	//And @Autowired we can use with any function not only with setter , keep in mind
	
	
	//@Autowired
	/* For Constructor Injection with Annotation
	public TennisCoach(FortuneService fortuneServiceImpl) {
		this.fortuneServiceImpl=fortuneServiceImpl;
	}
	*/
	
	/* Setter Injection
	public TennisCoach() {
			System.out.println("Coach Constructor");
	}
	@Autowired
	public void setFortuneServiceImpl(FortuneService fortuneServiceImpl){
		System.out.println("Impls");
		this.fortuneServiceImpl=fortuneServiceImpl;
	}
	
	*/
	
	//define init method
	@PostConstruct
	public void doStartStuff(){
		System.out.println("Init Start");
	}
	
	//define destroy method
	@PreDestroy
	public void doEndStuff(){
		System.out.println("Destroy Start");
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Tennis Player workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServiceImpl.getFortune();
	}

}
