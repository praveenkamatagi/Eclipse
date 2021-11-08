package com.xworkz.woodshop.design;

public class ComputerTable extends Furniture {
	 
		
		public ComputerTable()
		{
			super();
			System.out.println("invoked furniture non arg const");
			super.durablity="good";
			super.quantity=2;
			System.out.println("Quantity:"+quantity);
			
		} 
		

	}

