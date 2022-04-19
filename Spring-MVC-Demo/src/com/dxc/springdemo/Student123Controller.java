package com.dxc.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student123")
public class Student123Controller {
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student123 student= new Student123();
		
		model.addAttribute("student", student);
		
		return "student-form123";
	}
	
	@RequestMapping("/processForm")
	public String processForm(Model model, @ModelAttribute("student") Student123 s123) {
		s123.setFirstName("Reference s123 " + s123.getFirstName());
		model.addAttribute("s123", s123);// can remove this line and Model model if do not use ${s123} in jsp file
		return "student-confirmation";
	}

}
