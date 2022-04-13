package com.dxc.springIOC;

public class MyAppIOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// programmer create the object.
		JavaTrainer jt = new JavaTrainer();
		System.out.println(jt.getDailyTrainingSession());
		
		WebTechTrainer wt = new WebTechTrainer();
		System.out.println(wt.getDailyTrainingSession());
		// let application to create the object. IOC approach
		
	}

}
