package com.dxc.MavenAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqlTrainer implements Trainer {
	private StandardPracticeTime spt;

	public String getDailyTrainingSession() {
		return "Have sql training every day";
	}

	@Autowired
	public SqlTrainer(StandardPracticeTime spt) {
		this.spt = spt;
	}

	public String getPracticeTime() {
		// TODO Auto-generated method stub
		System.out.print("Sql Trainer say: ");
		return spt.sendStandardPracticeTime();
	}
}
