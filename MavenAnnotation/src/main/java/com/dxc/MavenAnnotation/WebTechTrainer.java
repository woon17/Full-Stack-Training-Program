package com.dxc.MavenAnnotation;

import org.springframework.stereotype.Component;

@Component
public class WebTechTrainer implements Trainer{
	public String getDailyTrainingSession() {
		return "Have web session to practice web development skills";	
	}
}
