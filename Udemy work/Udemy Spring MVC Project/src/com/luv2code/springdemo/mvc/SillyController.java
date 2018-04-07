package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/two")
public class SillyController {

	@RequestMapping("/showForm")
	public String showForm(){
		return "silly-view";
	}
	
}
