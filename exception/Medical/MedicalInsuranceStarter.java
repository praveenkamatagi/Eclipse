package com.xworkz.exception.Medical;

import com.xworkz.exception.CashlessException.CashlessException;

public class MedicalInsuranceStarter {
	public static void main(String[] args) throws CashlessException {
		MedicalInsurance ref=new MedicalInsurance();
		ref.canAvailCashless(null, 0);
				
		System.out.println("above requirement should be fullfilled");
	}

}
