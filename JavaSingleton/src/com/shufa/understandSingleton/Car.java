package com.shufa.understandSingleton;

public class Car {
	private String brand;
	private static Car single_instance = null;

	private Car() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public static Car getInstance() {
		if (single_instance == null) {
			single_instance = new Car();
		}
		return single_instance;
	}

//	@Override
//	public String toString() {
//		return "Car [brand=" + brand + "]";
//	}

}


class Car2{
	private static Car2 car = new Car2("BMW");
	private String brand;
	private Car2(String brand) {
		this.brand = brand;
	}
	
	public static Car2 getInstance() {
		return car;
	}
}
