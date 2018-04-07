package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.list.CustomerList;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/webservices")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/addCustomer",method=RequestMethod.POST)
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
		System.out.println("addCustomer");
		customerService.addCustomer(customer);
			return new ResponseEntity<String>("Customer Created",HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/updateCustomer/{id}",method=RequestMethod.PUT)
	public ResponseEntity<String> updateCustomer(@PathVariable("id")int id,@RequestBody Customer customer){
		System.out.println("updateCustomer");
		Customer customerchk = customerService.getCustomer(id);
		if(customerchk == null)
			return new ResponseEntity<String>("<?xml version=\"1.0\" encoding=\"UTF-8\"?><error>Customer Not Found !!</error>",HttpStatus.NOT_FOUND);
		else{
			customerService.updateCustomer(customer);
			return new ResponseEntity<String>("<?xml version=\"1.0\" encoding=\"UTF-8\"?><sucess>Record Updated !! Sucessfully</sucess>",HttpStatus.OK);
		}

	}
	
	@RequestMapping(value="/deleteCustomer/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteCustomer(@PathVariable("id")int id){
		System.out.println("deleteCustomer");
		Customer customer=customerService.getCustomer(id);
		if(customer == null)
			return new ResponseEntity<String>("Customer Not Found !!!",HttpStatus.NOT_FOUND);
		else{
		customerService.deleteCustomer(customer);
		return new ResponseEntity<String>("Record Deleted Successfully!!!",HttpStatus.OK);
		}
	}
	@RequestMapping(value="/customer/{id}",method=RequestMethod.GET)
	public ResponseEntity<Customer> getCustomer(@PathVariable("id")int id){
		System.out.println("getCustomer");
		Customer customer=customerService.getCustomer(id);
		if(customer == null)
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		else{
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		}
	}
	@RequestMapping(value="/customers",method=RequestMethod.GET)
	public ResponseEntity<CustomerList> getCustomerList(){
		System.out.println("getCustomerList");
		CustomerList customerList=new CustomerList();
		customerList.setCustomerList(customerService.getCustomers());
			return new ResponseEntity<CustomerList>(customerList,HttpStatus.OK);
	}
}
