package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.dao.Account;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

	@AfterReturning(pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
				returning="result")
	public void afterResturningFindAccounts(JoinPoint joinpoint,List<Account> result){
		//printout which method we are advising on
		String method=joinpoint.getSignature().toShortString();
		System.out.println(method);
		
		//result is 
		System.out.println("before Change :\n"+result);
		
		//Be careful here we can change the data of list and it will reflect the change into the final list data
		//
		result.get(0).setFirstName("Vinnay");
		System.out.println("After Change :\n"+result);
		
	}
	
	@Before("execution(* com.luv2code.aopdemo.dao.AccountDAO.checkException(..))")
	public void beforeMethod(){
		System.out.println("@Before");
	}
	@AfterThrowing(pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.checkException(..))",
			throwing="MyExcp")
	public void afterThrowingException(JoinPoint jp,Throwable MyExcp){
		System.out.println("@AfterThrowing Exception caught:"+jp.getSignature().toShortString());
	}
	
	@After("execution(* com.luv2code.aopdemo.dao.AccountDAO.checkException(..))")
	public void alwaysExecute(){
		System.out.println("@After");
	}
	
	@AfterReturning(pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.checkException(..))")
	public void afterReturn(){
		System.out.println("@AfterReturning");
	}
	
	@Around("execution(* com.luv2code.aopdemo.dao.AccountDAO.checkException(..))")
	public void afterAround(ProceedingJoinPoint prj) throws Throwable{
		long begin=System.currentTimeMillis();
		System.out.println("Before @Around");
		//Thread.currentThread().sleep(2000);
		//We can handle exception trhown by the method call here also or can rethrow
		//which can be handle by @AfterReturning
		Object result=null;
		try{
			result=prj.proceed();
		}
		catch(Exception e){
			System.out.println("Hanlde by Around");
			throw e;
		}
		System.out.println("After @Around");
		long end=System.currentTimeMillis();
		System.out.println("Result :"+result);
		System.out.println("Time taken: "+(end-begin));
	}
	
	@Before("com.luv2code.aopdemo.aspect.LuvAopExpression.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinpoint){
		System.out.println("beforeAddAccountAdvice");
		//Display Method Signature
		MethodSignature methodSig=(MethodSignature) joinpoint.getSignature();
		//Print method name on which we are applying with full qualified name and parameters
		System.out.println("beforeAddAccountAdvice Signature:"+methodSig); 
		
		//Display Method Arguments

		//get args
			Object[] args=joinpoint.getArgs();

		//loop thruough args
			for(Object arg:args)
				System.out.println(arg);
	}
		
}
