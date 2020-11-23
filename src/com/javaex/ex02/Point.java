package com.javaex.ex02;

public class Point {

	 int x;
	int y;
	
	public void setPointx(int x) {
		this.x = x;
		
	}
	
	public int getPointx() {
		return x;
	}
	
	
	public void setPointy(int y) {
		this.y = y;
		
	}
	
	public int getPointy() {
		return y;
	}
	
	
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
	
	
	public static void main(String[] args) {
		
		Point p = new Point();
		
		
		
		
		System.out.println(p.x);
	}
	
	
	
	
	
	
	
}
