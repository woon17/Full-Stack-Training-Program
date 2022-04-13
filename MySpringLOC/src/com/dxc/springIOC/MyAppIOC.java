package com.dxc.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppIOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// programmer create the object.
//		JavaTrainer jt = new JavaTrainer();
//		System.out.println(jt.getDailyTrainingSession());
//		
//		WebTechTrainer wt = new WebTechTrainer();
//		System.out.println(wt.getDailyTrainingSession());
		
		// let application to create the object. IOC approach
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		Trainer jt = (Trainer) context.getBean("j");
		System.out.println(jt.getDailyTrainingSession());
		
		Trainer wt = (Trainer) context.getBean("w");
		System.out.println(wt.getDailyTrainingSession());
	}

}
