package com.javaex.ex13;

public class Person {
		
	protected String name; 
	protected int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
}
