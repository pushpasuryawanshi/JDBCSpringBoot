package com.projectdemo;

public class Employee {
	
	String empName;
	int empAge;
	int empSalary;
	String empLocation;
	int empId;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(String empName, int empAge, int empSalary, String empLocation,int empId) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.empLocation = empLocation;
		this.empId=empId;
	}




	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	public int getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}


	public String getEmpLocation() {
		return empLocation;
	}


	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary + ", empLocation="
				+ empLocation + ", empId=" + empId + ", getEmpName()=" + getEmpName() + ", getEmpAge()=" + getEmpAge()
				+ ", getEmpSalary()=" + getEmpSalary() + ", getEmpLocation()=" + getEmpLocation() + ", getEmpId()="
				+ getEmpId() + "]";
	}

	

}
