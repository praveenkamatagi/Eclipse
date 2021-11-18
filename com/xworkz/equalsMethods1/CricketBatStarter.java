package com.xworkz.equalsMethods1;

import com.xworkz.Overide.CricketBat;

public class CricketBatStarter {
	public static void main(String[] args)
	{
		CricketBat cricketBat=new CricketBat();
		cricketBat.setCompanyName("BRAND");
		cricketBat.setPrice(1500);
		cricketBat.setWood("WILLOW");
		
		 System.out.println(cricketBat.hashCode());
		 System.out.println(cricketBat.toString());
		 System.out.println(cricketBat);
		
		    CricketBat cricketBat2=new CricketBat();
	        cricketBat2.setCompanyName("new BRAND");
			cricketBat2.setPrice(3000);
			cricketBat2.setWood(" WILLOW WILLOW");
			
			 System.out.println(cricketBat2.hashCode());
			 System.out.println(cricketBat2.toString());
			 System.out.println(cricketBat2);
		
		boolean same=cricketBat.equals(cricketBat2);
		System.out.println(same);
		
		  
		Class clas=cricketBat2.getClass();
		System.out.println(clas.getName());
		System.out.println(clas.getPackage());
		System.out.println(clas.getSuperclass());
		System.out.println(clas.getMethods().length);
		System.out.println(clas.getFields().length);
		System.out.println(clas.getConstructors().length);
		
		 
	
	}

	
}

