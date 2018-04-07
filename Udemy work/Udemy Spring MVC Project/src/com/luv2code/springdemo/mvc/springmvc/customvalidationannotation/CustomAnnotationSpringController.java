package com.luv2code.springdemo.mvc.springmvc.customvalidationannotation;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/students")
public class CustomAnnotationSpringController {

	@RequestMapping("/showPage")
	public String showPage(Model model){
		model.addAttribute("student", new Student());
		return "studentInfoForm";
	}
	
	@RequestMapping("/processShowPage")
	public String confirmationPage(@Valid @ModelAttribute Student student,BindingResult bindingResult){
		System.out.println(bindingResult);
		if(bindingResult.hasErrors())
		return "studentInfoForm";
		else
		return "studentInfoConfirmation";
	}
	
	
}
