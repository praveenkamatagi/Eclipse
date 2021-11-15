package com.xworkz.inheitance.ladder;

public class ladder {
	public ladder() {
		System.out.println("invoked ladder");
	}
	public String toString() {
		System.out.println("invoked to String");
		return "LADDER";
	}
	public void lift() {
		System.out.println("invoked lift from ladder");
	}
	public int hashcode() {
		return 25;
	}

}
