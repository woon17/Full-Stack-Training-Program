package com.dxc.springSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// without IOC
//		Employee emp = new Employee();
//		emp.setEmpId(1);
//		emp.setEmpName("shufa");
//		System.out.println(emp);
		//with IOC
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		Employee emp = (Employee) context.getBean("emp");
		emp.setEmpId(1);
		emp.setEmpName("shufa");
		System.out.println(emp);
		
	}

}
