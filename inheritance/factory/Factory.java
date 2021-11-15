package com.xworkz.inheritance.factory;

public class Factory {
	
	public Factory() {
		System.out.println("invoked factory");
	}
	public void  manufacture() {
		System.out.println("invoked manufacture");
		
	}
	public void open() {
		System.out.println("invoked open");
	}
	public String toString() {
		return "FACTORY IS RUNNING";
	}
	public int hashCode() {
		return 0;
	}
	
}
