package com.xworkz.ElectionComissionRules;

import com.xworkz.ElectionComission.ElectionComission;
import com.xworkz.ElectionComission.ElectionComissionComission;
import com.xworkz.ElectionRules.ElectionRules;

public class ElectionComissionRulesStarter {
	public static void main(String[] args) {
		ElectionRules election=new ElectionComissionComission();
		
		 ElectionComissionComission ref=new ElectionComissionComission();
		ref.vaildAge();
		ref.address();
		ref.wardNo();
		
		ElectionComission electioncomission1=new ElectionComission(election  );
		 
		electioncomission1.VoterId();
		 
	}

}
