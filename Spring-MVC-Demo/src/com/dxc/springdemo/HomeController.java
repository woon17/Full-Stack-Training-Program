package com.dxc.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
