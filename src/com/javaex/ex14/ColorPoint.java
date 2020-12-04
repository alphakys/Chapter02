package com.javaex.ex14;

public class ColorPoint extends Point {
	
	private String color;
	
	///////////////////////////////////////////
	public ColorPoint() {}
	
	public ColorPoint(String color) {
		this.color = color;
		
	}
	
	
	public ColorPoint(int x, int y,String color) {
		super(x,y);
		this.color = color;
	}

	
	
	
	
	///////////////////////////////////////////////////
	
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
}
