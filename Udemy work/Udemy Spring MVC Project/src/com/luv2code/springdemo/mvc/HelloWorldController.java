package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model,@RequestParam("age")int age){
		model.addAttribute("nameinuppercase", request.getParameter("name").toUpperCase());
		model.addAttribute("lastnameinuppercase", request.getParameter("lastname").toUpperCase());
		model.addAttribute("newage",age+20);
		return "helloworld";
	}
	
}
