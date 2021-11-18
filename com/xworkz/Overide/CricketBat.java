package com.xworkz.Overide;

import com.xworkz.equalsMethods1.Bat;

public class CricketBat {
	private String companyName;
	private Integer price;
	private String wood;
	private Bat types=Bat. MRF;
	public CricketBat()
	{
		System.out.println("invoked no-arg constructor");
	}
	@Override
	public boolean equals(Object o)
	{
	System.out.println("invoked equals from cricket bat");
	if (o != null)
	{
		System.err.println("ref is not null");
		if(o instanceof CricketBat)
		{
			System.out.println("ref is a valid ref");
			CricketBat casted=(CricketBat) o;
			String castedCompanyName=casted.getCompanyName();
			String castedWood=casted.getWood();
			if(this.companyName.equals(castedCompanyName) && this.wood.equals(castedWood)) {
				System.out.println("company name nd wood is matching");
			return true;
		}
		else 
		{
			System.err.println("company name or wood is not matching");
		}
		System.out.println("reference .......cricket bat");
	}
		else {
			
			System.out.println("not comparing");
			}
	}
		
	else
	{
		System.err.println("not opointing......");
	}
	return false;
}
	
	public CricketBat(String companyName, Integer price, String wood, Bat types) {
		super();
		this.companyName = companyName;
		this.price = price;
		this.wood = wood;
		this.types = types;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getWood() {
		return wood;
	}

	public void setWood(String wood) {
		this.wood = wood;
	}

	public Bat  getTypes() {
		return types;
	}

	public void setTypes(Bat types) {
		this.types = types;
	}
	
	public int hashCode()
	{
		System.out.println("invoke Hash code");
		return 86;
	}

	public String toString() {
		System.out.println("invoked toString  ");
		return "BATvis good";
	}
	
	
}


