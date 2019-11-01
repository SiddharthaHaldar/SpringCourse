package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	@RequestMapping("/processFormv2")
	public String processForm2(HttpServletRequest request,Model model) {
		
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String result = "Yo " + name;
		
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
	
	@RequestMapping("/processFormv3")
	public String processForm3(
			@RequestParam("studentName") String name,
			Model model) {
		
		name = name.toUpperCase();
		
		String result = "Yo " + name;
		
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
	
}
