package com.javabean_programs;

import java.io.Serializable;

public class JavaBean_Ques2 implements Serializable {

	private int employeeID;
	private String employeeName;
	private float employeeSalary;
	private String employeeShift;
	
	public JavaBean_Ques2() {
		this.employeeID = -1;
		this.employeeName = null;
		this.employeeSalary = 0.0F;
		this.employeeShift = null;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float d) {
		this.employeeSalary = d;
	}

	public String getEmployeeShift() {
		return employeeShift;
	}

	public void setEmployeeShift(String employeeShift) {
		this.employeeShift = employeeShift;
	}
	
	
}
