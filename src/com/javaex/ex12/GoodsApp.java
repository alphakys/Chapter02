package com.javaex.ex12;

public class GoodsApp {

	public static void main(String[] args) {
				Goods goodsArray[] = new Goods[3];
				
			Goods camera = new Goods("니콘", 400000);
			
			Goods computer = new Goods("그램",1000000);
			
			Goods mug = new Goods("스벅 머그", 5000);
			
			goodsArray[0] = camera;
			goodsArray[1] = computer;
			goodsArray[2] = mug;
			
			for(int i=0; i<goodsArray.length;i++) {
				System.out.println(goodsArray[i]);
			}
				
			
				
				
				
				
				
				
				
				
				
	}

}
