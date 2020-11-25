package com.javaex.ex05;

public class Point {
		
	private int x;
	private int y;
	
	public Point () {}
	
	public Point (int x) {
		this.x = x;
	}
	
	//public Point (int y) {
	//	this.y = y;
	//}
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		
		System.out.println("점 X= "+x+"점 Y= "+y+"를 그렸습니다");
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
