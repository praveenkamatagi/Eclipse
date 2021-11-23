package com.xworkz.ElectionComission;

import com.xworkz.ElectionRules.ElectionRules;

public class ElectionComissionComission  implements ElectionRules{

	@Override
	public int vaildAge() {
		// TODO Auto-generated method stub
		System.out.println("invoked VaildAge");
		return 18;
	}

	@Override
	public int wardNo() {
		// TODO Auto-generated method stub
		System.out.println("invoked WardNo");
		return 121;
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		System.out.println("invoked Adress");
		return "Vivekananda nagar Gokak";
	}

}
