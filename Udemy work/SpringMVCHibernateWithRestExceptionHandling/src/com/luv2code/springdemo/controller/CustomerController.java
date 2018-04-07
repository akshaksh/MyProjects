package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject the customer dao
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from the dao
		List<Customer> theCustomers = customerService.getCustomers();
				
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model){
		//Here object name must be the same as model attribute name "newcustomer"
		//in the form else will give error.
		//Below step is required to create a blank object and then fill it with the 
		//values
		model.addAttribute("newcustomer", new Customer());
		return "addCustomerForm";
	}
	
	@RequestMapping("/processAddCustomerForm")
	public String processAddCustomerForm(@ModelAttribute Customer customer){
		customerService.addCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId")int id, Model model){
		//get the customer from database
		Customer customer=customerService.getCustomer(id);
		//set customer as model 
		model.addAttribute("updateCustomer", customer);
		return "updateCustomerForm";
	}
	
	@RequestMapping("/processUpdateCustomerForm")
	public String processUpdateCustomerForm(@ModelAttribute Customer customer){
		customerService.updateCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@RequestMapping("/deleteCustomer")
	public String showFormForDelete(@RequestParam("customerId")int id){
		//get the customer from database
		Customer customer=customerService.getCustomer(id);
		//delete the customer object
		customerService.deleteCustomer(customer);
		return "redirect:/customer/list";
	}
}


