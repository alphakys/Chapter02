package com.javaex.ex23;

public class Ex24 {
	
	
	public static void main(String[] args) {
	
	
	try {
		Rectangle r01 = null;
		r01.toString();
	}catch(NullPointerException e) {
		System.out.println("널 포인트 발생");
	}
	
	
	
	
	
	try {
		int[] intArray = new int[] {3,6,9};
		System.out.println(intArray[3]);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("배열의 범위밖--->처리로직");
		System.out.println(e.getMessage());
	}
	
	
	
}
}