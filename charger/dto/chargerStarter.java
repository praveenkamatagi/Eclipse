package com.xworkz.charger.dto;
import com.xworkz.charger.dto.chargerDTO;
public class chargerStarter {
public static void main(String[] args) {
	chargerDTO charger=new chargerDTO();
	charger.setBrand("realme");
	charger.setColor("white");
	charger.setRate(750.25f);
	charger.setType("c");
	charger.setQuantity(10);
	String brand=charger.getBrand();
	String color=charger.getColor();
	float rate=charger.getRate();
	String type=charger.getType();
	int quantity=charger.getQuantity();
	System.out.println(brand.concat(" ").concat(" ").concat(String.valueOf(charger.getQuantity())
			.concat(" ").concat(String.valueOf(charger.getRate())).concat(" ").concat(charger.getType())));

chargerDTO charger1=new chargerDTO("redmii",2500.25f,"silver","nrml",5);
System.out.println(charger1.getBrand().concat(" ").concat(charger.getColor()).concat(" ").concat(String.valueOf(charger1.getRate()).concat(" ")
		   .concat(charger1.getType()).concat(" ").concat(String.valueOf(charger.getQuantity())).concat(" ")));
}}
