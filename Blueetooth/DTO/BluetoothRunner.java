package com.xworkz.Blueetooth.DTO;
import com.xworkz.Blueetooth.DTO.*;
public class BluetoothRunner {
	public static void main(String[] args) {
		BluetoothDTO bluetooth=new BluetoothDTO();
		bluetooth.setBrand("samsung");
		bluetooth.setColor("white");
		bluetooth.setType("wireless");
		bluetooth.setPrice(1500);
		bluetooth.setRating(4.99d);
		
		String brand= bluetooth.getBrand();
		String color=bluetooth.getColor();
		String type=bluetooth.getType();
		int price=bluetooth.getPrice();
		double rating=bluetooth.getRating();
		
		System.out.println(brand.concat(" ").concat(" ").concat(String.valueOf(bluetooth.getColor())
				.concat(" ").concat(String.valueOf(bluetooth.getPrice())).concat(" ").concat(bluetooth.getType())));
		
		BluetoothDTO bluetooth1=new BluetoothDTO("redmii","red","wire",200,4.99);
		System.out.println(bluetooth1.getBrand().concat(" ").concat(bluetooth.getColor()).concat(" ").concat(String.valueOf(bluetooth1.getPrice()).concat(" ")
				   .concat(bluetooth1.getType()).concat(" ").concat(String.valueOf(bluetooth1.getRating())).concat(" ")));
		
		
	}

}
