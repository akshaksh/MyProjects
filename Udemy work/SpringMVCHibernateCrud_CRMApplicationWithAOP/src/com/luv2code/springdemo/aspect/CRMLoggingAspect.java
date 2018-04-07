package com.luv2code.springdemo.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {

	//Setup Logger
	private Logger mylogger=Logger.getLogger(getClass().getName());
	
	//Setup Point Declarations
	@Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
	private void forControllerPackage(){}
	
	@Pointcut("execution(* com.luv2code.springdemo.service.*.*(..))")
	private void forServicePackage(){}
	
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
	private void forDaoPackage(){}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	private void forAppflow(){}
	
	//@Before Advice
	@Before("forAppflow()")
	public void before(JoinPoint joinPoint){
		//display name of the method we are calling
		//mylogger.info("======>> @Before"+joinPoint.getSignature().toShortString());
		System.out.println("======>> @Before"+joinPoint.getSignature().toShortString());
		
		//Display Arguments of the Method
		Object args[]=joinPoint.getArgs();
		
		//Show Arguments
		for(Object arg:args)
			{
				System.out.println("===>args: "+arg);
			}
	}
	
	//add @AfterReturning
	@AfterReturning(pointcut="forAppflow()",returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result){
		//Display method we are returning from
		System.out.println("After Returning:"+joinPoint.getSignature().toShortString());
		//Display data returned
		System.out.println("Results: "+result);
	}
}
