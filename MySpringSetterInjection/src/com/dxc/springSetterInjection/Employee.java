package com.dxc.springSetterInjection;

public class Employee {
	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void empStart() {
		System.out.println("Init sart");
		
	}
	public void empStop() {
		System.out.println("Destory called");
		
		
	}

//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + "]";
//	}

}
