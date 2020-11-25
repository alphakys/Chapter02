package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Song lie = new Song();
		
		lie.setTitle("거짓말");
		System.out.println(lie.toString());
		
		
		Song FantasticBaby = new Song();
		
		FantasticBaby.setTitle("판타스틱베이비");
		
		System.out.println(FantasticBaby.toString());
		
		
		Song s6 = new Song("1","1","1","1",2,"1");
		
		System.out.println(s6.toString());
		
		
		
		
		
		
		
		
	}

}
