package com.xworkz.charger.dto;

public class chargerDTO {
private String brand;
private float  rate;
private String color;
private String type;
private int quantity;

public chargerDTO()
{
	
}
public chargerDTO(String brand,int quantity) {
	super();
	this.brand=brand;
	this.quantity=quantity;
}
public chargerDTO(String brand,float rate,String color,String type,int quantity) {
	this.brand=brand;
	this.rate=rate;
	this.color=color;
	this.type=type;
	this.quantity= quantity;
	
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand=brand;
}
public float getRate() {
	return rate;
}
public void setRate(float rate) {
	this.rate = rate;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}


