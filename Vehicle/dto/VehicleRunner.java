package com.xworkz.Vehicle.dto;

import com.xworkz.Vehicle.dto.*;

public class VehicleRunner {
	
		public static void main(String[] args) {
			VehicleDTO vehicle=new VehicleDTO();
			vehicle.setCompany("tvs");
			vehicle.setType("gear");
			vehicle.setModel("newone");
			vehicle.setPrice(55000);
			vehicle.setAvg(70.5f);
			
			String company=vehicle.getCompany();
			String type=vehicle.getType();
			String model=vehicle.getModel();
			int price=vehicle.getPrice();
			float avg=vehicle.getAvg();
			
			
			System.out.println(company.concat(" ").concat(" ").concat(String.valueOf(vehicle.getPrice())
					.concat(" ").concat(String.valueOf(vehicle.getModel())).concat(" ").concat(vehicle.getType())));
		
			
			VehicleDTO vehicle1=new VehicleDTO("pulsar","gear","discbreak",70000,42.5f);
			System.out.println(vehicle1.getCompany().concat(" ").concat(vehicle1.getType()).concat(" ").concat(String.valueOf(vehicle1.getModel()).concat(" ")
					   .concat(vehicle1.getType())).concat(" ").concat(String.valueOf(vehicle.getAvg())).concat(" "));
		}
		

}
