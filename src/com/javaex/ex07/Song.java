package com.javaex.ex07;

public class Song {
	
	
	

	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	
	
	////
///// GD 노래 //////
	
	public Song (){
		this("GD");
	}
	
	public Song (String title, String artist, String album, String composer, int year, String track) {
		
		this("거짓말","지디" );
		
		
	
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
		System.out.println("생성자(6)");
		
	}
	
	
	
	public Song(String title, String artist){
		this.title = title;
		this.artist = artist;
	
	
		System.out.println("생성자(2)");
	}
	
	
	
	
	
	public Song(String artist){
		
		this.artist = artist;
	
	}
	
	/*
	public Song(String title, String artist){
		this.title = title;
		this.artist = artist;
	
	}
	
	public Song (String title, String track){
		this.title = title;
		this.track = track;
		}
	*/
	
	///메소드

	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
	

	
	public void showInfo() {
		System.out.println(artist+", "+title+"( "+ album+", "+year+", "+track+", "+composer+" )");
	}
	
	
}
	
	
	
	
	
	
	
	
	
