package com.student.teacher.security.domain;


public class Student {
	
	private String name;
	private String rollNumber;
	private String className;
	
	public Student(String name, String rollNumber, String className) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.className = className;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
}
