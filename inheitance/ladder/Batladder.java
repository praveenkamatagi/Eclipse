package com.xworkz.inheitance.ladder;

public class Batladder extends ladder {

	public void fold() {
		System.out.println("invoked fold from batladder");
	}
	public void lift() {
		System.out.println("invoked lift from batladder");
		
	}
	public void lift(int steps) {
		System.out.println("invoked lift from batladder");
	}
	public String toString() {
		System.out.println("invoked tostring from batladdder");
		return "batladder bat ladder";
		
	}
}
