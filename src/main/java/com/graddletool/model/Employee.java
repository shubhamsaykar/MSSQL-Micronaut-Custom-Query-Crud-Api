package com.graddletool.model;

import java.util.ArrayList;
//import java.util.List;

public class Employee {
	
	private int empId;	
	private String empName;
	private String empAddress;
	private String designation;
	private long salary;
	
	public ArrayList<Employee> al = new ArrayList<Employee>();
	
	//List<Employee> list=new ArrayList<Employee>();
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
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", designation="
				+ designation + ", salary=" + salary + "]";
	}
	public Employee(int empId, String empName, String empAddress, String designation, long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.designation = designation;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
