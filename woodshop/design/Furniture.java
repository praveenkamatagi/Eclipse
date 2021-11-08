package com.xworkz.woodshop.design;

public class Furniture {
	public String durablity;
	private double price=25000.025;
	protected String Variety;
	public int quantity;
	
    public Furniture()
    {
    	System.out.println("invoked non arg const furniture");
    }
    public Furniture(String durablity, int quantity)
    {
    	super();
    	this.durablity=durablity;
    	this.price=price;
    	this.quantity=quantity;
    	
    	System.out.println("invoked furniture constructor String double int");
        System.out.println("furnitures:"+this.durablity +this.quantity);

    }
}


