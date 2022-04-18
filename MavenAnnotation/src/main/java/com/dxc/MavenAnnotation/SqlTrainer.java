package com.dxc.MavenAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqlTrainer implements Trainer {
	private StandardPracticeTime spt;

	public SqlTrainer() {

	}

	public String getDailyTrainingSession() {
		return "Have sql training every day";
	}

	@Autowired
	public void setStandardPracticeTime(StandardPracticeTime spt) {
		System.out.println("SqlTrainer setter is called");
		this.spt = spt;
	}

	public String getPracticeTime() {
		// TODO Auto-generated method stub
		System.out.print("Sql Trainer say: ");
		return spt.sendStandardPracticeTime();
	}
}
