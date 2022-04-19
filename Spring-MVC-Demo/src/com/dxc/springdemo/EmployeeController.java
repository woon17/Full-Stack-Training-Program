package com.dxc.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@RequestMapping("/showForm")
	public String showEmployeeForm() {
		return "employee-form";
	}
}
