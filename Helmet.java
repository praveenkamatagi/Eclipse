package test;

public class Helmet {
	private String[] container = new String[6];
	private int count = 0;
	public Helmet() {
		System.out.println("Invoked no-arg constructor");
	}
	public void add(String brand) {
		if(brand!=null && count<container.length)
		{
		this.container[count] = brand;
		count++;
		}
		else
		{
		System.err.println("Dont ride without Helment");
		}
	}
	public void displayDetails() {
		System.out.println("Invoked Display");
		for(int i=0;i<this.container.length;i++) {
			System.out.println(this.container[i]);
		}
}
}


