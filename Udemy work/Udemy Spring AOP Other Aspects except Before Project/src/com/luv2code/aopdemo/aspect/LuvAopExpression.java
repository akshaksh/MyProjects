package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LuvAopExpression {
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.add*(..))")
	private void forDaoPackage(){}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	private void getter(){}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set(..))")
	private void setter(){}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter(){} //put on public so that can be use in other
}
