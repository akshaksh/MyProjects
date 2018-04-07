package com.luv2code.springdemo.entity.list;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.luv2code.springdemo.entity.Customer;

@XmlRootElement(name="CustomerList")
public class CustomerList {

	List<Customer> customerList;
	public CustomerList(){}
	@XmlElement(name="Customer")
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
}
