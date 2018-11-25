package com.javabean_programs;

import java.io.Serializable;

public class JavaBean_Ques1 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private int age;
	private String rollNumber;
	private String courseName;
	
	public JavaBean_Ques1() {
		this.firstName = null;
		this.lastName = null;
		
		this.age = -1;
		
		this.rollNumber = null;
		
		this.courseName = null;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
