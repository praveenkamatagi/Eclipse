package demo;

public class Vehicle {
	private String[] container = new String[5];
	private int count = 0;
	public Vehicle() {
		System.out.println("Invoked no-arg constructor");
	}
	public void add(String Brand) {
		if(Brand!=null && count<container.length)
		{
		this.container[count] = Brand;
		count++;
		}
		else
		{
		System.err.println("vehicle brand");
		}
	}
	public void displayDetails() {
		System.out.println("Invoked Display");
		for(int i=0;i<this.container.length;i++) {
			System.out.println(this.container[i]);
		}
	}
}


