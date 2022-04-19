package com.dxc.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showEmployeeForm() {
		return "student-form";
	}
	
	@RequestMapping("/confirmationPage")
	public String confirmation(Model model, @RequestParam("fName") String fName, @RequestParam("lName") String lName) {
		String fullName = fName + ", " + lName;
		model.addAttribute("fullName", fullName);
		return "confirmation-page";
	}
}
