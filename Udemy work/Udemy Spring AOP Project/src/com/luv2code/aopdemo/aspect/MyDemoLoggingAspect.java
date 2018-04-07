package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect  //Need to deifne it is a aspect
@Component //Need to tell that register it as bean
public class MyDemoLoggingAspect {
	//this is the place where we will define all advices
	//here method declaration must be same like that 
	//method on which we want to call advice
	@Before("execution(public void addAccount())") 
	public void beforeAddAccountAdvice(){
		System.out.println("=======Before========\n");
	}
	
	/*
	 *execution(public void addAccount()) it means call this function for any class
	 *Modifiers(Public etc.),Throw Exception(at the end of function) are optional
	 * To specify for only one particular class we need to give complete path of the class
	 * For Param-Pattern
	 * a)() - matches a method with no arguments
	 * b)(*) - matches a method with one argument of any type.
	 * c) (..) - matches a method 0 or more arguments of any type.
	 * 
	 * For example
	 * execution(* com.luv2code.dao.*.*(..))
	 * here it means any return type, package with any class and any method of their classes
	 * */
	
	@After("execution(public void addAccount())") 
	public void afterAddAccountAdvice(){
		System.out.println("=======After========\n");
	}
}
