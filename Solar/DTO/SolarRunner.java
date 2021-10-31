package com.xworkz.Solar.DTO;

public class SolarRunner {
public static void main(String args []) {
	SolarDTO solar=new SolarDTO();
	 solar.setBrand("BlueBird");
	 solar.setMaterial("crystalline silcon");
	 solar.setComponents("solar pannel");
	 solar. setPrice(100000);
	 solar.setWeight(24.8d);
	 
	 String brand = solar.getBrand();
	 String material = solar.getMaterial();
	 String components = solar.getComponents();
	 int price = solar.getPrice();
	double weight= solar.getWeight();
	 
	SolarDTO solar1=new SolarDTO("luminious","silcon","pannel",200000,30.5d);
	System.out.println(brand.concat(" ").concat(" ").concat(String.valueOf(solar.getMaterial())
			.concat(" ").concat(String.valueOf(solar.getPrice())).concat(" ").concat(solar.getComponents())));
	
	System.out.println(brand.concat(" ").concat(" ").concat(String.valueOf(solar1.getMaterial())
			.concat(" ").concat(String.valueOf(solar1.getPrice())).concat(" ").concat(solar1.getComponents())));
	System.out.println(solar1.getBrand().concat(" ").concat(solar1.getMaterial()).concat(" ").concat(String.valueOf(solar1.getPrice()).concat(" ")
			   .concat(solar1.getComponents()).concat(" ").concat(String.valueOf(solar1.getWeight())).concat(" ")));
	

	
	
}
}
