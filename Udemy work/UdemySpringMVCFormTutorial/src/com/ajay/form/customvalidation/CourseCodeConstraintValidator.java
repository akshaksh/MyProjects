/**
 * 
 */
package com.ajay.form.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Ajay_Kushwaha
 *
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	//Initializes the validator in preparation for isValid(Object, ConstraintValidatorContext) calls.
	@Override
	public void initialize(CourseCode theCourse){
		coursePrefix=theCourse.value();
	}
	
	@Override
	public boolean isValid(String thecode, ConstraintValidatorContext context) {
		boolean result=false;
		//Need to check the null value else it will pass the validation with null value
		if(null != thecode){
			result=thecode.startsWith(coursePrefix);
		}
		return result;
	}

}
