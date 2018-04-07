package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.mvc.beans.Student;

@Component
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}") 
    private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model model){
		//create a student object and add student object to model
		model.addAttribute("student",new Student());
		model.addAttribute("theCountryOptions", countryOptions);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processedForm(@ModelAttribute Student stud){
		//log the input
		System.out.println(stud.getFirstName());
		System.out.println(stud.getLastName());
		System.out.println(stud.getAge());
		return "student-confirmation";
	}
}
