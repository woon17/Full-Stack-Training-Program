package com.dxc.MavenAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebTechTrainer implements Trainer {
	private StandardPracticeTime spt;

	public WebTechTrainer() {

	}

	public String getDailyTrainingSession() {
		return "Have web session to practice web development skills";
	}

	@Autowired
	public void setStandardPracticeTime(StandardPracticeTime spt) {
		System.out.println("WebTechTrainer setter is called");
		this.spt = spt;
	}

	public String getPracticeTime() {
		// TODO Auto-generated method stub
		System.out.print("Web Trainer say: ");
		return spt.sendStandardPracticeTime();
	}
}
