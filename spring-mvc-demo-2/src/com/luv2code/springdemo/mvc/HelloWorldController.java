package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "show-view";
	}

	// new a controller method to read form data and
	// add data to the model

	@RequestMapping("/processFormVersionTwo") 
	public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {


		// convert that to uppercase
		theName = theName.toUpperCase();

		// create the message
		String result = "Ohhhh " + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "show-view";
	}
}
