package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

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
