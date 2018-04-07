package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect  //Need to deifne it is a aspect
@Component //Need to tell that register it as bean
public class MyDemoLoggingAspect {

	/*Here we will use Pointcut declaration so that we can creata point cut 
	once and can apply on multiple places so that if in future we need to update or
	add this advice to other place only here we need to change and it will update 
	all places.*/
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))") //Declaration of point cut created
	private void forDaoPackage(){}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	private void getter(){}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set(..))")
	private void setter(){}
	
	//A new Point cut which will be combination of above point cut
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter(){}
	
	@Before("forDaoPackageNoGetterSetter()") //Applied the point cut on join points
	public void beforeAddAccountAdvice(){
		System.out.println("=======Before========\n");
	}
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics(){
		System.out.println("\n Performing API Analytics");
	}
	
	/*We can combine the multiple point cut to use for the method and for this we use
	logical opertor
	a)@Before("expression1() || expression2()")
	b)@Before("expression1() && expression2()")
	c)@Before("expression1() && !expression2()")
	For example we want to apply pointcut on all methods except the getter setter method 
	of bean.*/
	
	}
