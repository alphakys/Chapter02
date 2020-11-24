package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
				
		Song goodDay = new Song();
		
		
		Song lie = new Song();
		Song blossom = new Song();
		
		
		
		
		
		
		goodDay.setAlbum("Real"); 
		goodDay.setArtist("아이유");
		goodDay.setComposer("이민수 작곡");
		goodDay.setTitle("좋은날");
		goodDay.setTrack("2번 track");
		goodDay.setYear(2010);
		
		lie.setAlbum("Always");
		lie.setArtist("BIGBANG");
		lie.setComposer("G-DRAGON 작곡");
		lie.setTitle("거짓말");
		lie.setTrack("2번 트랙");
		lie.setYear(2007);
		
		blossom.setAlbum("버스커버스커1집");
		blossom.setArtist("버스커버스커");
		blossom.setComposer("장범준 작곡");
		blossom.setTitle("벚꽃엔딩");
		blossom.setTrack("4번 track");
		blossom.setYear(2012);
		
		
		goodDay.showInfo();
		
		lie.showInfo();
		
		blossom.showInfo();
		
		
		
		
		
		
	}

}
