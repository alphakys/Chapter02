package com.javaex.ex01;

public class GoodsApp {

		
	



public static void main(String[] args) {
		
	
	Goods camera1 = new Goods("nikon", 450000);
	
	Goods computer1 = new Goods("LG 그램",1000000);
	
	
	Goods mugcup1 = new Goods("머그컵", 4000);
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
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
