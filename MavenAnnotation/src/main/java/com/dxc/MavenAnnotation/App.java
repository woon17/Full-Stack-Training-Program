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
		System.out.println("\nJavaTrainer:");
		System.out.println(jt);
		System.out.println(jt2);
		System.out.println(jt.getDailyTrainingSession());
		System.out.println(jt.getPracticeTime());
		
		System.out.println("\nWebTechTrainer:");
		// first letter is small and as a string when only use @Component
		Trainer wt = (Trainer) context.getBean("webTechTrainer");
//		Trainer wt = (Trainer) context.getBean(WebTechTrainer.class);
		System.out.println(wt.getDailyTrainingSession());
		System.out.println(wt.getPracticeTime());
		
		System.out.println("\nSqlTrainer:");
		Trainer jt3 = (Trainer) context.getBean("sqlTrainer");
		System.out.println(jt3);
		System.out.println(jt3.getDailyTrainingSession());
		System.out.println(jt3.getPracticeTime());
	}
}
