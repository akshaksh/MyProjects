package com.luv2code.springdemo.mvc.springmvc.customvalidationannotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCodeConstraint,String>{

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCodeConstraint coursePrefix){
		this.coursePrefix=coursePrefix.value();
		//Here this will take the value from the value attribute of annotation
		//for example @Coursecode(value="ABC") so coursePrefix="ABC" 
	}
	
	@Override
	public boolean isValid(String coursecode, ConstraintValidatorContext context) {
		//here coursecode parameter will contain the value entered in html field of form
		boolean result=false;
		System.out.println("coursePrefix :"+coursePrefix);
		System.out.println("coursecode :"+coursecode);
		if(coursecode != null){
			result=coursecode.startsWith(this.coursePrefix);
			System.out.println("result :"+result);
		}
		else{
			result = true;
		}
		return result;
	}

}
