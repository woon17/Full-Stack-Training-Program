package com.dxc.MavenAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jTrainer")
@Scope("prototype")
public class JavaTrainer implements Trainer {
	private StandardPracticeTime spt;

	public String getDailyTrainingSession() {
		return "Have java training every day";
	}

	@Autowired
	public JavaTrainer(StandardPracticeTime spt) {
		System.out.println("JavaTrainer constructor called");
		this.spt = spt;
	}

	public String getPracticeTime() {
		// TODO Auto-generated method stub
		System.out.print("Java Trainer say: ");
		return spt.sendStandardPracticeTime();
	}
}
