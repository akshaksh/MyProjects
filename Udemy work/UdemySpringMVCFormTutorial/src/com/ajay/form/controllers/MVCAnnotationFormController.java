/*
 *This program will show a basic HTML form (no spring form library) example with spring MVC.
 */
package com.ajay.form.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.WebBindingInitializer;

import com.ajay.form.entity.Student;

@Controller
//@RequestMapping("/student")
public class MVCAnnotationFormController {

	@Value("#{countryOptions}")
	private Map<String,String> countryOptions;

	@Value("#{courses}")
	private Map<String,String> courses;
	
	@Value("#{hobby}")
	private Map<String,String> hobby;
	
	private List<String> courseList;
	//mapping to show requested form
	@RequestMapping("/showForm")
	public String showForm(){
		return "showForm";
	}
	
	//Showing the result after processing
	//It is not mandatory to add param in an attribute we can directly access on the jsp page
	//like this ${param.name} can see in showFormResult.jsp
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("student") String studentName,HttpServletRequest request,Model model){
		//we can read the html paramter either using @RequestParam annotation or HttpServletRequest object
		//request.getParameter("param-name") OR  @RequestParam("student") String studentName
		System.out.println(request.getParameter("student"));
		model.addAttribute("name",studentName);
		return "showFormResult";
	}
	
/*	OR
 * like this ${param.name} can see in showFormResult.jsp
 * @RequestMapping("/processForm")
	public String processForm(){
		return "showFormResult";
	}
	
*/
	@RequestMapping("/showMVCTagsForm")
	public String showMVCTagsForm(Model model){
		//Creating student object
		System.out.println("hobby:"+hobby);
		Student student=new Student();
		//Adding student object into model which will use to keep value directly from form to bean
		model.addAttribute("student",student);
		model.addAttribute("countryOptions", countryOptions);
		model.addAttribute("courses",courses);
		model.addAttribute("hobby", hobby);
		return "showMVCTagsForm";
	}
	
	/*@RequestMapping("/processMVCTagsForm")
	public String processMVCTagsForm(@ModelAttribute("student") Student student,Model model){
		//@ModelAttribute("student") in this name must be same as we have passed in attribute "modelattribute" of processing form in jsp file 
		System.out.println(student);
		model.addAttribute("thestudent",student);
		return "processMVCTagsForm";
	}*/
	
	@RequestMapping("/processMVCTagsForm")
	public String processMVCTagsForm(@Valid @ModelAttribute("student") Student student,BindingResult bindingResult,Model model){
		//System.out.println(student);
		//System.out.println("bindingResult: "+bindingResult);
		if(bindingResult.hasErrors()){
			System.out.println("student:"+student);
			model.addAttribute("countryOptions", countryOptions);
			model.addAttribute("courses",courses);
			model.addAttribute("hobby", hobby);
			return "showMVCTagsForm";
		}
		else{
		model.addAttribute("thestudent",student);
			System.out.println("student:"+student);
		    return "processMVCTagsForm";
		}
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true); //this true value tell that remove space and make it null
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
}

/*a) Important Note: If we are using the properties file to load the drop down value or any other value
 * for e.g. name=ajay then left side value will behave as the exact value which it will contain
 * and right side value as label of that input
 * 
 * b) Spring JSR 303 validations if we are using multiple validation on one field then on jsp page 
 * we will see all the message in one shot not one by one if we want one by one either we have to use client side
 * script validation using JS or use customer validation
 * */
 