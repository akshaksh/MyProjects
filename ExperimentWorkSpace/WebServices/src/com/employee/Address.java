package com.employee;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
public class Address {

int zipcode;
String city;
String state;
String area;
@XmlElement(name="ZIPCODE")
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
@XmlElement(name="CITY")
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@XmlElement(name="STATE")
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@XmlElement(name="AREA")
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
	
}
