package com.luv2code.springdemo.mvc.springmvc.customvalidationannotation;

public class Student {

	private String firstName;
	private String lastName;
	
	@CourseCodeConstraint
	private String courseCode;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
