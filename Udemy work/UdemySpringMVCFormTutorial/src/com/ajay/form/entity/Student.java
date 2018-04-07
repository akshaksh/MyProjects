package com.ajay.form.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;

import com.ajay.form.customvalidation.CourseCode;
public class Student {

@NotNull(message="firstName is required")
@NotEmpty(message="firstName is required")
@Size(min=5,max=50,message="firstName must be between 5 and 50")
//@Pattern(regexp="^[a-zA-Z\\s+]$",message="firstName must contain characters")
private String firstName;

@NotNull(message="lastName is required")
@Size(min=5,max=50,message="lastName must be between 5 and 50")
//@Pattern(regexp="^[a-zA-Z\\s+]$",message="lastName must be characters")
private String lastName;

@NotNull(message="Email is required")
@NotEmpty(message="Email is required")
//@Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$;",message="Invalid email")
@Email(message="Invalid email")
private String email;

@NotNull(message="hobbyList is required")
@NotEmpty(message="hobbyList is required")
private String[] hobbyList;

@NotNull(message="course is required")
private String course;

@NotNull(message="country is required")
private String country;

@NotNull(message="comments is required")
@Size(max=40)
private String comments;

private String checklabel;
private String hiddeninput;

@NotNull(message="countryOptions is required")
private String countryOptions;

@Min(value=1,message="passes value must be greater than 0")
@Max(value=10,message="passes value must be less than 10")
@NotNull(message="Pasess value required")
private Integer pasess;

@CourseCode
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String[] getHobbyList() {
	return hobbyList;
}
public void setHobbyList(String[] hobbyList) {
	this.hobbyList = hobbyList;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public String getChecklabel() {
	return checklabel;
}
public void setChecklabel(String checklabel) {
	this.checklabel = checklabel;
}
public String getHiddeninput() {
	return hiddeninput;
}
public void setHiddeninput(String hiddeninput) {
	this.hiddeninput = hiddeninput;
}

public String getCountryOptions() {
	return countryOptions;
}
public void setCountryOptions(String countryOptions) {
	this.countryOptions = countryOptions;
}

public Integer getPasess() {
	return pasess;
}
public void setPasess(Integer pasess) {
	this.pasess = pasess;
}
public String getCourseCode() {
	return courseCode;
}
public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
}
public String toString(){
	return "Student=[firstName="+firstName+",lastName="+lastName+", email="+email+", country="+country+", comments="+comments+", checkLabel="+checklabel+
			", hiddeninput="+hiddeninput+",  passes="+pasess+"]";
}

}

/*
 * @Min(value=1,message="passes value must be greater than 0")
@Max(value=10,message="passes value must be less than 10")
@NotNull(message="Pasess value required")
private int pasess; 
if we use int instead of wrapper class "Integer" then on passing null value int jsp page
input control then we will get below exception
 a) Error1: Failed to convert property value of type java.lang.String to required type int for property pasess; nested exception is java.lang.NumberFormatException: For input string: ""
And if we use Integer wrapper class then it will not give any exception because whatever value
we will pass into jsp page input control it will consider as string value.

 b) Error2: Failed to convert property value of type java.lang.String to required type java.lang.Integer for property pasess; nested exception is java.lang.NumberFormatException: For input string: "djfgbdf"
 Above error will come if we insert the text value instead of number like "dsasda" etc.
 
 To resolve this we could not do enything extra we could only short the message using properties file
*/