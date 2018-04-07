package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyCloudLoggingAspect {
	
	@Before("com.luv2code.aopdemo.aspect.LuvAopExpression.forDaoPackageNoGetterSetter()")
	public void cloud(){
		System.out.println("Cloud one");
	}
}
