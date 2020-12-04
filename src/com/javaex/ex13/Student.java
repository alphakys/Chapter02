package com.javaex.ex13;

public class Student extends Person {
	private String schoolName;
	
	
	
	public Student(String schoolName) {
		
		
		this.schoolName = schoolName;
	}
	
	
	
	public Student(String name, int age, String schoolName) {
		
		super(name, age);
		
		
		//super.setName(name);
		//super.setAge(age);
		
		
		
	}
	
	
	
	

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	
}
