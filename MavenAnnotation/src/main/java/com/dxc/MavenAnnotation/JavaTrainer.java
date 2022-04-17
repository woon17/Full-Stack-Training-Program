package com.dxc.MavenAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jTrainer")
@Scope("prototype")
public class JavaTrainer implements Trainer{
	
	public String getDailyTrainingSession() {
		return "Have java training every day";	
	}
}
