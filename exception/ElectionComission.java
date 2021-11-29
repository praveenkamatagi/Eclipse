package com.xworkz.exception;

import com.xworkz.exceptions.NotEligibleForVote;

public class ElectionComission {
	ElectionComission(){
		System.out.println("non argument constructor");
	}
	public void canVote(String name,int age) throws NotEligibleForVote  {
		if( name!=null && name.length() >2 && name.length()<26 && age>=18 ) {
			System.out.println("he/she can eligible for vote");
			 
		}
		else{
			System.out.println("not eligible for voting");
			throw new NotEligibleForVote();
	
		}
		
	}
	

}
