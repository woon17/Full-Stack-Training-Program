package com.dxc.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String showFormTwo(Model model, @RequestParam("name") String empName, @RequestParam("city") String empCity,
			@RequestParam("country") String empCountry) {
		// make changes to the data
		// 1. collect the data from the html/jsp

		empName = "hello! " + empName;
		empCity = empCity + " is a decent city";
		empCountry = "SG GOV decide to change " + empCountry + "to newCity";
		model.addAttribute("name", empName);
		model.addAttribute("city", empCity);
		model.addAttribute("country", empCountry);

		// it will append prefix and suffix as we set up in step 5 in xml file
		return "processed-form-data";
	}

}
