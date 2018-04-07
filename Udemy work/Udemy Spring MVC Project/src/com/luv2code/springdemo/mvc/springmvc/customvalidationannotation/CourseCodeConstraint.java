package com.luv2code.springdemo.mvc.springmvc.customvalidationannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCodeConstraint {

	//define default course code
	public String value() default "LUV";
	
	//Default Error Message
	public String message() default "must start with LUV";
	
	//Default Group
	public Class<?>[] groups() default {};
	
	//Default Payload
	public Class<? extends Payload>[] payload() default {};
	
	
}
