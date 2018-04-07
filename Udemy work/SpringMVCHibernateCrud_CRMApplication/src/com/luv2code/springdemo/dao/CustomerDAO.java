package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	public int addCustomer(Customer customer);
	public int updateCustomer(Customer customer);
	public Customer getCustomer(int id);
	public void deleteCustomer(Customer customer);
}
