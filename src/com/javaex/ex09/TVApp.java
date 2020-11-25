package com.javaex.ex09;

public class TVApp {

	public static void main(String[] args) {
			TV tv = new TV(7, 20, false);
			
			
			tv.status();
			
			
			tv.power(true);
			tv.volume(130);
			tv.status();
			
			tv.volume(true);
			tv.volume(true);
			tv.volume(true);
			tv.status();

			tv.channel(0);
			tv.status();
			
			tv.channel(true);
			tv.channel(true);
			tv.channel(true);
			tv.status();
			
			tv.power(true);
			tv.status();
			
			tv.channel(0);
			tv.channel(false);
			tv.status();
			
			tv.volume(0);
			tv.status();
			
			tv.volume(false);
			tv.status();
			
	}

}
