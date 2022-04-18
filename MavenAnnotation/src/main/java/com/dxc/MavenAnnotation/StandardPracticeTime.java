package com.dxc.MavenAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StandardPracticeTime {
	public StandardPracticeTime() {
		System.out.println("StandardPracticeTime constructor is called for object creation");
	}

	public String sendStandardPracticeTime() {
		return "The default practice time for anything is 2 hours everyday";
	}

}
