package com.ajay.form.xmlbased.formvalidator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ajay.form.xmlbased.entity.Student;

@Component("studentFormValidator")
public class StudentFormValidator implements Validator{

	@Override
	public boolean supports(Class<?> studentClass) {
		System.out.println("check class: "+studentClass);
		return Student.class.equals(studentClass);
	}

	@Override
	public void validate(Object target, Errors errors){
			Student student=(Student)target;
			ValidationUtils.rejectIfEmpty(errors, "firstName", "NotEmpty.student.firstName");
			ValidationUtils.rejectIfEmpty(errors, "lastName", "NotEmpty.student.lastName");
			ValidationUtils.rejectIfEmpty(errors, "email", "NotEmpty.student.email");
			ValidationUtils.rejectIfEmpty(errors, "hobbyList", "NotEmpty.student.hobbyList");
			ValidationUtils.rejectIfEmpty(errors, "course", "NotEmpty.student.course");
			ValidationUtils.rejectIfEmpty(errors, "country", "NotEmpty.student.country");
			ValidationUtils.rejectIfEmpty(errors, "comments", "NotEmpty.student.comments");
			ValidationUtils.rejectIfEmpty(errors, "countryOptions", "NotEmpty.student.countryOptions");
			ValidationUtils.rejectIfEmpty(errors, "pasess", "NotEmpty.student.pasess");
			ValidationUtils.rejectIfEmpty(errors, "courseCode", "NotEmpty.student.courseCode");
			if(null!= student.getPasess() && (student.getPasess()>10 || student.getPasess()<1)){
				errors.rejectValue("pasess","passes");
			}
	}
}
