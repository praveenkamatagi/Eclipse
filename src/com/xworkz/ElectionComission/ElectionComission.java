package com.xworkz.ElectionComission;

import com.xworkz.ElectionRules.ElectionRules;

public class ElectionComission {
	private ElectionRules electionrule;
	public ElectionComission(ElectionRules electionRule) {
		this.electionrule=electionrule;
	}
	public ElectionComission() {
		System.out.println("invoked Election Comission");
	}
	public void VoterId() {
		System.out.println("invoked voter id");
		
	
	if(electionrule!=null) {
	int vaildAge=	electionrule.vaildAge();
	int wardNo=	electionrule .wardNo();
	String address=	electionrule.address();
		 
		if(vaildAge>=18 && wardNo >=0 && wardNo <=100 && address.length()>=10 && address.length()<=50) {
	System.out.println("He/she can  have eligliblity to apply for voterId");
	}
		else
		{
			System.err.println(" not eligible for voter id");
		}
	}
	else
	{
		System.err.println(" not matching above rules");
	}
}


}


	
	