package com.xworkz.Solar.DTO;

public class SolarDTO {
private String brand;
private String material;
private String components;
private int price;
private double weight;


SolarDTO(){
	
}


public SolarDTO(String brand, String material, String components, int price, double weight) {
	super();
	this.brand = brand;
	this.material = material;
	this.components = components;
	this.price = price;
	this.weight = weight;
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public String getMaterial() {
	return material;
}


public void setMaterial(String material) {
	this.material = material;
}


public String getComponents() {
	return components;
}


public void setComponents(String components) {
	this.components = components;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public double getWeight() {
	return weight;
}


public void setWeight(double weight) {
	this.weight = weight;
}
 
}
