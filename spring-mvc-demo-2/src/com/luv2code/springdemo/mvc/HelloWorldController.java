package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String letsShoutDude(HttpServletRequest request, Model model) {

		// read the request parameter from the html form
		String theName = request.getParameter("studentName");

		// convert that to uppercase
		theName = theName.toUpperCase();

		// create the message
		String result = "Ohhhh " + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "show-view";
	}
}
