package com.ajay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/security")
public class SecurityController {

	@RequestMapping("/showPage")
	public String showPage(){
		System.out.println("Start");
		System.out.println("End");
		return "showPage";
	}
}
