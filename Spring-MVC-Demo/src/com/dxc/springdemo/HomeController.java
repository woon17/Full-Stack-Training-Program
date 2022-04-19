package com.dxc.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class HomeController {

	@RequestMapping("/") // execute when there is request from "/"
	public String showHomePage() {
		// it will append prefix and suffix as we set up in step 5 in xml file
		return "main-menu";
	}

	@RequestMapping("/demo") // execute when there is request from "/demo"
	public String showTrail() {
		// it will append prefix and suffix as we set up in step 5 in xml file
		return "show-trial";
	}

	@RequestMapping("/showForm") // execute when there is request from "/showForm"
	public String showForm() {
		// it will append prefix and suffix as we set up in step 5 in xml file
		return "show-form";
	}

	@RequestMapping("/processForm") // execute when there is request from "/processForm"
	public String processForm() {
		// it will append prefix and suffix as we set up in step 5 in xml file
		return "hello-world";
	}
	
	@RequestMapping("/displayFormTwo") // execute when there is request from "/processForm"
	public String displayFormTwo() {
		// it will append prefix and suffix as we set up in step 5 in xml file
		return "showFormTwo";
	}
	
	@RequestMapping("/showFormTwo") // execute when there is request from "/showFormTwo"
	public String showFormTwo(Model model, HttpServletRequest req) {
		// make changes to the data
		// 1. collect the data from the html/jsp
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		
		name = "hello! " + name;
		city = city + " is a decent city";
		country = "SG GOV decide to change " + country + "to newCity";
		model.addAttribute("name", name);
		model.addAttribute("city", city);
		model.addAttribute("country", country);
		
		// it will append prefix and suffix as we set up in step 5 in xml file
		return "processed-form-data";
	}

}
