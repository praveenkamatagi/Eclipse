package com.xworkz.Vehicle.dto;

public class VehicleDTO {
	private String company;
	private String type;
private	String model;
private	int price;
	private float avg;
	
	public VehicleDTO() {
		
	}

	public VehicleDTO(String company, String type, String model, int price, float avg) {
		super();
		this.company = company;
		this.type = type;
		this.model = model;
		this.price = price;
		this.avg = avg;
	}
	public String  getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company=company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}
	
}