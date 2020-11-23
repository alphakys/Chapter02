package com.javaex.ex01;

public class GoodsApp {

		
	



public static void main(String[] args) {
		
	String str = "1";
	Goods na;
	
	System.out.println(str);
	
	String str1 = "ggg"; 
		char ch1= str1.charAt(0);
	System.out.println(ch1);
		Goods camera = new Goods();
		
		camera.name = "nikon";
		camera.price = 400000;
		
		
		
		Goods computer = new Goods();
		
		computer.name = "LG그램";
		computer.price = 1000000;
		
		
		
		Goods mugcup = new Goods();
		
		mugcup.name = "스타벅스 머그컵";
		mugcup.price = 4000;
		
		camera.price = 450000;
		
		System.out.println(camera.price);
		
		
		
		System.out.println(camera.getName());
		
		
		
		
	}

}
