package com.dxc.MavenAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.dxc.MavenAnnotation.Trainer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Trainer jt = (Trainer) context.getBean("jTrainer");
		Trainer jt2 = (Trainer) context.getBean("jTrainer");
		System.out.println(jt);
		System.out.println(jt2);
		System.out.println(jt.getDailyTrainingSession());

		// first letter is small and as a string when only use @Component
		Trainer wt = (Trainer) context.getBean("webTechTrainer");
//		Trainer wt = (Trainer) context.getBean(WebTechTrainer.class);
		System.out.println(wt.getDailyTrainingSession());
	}
}
