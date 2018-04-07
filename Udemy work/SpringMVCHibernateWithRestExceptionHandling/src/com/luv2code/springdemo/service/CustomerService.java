package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	public int addCustomer(Customer customer);
	public int updateCustomer(Customer customer);
	public Customer getCustomer(int id);
	public void deleteCustomer(Customer customer);
}
