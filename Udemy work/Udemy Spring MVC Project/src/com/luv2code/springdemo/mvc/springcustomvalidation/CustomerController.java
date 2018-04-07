package com.luv2code.springdemo.mvc.springcustomvalidation;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showForm(Model model){
		System.out.println("showForm");
		model.addAttribute("customer",new Customer());
		return "customer-form";
	}
	@RequestMapping("/customerProcessForm")
	public String customerProcessForm(@Valid @ModelAttribute Customer customer,BindingResult result){
		System.out.println("customerProcessForm");
		System.out.println("result: "+result+"\n\n\n\n\n\n\n\n");
		/*As you can see we have typeMismatch.customer.freePass error code
		 * for the free pass field so we will just override the custom message
		 * of it  
		 * */
		if(result.hasErrors())
			return "customer-form";
		else
		return "customer-confirmation";
	}
	//@InitBinder is a pre-processor which handle all web request
	//Here we are using this to trim the text of all the fields
	@InitBinder
	public void initBinder(WebDataBinder databinder){
		System.out.println("initBinder");
		StringTrimmerEditor streingtrim= new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class,streingtrim);
	}
}

