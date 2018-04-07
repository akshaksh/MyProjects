package com.employee;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name="Employees")
@XmlType(propOrder= {"id","name","age","gender","salary","address"})
public class Employee {


int id;
String name;
int age;
float salary;
char gender;
ArrayList<Address> address;
@XmlElementWrapper(name="LISTOFADDRESSES")
@XmlElement(name="ADDRESS")
public ArrayList<Address> getAddress() {
	return address;
}
public void setAddress(ArrayList<Address> address) {
	this.address = address;
}
@XmlElement(name="ID")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@XmlElement(name="NAME")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@XmlElement(name="AGE")
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@XmlElement(name="SALARY")
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@XmlElement(name="GENDER")
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}

}
