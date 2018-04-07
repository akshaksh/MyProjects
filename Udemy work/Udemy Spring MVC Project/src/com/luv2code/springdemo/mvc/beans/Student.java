package com.luv2code.springdemo.mvc.beans;

import java.util.LinkedHashMap;
/*We can provide the values of drop-downs in three ways
a)Via options in the jsp page
b)Via DataStructure like LinkedHashMap etc.
c)Via properties file
*/

//Attached Controller - StudentController
public class Student {
String firstName;
String lastName;
int age;
String sex;
String favirouteLanguage;
String country;
String state;
String[] operatingSystem;
LinkedHashMap<String,String> stateItemValues;
LinkedHashMap<String,String> countryItemValues;
LinkedHashMap<String,String> favoriteLanguageOptions;
LinkedHashMap<String,String> operatingSystemOptions;
//Using Constructor
public Student(){
	//To generate the value of drop - down using LinkedHashMap
	stateItemValues=new LinkedHashMap<String,String>();
	stateItemValues.put("IN", "India");
	stateItemValues.put("ENG", "England");
	stateItemValues.put("PAK", "Pakistan");
	stateItemValues.put("US", "America");
	stateItemValues.put("CH", "China");
	favoriteLanguageOptions=new LinkedHashMap<String, String>();
	favoriteLanguageOptions.put("Java", "Java");
    favoriteLanguageOptions.put("C#", "C#");
    favoriteLanguageOptions.put("PHP", "PHP");
    favoriteLanguageOptions.put("Ruby", "Ruby");
    operatingSystemOptions = new LinkedHashMap<String, String>();
    operatingSystemOptions.put("Linux","Linux");
    operatingSystemOptions.put("OS7","OS7");
    operatingSystemOptions.put("OS10","OS10");
}
public String getFavirouteLanguage() {
	return favirouteLanguage;
}
public void setFavirouteLanguage(String favirouteLanguage) {
	this.favirouteLanguage = favirouteLanguage;
}

public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public String[] getOperatingSystem() {
	return operatingSystem;
}
public void setOperatingSystem(String[] operatingSystem) {
	this.operatingSystem = operatingSystem;
}
public LinkedHashMap<String, String> getStateItemValues() {
	return stateItemValues;
}
public LinkedHashMap<String, String> getCountryItemValues() {
	return countryItemValues;
}
public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
	return favoriteLanguageOptions;
}
public LinkedHashMap<String, String> getOperatingSystemOptions() {
	return operatingSystemOptions;
}

}
