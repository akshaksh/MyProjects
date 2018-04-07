package com.ajay.form.xmlbased.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ajay.form.xmlbased.entity.Student;
import com.ajay.form.xmlbased.formvalidator.StudentFormValidator;

@Controller
@RequestMapping("/student")
public class MVCXmlFormController {

	@Value("#{countryOptions}")
	private Map<String,String> countryOptions;

	@Value("#{courses}")
	private Map<String,String> courses;
	
	@Value("#{hobby}")
	private Map<String,String> hobby;
	private List<String> courseList;

	
	@Autowired
	@Qualifier("studentFormValidator")
	private StudentFormValidator studentFormValidator;
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "showForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("student") String studentName,HttpServletRequest request,Model model){
		System.out.println(request.getParameter("student"));
		model.addAttribute("name",studentName);
		return "showFormResult";
	}
	
	@RequestMapping("/showMVCTagsForm")
	public String showMVCTagsForm(Model model){
		System.out.println("hobby:"+hobby);
		Student student=new Student();
		model.addAttribute("student",student);
		model.addAttribute("countryOptions", countryOptions);
		model.addAttribute("courses",courses);
		model.addAttribute("hobby", hobby);
		return "showMVCTagsForm";
	}
	
	@RequestMapping("/processMVCTagsForm")
	public String processMVCTagsForm(@Valid @ModelAttribute("student") Student student,BindingResult bindingResult,Model model, RedirectAttributes redirectAttributes){
		if(bindingResult.hasErrors()){
			System.out.println("student:"+student);
			model.addAttribute("countryOptions", countryOptions);
			model.addAttribute("courses",courses);
			model.addAttribute("hobby", hobby);
			return "showMVCTagsForm";
		}
		else{
			model.addAttribute("thestudent",student);
			//redirectAttributes.addAttribute("thestudent", student);
			//redirectAttributes.addFlashAttribute("thestudent", student);
			System.out.println("student:"+student);
		    return "processMVCTagsForm";
		    //return "redirect:/student/processMVCTagsFormResult"; this will use to stop the re-submission of the form after reaching to the success page. 
		}
	}
	@RequestMapping("/processMVCTagsFormResult")
	public String processMVCTagsFormResult(){
		System.out.println("I was here");
		return "processMVCTagsFormResult";
	}
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
			dataBinder.setValidator(studentFormValidator);
	}
}
/*addFlashAttribute() actually stores the attributes in a flashmap (which is internally maintained in the users session and removed once the next redirected request gets fulfilled)
addAttribute() essentially constructs request parameters out of your attributes and redirects to the desired page with the request parameters.
So the advantage of addFlashAttribute() will be that you can store pretty much any object in your flash attribute (as it is not serialized into request params at all, but maintained as an object), whereas with addAttribute() since the object that you add gets transformed to a normal request param, you are pretty limited to the object types like String or primitives.*/