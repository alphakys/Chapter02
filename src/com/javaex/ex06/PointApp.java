package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Point p01 = new Point();
		
		p01.setX(10);
		p01.setY(5);
		
		String str = p01.toString();
		
		System.out.println(str);
		
		Point p02 = new Point(100, 100);
		
		p02.draw(true);
		p02.draw(false);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
