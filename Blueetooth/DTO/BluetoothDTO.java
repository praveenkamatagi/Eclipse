package com.xworkz.Blueetooth.DTO;

public class BluetoothDTO {
	String brand;
	String type;
	String color;
	int price;
	double rating;
	
	BluetoothDTO(){
		
	}
	BluetoothDTO(String brand,String type,String color,int price,double rating){
		super();
		this.brand=brand;
		this.type=type;
		this.color=color;
		this.price=price;
		this.rating=rating;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

}
