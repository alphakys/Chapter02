package com.javaex.ex09;

public class TV {
	///필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	
	
	
	
	//생성자
	
	public TV() {}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
	}
	


	// 겟
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	

	
	
	//메써드
	
	public void power(boolean on) {
		
		if(on==true) {
			this.power = true;
					}
		else {
			this.power = false;
			}
		
	}
	
	
	public void channel(int channel) {
		
		if(channel<1) {
			this.channel = 1;
		
					  }
		else if(channel>255) {
			this.channel = 255;
					  }
		else {
			this.channel = channel;
			}
									}
		
	
	
	public void channel(boolean up) {
								
						if(up==true) {
								if(this.channel<255) {
											this.channel++;
													}
								else {
									this.channel = 255;
									}
								
									 }
						else {
							if(this.channel>1) {
										this.channel--; 
											}
							else {
								this.channel = 1;
								}
							
							}
									}
	
	
	public void volume(int volume) {
		
		if(volume<0) {
			this.volume = 0;
		
					  }
		
		else if(volume>100) {
			this.volume = 100;
					  }
		else {
			this.volume = volume;
			}
					
								}
	
	
	public void volume(boolean up) {
						if(up==true) {
								if(this.volume<100) {
											this.volume++;
													}
								else {
									this.volume = 100;
									  }
			
										}
							else {
								if(this.volume>0) {
											this.volume--; 
													}
								else {
									this.volume = 0;
										}
								
								}
									}
	

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}


	public void status() {
		if(power==true) {
			System.out.println("channel: "+channel+" volume: "+volume);
						}
		else {
			System.out.println("전원을 켜주세요");
				}
	}
	
	


	
}
