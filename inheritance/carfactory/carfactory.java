package com.xworkz.inheritance.carfactory;

import com.xworkz.inheritance.factory.Factory;

public class carfactory extends Factory {
	public void manufacture() {
		System.out.println("invoked manufacture");
		
	}
	public void shutdown() {
		System.out.println("invoked shutdown from carfactory");
	}
	public String toString() {
		System.out.println("invoked tostring");
		return "factory of car";
	}
	public int hashcode() {
		System.out.println("invoked hashcode");
		return 12;
	}

}
