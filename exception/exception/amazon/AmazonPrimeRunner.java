package com.xworkz.exception.amazon;

import com.xworkz.exceptions.NotPrimeMemberException;

public class AmazonPrimeRunner {
	public static void main(String[] args) throws NotPrimeMemberException {
		AmazonPrime ref=new AmazonPrime();
		ref.freeDilivery(true, "India");
		System.out.println("amazon free dilivery");
		
		
	}

}
