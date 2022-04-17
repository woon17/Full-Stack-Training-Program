package com.dxc.springConstructorInjection;

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
		// without setter injection
//		emp.setEmpId(1);
//		emp.setEmpName("wen");
		
		Employee emp2 = (Employee) context.getBean("emp");
		Employee emp3 = (Employee) context.getBean("emp");
//		emp2.setEmpName("test");
		System.out.println(emp);
		System.out.println(emp2);
		System.out.println(emp3);
		
		
		
	}

}
