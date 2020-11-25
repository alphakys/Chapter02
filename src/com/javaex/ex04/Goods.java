package com.javaex.ex04;

public class Goods {

	
	private String name;
	private int price;
	
	///////////////////////////////////////////////
	
	public Goods() {}
	
	public Goods(String name) {
		this.name = name;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Goods(int price) {
		this.price = price;
	}

	
	
	
	
	//////////////////////////////////////////////////
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ "]";
	}
	
	
	
	
	
	
	
	
}
