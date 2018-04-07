package com.ajay.form.xmlbased.entity;

public class Student {

private String firstName;
private String lastName;
private String email;
private String[] hobbyList;
private String course;
private String country;
private String comments;
private String checklabel;
private String hiddeninput;
private String countryOptions;
private Integer pasess;
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