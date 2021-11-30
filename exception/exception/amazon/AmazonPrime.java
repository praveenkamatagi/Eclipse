package com.xworkz.exception.amazon;

import com.xworkz.exceptions.NotPrimeMemberException;

public class AmazonPrime {
	//private String India;
	AmazonPrime (){
		System.out.println("non argument constructor");
	}
	public void  freeDilivery(boolean primeMember,String country) throws NotPrimeMemberException {
		 
		 
		if(primeMember=true && country=="India" ) {
			System.out.println("eligible for free dilivery");
			
		}
		else {
			System.out.println("not eligible for free dilivery");
			throw new  NotPrimeMemberException();
		}
	}
	

}



