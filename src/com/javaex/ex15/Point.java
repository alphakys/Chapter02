package com.javaex.ex15;

public class Point {
	protected int x;
	protected int y;
	
	
	public Point (){}
	
	public Point (int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("상위 클래스 생성자(2)");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
