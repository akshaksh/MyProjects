package com.luv2code.springdemo.mvc.springcustomvalidation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String firstName;
	private String lastName;
	
	@Min(value=0,message="Value must be greater than equals to 0")
	@Max(value=10,message="Value must be less than equals to 10")
	@NotNull(message="is required")
	private Integer freePass; 
	//Its good to use always Integer wrapper class instead of primitive data type
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="Postal Code can have number or characters only of length 5")
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
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
	
}
